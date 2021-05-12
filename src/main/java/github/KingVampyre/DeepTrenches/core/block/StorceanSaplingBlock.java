package github.KingVampyre.DeepTrenches.core.block;

import github.Louwind.Features.impl.block.FeaturesSaplingBlock;
import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlockTags.*;

public class StorceanSaplingBlock extends FeaturesSaplingBlock {

	public StorceanSaplingBlock(FeaturesSaplingGenerator generator, Settings settings) {
		super(generator, settings);
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
		return this.isIn(HYBRID_STORCEAN_SAPLING) ? floor.isIn(HYBRID_STORCEAN_SAPLING_PLANTABLE) : floor.isIn(DRITEAN);
	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		this.randomTick(state, world, pos, random);
	}

}
