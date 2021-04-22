package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DeadCoralBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.block.enums.BlockHalf.BOTTOM;
import static net.minecraft.block.enums.BlockHalf.TOP;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.BLOCK_HALF;

public class DeadTallCoralBlock extends DeadCoralBlock {

	public DeadTallCoralBlock(Settings settings) {
		super(settings);

		this.setDefaultState(this.stateManager.getDefaultState().with(BLOCK_HALF, BOTTOM).with(WATERLOGGED, true));
	}

	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		super.appendProperties(builder);

		builder.add(BLOCK_HALF);
	}

	@Override
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		float height = world.getDimension().getLogicalHeight() - 1;
		BlockState down = world.getBlockState(pos.down());

		if (pos.getY() < height)
		    if (state.get(BLOCK_HALF) == BOTTOM)
				return down.getBlock() != this && super.canPlaceAt(state, world, pos);
		    else
				return down.getBlock() == this;

		return false;

	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		BlockState state = ctx.getWorld().getBlockState(ctx.getBlockPos().up());

		return state.canReplace(ctx) ? super.getPlacementState(ctx) : AIR.getDefaultState();

	}
	
	@Override
	public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean moved) {
		super.onBlockAdded(state, world, pos, oldState, moved);

		if (!this.canPlaceAt(state, world, pos))
		    world.removeBlock(pos, true);
		
		if (state.get(WATERLOGGED))
		    world.getFluidTickScheduler().schedule(pos, WATER, WATER.getTickRate(world));
	
	}
	
	@Override
	public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
		BlockPos half = state.get(BLOCK_HALF) == BOTTOM ? pos.up() : pos.down();

		world.breakBlock(half, false);
		super.onBreak(world, pos, state, player);
	}

	@Override
	public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
		BlockPos up = pos.up();
		BlockState stateIn = world.getBlockState(up);

		world.setBlockState(up, state.with(BLOCK_HALF, TOP).with(WATERLOGGED, stateIn.getBlock() == Blocks.WATER));
	}

}
