package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.GrowingStemBlock;
import github.KingVampyre.DeepTrenches.core.block.enums.BlockThird;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
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
import static github.KingVampyre.DeepTrenches.core.init.DTBlockTags.VYNHERT_LOGS;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.VYNHERT_FRUIT;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.BLOCK_THIRD;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.FRUIT;
import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.state.property.Properties.AGE_25;
import static net.minecraft.util.math.Direction.UP;

public class VynhertLeafBlock extends GrowingStemBlock {

    public VynhertLeafBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(AGE_25, 0).with(BLOCK_THIRD, TOP).with(FRUIT, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE_25, BLOCK_THIRD, FRUIT);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        BlockThird third = state.get(BLOCK_THIRD);

        if(third != MIDDLE) {
            BlockPos down = pos.down();
            BlockState downState = world.getBlockState(down);

            if(this.canPlaceAt(downState, world, down))
                return third != TOP || downState.isAir();

        }

        return false;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {

        if(state.contains(BLOCK_THIRD)) {
            BlockThird third = state.get(BLOCK_THIRD);
            BlockPos down = pos.down();
            BlockPos up = pos.up();

            if (third == TOP) {
                BlockState upState = world.getBlockState(up);

                return this.canPlantOnTop(upState, world, up);
            }

            if(down.getY() >= 0 && !world.isAir(up) && this.getHeight(world, pos) < this.getMaxHeight())
                return third != MIDDLE || !world.isAir(down);

            return false;
        }

        return state.isAir() && this.getHeight(world, pos) < this.getMaxHeight();
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {

        if (floor.isOf(this)) {
            BlockThird third = floor.get(BLOCK_THIRD);

            return third == TOP || third == MIDDLE;
        }

        return floor.isIn(VYNHERT_LOGS);
    }

    @Override
    protected int getHeight(WorldView world, BlockPos pos) {
        int i = 1;

        while (world.getBlockState(pos.up(i)).isOf(this))
            i++;

        return i;
    }

    @Override
    protected int getMaxAge() {
        return 6;
    }

    @Override
    protected int getMaxHeight() {
        return 25;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        BlockThird third = state.get(BLOCK_THIRD);

        return third != TOP && direction == UP && !state.canPlaceAt(world, pos) ? AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockState defaultState = this.getDefaultState();
        BlockThird third = state.get(BLOCK_THIRD);

        world.setBlockState(pos.down(), defaultState.with(BLOCK_THIRD, BOTTOM), 3);
        world.setBlockState(pos, defaultState.with(BLOCK_THIRD, third == TOP ? TOP : MIDDLE), 3);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return false;
    }

    @Override
    protected void onBreakInCreative(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockThird third = state.get(BLOCK_THIRD);

        if (third == BOTTOM || third == MIDDLE) {
            BlockPos up = pos.up();
            BlockState upState = world.getBlockState(up);

            while (upState.isOf(this)) {

                if (upState.get(BLOCK_THIRD) != TOP) {
                    world.setBlockState(up, Blocks.AIR.getDefaultState(), 35);
                    world.syncWorldEvent(player, 2001, up, Block.getRawIdFromState(upState));
                } else
                    break;

                up = up.up();
                upState = world.getBlockState(up);
            }

        }

    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);

        if(state.get(BLOCK_THIRD) == BOTTOM) {
            BlockPos down = pos.down();
            BlockState downState = world.getBlockState(down);

            if(downState.isOf(VYNHERT_FRUIT))
                world.setBlockState(pos, state.with(FRUIT, true), 3);
        }

    }

}
