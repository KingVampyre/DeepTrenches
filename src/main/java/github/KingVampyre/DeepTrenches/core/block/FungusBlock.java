package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.MOSOIL;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.fluid.Fluids.*;
import static net.minecraft.state.property.Properties.WATERLOGGED;

public class FungusBlock extends StorceanTallSaplingBlock {

	public FungusBlock(FeaturesSaplingGenerator generator, Settings settings) {
		super(generator, settings);
	}

	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		super.appendProperties(builder);

		builder.add(WATERLOGGED);
	}

	@Override
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {

		if (!state.get(WATERLOGGED))
			return false;

		FluidState ifluidstate = world.getFluidState(pos);
		Fluid fluid = ifluidstate.getFluid();

		if (fluid == WATER)
			return super.canPlaceAt(state, world, pos);
		else if (fluid == EMPTY)
			return super.canPlaceAt(state, world, pos);

		return false;
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {
		return floor.getBlock() == MOSOIL;
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.get(WATERLOGGED) ? WATER.getStill(false) : super.getFluidState(state);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		FluidState ifluidstate = ctx.getWorld().getFluidState(ctx.getBlockPos());

		return super.getPlacementState(ctx).with(WATERLOGGED, ifluidstate.getFluid() == WATER);
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState,
			WorldAccess world, BlockPos pos, BlockPos neighborPos) {

		Block block = neighborState.getBlock();

		if (state.get(WATERLOGGED) && block == SPONGE || block == WET_SPONGE) {
			world.setBlockState(pos, state.with(WATERLOGGED, false), 4);

			return state.with(WATERLOGGED, false);
		}

		FluidState fluidState = world.getFluidState(neighborPos);

		if (fluidState.getFluid() == FLOWING_WATER)
			return neighborState;

		if (fluidState.getFluid() == WATER)
			return neighborState.with(WATERLOGGED, true);

		return super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

		if (!this.canPlaceAt(state, world, pos))
			world.setBlockState(pos, AIR.getDefaultState());

		super.scheduledTick(state, world, pos, random);

	}

}
