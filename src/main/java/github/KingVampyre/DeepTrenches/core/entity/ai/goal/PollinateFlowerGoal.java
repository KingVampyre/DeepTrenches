package github.KingVampyre.DeepTrenches.core.entity.ai.goal;

import java.util.Random;

import github.KingVampyre.DeepTrenches.common.entity.ai.goal.MoveAroundHomeGoal;
import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.*;

public class PollinateFlowerGoal extends MoveAroundHomeGoal {

	protected final StaspPollenComponent pollen;
	protected int pollinateDelay;

    public PollinateFlowerGoal(StaspEntity stasp, double speed, int range, int maxYDifference, double probability) {
		super(stasp, speed, range, maxYDifference, probability);

		this.pollen = (StaspPollenComponent) Components.POLLEN.get(this.mob);
    }

	protected int getPollinateDelay(StaspEntity stasp) {
		Random random = stasp.getRandom();

		return 300 + random.nextInt( 100);
	}

	@Override
	protected int getInterval(PathAwareEntity mob) {
		return 500;
	}

	@Override
	public boolean shouldContinue() {

		if (this.pollen.hasPollenCapacity() && !this.pollen.hasAqueanSap() && this.pollen.getTicksSincePollination() != 0)
			return super.shouldContinue();

		return false;
	}

    @Override
    public boolean canStart() {
		return this.pollen.hasPollenCapacity() && !this.pollen.hasAqueanSap() && super.canStart();
    }

    @Override
    public boolean shouldResetPath() {
		return true;
    }

    @Override
	protected boolean isTargetPos(WorldView world, BlockPos pos) {
		BlockState state = world.getBlockState(pos);
		Block block = state.getBlock();

		BlockPos down = this.mob.getBlockPos().down();
		BlockPos up = pos.up();

		BlockState upState = world.getBlockState(up);

		if (!down.equals(pos) && upState.isAir())
			// TODO tag
			return block == AQUEAN_LEAVES || block == FUCHSITRA_LEAVES;

		return false;
    }

    @Override
    public void tick() {
		super.tick();

		if (this.hasReached()) {
			StaspEntity stasp = (StaspEntity) this.mob;

			if (this.pollinateDelay == 0)
				this.pollinateDelay = this.getPollinateDelay(stasp);

			if (this.pollinateDelay > 0)
				--this.pollinateDelay;

			if (this.pollinateDelay == 0) {
				Random random = stasp.getRandom();

				int currPollen = this.pollen.getPollen();
				int maxPollen = this.pollen.getMaxPollen();
				int newPollen = currPollen + 25 + random.nextInt(15);

				this.pollen.setPollen(Math.min(newPollen, maxPollen));
				this.pollen.setTicksSincePollination(0);

				this.targetPos = BlockPos.ORIGIN;
			}
		} else
			this.mob.getNavigation().recalculatePath();

    }

}