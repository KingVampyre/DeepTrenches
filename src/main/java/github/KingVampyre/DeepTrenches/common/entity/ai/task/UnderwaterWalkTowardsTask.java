package github.KingVampyre.DeepTrenches.common.entity.ai.task;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.ai.brain.task.LookTargetUtil;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import static net.minecraft.entity.ai.brain.MemoryModuleState.REGISTERED;
import static net.minecraft.entity.ai.brain.MemoryModuleState.VALUE_ABSENT;
import static net.minecraft.entity.ai.brain.MemoryModuleType.*;
import static net.minecraft.tag.FluidTags.WATER;

public class UnderwaterWalkTowardsTask extends Task<PathAwareEntity> {

    protected final int range;
    protected final float speed;

    public UnderwaterWalkTowardsTask(int range, float speed) {
        super(ImmutableMap.of(ATTACK_TARGET, VALUE_ABSENT, WALK_TARGET, VALUE_ABSENT, LOOK_TARGET, REGISTERED));
        this.range = range;
        this.speed = speed;
    }

    @Override
    protected boolean shouldRun(ServerWorld serverWorld, PathAwareEntity pathAwareEntity) {
        BlockPos pos = pathAwareEntity.getBlockPos();

        return !pathAwareEntity.world.getFluidState(pos).isIn(WATER);
    }

    @Override
    protected void run(ServerWorld serverWorld, PathAwareEntity pathAwareEntity, long l) {
        Iterable<BlockPos> iterable = BlockPos.iterateOutwards(pathAwareEntity.getBlockPos(), this.range, this.range, this.range);

        for (BlockPos pos : iterable) {

            if (pathAwareEntity.world.getFluidState(pos).isIn(WATER))
                LookTargetUtil.walkTowards(pathAwareEntity, pos, this.speed, 0);
        }

    }

}
