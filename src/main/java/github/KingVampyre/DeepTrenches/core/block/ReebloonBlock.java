package github.KingVampyre.DeepTrenches.core.block;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.MOSOIL;

import net.minecraft.block.BlockState;
import net.minecraft.block.TallSeagrassBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ReebloonBlock extends TallSeagrassBlock {

	public ReebloonBlock(Settings settings) {
		super(settings);
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
		return floor.isOf(MOSOIL);
	}

}
