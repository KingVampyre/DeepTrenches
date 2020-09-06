package github.KingVampyre.DeepTrenches.core.block;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.REEBLOON;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.GrassBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;

public class MosoilBlock extends GrassBlock {

	public static final BooleanProperty STORCEAN = BooleanProperty.of("storcean");
	
	public MosoilBlock(Settings settings) {
		super(settings);
	}

	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		super.appendProperties(builder);
		
		builder.add(STORCEAN);
	}
	
	@Override
	public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
		BlockState reebloon = REEBLOON.getDefaultState();
		BlockPos up = pos.up();

		for (int i = 0; i < 128; ++i) {
			BlockPos currPos = up;
			int j = 0;

			while (true) {
				if (j >= i / 16) {

					BlockState stateIn = worldIn.getBlockState(currPos);

					if (stateIn.getBlock() == reebloon.getBlock() && rand.nextInt(10) == 0) {
						Fertilizable fertilizable = (Fertilizable) reebloon.getBlock();

						fertilizable.grow(worldIn, rand, currPos, stateIn);
					}

					if (!worldIn.isAir(currPos))
						break;

					if (reebloon.canPlaceAt(worldIn, currPos))
						worldIn.setBlockState(currPos, reebloon, 3);

					break;
				}

				currPos = currPos.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);
				BlockState ground = worldIn.getBlockState(currPos.down());

				if (!ground.isOf(this) || worldIn.getBlockState(currPos).isFullCube(worldIn, currPos))
					break;

				++j;
			}
		}
	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		super.scheduledTick(state, world, pos, random);

		if (!world.isClient) {

			if (state.get(SNOWY)) {
				// TODO: check dimension
			}

		}

	}

}
