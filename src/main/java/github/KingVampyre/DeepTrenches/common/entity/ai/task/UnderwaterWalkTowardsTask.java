package github.KingVampyre.DeepTrenches.common.entity.ai.task;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.ai.brain.MemoryModuleState;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.task.LookTargetUtil;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;

import java.util.Iterator;

public class UnderwaterWalkTowardsTask extends Task<PathAwareEntity> {
    private final int field_28317;
    private final float field_28318;

    public UnderwaterWalkTowardsTask(int i, float f) {
        super(ImmutableMap.of(MemoryModuleType.ATTACK_TARGET, MemoryModuleState.VALUE_ABSENT, MemoryModuleType.WALK_TARGET, MemoryModuleState.VALUE_ABSENT, MemoryModuleType.LOOK_TARGET, MemoryModuleState.REGISTERED));
        this.field_28317 = i;
        this.field_28318 = f;
    }

    protected boolean shouldRun(ServerWorld serverWorld, PathAwareEntity pathAwareEntity) {
        return !pathAwareEntity.world.getFluidState(pathAwareEntity.getBlockPos()).isIn(FluidTags.WATER);
    }

    protected void run(ServerWorld serverWorld, PathAwareEntity pathAwareEntity, long l) {
        BlockPos blockPos = null;
        Iterable<BlockPos> iterable = BlockPos.iterateOutwards(pathAwareEntity.getBlockPos(), this.field_28317, this.field_28317, this.field_28317);
        Iterator var7 = iterable.iterator();

        while (var7.hasNext()) {
            BlockPos blockPos2 = (BlockPos) var7.next();
            if (pathAwareEntity.world.getFluidState(blockPos2).isIn(FluidTags.WATER)) {
                blockPos = blockPos2.toImmutable();
                break;
            }
        }

        if (blockPos != null) {
            LookTargetUtil.walkTowards(pathAwareEntity, blockPos, this.field_28318, 0);
        }

    }

}
