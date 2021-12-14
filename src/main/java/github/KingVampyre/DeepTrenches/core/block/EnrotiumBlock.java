package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerSpreadableBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.POININE;
import static net.minecraft.block.Blocks.SNOW;
import static net.minecraft.block.Blocks.SNOW_BLOCK;

public class EnrotiumBlock extends GrassBlock {

    public EnrotiumBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {

        if(direction == Direction.UP && newState.isOf(SNOW_BLOCK) || newState.isOf(SNOW))
            return POININE.getDefaultState();

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!InvokerSpreadableBlock.canSurvive(state, world, pos))
            world.setBlockState(pos, POININE.getDefaultState());
        else {
            BlockPos up = pos.up();

            if (world.getLightLevel(up) >= 9) {
                BlockState defaultState = this.getDefaultState();

                for(int i = 0; i < 4; ++i) {
                    int x = random.nextInt(3) - 1;
                    int y = random.nextInt(5) - 3;
                    int z = random.nextInt(3) - 1;

                    BlockPos blockPos = pos.add(x, y, z);
                    BlockState blockState =  world.getBlockState(blockPos);

                    if (blockState.isOf(POININE) && InvokerSpreadableBlock.canSpread(defaultState, world, blockPos))
                        world.setBlockState(blockPos, defaultState);

                }

            }

        }

    }

}
