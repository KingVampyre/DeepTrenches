package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.block.enums.BlockThird;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.block.enums.BlockThird.*;
import static github.KingVampyre.DeepTrenches.core.init.ModProperties.BLOCK_THIRD;
import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;

public class MurkstemBlock extends PlantBlock {

    public static final IntProperty AGE = Properties.AGE_25;

    public MurkstemBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0).with(BLOCK_THIRD, BOTTOM));
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, AIR.getDefaultState(), blockEntity, stack);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);

        builder.add(AGE, BLOCK_THIRD);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {

        if(state.contains(BLOCK_THIRD)) {
            BlockThird third = state.get(BLOCK_THIRD);
            BlockPos up = pos.up();

            if (third == BOTTOM)
                return super.canPlaceAt(state, world, pos);

            BlockPos down = pos.down();

            if(!world.isAir(down) && this.getHeight(world, pos) < 25)
                return third != MIDDLE || !world.isAir(up);

            return false;
        }

        return this.getHeight(world, pos) < 25;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView view, BlockPos pos) {

        if (floor.isOf(this)) {
            BlockThird third = floor.get(BLOCK_THIRD);

            return third == BOTTOM || third == MIDDLE;
        }

        return super.canPlantOnTop(floor, view, pos);
    }

    private int getHeight(WorldView world, BlockPos pos) {
        int i = 1;

        while (world.getBlockState(pos.down(i)).isOf(this))
            i++;

        return i;
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

    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient) {

            if (player.isCreative()) {
                BlockThird third = state.get(BLOCK_THIRD);

                if (third == TOP || third == MIDDLE) {
                    BlockPos down = pos.down();
                    BlockState downState = world.getBlockState(down);

                    while (downState.isOf(this)) {
                        if (downState.get(BLOCK_THIRD) == BOTTOM) {
                            world.setBlockState(down, Blocks.AIR.getDefaultState(), 35);
                            world.syncWorldEvent(player, 2001, down, Block.getRawIdFromState(downState));
                        }

                        down = down.down();
                        downState = world.getBlockState(down);
                    }

                }
            } else
                dropStacks(state, world, pos, null, player, player.getMainHandStack());

        }

        super.onBreak(world, pos, state, player);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        world.setBlockState(pos.up(), this.getDefaultState().with(BLOCK_THIRD, TOP), 3);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);

        if (!this.canPlaceAt(state, world, pos))
            world.removeBlock(pos, true);

        if (state.get(AGE) < 5)
            world.setBlockState(pos, state.cycle(AGE), 3);

        BlockThird third = state.get(BLOCK_THIRD);

        if (third == TOP && state.get(AGE) >= 5) {
            BlockPos up = pos.up();
            BlockState upState = world.getBlockState(up);

            if (this.canPlaceAt(upState, world, up)) {
                BlockState defaultState = this.getDefaultState();

                world.setBlockState(up, defaultState.with(BLOCK_THIRD, TOP), 3);
                world.setBlockState(pos, defaultState.with(BLOCK_THIRD, MIDDLE), 3);
            }

        }

    }

}
