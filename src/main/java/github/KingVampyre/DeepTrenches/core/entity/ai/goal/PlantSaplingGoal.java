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

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.*;

public class PlantSaplingGoal extends MoveAroundHomeGoal {

	protected final StaspPollenComponent pollen;

	public PlantSaplingGoal(StaspEntity stasp, double speed, int range, int maxYDifference, double probability) {
		super(stasp, speed, range, maxYDifference, probability);

		this.pollen = (StaspPollenComponent) Components.POLLEN.get(this.mob);
	}

    @Override
    protected int getInterval(PathAwareEntity mob) {
		return 900;
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

		// TODO dritrean tag
		return block == MOSOIL;
	}

	@Override
    public void tick() {
		super.tick();

		if (this.hasReached()) {
			BlockPos pos = this.targetPos.up();
			World worldIn = this.mob.getEntityWorld();

			// TODO sapling tag
			Block block = worldIn.random.nextBoolean() ? AQUEAN_SAPLING : FUCHSITRA_SAPLING;
			BlockState state = block.getDefaultState();

			if (!worldIn.isClient()) {
				worldIn.setBlockState(pos, state);
				this.pollen.setPollen(0);

				this.targetPos = BlockPos.ORIGIN;
			}
		}

    }

}
