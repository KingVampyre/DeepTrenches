package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerSpreadableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.DRITEAN;

public class MosoilBlock extends GrassBlock {

	public static final BooleanProperty STORCEAN = BooleanProperty.of("storcean");

	public MosoilBlock(Settings settings) {
		super(settings);

		this.setDefaultState(this.stateManager.getDefaultState().with(SNOWY, false).with(STORCEAN, false));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		super.appendProperties(builder);

		builder.add(STORCEAN);
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (!InvokerSpreadableBlock.canSurvive(state, world, pos))
			world.setBlockState(pos, DRITEAN.getDefaultState());
		else {
			BlockPos up = pos.up();

			if (world.getLightLevel(up) >= 9) {
				BlockState defaultState = this.getDefaultState();

				for(int i = 0; i < 4; ++i) {
					int x = random.nextInt(3) - 1;
					int y = random.nextInt(5) - 3;
					int z = random.nextInt(3) - 1;

					BlockPos blockPos = pos.add(x, y, z);
					BlockState blockState =  world.getBlockState(blockPos);

					if (blockState.isOf(DRITEAN) && InvokerSpreadableBlock.canSpread(defaultState, world, blockPos)) {
						BlockState aboveState = world.getBlockState(blockPos.up());

						BlockState mosoil = defaultState
								.with(SNOWY, aboveState.isOf(Blocks.SNOW))
								.with(STORCEAN, false);

						world.setBlockState(blockPos, mosoil);
					}
				}
			}

		}
	}

}
