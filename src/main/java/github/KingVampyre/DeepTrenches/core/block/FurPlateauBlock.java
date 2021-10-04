package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.BigDripleafBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.FUR_PLATEAU;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.FUR_PLATEAU_STEM;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.math.Direction.UP;

public class FurPlateauBlock extends BigDripleafBlock {

    public FurPlateauBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var down = pos.down();
        var downState = world.getBlockState(down);

        return downState.isOf(FUR_PLATEAU_STEM) || downState.isOf(this) || downState.isSideSolidFullSquare(world, down, UP);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        var upState = world.getBlockState(pos.up());

        return upState.isAir() || upState.isOf(Blocks.WATER);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var pos = ctx.getBlockPos();
        var world = ctx.getWorld();

        var downState = world.getBlockState(pos.down());
        var fluidState = world.getFluidState(pos);
        var opposite = ctx.getPlayerFacing().getOpposite();

        return this.getDefaultState()
                .with(WATERLOGGED, fluidState.isEqualAndStill(Fluids.WATER))
                .with(FACING, downState.isOf(FUR_PLATEAU) || downState.isOf(FUR_PLATEAU_STEM) ? downState.get(FACING) : opposite);
    }

}
