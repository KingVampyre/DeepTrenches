package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import github.KingVampyre.DeepTrenches.common.entity.TamableFishEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.LoveTask;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.LoveTemptingTask;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.TamableFishFollowOwnerTask;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.TemptingCooldownTask;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.ai.brain.task.*;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

import java.util.List;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_235;
import static github.KingVampyre.DeepTrenches.core.init.EntityTypes.BETTA;
import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.BETTA_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.BETTA_TEMPTING;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.SKITTISH_HURT_BY;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.entity.ai.brain.sensor.SensorType.NEAREST_LIVING_ENTITIES;
import static net.minecraft.item.Items.COD;

public class BettaEntity extends TamableFishEntity {

    protected static final ImmutableList<? extends SensorType<? extends Sensor<? super BettaEntity>>> SENSORS = ImmutableList.of(SKITTISH_HURT_BY, NEAREST_LIVING_ENTITIES, BETTA_TEMPTING);

    private static final TrackedData<Integer> BETTA_TYPE = DataTracker.registerData(BettaEntity.class, TrackedDataHandlerRegistry.INTEGER);
    private static final IntRange ANGER_TIME_RANGE = Durations.betweenSeconds(10, 15);

    public BettaEntity(EntityType<? extends BettaEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean canAttackWithOwner(LivingEntity target, LivingEntity owner) {
        return false;
    }

    @Override
    protected Brain.Profile<BettaEntity> createBrainProfile() {
        return Brain.createProfile(this.getMemoryModules(), SENSORS);
    }

    @Override
    public List<MemoryModuleType<?>> getMemoryModules() {
        List<MemoryModuleType<?>> memoryModules = super.getMemoryModules();

        memoryModules.add(BREEDING_TARGET);
        memoryModules.add(CANT_REACH_WALK_TARGET_SINCE);
        memoryModules.add(HURT_BY);
        memoryModules.add(HURT_BY_ENTITY);
        memoryModules.add(LOOK_TARGET);
        memoryModules.add(PATH);
        memoryModules.add(TEMPTATION_COOLDOWN_TICKS);
        memoryModules.add(TEMPTING_PLAYER);
        memoryModules.add(TEMPTED);
        memoryModules.add(VISIBLE_MOBS);
        memoryModules.add(WALK_TARGET);

        return ImmutableList.copyOf(memoryModules);
    }

    @Override
    protected void copyDataToStack(ItemStack stack) {
        super.copyDataToStack(stack);

        CompoundTag compound = stack.getOrCreateTag();

        compound.putInt("BettaType", this.getBettaType());
    }

    @Override
    public Entity createChild(ServerWorld world, Lovable lovable) {
        BettaEntity betta = BETTA.create(world);

        if(betta != null) {
            PlayerEntity player = lovable.getLovingPlayer();

            betta.setBettaType(this.random.nextInt(7));
            betta.setTamedBy(player);
        }

        return betta;
    }

    @Override
    public ExperienceOrbEntity createExperienceOrb(ServerWorld server, double x, double y, double z) {
        return new ExperienceOrbEntity(server, x, y, z, this.random.nextInt(7) + 1);
    }

    @Override
    protected Brain<?> deserializeBrain(Dynamic<?> dynamic) {
        Brain<BettaEntity> brain = this.createBrainProfile().deserialize(dynamic);

        brain.setTaskList(Activity.CORE, 0, ImmutableList.of(
                new LookAroundTask(45, 90),
                new WanderAroundTask(200, 350),
                new TemptingCooldownTask()));

        brain.setTaskList(Activity.IDLE, ImmutableList.of(
                Pair.of(0, GoToRememberedPositionTask.toEntity(HURT_BY_ENTITY, 2.115F, 6, false)),
                Pair.of(0, new LoveTask<>(3.0F, 0.9F)),
                Pair.of(1, new LoveTemptingTask<>(0.9F)),
                Pair.of(2, new GoTowardsLookTarget(0.9F, 1)),
                Pair.of(3, new TamableFishFollowOwnerTask<>(0.9F, 16.0F, 6.0F)),
                Pair.of(3, new StrollTask(0.9F, 12, 9))
        ));

        brain.setCoreActivities(ImmutableSet.of(Activity.CORE));
        brain.setDefaultActivity(Activity.IDLE);
        brain.resetPossibleActivities();

        return brain;
    }

    @Override
    protected IntRange getAngerTimeRange() {
        return ANGER_TIME_RANGE;
    }

    @Override
    protected ItemStack getFishBucketItem() {
        return new ItemStack(BETTA_BUCKET);
    }


    @Override
    protected SoundEvent getAmbientSound() {
        // TODO betta ambient sound
        return SoundEvents.ENTITY_SALMON_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        // TODO betta death sound
        return SoundEvents.ENTITY_SALMON_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        // TODO betta hurt sound
        return SoundEvents.ENTITY_SALMON_HURT;
    }

    @Override
    protected SoundEvent getFlopSound() {
        // TODO betta flop sound
        return SoundEvents.ENTITY_SALMON_FLOP;
    }

    @Override
    public EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_235;
    }

    public int getBettaType() {
        return this.dataTracker.get(BETTA_TYPE);
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
    public void setBaby(boolean baby) {
        this.setBreedingAge(baby ? -24000 : 0);
    }

    public void setBettaType(int bettaType) {
        this.dataTracker.set(BETTA_TYPE, bettaType);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();

        this.dataTracker.startTracking(BETTA_TYPE, 0);
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        EntityData data = super.initialize(world, difficulty, spawnReason, entityData, entityTag);

        if (entityTag != null && entityTag.contains("BettaType"))
            this.setBettaType(entityTag.getInt("BettaType"));

        else if (entityData instanceof BettaData)
            this.setBettaType(((BettaData)entityData).type);
        else {
            int bettaType = this.random.nextInt(7);
            this.setBettaType(bettaType);

            return new BettaData(bettaType);
        }

        return data;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void mobTick() {
        super.mobTick();

        Brain<BettaEntity> brain = (Brain<BettaEntity>) this.getBrain();
        ServerWorld server = (ServerWorld) this.world;

        this.world.getProfiler().push("bettaBrain");
        brain.tick(server, this);
        this.world.getProfiler().pop();
        this.world.getProfiler().push("bettaActivityUpdate");
        brain.resetPossibleActivities(ImmutableList.of(Activity.IDLE));
        this.world.getProfiler().pop();
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);

        this.setBettaType(tag.getInt("BettaType"));
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);

        tag.putInt("BettaType", this.getBettaType());
    }

    public static class BettaData extends PassiveEntity.PassiveData {

        public final int type;

        public BettaData(int type) {
            super(1.0F);

            this.type = type;
        }

    }

}
