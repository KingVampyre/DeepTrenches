package github.KingVampyre.DeepTrenches.core.block;

import static net.minecraft.block.enums.BlockHalf.BOTTOM;
import static net.minecraft.state.property.Properties.BLOCK_HALF;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class TallCoralBlock extends DeadTallCoralBlock {

	protected Block deadCoralBlock;
	
	public TallCoralBlock(Block deadCoralBlock, Settings settings) {
		super(settings);
		
		this.deadCoralBlock = deadCoralBlock;
	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		BlockState deadBlock = this.deadCoralBlock.getDefaultState();

		BlockState newState = deadBlock.with(BLOCK_HALF, state.get(BLOCK_HALF));
		BlockPos blockPos = state.get(BLOCK_HALF) == BOTTOM ? pos.up() : pos.down();
		BlockState halfState = world.getBlockState(blockPos);

		if (!isInWater(state, world, pos))
			newState = newState.with(WATERLOGGED, false);

		halfState = deadBlock.with(BLOCK_HALF, halfState.get(BLOCK_HALF)).with(WATERLOGGED, halfState.get(WATERLOGGED));

		world.setBlockState(blockPos, halfState, 2);
		world.setBlockState(pos, newState, 2);
	}

}
