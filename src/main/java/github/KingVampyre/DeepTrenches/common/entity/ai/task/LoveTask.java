package github.KingVampyre.DeepTrenches.common.entity.ai.task;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Lovable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.task.LookTargetUtil;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.server.world.ServerWorld;

import java.util.List;
import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.BREEDING_TARGET;
import static net.minecraft.entity.ai.brain.MemoryModuleState.*;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;

public class LoveTask<T extends MobEntity & Lovable> extends Task<T> {

    protected final double minDist;
    protected final float speed;

    protected long breedTime;
    protected LivingEntity target;

    public LoveTask(double minDist, float speed) {
        super(ImmutableMap.of(VISIBLE_MOBS, VALUE_PRESENT, BREEDING_TARGET, VALUE_ABSENT, WALK_TARGET, REGISTERED, LOOK_TARGET, REGISTERED), 325);

        this.minDist = minDist;
        this.speed = speed;
    }

    @Override
    protected void finishRunning(ServerWorld world, T entity, long time) {
        entity.getBrain().forget(BREEDING_TARGET);
        entity.getBrain().forget(WALK_TARGET);
        entity.getBrain().forget(LOOK_TARGET);
        this.breedTime = 0;
    }

    @Override
    protected void keepRunning(ServerWorld world, T entity, long time) {
        LivingEntity breedTarget = this.getBreedTarget(entity);
        this.lookAtAndWalkTowardsEachOther(entity, breedTarget, this.speed);

        if (this.isCloseEnough(entity, breedTarget)) {
            Lovable lovable = (Lovable) breedTarget;

            if (time >= this.breedTime) {
                entity.breed(world, lovable);

                entity.getBrain().forget(BREEDING_TARGET);
                breedTarget.getBrain().forget(BREEDING_TARGET);
            }

        }

    }

    @Override
    protected void run(ServerWorld world, T entity, long time) {
        entity.getBrain().remember(BREEDING_TARGET, this.target);
        this.target.getBrain().remember(BREEDING_TARGET, entity);

        this.lookAtAndWalkTowardsEachOther(entity, this.target, this.speed);

        this.breedTime = time + this.getTime(world.random);
    }

    @Override
    protected boolean shouldKeepRunning(ServerWorld world, T entity, long time) {
        if (!this.hasBreedTarget(entity))
            return false;

        LivingEntity breedTarget = this.getBreedTarget(entity);

        return breedTarget.isAlive() && entity.canBreedWith(breedTarget) && LookTargetUtil.canSee(entity.getBrain(), breedTarget) && time <= this.breedTime;
    }

    @Override
    protected boolean shouldRun(ServerWorld world, T entity) {

        if(entity.isInLove()) {
            this.target = this.findBreedTarget(entity);

            return this.target != null;
        }

        return false;
    }

    protected LivingEntity findBreedTarget(T entity) {
        return entity.getBrain().getOptionalMemory(VISIBLE_MOBS)
                .stream()
                .flatMap(List::stream)
                .filter(entity::canBreedWith)
                .findFirst()
                .orElse(null);
    }

    protected boolean hasBreedTarget(LivingEntity living) {
        return living.getBrain().hasMemoryModule(BREEDING_TARGET);
    }

    protected boolean isCloseEnough(Entity entity, LivingEntity breedTarget) {
        return entity.isInRange(breedTarget, this.minDist);
    }

    protected LivingEntity getBreedTarget(LivingEntity living) {
        return living.getBrain().getOptionalMemory(BREEDING_TARGET).orElseThrow();
    }

    protected long getTime(Random random) {
        return 275 + random.nextInt(50);
    }

    protected void lookAtAndWalkTowardsEachOther(T first, LivingEntity second, float speed) {
        LookTargetUtil.lookAt(first, second);
        LookTargetUtil.lookAt(second, first);

        LookTargetUtil.walkTowards(first, second, speed, 0);
        LookTargetUtil.walkTowards(second, first, speed, 0);
    }

}
