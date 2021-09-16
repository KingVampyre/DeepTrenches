package github.KingVampyre.DeepTrenches.common.entity;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Variant;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.LoveTask;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.TamableFishFollowOwnerTask;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import github.KingVampyre.DeepTrenches.core.entity.ai.task.LoosejawUpdateAttackTargetTask;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.ai.brain.task.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static github.KingVampyre.DeepTrenches.core.entity.ai.task.LoosejawUpdateAttackTargetTask.HURT_BY_EXCEPT_OWNER_GETTER;
import static github.KingVampyre.DeepTrenches.core.init.DTMemoryModuleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.DTSensorTypes.COD_TEMPTING;
import static github.KingVampyre.DeepTrenches.core.init.DTSensorTypes.TAMABLE_HURT_BY;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.entity.ai.brain.sensor.SensorType.NEAREST_LIVING_ENTITIES;
import static net.minecraft.item.Items.COD;

@Deprecated
public abstract class AbstractLoosejawEntity extends TamableFishEntity implements Variant {

    protected static final ImmutableList<? extends MemoryModuleType<?>> MEMORY_MODULES = ImmutableList.of(ATTACK_TARGET, ATTACK_COOLING_DOWN, NEAREST_PLAYERS, NEAREST_VISIBLE_PLAYER, NEAREST_VISIBLE_TARGETABLE_PLAYER, BREEDING_AGE, FORCED_AGE, HAPPY_TICKS_REMAINING, LOVE_TICKS, LOVING_PLAYER, OWNER, SITTING, TAMED, BREEDING_TARGET, CANT_REACH_WALK_TARGET_SINCE, HURT_BY, HURT_BY_ENTITY, LOOK_TARGET, PATH, TEMPTATION_COOLDOWN_TICKS, TEMPTING_PLAYER, IS_TEMPTED, VISIBLE_MOBS, WALK_TARGET);
    protected static final ImmutableList<SensorType<? extends Sensor<? super BettaEntity>>> SENSORS = ImmutableList.of(COD_TEMPTING, NEAREST_LIVING_ENTITIES, SensorType.NEAREST_PLAYERS, TAMABLE_HURT_BY);

    private static final TrackedData<Integer> LOOSEJAW_TYPE = DataTracker.registerData(AbstractLoosejawEntity.class, TrackedDataHandlerRegistry.INTEGER);

    protected AbstractLoosejawEntity(EntityType<? extends AbstractLoosejawEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean canAttackWithOwner(LivingEntity target, LivingEntity owner) {
        return true;
    }

    @Override
    public int getVariant() {
        return this.dataTracker.get(LOOSEJAW_TYPE);
    }

    @Override
    public void setVariant(int variant) {
        this.dataTracker.set(LOOSEJAW_TYPE, variant);
    }

    @Override
    public void copyDataToStack(ItemStack stack) {
        super.copyDataToStack(stack);

        stack.getOrCreateNbt().putInt("Variant", this.getVariant());
    }

    @Override
    public ExperienceOrbEntity createExperienceOrb(ServerWorld server, double x, double y, double z) {
        return new ExperienceOrbEntity(server, x, y, z, this.random.nextInt(7) + 1);
    }

    @Override
    protected Brain.Profile<?> createBrainProfile() {
        return Brain.createProfile(MEMORY_MODULES, SENSORS);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Brain<?> deserializeBrain(Dynamic<?> dynamic) {
        Brain<AbstractLoosejawEntity> brain = (Brain<AbstractLoosejawEntity>) super.deserializeBrain(dynamic);

        brain.setTaskList(Activity.CORE, 0, ImmutableList.of(
                new LookAroundTask(45, 90),
                new WanderAroundTask(200, 350),
                new TemptationCooldownTask(TEMPTATION_COOLDOWN_TICKS))
        );

        brain.setTaskList(Activity.FIGHT, 10, ImmutableList.of(
                new MeleeAttackTask(40),
                new RangedApproachTask(3.5F),
                new ForgetAttackTargetTask<>()
        ), MemoryModuleType.ATTACK_TARGET);

        brain.setTaskList(Activity.IDLE, ImmutableList.of(
                Pair.of(0, new GoTowardsLookTarget(3.5F, 0)),
                Pair.of(0, new LoosejawUpdateAttackTargetTask(HURT_BY_EXCEPT_OWNER_GETTER)),
                Pair.of(1, new WaitTask(30, 60)),
                Pair.of(2, new LoveTask<>(3.0F, 0.9F)),
                Pair.of(3, new TemptTask(entity -> entity.isInsideWaterOrBubbleColumn() ? 0.5F : 0.15F)),
                Pair.of(4, new TamableFishFollowOwnerTask<>(0.9F, 16.0F, 6.0F)),
                Pair.of(4, new TimeLimitedTask<>(new FollowMobTask(8.0F), UniformIntProvider.create(30, 60))),
                Pair.of(5, new StrollTask(0.9F, 16, 9))
        ));

        brain.setCoreActivities(ImmutableSet.of(Activity.CORE));
        brain.setDefaultActivity(Activity.IDLE);
        brain.resetPossibleActivities();

        return brain;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        // TODO loosejaw ambient sound
        return SoundEvents.ENTITY_SALMON_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        // TODO loosejaw death sound
        return SoundEvents.ENTITY_SALMON_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        // TODO loosejaw hurt sound
        return SoundEvents.ENTITY_SALMON_HURT;
    }

    @Override
    protected SoundEvent getFlopSound() {
        // TODO loosejaw flop sound
        return SoundEvents.ENTITY_SALMON_FLOP;
    }

    @Override
    public void setBaby(boolean baby) {
        this.setBreedingAge(baby ? -36000 : 0);
    }

    public abstract int chooseType();

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(LOOSEJAW_TYPE, 0);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.getItem() == COD;
    }

    @Override
    public boolean isTameItem(ItemStack stack) {
        return stack.getItem() == COD;
    }

    @Nullable
    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {
        this.setVariant(this.chooseType());

        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void mobTick() {
        super.mobTick();

        Brain<AbstractLoosejawEntity> brain = (Brain<AbstractLoosejawEntity>) this.getBrain();
        ServerWorld server = (ServerWorld) this.world;

        this.world.getProfiler().push("loosejawBrain");
        brain.tick(server, this);
        this.world.getProfiler().pop();

        brain.resetPossibleActivities(ImmutableList.of(Activity.FIGHT, Activity.IDLE));

        this.setAttacking(brain.hasMemoryModule(MemoryModuleType.ATTACK_TARGET));
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);

        // TODO this.variantFromTag(nbt);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);

        // TODO this.variantToTag(nbt);
    }

}
