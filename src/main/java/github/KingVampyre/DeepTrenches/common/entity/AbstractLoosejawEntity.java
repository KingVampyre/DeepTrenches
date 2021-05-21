package github.KingVampyre.DeepTrenches.common.entity;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.LoveTask;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.LoveTemptingTask;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.TamableFishFollowOwnerTask;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.TemptingCooldownTask;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import github.KingVampyre.DeepTrenches.core.entity.ai.task.LightableUpdateAttackTargetTask;
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
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.entity.ai.task.LightableUpdateAttackTargetTask.HURT_BY_EXCEPT_OWNER_GETTER;
import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.COD_TEMPTING;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.TAMABLE_HURT_BY;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.entity.ai.brain.sensor.SensorType.NEAREST_LIVING_ENTITIES;
import static net.minecraft.item.Items.COD;

public abstract class AbstractLoosejawEntity extends TamableFishEntity {

    protected static final ImmutableList<? extends MemoryModuleType<?>> MEMORY_MODULES = ImmutableList.of(ATTACK_TARGET, ATTACK_COOLING_DOWN, NEAREST_PLAYERS, NEAREST_VISIBLE_PLAYER, NEAREST_VISIBLE_TARGETABLE_PLAYER, BREEDING_AGE, FORCED_AGE, HAPPY_TICKS_REMAINING, LOVE_TICKS, LOVING_PLAYER, OWNER, SITTING, TAMED, BREEDING_TARGET, CANT_REACH_WALK_TARGET_SINCE, HURT_BY, HURT_BY_ENTITY, LOOK_TARGET, PATH, TEMPTATION_COOLDOWN_TICKS, TEMPTING_PLAYER, TEMPTED, VISIBLE_MOBS, WALK_TARGET);
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
    protected void copyDataToStack(ItemStack stack) {
        super.copyDataToStack(stack);

        CompoundTag compound = stack.getOrCreateTag();

        compound.putInt("LoosejawType", this.getLoosejawType());
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
                new TemptingCooldownTask())
        );

        brain.setTaskList(Activity.FIGHT, 10, ImmutableList.of(
                new MeleeAttackTask(40),
                new RangedApproachTask(3.5F),
                new ForgetAttackTargetTask<>()
        ), MemoryModuleType.ATTACK_TARGET);

        brain.setTaskList(Activity.IDLE, ImmutableList.of(
                Pair.of(0, new GoTowardsLookTarget(3.5F, 0)),
                Pair.of(0, new LightableUpdateAttackTargetTask(HURT_BY_EXCEPT_OWNER_GETTER)),
                Pair.of(1, new WaitTask(30, 60)),
                Pair.of(2, new LoveTask<>(3.0F, 0.9F)),
                Pair.of(3, new LoveTemptingTask<>(0.9F)),
                Pair.of(4, new TamableFishFollowOwnerTask<>(0.9F, 16.0F, 6.0F)),
                Pair.of(4, new TimeLimitedTask<>(new FollowMobTask(8.0F), IntRange.between(30, 60))),
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

    public int getLoosejawType() {
        return this.dataTracker.get(LOOSEJAW_TYPE);
    }

    public void setLoosejawType(int loosejawType) {
        this.dataTracker.set(LOOSEJAW_TYPE, loosejawType);
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

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        EntityData data = super.initialize(world, difficulty, spawnReason, entityData, entityTag);

        if (entityTag != null && entityTag.contains("LoosejawType"))
            this.setLoosejawType(entityTag.getInt("LoosejawType"));

        else if (entityData instanceof LoosejawData)
            this.setLoosejawType(((LoosejawData) entityData).type);
        else {
            int loosejawType = this.chooseType();
            this.setLoosejawType(loosejawType);

            return new LoosejawData(loosejawType);
        }

        return data;
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
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        this.setLoosejawType(tag.getInt("LoosejawType"));
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        tag.putInt("LoosejawType", this.getLoosejawType());
    }

    public static class LoosejawData extends PassiveEntity.PassiveData {

        public final int type;

        public LoosejawData(int type) {
            super(1.0F);

            this.type = type;
        }

    }

}
