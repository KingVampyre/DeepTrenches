package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.BigDripleafStemBlock;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockLocating;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.FUR_PLATEAU;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.FUR_PLATEAU_STEM;
import static net.minecraft.block.Blocks.WATER;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.math.Direction.UP;

public class FurPlateauStem extends BigDripleafStemBlock {

    public FurPlateauStem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var down = pos.down();
        var downState = world.getBlockState(down);
        var upState = world.getBlockState(pos.up());

        if(downState.isOf(this) || downState.isSideSolidFullSquare(world, down, UP))
            return upState.isOf(this) || upState.isOf(FUR_PLATEAU);

        return false;
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(FUR_PLATEAU);
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockLocating.findColumnEnd(world, pos, state.getBlock(), UP, FUR_PLATEAU).ifPresent(columnEnd -> {
            var facing = state.get(FACING);
            var up = columnEnd.up();

            var columnEndFluid = world.getFluidState(columnEnd);
            var fluidState =  world.getFluidState(up);

            var stemState = FUR_PLATEAU_STEM.getDefaultState().with(WATERLOGGED, columnEndFluid.isEqualAndStill(Fluids.WATER)).with(FACING, facing);
            var plateauState = FUR_PLATEAU.getDefaultState().with(WATERLOGGED, fluidState.isEqualAndStill(Fluids.WATER)).with(FACING, facing);

            world.setBlockState(pos, stemState, 3);
            world.setBlockState(pos, plateauState, 3);
        });

    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        var columnEnd = BlockLocating.findColumnEnd(world, pos, state.getBlock(), UP, FUR_PLATEAU);

        if (columnEnd.isEmpty())
            return false;

        var up = columnEnd.get().up();
        var upState = world.getBlockState(up);

        if(!world.isOutOfHeightLimit(up))
            return upState.isAir() || upState.isOf(WATER);

        return false;
    }

}
