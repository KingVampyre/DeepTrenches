package github.KingVampyre.DeepTrenches.core.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.tag.Tag;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Map;
import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModProperties.FACING_EXCEPT_DOWN;
import static github.KingVampyre.DeepTrenches.core.init.ModProperties.STAGE_2;
import static net.minecraft.state.property.Properties.AGE_25;
import static net.minecraft.util.math.Direction.*;

public class LeavesFlowerBlock extends PlantBlock {

    private static final Map<Direction, VoxelShape> FACING_TO_SHAPE = Maps.newEnumMap(ImmutableMap.of(
            NORTH, Block.createCuboidShape(0.0D, 4.0D, 5.0D, 16.0D, 12.0D, 16.0D),
            SOUTH, Block.createCuboidShape(0.0D, 4.0D, 0.0D, 16.0D, 12.0D, 11.0D),
            WEST, Block.createCuboidShape(5.0D, 4.0D, 0.0D, 16.0D, 12.0D, 16.0D),
            EAST, Block.createCuboidShape(0.0D, 4.0D, 0.0D, 11.0D, 12.0D, 16.0D),
            UP, Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D)
    ));

    protected final Tag<Block> tag;

    public LeavesFlowerBlock(Tag<Block> tag, Settings settings) {
        super(settings);

        this.tag = tag;

        this.setDefaultState(this.stateManager.getDefaultState().with(AGE_25, 0).with(FACING_EXCEPT_DOWN, NORTH).with(STAGE_2, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);

        builder.add(AGE_25, FACING_EXCEPT_DOWN, STAGE_2);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = state.get(FACING_EXCEPT_DOWN);
        BlockPos offset = pos.offset(direction.getOpposite());
        BlockState offsetState = world.getBlockState(offset);

        return offsetState.isIn(this.tag);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return FACING_TO_SHAPE.get(state.get(FACING_EXCEPT_DOWN));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState state = super.getPlacementState(ctx);

        if(state != null) {
            Direction side = ctx.getSide();
            BlockPos pos = ctx.getBlockPos();
            World world = ctx.getWorld();

            BlockState placementState = state.with(FACING_EXCEPT_DOWN, side.getAxis().isVertical() ? UP : side);

            if (placementState.canPlaceAt(world, pos))
                return placementState;

        }

        return null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        return direction.getOpposite() == state.get(FACING_EXCEPT_DOWN) && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING_EXCEPT_DOWN)));
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);

        if (!this.canPlaceAt(state, world, pos))
            world.removeBlock(pos, true);

        if(state.get(STAGE_2) < 2) {

            if (state.get(AGE_25) < 15)
                world.setBlockState(pos, state.cycle(AGE_25), 3);
            else
                world.setBlockState(pos, state.cycle(STAGE_2).with(AGE_25, 0), 3);
        }

    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING_EXCEPT_DOWN, rotation.rotate(state.get(FACING_EXCEPT_DOWN)));
    }

}
