package github.KingVampyre.DeepTrenches.core.entity.ai.goal;

import github.KingVampyre.DeepTrenches.common.entity.ai.goal.MoveAroundHomeGoal;
import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.block.BlockState;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.WorldView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlockTags.AQUEAN_LOGS;

public class ExtractAqueanSapGoal extends MoveAroundHomeGoal {

    protected final StaspPollenComponent pollen;
    protected final StaspEntity stasp;
    protected int pollinateDelay;

    public ExtractAqueanSapGoal(StaspEntity stasp, double speed, int range, int maxDifference, double probability) {
		super(stasp, speed, range, maxDifference, probability);

        this.pollen = (StaspPollenComponent) Components.POLLEN.get(this.mob);
        this.stasp = stasp;
    }

    @Override
    protected int getInterval(PathAwareEntity mob) {
        return 700;
    }

    protected int getPollinateDelay(StaspEntity stasp) {
        Random random = stasp.getRandom();

		return 300 + random.nextInt( 100);
    }

    @Override
    public double getDesiredSquaredDistanceToTarget() {
		return 1.15;
    }

    @Override
    public boolean shouldContinue() {
		return this.pollen.hasAqueanSapCapacity() && !this.pollen.hasPollen() && this.targetPos != BlockPos.ORIGIN && super.shouldContinue();
    }

    @Override
    public boolean canStart() {
	    return this.pollen.hasAqueanSapCapacity() && !this.pollen.hasPollen() && super.canStart();
    }

    @Override
    public boolean shouldResetPath() {
        return true;
    }

    @Override
    protected boolean isTargetPos(WorldView world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);

        return state.isIn(AQUEAN_LOGS);
    }

    @Override
    public void stop() {
        this.stasp.setIsHanging(false);
    }

    @Override
    public void tick() {
        super.tick();

        double distance = this.getDesiredSquaredDistanceToTarget();
        BlockPos pos = stasp.getBlockPos();

        if (this.targetPos.isWithinDistance(pos, distance)) {
            double y = (double) MathHelper.floor(this.mob.getY()) + 1 - this.mob.getHeight();

            this.mob.refreshPositionAndAngles(0, y, 0, this.mob.yaw, this.mob.pitch);

            if (this.pollinateDelay == 0) {
                this.pollinateDelay = this.getPollinateDelay(stasp);

                stasp.setIsHanging(true);
            }

            if (this.pollinateDelay > 0)
                --this.pollinateDelay;

            if (this.pollinateDelay == 0) {
                Random random = this.mob.getRandom();

                int aqueanSap = this.pollen.getAqueanSap();
                int maxAqueanSap = this.pollen.getMaxAqueanSap();
                int sap = aqueanSap + 25 + random.nextInt(15);

                this.pollen.setAqueanSap(Math.min(sap, maxAqueanSap));
                this.pollen.setTicksSincePollination(0);

                this.targetPos = BlockPos.ORIGIN;
            }

        } else
            stasp.setIsHanging(false);
    }

}

