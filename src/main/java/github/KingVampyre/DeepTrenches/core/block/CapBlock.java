package github.KingVampyre.DeepTrenches.core.block;

import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.WATERLOGGED;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CapBlock extends LeavesBlock {

	public CapBlock(Settings settings) {
		super(settings);

		this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false));
	}

	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		super.appendProperties(builder);

		builder.add(WATERLOGGED);
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.get(WATERLOGGED) ? WATER.getStill(false) : super.getFluidState(state);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		BlockPos pos = ctx.getBlockPos();
		World world = ctx.getWorld();

		BlockState state = super.getPlacementState(ctx);

		if(state != null) {
			FluidState fluidState = world.getFluidState(pos);

			return state.with(WATERLOGGED, fluidState.getFluid() == WATER);
		}

		return null;
	}

	@Override
	public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
		FluidState fluidState = world.getFluidState(pos);

		if (fluidState.getFluid() == WATER)
			world.getBlockTickScheduler().schedule(pos, this, 1);

	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		super.scheduledTick(state, world, pos, random);

		FluidState fluidState = world.getFluidState(pos);

		world.setBlockState(pos, state.with(WATERLOGGED, fluidState.getFluid() == WATER), 3);
	}

}
