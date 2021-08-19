package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockTags.*;

public class StorceanSaplingBlock extends SaplingBlock {

	public StorceanSaplingBlock(SaplingGenerator generator, Settings settings) {
		super(generator, settings);
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
		return HYBRID_STORCEAN_SAPLING.contains(this) ? floor.isIn(HYBRID_STORCEAN_SAPLING_PLANTABLE) : floor.isIn(DRITEAN);
	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		this.randomTick(state, world, pos, random);
	}

}
