package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerSpreadableBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.*;
import static net.minecraft.block.Blocks.SNOW;

public class SpriliumBlock extends GrassBlock {

    public SpriliumBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(SNOWY, false));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!InvokerSpreadableBlock.canSurvive(state, world, pos))
            world.setBlockState(pos, VERDINE.getDefaultState());
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

                    if (blockState.isOf(VERDINE) && InvokerSpreadableBlock.canSpread(defaultState, world, blockPos)) {
                        BlockState aboveState = world.getBlockState(blockPos.up());
                        BlockState sprilium = defaultState.with(SNOWY, aboveState.isOf(SNOW));

                        world.setBlockState(blockPos, sprilium);
                    }

                }

            }

        }

    }

}
