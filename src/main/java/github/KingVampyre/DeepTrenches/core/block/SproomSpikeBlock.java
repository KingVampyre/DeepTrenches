package github.KingVampyre.DeepTrenches.core.block;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.SPROOM_LOG;
import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.SPROOM_WOOD;
import static github.KingVampyre.DeepTrenches.core.init.entity.DTDamageSources.SPROOM_SPIKE;
import static net.minecraft.block.Blocks.JIGSAW;
import static net.minecraft.block.enums.BlockHalf.BOTTOM;
import static net.minecraft.block.enums.BlockHalf.TOP;
import static net.minecraft.state.property.Properties.BLOCK_HALF;
import static net.minecraft.state.property.Properties.FACING;
import static net.minecraft.util.math.Direction.NORTH;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager.Builder;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class SproomSpikeBlock extends PlantBlock {

	public static final IntProperty AGE = Properties.AGE_25;

	public SproomSpikeBlock(Settings settings) {
		super(settings);

		this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0).with(FACING, NORTH).with(BLOCK_HALF, TOP));
	}

	@Override
	protected void appendProperties(Builder<Block, BlockState> builder) {
		super.appendProperties(builder);

		builder.add(AGE, FACING, BLOCK_HALF);
	}

	@Override
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		Direction direction = state.get(FACING).getOpposite();

		int i = 1;

		while (world.getBlockState(pos.offset(direction, i)).getBlock() == this)
			i++;

		BlockPos offset = pos.offset(direction, i);
		BlockState stateIn = world.getBlockState(offset);

		return i < 5 && this.isValidWood(stateIn);
	}
	
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {

		return switch (state.get(FACING).getAxis()) {
			case X -> Block.createCuboidShape(0, 6, 6, 16, 10, 10);
			case Z -> Block.createCuboidShape(6, 6, 0, 10, 10, 16);
			case Y -> Block.createCuboidShape(6, 0, 6, 10, 16, 10);
		};

	}

	private Direction getFacing(WorldAccess worldIn, BlockPos currentPos, BlockState stateIn) {
		Direction direction = stateIn.get(FACING);
		Direction opposite = direction.getOpposite();
		BlockPos offset = currentPos.offset(opposite);

		if (worldIn.isAir(offset))
			for (Direction dir : Direction.values()) {
				BlockPos pos = currentPos.offset(dir);
				BlockState state = worldIn.getBlockState(pos);

				if (this.isValidWood(state))
					return dir.getOpposite();

				if (dir.getAxis().isHorizontal() && state.getBlock() == this && dir != state.get(FACING))
					return dir;
			}

		return direction;
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		BlockState state = super.getPlacementState(ctx);

		BlockPos pos = ctx.getBlockPos();
		World world = ctx.getWorld();

		if(state != null) {
			for (Direction direction : ctx.getPlacementDirections()) {
				state = state.with(FACING, direction.getOpposite());

				if (state.canPlaceAt(world, pos))
					return state;
			}

		}

		return null;
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		Direction dir = this.getFacing(world, pos, state);
		Direction direction = state.get(FACING);

		BlockPos offset = pos.offset(direction);
		BlockState offsetState = world.getBlockState(offset);

		if (direction != dir)
			return state.with(FACING, dir.getOpposite());

		if (!state.canPlaceAt(world, pos))
			world.createAndScheduleBlockTick(pos, this, 1);

		if (offsetState.getBlock() == this && state.get(BLOCK_HALF) == TOP)
			return state.with(BLOCK_HALF, BOTTOM);

		if (state.get(BLOCK_HALF) == BOTTOM && world.isAir(offset))
			return state.with(BLOCK_HALF, TOP);

		return state;
	}

	private boolean isValidWood(BlockState state) {
		Block block = state.getBlock();

		return block == SPROOM_LOG || block == SPROOM_WOOD || block == JIGSAW;
	}

	@Override
	public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {

		if (state.get(BLOCK_HALF) == TOP)
			entity.damage(SPROOM_SPIKE, 3);

	}

	@Override
	public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		Direction direction = state.get(FACING).getOpposite();
		BlockPos offset = pos.offset(direction);

		if (!state.canPlaceAt(world, pos))
			world.removeBlock(pos, true);

		else if (world.isAir(offset) && this.canPlaceAt(state, world, offset)) {

			if (state.get(AGE) == 25) {
				world.setBlockState(offset, state.cycle(AGE));
				world.setBlockState(pos, state.cycle(AGE).with(BLOCK_HALF, BOTTOM), 4);
			} else
				world.setBlockState(pos, state.cycle(AGE), 4);

		}
	}

	@Override
	public BlockState rotate(BlockState state, BlockRotation rotation) {
		Direction direction = state.get(FACING);
		
		return state.with(FACING, rotation.rotate(direction));
	}

}
