package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.GrowingStemBlock;
import github.KingVampyre.DeepTrenches.core.block.enums.BlockThird;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.block.enums.BlockThird.*;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.BLOCK_THIRD;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.FRUIT;
import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.state.property.Properties.AGE_25;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;

public class MurkstemBlock extends GrowingStemBlock {

    public MurkstemBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(AGE_25, 0).with(BLOCK_THIRD, BOTTOM));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE_25, BLOCK_THIRD, FRUIT);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        BlockThird third = state.get(BLOCK_THIRD);

        if(third == TOP) {
            BlockPos up = pos.up();
            BlockState upState = world.getBlockState(up);

            return this.canPlaceAt(upState, world, up);
        }

        return false;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {

        if(state.isOf(this)) {
            BlockThird third = state.get(BLOCK_THIRD);

            if (third == BOTTOM)
                return super.canPlaceAt(state, world, pos);

            BlockPos down = pos.down();
            BlockPos up = pos.up();

            if(!world.isAir(down) && this.getHeight(world, pos) < this.getMaxHeight())
                return third != MIDDLE || !world.isAir(up);

            return false;
        }

        return state.isAir() && this.getHeight(world, pos) < this.getMaxHeight();
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {

        if (floor.isOf(this)) {
            BlockThird third = floor.get(BLOCK_THIRD);

            return third == BOTTOM || third == MIDDLE;
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
    protected int getMaxAge() {
        return 5;
    }

    @Override
    protected int getMaxHeight() {
        return 25;
    }

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
        BlockThird third = state.get(BLOCK_THIRD);

        if (third == BOTTOM && direction == UP && !newState.isOf(this))
            return AIR.getDefaultState();

        return third == BOTTOM && direction == DOWN && !state.canPlaceAt(world, pos) ? AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockState defaultState = this.getDefaultState();

        world.setBlockState(pos.up(), defaultState.with(BLOCK_THIRD, TOP), 3);
        world.setBlockState(pos, defaultState.with(BLOCK_THIRD, MIDDLE), 3);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return false;
    }

    @Override
    protected void onBreakInCreative(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockThird third = state.get(BLOCK_THIRD);

        if (third == TOP || third == MIDDLE) {
            BlockPos down = pos.down();
            BlockState downState = world.getBlockState(down);

            while (downState.isOf(this)) {
                if (downState.get(BLOCK_THIRD) == BOTTOM) {
                    world.setBlockState(down, Blocks.AIR.getDefaultState(), 3);
                    world.syncWorldEvent(player, 2001, down, Block.getRawIdFromState(downState));
                }

                down = down.down();
                downState = world.getBlockState(down);
            }

        }

    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        world.setBlockState(pos.up(), this.getDefaultState().with(BLOCK_THIRD, TOP), 3);
    }

}
