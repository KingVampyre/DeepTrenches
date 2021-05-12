package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.block.enums.DoubleBlockHalf.LOWER;
import static net.minecraft.block.enums.DoubleBlockHalf.UPPER;
import static net.minecraft.state.property.Properties.DOUBLE_BLOCK_HALF;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;

public abstract class DoubleStemBlock extends GrowingStemBlock {

    public DoubleStemBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {

        if(state.get(DOUBLE_BLOCK_HALF) == UPPER) {
            BlockPos up = pos.up();
            BlockState upState = world.getBlockState(up);

            return upState.isAir() && this.getHeight(world, up) < this.getMaxHeight();
        }

        return false;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        DoubleBlockHalf half = state.get(DOUBLE_BLOCK_HALF);

        if (half == LOWER)
            return super.canPlaceAt(state, world, pos);

        BlockPos down = pos.down();
        BlockState downState = world.getBlockState(down);

        return downState.isOf(this) && this.getHeight(world, pos) < this.getMaxHeight();
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {

        if (floor.isOf(this)) {
            DoubleBlockHalf half = floor.get(DOUBLE_BLOCK_HALF);

            return half == LOWER;
        }

        return super.canPlantOnTop(floor, view, pos);
    }

    @Override
    protected int getHeight(WorldView world, BlockPos pos) {
        int i = 1;

        while (world.getBlockState(pos.down(i)).isOf(this))
            i++;

        return i;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(pos, this.getDefaultState().with(DOUBLE_BLOCK_HALF, LOWER), 3);
        world.setBlockState(pos.up(), this.getDefaultState().with(DOUBLE_BLOCK_HALF, UPPER), 3);
    }

    @Override
    public AbstractBlock.OffsetType getOffsetType() {
        return AbstractBlock.OffsetType.XZ;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState state = super.getPlacementState(ctx);

        BlockPos pos = ctx.getBlockPos();
        World world = ctx.getWorld();

        if(pos.getY() < 255 && state != null) {
            BlockPos up = pos.up();
            BlockState upState = world.getBlockState(up);

            if(this.canPlaceAt(state, world, pos) && upState.canReplace(ctx))
                return state;

        }

        return null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        DoubleBlockHalf half = state.get(DOUBLE_BLOCK_HALF);

        if (half == LOWER && direction == UP && !newState.isOf(this))
            return AIR.getDefaultState();

        return half == LOWER && direction == DOWN && !state.canPlaceAt(world, pos) ? AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return false;
    }

    @Override
    protected void onBreakInCreative(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockPos down = pos.down();
        BlockState downState = world.getBlockState(down);

        while (downState.isOf(this)) {
            if (downState.get(DOUBLE_BLOCK_HALF) == LOWER) {
                world.setBlockState(down, AIR.getDefaultState(), 35);
                world.syncWorldEvent(player, 2001, down, Block.getRawIdFromState(downState));
            }

            down = down.down();
            downState = world.getBlockState(down);
        }

    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        world.setBlockState(pos.up(), this.getDefaultState().with(DOUBLE_BLOCK_HALF, UPPER), 3);
    }

}
