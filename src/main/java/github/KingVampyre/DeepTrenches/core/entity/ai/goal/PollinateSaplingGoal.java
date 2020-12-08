package github.KingVampyre.DeepTrenches.core.entity.ai.goal;

import github.KingVampyre.DeepTrenches.common.entity.ai.goal.MoveAroundHomeGoal;
import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.AQUEAN_SAPLING;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.FUCHSITRA_SAPLING;

public class PollinateSaplingGoal extends MoveAroundHomeGoal {

	protected final StaspPollenComponent pollen;

	public PollinateSaplingGoal(StaspEntity stasp, double speed, int range, int maxYDifference, double probability) {
		super(stasp, speed, range, maxYDifference, probability);

		this.pollen = (StaspPollenComponent) Components.POLLEN.get(this.mob);
	}

    @Override
    protected int getInterval(PathAwareEntity mob) {
		return 1200;
    }

    @Override
    public boolean shouldContinue() {
		return !this.pollen.hasPollenCapacity() && !this.pollen.hasAqueanSap() && super.shouldContinue();
   }

    @Override
    public boolean canStart() {
		return !this.pollen.hasPollenCapacity() && !this.pollen.hasAqueanSap() && super.canStart();
	}

    @Override
    protected boolean isTargetPos(WorldView world, BlockPos pos) {
		BlockState state = world.getBlockState(pos);
		Block block = state.getBlock();

		// TODO sapling tag
		return block == AQUEAN_SAPLING || block == FUCHSITRA_SAPLING;
    }

    @Override
    public void tick() {
		super.tick();

		if (this.hasReached()) {
			StaspEntity stasp = (StaspEntity) this.mob;

			BlockPos pos = this.targetPos;
			World world = stasp.getEntityWorld();

			BlockState state = world.getBlockState(pos);
			Block block = state.getBlock();

			// TODO sapling tag
			if (block == AQUEAN_SAPLING || block == FUCHSITRA_SAPLING) {
				world.getBlockTickScheduler().schedule(pos, block, 20);
				this.pollen.setPollen(0);

				this.targetPos = BlockPos.ORIGIN;
			}

		}

    }

}
