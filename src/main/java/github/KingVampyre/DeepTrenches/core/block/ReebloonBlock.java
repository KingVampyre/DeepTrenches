package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FernBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.*;

public class ReebloonBlock extends FernBlock {

	public ReebloonBlock(AbstractBlock.Settings settings) {
		super(settings);
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
		return floor.isOf(DRITEAN) || floor.isOf(MOSOIL);
	}

	@Override
	public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
		world.setBlockState(pos, REEBLOON.getDefaultState(), 2);

	}

}
