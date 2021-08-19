package github.KingVampyre.DeepTrenches.common.entity.ai.task;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Tamable;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.FuzzyTargeting;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.EntityLookTarget;
import net.minecraft.entity.ai.brain.WalkTarget;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.ai.pathing.LandPathNodeMaker;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

import static github.KingVampyre.DeepTrenches.core.init.DTMemoryModuleTypes.OWNER;
import static net.minecraft.entity.ai.brain.MemoryModuleState.*;
import static net.minecraft.entity.ai.brain.MemoryModuleType.LOOK_TARGET;
import static net.minecraft.entity.ai.brain.MemoryModuleType.WALK_TARGET;
import static net.minecraft.predicate.entity.EntityPredicates.EXCEPT_SPECTATOR;

public class FollowOwnerTask<T extends PathAwareEntity & Tamable> extends Task<T> {

    protected final double minDist;
    protected final double minTeleportDist;
    protected final boolean leavesAllowed;
    protected final float speed;

    protected float oldWaterPenalty;
    protected int updateCountdownTicks;

    public FollowOwnerTask(float speed, double minTeleportDist, double minDist, boolean leavesAllowed) {
        super(ImmutableMap.of(LOOK_TARGET, REGISTERED, OWNER, VALUE_PRESENT, WALK_TARGET, REGISTERED));

        this.speed = speed;
        this.minDist = minDist;
        this.leavesAllowed = leavesAllowed;
        this.minTeleportDist = minTeleportDist;
    }

    @Override
    protected void finishRunning(ServerWorld world, T entity, long time) {
        Brain<?> brain = entity.getBrain();

        brain.forget(WALK_TARGET);
        brain.forget(LOOK_TARGET);

        entity.setPathfindingPenalty(PathNodeType.WATER, this.oldWaterPenalty);
    }

    @Override
    protected void keepRunning(ServerWorld world, T entity, long time) {
        Brain<?> brain = entity.getBrain();
        LivingEntity owner = entity.getOwner();

        brain.remember(LOOK_TARGET, new EntityLookTarget(owner, true));

        if (--this.updateCountdownTicks <= 0) {
            this.updateCountdownTicks = 10;

            if (!entity.isLeashed() && !entity.hasVehicle()) {

                if (entity.distanceTo(owner) >= this.minTeleportDist)
                    this.tryTeleport(world, entity, owner);
                else
                    brain.remember(WALK_TARGET, new WalkTarget(new EntityLookTarget(owner, false), this.speed, 2));

            }

        }

    }

    @Override
    protected void run(ServerWorld world, T entity, long time) {
        this.oldWaterPenalty = entity.getPathfindingPenalty(PathNodeType.WATER);

        entity.setPathfindingPenalty(PathNodeType.WATER, 0.0F);
    }

    @Override
    protected boolean shouldKeepRunning(ServerWorld world, T entity, long time) {
        return this.shouldRun(world, entity);
    }

    @Override
    protected boolean shouldRun(ServerWorld world, T entity) {

        if(entity.isTamed()) {
            LivingEntity owner = entity.getOwner();

            if (owner == null)
                return false;
            else if (!EXCEPT_SPECTATOR.test(owner))
                return false;
            else if (entity.isSitting())
                return false;
            else
                return entity.distanceTo(owner) > this.minDist;
        }

        return false;
    }

    protected boolean canTeleportTo(ServerWorld world, T entity, BlockPos pos) {
        PathNodeType pathNodeType = LandPathNodeMaker.getLandNodeType(world, pos.mutableCopy());

        if (pathNodeType != PathNodeType.WALKABLE)
            return false;

        BlockState state = world.getBlockState(pos.down());

        if (!this.leavesAllowed && state.getBlock() instanceof LeavesBlock)
            return false;

        BlockPos subtract = pos.subtract(entity.getBlockPos());
        Box box = entity.getBoundingBox();
        Box offset = box.offset(subtract);

        return world.isSpaceEmpty(entity, offset);
    }

    protected Vec3d findTarget(T entity, LivingEntity owner) {
        BlockPos pos = owner.getBlockPos();
        Vec3d vec3d = Vec3d.ofCenter(pos);

        return FuzzyTargeting.findTo(entity, 3, 1, vec3d);
    }

    protected void tryTeleport(ServerWorld world, T entity, LivingEntity owner) {

        for (int i = 0; i < 10; i++) {
            Vec3d target = this.findTarget(entity, owner);

            if(target != null) {
                double x = target.getX();
                double y = target.getY();
                double z = target.getZ();

                BlockPos pos = new BlockPos(x, y, z);

                if (this.canTeleportTo(world, entity, pos))
                    entity.refreshPositionAfterTeleport(x, y, z);

            }

        }

    }

}
