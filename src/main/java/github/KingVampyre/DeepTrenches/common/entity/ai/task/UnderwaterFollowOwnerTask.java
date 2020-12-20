package github.KingVampyre.DeepTrenches.common.entity.ai.task;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Tamable;
import net.minecraft.entity.ai.pathing.LandPathNodeMaker;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class UnderwaterFollowOwnerTask<T extends PathAwareEntity & Tamable> extends FollowOwnerTask<T> {

    public UnderwaterFollowOwnerTask(float speed, double minTeleportDist, double minDist) {
        super(speed, minTeleportDist, minDist, false);
    }

    @Override
    protected boolean canTeleportTo(ServerWorld world, T entity, BlockPos pos) {
        PathNodeType pathNodeType = LandPathNodeMaker.getLandNodeType(world, pos.mutableCopy());

        return pathNodeType == PathNodeType.WATER;
    }

}
