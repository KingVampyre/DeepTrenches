package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.FeaturesSaplingBlock;
import github.KingVampyre.DeepTrenches.common.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.DRITEAN;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.MOSOIL;

public class StorceanSaplingBlock extends FeaturesSaplingBlock {

	public StorceanSaplingBlock(FeaturesSaplingGenerator generator, Settings settings) {
		super(generator, settings);
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
		return floor.getBlock() == DRITEAN || floor.getBlock() == MOSOIL;
	}
	
}
