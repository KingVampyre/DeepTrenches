package github.KingVampyre.DeepTrenches.common.entity.ai.goal;

import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.FuzzyTargeting;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.*;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class FlyOntoTreeGoal extends WanderAroundFarGoal {

    protected final Box box;
    protected final Predicate<BlockState> predicate;

    public FlyOntoTreeGoal(PathAwareEntity pathAwareEntity, Box box, Predicate<BlockState> predicate, double speed, float probability) {
        super(pathAwareEntity, speed, probability);

        this.box = box;
        this.predicate = predicate;
    }

    @Override
    protected Vec3d getWanderTarget() {
        Vec3d target = super.getWanderTarget();

        if (this.mob.isTouchingWater()) {
            Vec3d vec3d = FuzzyTargeting.find(this.mob, 15, 15);

            return target == null ? vec3d : target;
        }

        if (this.mob.getRandom().nextFloat() >= this.probability) {
            Vec3d vec3d = this.getTreeTarget();

            return target == null ? vec3d : target;
        }

        return target;
    }

    protected Vec3d getTreeTarget() {
        BlockPos blockPos = this.mob.getBlockPos();
        World world = this.mob.getEntityWorld();

        BlockPos.Mutable mutable = new BlockPos.Mutable();
        BlockPos.Mutable mutable2 = new BlockPos.Mutable();

        int startX = MathHelper.floor(this.mob.getX() - this.box.minX);
        int startY = MathHelper.floor(this.mob.getY() - this.box.minY);
        int startZ = MathHelper.floor(this.mob.getZ() - this.box.minZ);

        int endX = MathHelper.floor(this.mob.getX() + this.box.maxX);
        int endY = MathHelper.floor(this.mob.getY() + this.box.maxY);
        int endZ = MathHelper.floor(this.mob.getZ() + this.box.maxZ);

        Iterable<BlockPos> iterable = BlockPos.iterate(startX, startY, startZ, endX, endY, endZ);

        for (BlockPos pos : iterable) {

            if(!blockPos.equals(pos)) {
                BlockState state = world.getBlockState(mutable2.set(pos, Direction.DOWN));

                if(this.predicate.test(state)) {

                    if(world.isAir(pos) || world.isAir(mutable.set(pos, Direction.UP)))
                        return Vec3d.ofBottomCenter(pos);
                }
            }

        }

        return null;
    }

}
