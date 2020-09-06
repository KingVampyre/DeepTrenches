package github.KingVampyre.DeepTrenches.core.block;

import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.block.enums.SlabType.BOTTOM;
import static net.minecraft.block.enums.SlabType.DOUBLE;
import static net.minecraft.block.enums.SlabType.TOP;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.chunk.ChunkGenerator;

public class StorceanTallSaplingBlock extends StorceanSaplingBlock {

	public static final IntProperty AGE = Properties.AGE_25;
	public static final EnumProperty<SlabType> TYPE = Properties.SLAB_TYPE;

	public StorceanTallSaplingBlock(SaplingGenerator generator, Settings settings) {
		super(generator, settings);

		this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0).with(STAGE, 0).with(TYPE, DOUBLE));
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {

		if (floor.getBlock() == this && floor.get(TYPE) == BOTTOM)
			return true;

		return super.canPlantOnTop(floor, view, pos);
	}

	@Override
	public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
		return state.get(AGE) < 25;
	}

	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		super.appendProperties(builder);

		builder.add(AGE);
		builder.add(TYPE);
	}

	@Override
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {

		if (state.get(TYPE) == BOTTOM && world.isAir(pos.up()))
			return false;

		return super.canPlaceAt(state, world, pos);
	}

	@Override
	public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
		SlabType type = state.get(TYPE);

		if (state.get(AGE) < 24)
			worldIn.setBlockState(pos, state.cycle(AGE), 3);

		if (state.get(STAGE) == 0 && type == DOUBLE) {

			if (state.get(AGE) >= 10) {
				BlockPos up = pos.up();
				BlockState upState = worldIn.getBlockState(up);

				if (upState.canPlaceAt(worldIn, up)) {
					worldIn.setBlockState(up, state.with(TYPE, TOP).with(STAGE, 1), 3);
					worldIn.setBlockState(pos, state.with(TYPE, BOTTOM).with(STAGE, 1), 3);
				}
			}

		} else if (state.get(STAGE) == 1) {
			BlockPos blockPos = type == BOTTOM ? pos.up() : pos.down();
			BlockState blockState = worldIn.getBlockState(blockPos);

			if (state.get(AGE) == 24)
				worldIn.setBlockState(blockPos, blockState.with(AGE, 24), 3);
			else
				worldIn.setBlockState(blockPos, blockState.cycle(AGE), 3);

			if (state.get(AGE) == 24) {
				ChunkGenerator chunkGenerator = worldIn.getChunkManager().getChunkGenerator();

				this.generator.generate(worldIn, chunkGenerator, type == BOTTOM ? pos : pos.down(), state, rand);
			}

		}
	}

	@Override
	public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {

		if (player.isCreative() && state.get(TYPE) == TOP) {
			BlockPos down = pos.down();

			world.setBlockState(down, AIR.getDefaultState(), 3);
		}

		super.onBreak(world, pos, state, player);
	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

		if (!this.canPlaceAt(state, world, pos))
			world.removeBlock(pos, false);

		if (world.getLightLevel(pos.up()) >= 9 && random.nextInt(3) == 0)
			this.grow(world, random, pos, state);
	}

}
