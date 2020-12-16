package github.KingVampyre.DeepTrenches.common.entity.ai.goal;

import github.KingVampyre.DeepTrenches.common.component.animal.TamableComponent;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetFinder;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.LandPathNodeMaker;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.EnumSet;

public class FollowOwnerGoal extends Goal {

    protected final double maxDist;
    protected final double minDist;
    protected final double minTeleportDist;
    protected final boolean leavesAllowed;
    protected final double speed;
    protected final PathAwareEntity mob;
    protected final EntityNavigation navigation;
    protected final TamableComponent tamable;
    protected final World world;

    protected float oldWaterpenalty;
    protected int updateCountdownTicks;
    protected LivingEntity owner;

    public FollowOwnerGoal(PathAwareEntity mob, TamableComponent tamable, double speed, double minTeleportDist, double minDist, double maxDist, boolean leavesAllowed) {
        this.mob = mob;
        this.tamable = tamable;
        this.speed = speed;
        this.maxDist = maxDist;
        this.minDist = minDist;
        this.leavesAllowed = leavesAllowed;
        this.minTeleportDist = minTeleportDist;
        this.navigation = this.mob.getNavigation();
        this.world = this.mob.getEntityWorld();

        this.setControls(EnumSet.of(Goal.Control.MOVE, Goal.Control.LOOK));
    }

    @Override
    public boolean canStart() {
        LivingEntity owner = this.tamable.getOwner();

        if (owner == null)
            return false;
        else if (owner.isSpectator())
            return false;
        else if (this.tamable.getIsSitting())
            return false;
        else if (this.mob.distanceTo(owner) < this.minDist)
            return false;

        this.owner = owner;
        return true;
    }

    @Override
    public boolean shouldContinue() {

        if (this.navigation.isIdle())
            return false;
        else if (this.tamable.getIsSitting())
            return false;

        return this.mob.distanceTo(this.owner) > this.maxDist;
    }

    @Override
    public void start() {
        this.updateCountdownTicks = 0;
        this.oldWaterpenalty = this.mob.getPathfindingPenalty(PathNodeType.WATER);

        this.mob.setPathfindingPenalty(PathNodeType.WATER, 0.0F);
    }

    @Override
    public void stop() {
        this.owner = null;
        this.navigation.stop();
        this.mob.setPathfindingPenalty(PathNodeType.WATER, this.oldWaterpenalty);
    }

    @Override
    public void tick() {
        this.mob.getLookControl().lookAt(this.owner, 10.0F, this.mob.getLookPitchSpeed());

        if (--this.updateCountdownTicks <= 0) {
            this.updateCountdownTicks = 10;

            if (!this.mob.isLeashed() && !this.mob.hasVehicle()) {

                if (this.mob.distanceTo(this.owner) >= this.minTeleportDist)
                    this.tryTeleport();
                else
                    this.startMovingTo(this.owner, this.speed);

            }

        }

    }

    protected boolean canTeleportTo(BlockPos pos) {
        PathNodeType pathNodeType = LandPathNodeMaker.getLandNodeType(this.world, pos.mutableCopy());

        if (pathNodeType != PathNodeType.WALKABLE)
            return false;

        BlockState state = this.world.getBlockState(pos.down());

        if (!this.leavesAllowed && state.getBlock() instanceof LeavesBlock)
            return false;

        BlockPos subtract = pos.subtract(this.mob.getBlockPos());
        Box box = this.mob.getBoundingBox();
        Box offset = box.offset(subtract);

        return this.world.isSpaceEmpty(this.mob, offset);
    }

    protected Vec3d findTarget() {
        BlockPos pos = this.owner.getBlockPos();
        Vec3d vec3d = Vec3d.ofCenter(pos);

        return TargetFinder.findTargetTowards(this.mob, 3, 1, vec3d);
    }

    protected boolean startMovingTo(Entity entity, double speed) {
        return this.navigation.startMovingTo(entity, speed);
    }

    protected void tryTeleport() {
        for (int i = 0; i < 10; i++) {
            Vec3d target = this.findTarget();

            if(target != null) {
                double x = target.getX() + 0.5D;
                double y = target.getY();
                double z = target.getZ() + 0.5D;

                BlockPos pos = new BlockPos(x, y, z);

                if (this.canTeleportTo(pos)) {
                    this.mob.refreshPositionAfterTeleport(x, y, z);
                    this.navigation.stop();
                }

            }

        }

    }

}
