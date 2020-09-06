package github.KingVampyre.DeepTrenches.core.block;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.DRITEAN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.MOSOIL;

import github.KingVampyre.DeepTrenches.common.block.ModSaplingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class StorceanSaplingBlock extends ModSaplingBlock {

	public StorceanSaplingBlock(SaplingGenerator generator, Settings settings) {
		super(generator, settings);
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
		return floor.getBlock() == DRITEAN || floor.getBlock() == MOSOIL;
	}
	
}
