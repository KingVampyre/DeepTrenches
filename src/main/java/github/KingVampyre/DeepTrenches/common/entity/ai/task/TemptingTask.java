package github.KingVampyre.DeepTrenches.common.entity.ai.task;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.ai.brain.*;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;

import java.util.Optional;

import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.TEMPTATION_COOLDOWN_TICKS;
import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.TEMPTED;
import static github.KingVampyre.DeepTrenches.core.init.MemoryModuleTypes.TEMPTING_PLAYER;
import static net.minecraft.entity.ai.brain.MemoryModuleState.*;
import static net.minecraft.entity.ai.brain.MemoryModuleType.LOOK_TARGET;
import static net.minecraft.entity.ai.brain.MemoryModuleType.WALK_TARGET;

public class TemptingTask extends Task<PathAwareEntity> {

    protected final float speed;

    public TemptingTask(float speed) {
        super(ImmutableMap.of(LOOK_TARGET, REGISTERED, WALK_TARGET, REGISTERED, TEMPTATION_COOLDOWN_TICKS, VALUE_ABSENT, TEMPTED, REGISTERED, TEMPTING_PLAYER, VALUE_PRESENT));

        this.speed = speed;
    }

    private Optional<PlayerEntity> getTemptingPlayer(PathAwareEntity pathAwareEntity) {
        return pathAwareEntity.getBrain().getOptionalMemory(TEMPTING_PLAYER);
    }

    @Override
    protected boolean isTimeLimitExceeded(long time) {
        return false;
    }

    @Override
    protected boolean shouldKeepRunning(ServerWorld serverWorld, PathAwareEntity entity, long l) {
        return this.getTemptingPlayer(entity).isPresent();
    }

    @Override
    protected void run(ServerWorld serverWorld, PathAwareEntity pathAwareEntity, long l) {
        pathAwareEntity.getBrain().remember(TEMPTED, true);
    }

    @Override
    protected void finishRunning(ServerWorld serverWorld, PathAwareEntity entity, long l) {
        Brain<?> brain = entity.getBrain();

        brain.remember(TEMPTATION_COOLDOWN_TICKS, 100);
        brain.remember(TEMPTED, false);
        brain.forget(WALK_TARGET);
        brain.forget(LOOK_TARGET);
    }

    @Override
    protected void keepRunning(ServerWorld serverWorld, PathAwareEntity entity, long l) {
        Brain<?> brain = entity.getBrain();

        this.getTemptingPlayer(entity).ifPresent(player -> {
            brain.remember(LOOK_TARGET, new EntityLookTarget(player, true));

            if (entity.squaredDistanceTo(player) < 6.25D)
                brain.forget(WALK_TARGET);
            else
                brain.remember(WALK_TARGET, new WalkTarget(new EntityLookTarget(player, false), this.speed, 2));

        });

    }

}
