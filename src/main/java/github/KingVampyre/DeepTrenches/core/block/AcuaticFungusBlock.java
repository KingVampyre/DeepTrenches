package github.KingVampyre.DeepTrenches.core.block;

import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import static net.minecraft.block.Blocks.*;
import static net.minecraft.fluid.Fluids.EMPTY;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.WATERLOGGED;

public class AcuaticFungusBlock extends FungusBlock {

	public AcuaticFungusBlock(FeaturesSaplingGenerator generator, AbstractBlock.Settings settings) {
		super(generator, settings);
	}

	@Override
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {

		if (!state.get(WATERLOGGED))
			return false;

		FluidState ifluidstate = world.getFluidState(pos);
		Fluid fluid = ifluidstate.getFluid();

		BlockPos down = pos.down();

		if (fluid == WATER)
			return this.canPlantOnTop(world.getBlockState(down), world, down);
		else if (fluid == EMPTY)
			return this.canPlantOnTop(world.getBlockState(down), world, down);

		return false;
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState,
		WorldAccess world, BlockPos pos, BlockPos neighborPos) {

		Block block = neighborState.getBlock();

		if (state.get(WATERLOGGED) && block == SPONGE || block == WET_SPONGE) {
			world.setBlockState(pos, state.with(WATERLOGGED, false), 4);

			return AIR.getDefaultState();
		}

		return super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
	}

}
