package github.KingVampyre.DeepTrenches.common.entity;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.LoveTask;
import github.KingVampyre.DeepTrenches.common.entity.ai.task.TamableFishFollowOwnerTask;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.task.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;

import static net.minecraft.entity.ai.brain.Activity.CORE;
import static net.minecraft.entity.ai.brain.Activity.IDLE;
import static net.minecraft.entity.ai.brain.MemoryModuleType.HURT_BY_ENTITY;
import static net.minecraft.entity.ai.brain.MemoryModuleType.TEMPTATION_COOLDOWN_TICKS;
import static net.minecraft.item.Items.COD;

public abstract class AbstractBettaEntity extends TamableFishEntity {

    protected static final UniformIntProvider ANGER_TIME_RANGE = Durations.betweenSeconds(10, 15);

    public AbstractBettaEntity(EntityType<? extends TamableFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected UniformIntProvider getAngerTimeRange() {
        return ANGER_TIME_RANGE;
    }

    @Override
    public ExperienceOrbEntity createExperienceOrb(ServerWorld server, double x, double y, double z) {
        return new ExperienceOrbEntity(server, x, y, z, this.random.nextInt(7) + 1);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.getItem() == COD;
    }

    @Override
    public Entity createChild(ServerWorld world, Lovable lovable) {
        AbstractBettaEntity betta = (AbstractBettaEntity) this.getType().create(world);

        if(betta != null) {
            PlayerEntity player = lovable.getLovingPlayer();

            betta.setTamedBy(player);
        }

        return betta;
    }

    @Override
    public boolean canAttackWithOwner(LivingEntity target, LivingEntity owner) {
        return false;
    }

    @Override
    public boolean isTameItem(ItemStack stack) {
        return stack.getItem() == COD;
    }

    @Override
    public void setBaby(boolean baby) {
        this.setBreedingAge(baby ? -24000 : 0);
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

    @SuppressWarnings("unchecked")
    @Override
    protected Brain<?> deserializeBrain(Dynamic<?> dynamic) {
        Brain<AbstractBettaEntity> brain = (Brain<AbstractBettaEntity>) super.deserializeBrain(dynamic);

        brain.setTaskList(CORE, 0, ImmutableList.of(
                new LookAroundTask(45, 90),
                new WanderAroundTask(200, 350),
                new TemptationCooldownTask(TEMPTATION_COOLDOWN_TICKS))
        );

        brain.setTaskList(IDLE, ImmutableList.of(
                Pair.of(0, GoToRememberedPositionTask.toEntity(HURT_BY_ENTITY, 2.115F, 6, false)),
                Pair.of(0, new LoveTask<>(3.0F, 0.9F)),
                Pair.of(1, new TemptTask(entity -> entity.isInsideWaterOrBubbleColumn() ? 0.5F : 0.15F)),
                Pair.of(2, new GoTowardsLookTarget(0.9F, 1)),
                Pair.of(3, new TamableFishFollowOwnerTask<>(0.9F, 16.0F, 6.0F)),
                Pair.of(3, new StrollTask(0.9F, 16, 9))
        ));

        brain.setCoreActivities(ImmutableSet.of(CORE));
        brain.setDefaultActivity(IDLE);
        brain.resetPossibleActivities();

        return brain;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void mobTick() {
        super.mobTick();

        Brain<AbstractBettaEntity> brain = (Brain<AbstractBettaEntity>) this.getBrain();
        ServerWorld server = (ServerWorld) this.world;

        this.world.getProfiler().push("Brain");
        brain.tick(server, this);
        this.world.getProfiler().pop();

        brain.resetPossibleActivities(ImmutableList.of(Activity.IDLE));
    }

}
