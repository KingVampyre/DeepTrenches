package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BuddingAmethystBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.Random;

import static net.minecraft.block.AmethystClusterBlock.FACING;
import static net.minecraft.block.AmethystClusterBlock.WATERLOGGED;

public abstract class BuddingClusterBlock extends BuddingAmethystBlock {

    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingClusterBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            var direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];

            var blockPos = pos.offset(direction);
            var blockState = world.getBlockState(blockPos);

            var block = blockState.getBlock();
            Block bud = null;

            if(canGrowIn(blockState))
                bud = this.getBud();
            else if (this.canGrow(block) && block instanceof AmethystClusterBlock && blockState.get(FACING) == direction)
                bud = this.grow(block);

            if (bud != null) {
                var cluster = bud.getDefaultState()
                        .with(FACING, direction)
                        .with(WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);

                world.setBlockState(blockPos, cluster);
            }

        }
    }

    protected abstract boolean canGrow(Block block);

    protected abstract Block grow(Block block);

    protected abstract Block getBud();

}
