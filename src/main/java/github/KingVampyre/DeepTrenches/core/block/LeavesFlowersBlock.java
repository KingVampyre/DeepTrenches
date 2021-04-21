package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.tag.Tag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class LeavesFlowersBlock extends VineBlock {

    protected final Tag<Block> tag;

    public LeavesFlowersBlock(Tag<Block> tag, Settings settings) {
        super(settings);

        this.tag = tag;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return super.canPlaceAt(state, world, pos) && this.checkLeaves(world, state, pos);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {

        for (Map.Entry<Direction, BooleanProperty> entry : FACING_PROPERTIES.entrySet()) {
            BooleanProperty property = entry.getValue();

            if(state.get(property) && direction == entry.getKey())
                return Blocks.AIR.getDefaultState();
        }

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        if (world.random.nextInt(4) == 0) {
            Direction direction = Direction.random(random);
            BlockPos up = pos.up();

            if (direction.getAxis().isHorizontal() && !state.get(getFacingProperty(direction))) {

                if (this.canGrowAt(world, pos)) {
                    BlockPos offset = pos.offset(direction);
                    BlockState offsetState = world.getBlockState(offset);

                    Direction opposite = direction.getOpposite();
                    BooleanProperty oppositeProperty = getFacingProperty(opposite);

                    if (offsetState.isAir()) {
                        Direction ycw = direction.rotateYClockwise();
                        Direction yccw = direction.rotateYCounterclockwise();

                        BooleanProperty ycwProperty = getFacingProperty(ycw);
                        BooleanProperty yccwProperty = getFacingProperty(yccw);

                        boolean bl = state.get(ycwProperty);
                        boolean bl2 = state.get(yccwProperty);

                        BlockPos ycwState = offset.offset(ycw);
                        BlockPos yccwState = offset.offset(yccw);

                        if (bl && world.isAir(ycwState) && shouldConnectTo(world, pos.offset(ycw), opposite))
                            world.setBlockState(ycwState, this.getDefaultState().with(oppositeProperty, true), 2);

                        else if (bl2 && world.isAir(yccwState) && shouldConnectTo(world, pos.offset(yccw), opposite))
                            world.setBlockState(yccwState, this.getDefaultState().with(oppositeProperty, true), 2);

                        else if (world.random.nextFloat() < 0.05 && shouldConnectTo(world, offset.up(), Direction.UP))
                            world.setBlockState(offset, this.getDefaultState().with(UP, true), 2);

                    } else if (shouldConnectTo(world, offset, direction)) {
                        world.setBlockState(pos, state.with(oppositeProperty, true), 2);
                    }

                }
            } else if (direction == Direction.UP && pos.getY() < 255) {

                if (this.shouldHaveSide(world, pos, direction)) {
                    world.setBlockState(pos, state.with(UP, true), 2);
                    return;
                }

                if (world.isAir(up)) {
                    if (!this.canGrowAt(world, pos))
                        return;

                    Iterator<Direction> iterator = Direction.Type.HORIZONTAL.iterator();
                    BlockState blockState = state;
                    Direction side;

                    while(true) {
                        do {
                            if (!iterator.hasNext()) {
                                if (this.hasHorizontalSide(blockState))
                                    world.setBlockState(up, blockState, 2);

                                return;
                            }

                            side = iterator.next();
                        } while(!random.nextBoolean() && shouldConnectTo(world, up.offset(side), Direction.UP));

                        blockState = blockState.with(getFacingProperty(side), false);
                    }

                }

            } else if (pos.getY() > 0) {
                BlockPos down = pos.down();
                BlockState downState = world.getBlockState(down);

                if (downState.isAir() || downState.isOf(this)) {
                    BlockState vineState = downState.isAir() ? this.getDefaultState() : downState;
                    BlockState grownState = this.getGrownState(state, vineState, random);

                    if (vineState != grownState && this.hasHorizontalSide(grownState) && this.checkLeaves(world, grownState, down))
                        world.setBlockState(down, grownState, 2);

                }

            }

        }

    }

    private boolean canGrowAt(BlockView world, BlockPos pos) {
        Iterable<BlockPos> iterable = BlockPos.iterate(pos.getX() - 4, pos.getY() - 1, pos.getZ() - 4, pos.getX() + 4, pos.getY() + 1, pos.getZ() + 4);
        int j = 5;

        for (BlockPos blockPos : iterable) {
            if (world.getBlockState(blockPos).isOf(this)) {
                --j;
                if (j <= 0) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkLeaves(WorldView world, BlockState state, BlockPos pos) {
        return Direction.Type.HORIZONTAL.stream().map(Direction::getOpposite).anyMatch(direction -> {
            BooleanProperty property = FACING_PROPERTIES.get(direction);

            BlockPos offset = pos.offset(direction);
            BlockState blockState = world.getBlockState(offset);

            return state.get(property) && blockState.isIn(this.tag);
        });
    }

    private BlockState getGrownState(BlockState above, BlockState state, Random random) {

        for (Direction direction : Direction.Type.HORIZONTAL) {

            if (random.nextBoolean()) {
                BooleanProperty booleanProperty = getFacingProperty(direction);

                if (above.get(booleanProperty))
                    state = state.with(booleanProperty, true);
            }
        }

        return state;
    }

    public Tag<Block> getTag() {
        return this.tag;
    }

    private boolean hasHorizontalSide(BlockState state) {
        return state.get(NORTH) || state.get(EAST) || state.get(SOUTH) || state.get(WEST);
    }

    private boolean shouldHaveSide(BlockView world, BlockPos pos, Direction side) {
        BooleanProperty property = FACING_PROPERTIES.get(side);
        BlockState state = world.getBlockState(pos.up());
        BlockPos offset = pos.offset(side);

        if (side == Direction.DOWN)
            return false;
        else if (shouldConnectTo(world, offset, side))
            return true;
        else if (side.getAxis() == Direction.Axis.Y)
            return false;

        return state.isOf(this) && state.get(property);
    }

}
