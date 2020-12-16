package github.KingVampyre.DeepTrenches.common.entity.ai.goal;

import github.KingVampyre.DeepTrenches.common.component.animal.TamableComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.TargetFinder;
import net.minecraft.entity.ai.pathing.LandPathNodeMaker;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class UnderwaterFollowOwnerGoal extends FollowOwnerGoal {

    public UnderwaterFollowOwnerGoal(PathAwareEntity mob, TamableComponent tamable, double speed, double minTeleportDist, double minDist, double maxDist, boolean leavesAllowed) {
        super(mob, tamable, speed, minTeleportDist, minDist, maxDist, leavesAllowed);
    }

    @Override
    protected boolean canTeleportTo(BlockPos pos) {
        PathNodeType pathNodeType = LandPathNodeMaker.getLandNodeType(this.world, pos.mutableCopy());

        return pathNodeType == PathNodeType.WATER;
    }

    @Override
    protected Vec3d findTarget() {
        BlockPos pos = this.owner.getBlockPos();
        Vec3d vec3d = Vec3d.ofCenter(pos);

        return TargetFinder.findTargetTowards(this.mob, 3, 1, vec3d);
    }

    @Override
    protected boolean startMovingTo(Entity entity, double speed) {
        Vec3d vec3d = entity.getPos();

        double x = vec3d.getX();
        double y = vec3d.getY() + 1;
        double z = vec3d.getZ();

        return this.navigation.startMovingTo(x, y, z, speed);
    }
}
