package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PlantBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import static github.KingVampyre.DeepTrenches.core.init.DTProperties.FACING_EXCEPT_DOWN;
import static net.minecraft.util.math.Direction.UP;

public abstract class FacingExceptDownPlantBlock extends PlantBlock {

    public FacingExceptDownPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING_EXCEPT_DOWN);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = state.get(FACING_EXCEPT_DOWN);
        BlockPos offset = pos.offset(direction.getOpposite());
        BlockState offsetState = world.getBlockState(offset);

        return this.canPlantOnTop(offsetState, world, pos);
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
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING_EXCEPT_DOWN, rotation.rotate(state.get(FACING_EXCEPT_DOWN)));
    }

}
