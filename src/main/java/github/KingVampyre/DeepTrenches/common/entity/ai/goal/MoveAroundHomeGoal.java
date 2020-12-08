package github.KingVampyre.DeepTrenches.common.entity.ai.goal;

import net.minecraft.entity.ai.goal.MoveToTargetPosGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class MoveAroundHomeGoal extends MoveToTargetPosGoal {

    protected final int maxYDifference;
    protected final double probability;
    protected final int range;

    public MoveAroundHomeGoal(PathAwareEntity mob, double speed, int range, int maxYDifference, double probability) {
        super(mob, speed, range);

        this.maxYDifference = maxYDifference;
        this.probability = probability;
        this.range = range;
    }

    @Override
    protected boolean findTargetPos() {
        World world = this.mob.getEntityWorld();

        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for (int y = this.lowestY; y <= this.maxYDifference; y = y > 0 ? -y : 1 - y) {
            for (int range = 0; range < this.range; ++range) {
                for (int x = 0; x <= range; x = x > 0 ? -x : 1 - x) {
                    for (int z = x < range && x > -range ? range : 0; z <= range; z = z > 0 ? -z : 1 - z) {

                        mutable.set(x, y - 1, z);

                        if (this.mob.isInWalkTargetRange(mutable) && this.isTargetPos(world, mutable)) {

                            if(this.mob.getRandom().nextFloat() < this.probability)
                            this.targetPos = mutable;

                            return true;
                        }

                    }
                }
            }
        }

        return false;
    }

}
