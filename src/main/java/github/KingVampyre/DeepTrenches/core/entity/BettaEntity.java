package github.KingVampyre.DeepTrenches.core.entity;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import github.KingVampyre.DeepTrenches.common.entity.TamableFishEntity;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.ai.brain.task.GoTowardsLookTarget;
import net.minecraft.entity.ai.brain.task.LookAroundTask;
import net.minecraft.entity.ai.brain.task.StrollTask;
import net.minecraft.entity.ai.brain.task.WanderAroundTask;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.IntRange;
import net.minecraft.world.World;

import java.util.List;

import static github.KingVampyre.DeepTrenches.core.init.AttributeModifiers.MOVEMENT_SPEED_BOOST_235;
import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.BETTA_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.BETTA_TEMPTING;
import static github.KingVampyre.DeepTrenches.core.init.SensorTypes.NEAREST_ADULT;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.entity.ai.brain.sensor.SensorType.NEAREST_LIVING_ENTITIES;
import static net.minecraft.item.Items.COD;

public class BettaEntity extends TamableFishEntity {

    protected static final ImmutableList<? extends SensorType<? extends Sensor<? super BettaEntity>>> SENSORS = ImmutableList.of(SensorType.HURT_BY, NEAREST_LIVING_ENTITIES, BETTA_TEMPTING, NEAREST_ADULT);

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
    public Entity createChild(ServerWorld world, Lovable lovable) {
        BettaEntity betta = (BettaEntity) this.getType().create(world);

        if(betta != null) {
            PlayerEntity player = lovable.getLovingPlayer();

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
    protected EntityAttributeModifier getSpeedModifier() {
        return MOVEMENT_SPEED_BOOST_235;
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

}
