package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerNyliumBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.NyliumBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.VERDINE;

public class SpriliumBlock extends NyliumBlock {

    public SpriliumBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos up = pos.up();

        if (world.getLightLevel(up) >= 9) {

            for(int i = 0; i < 9; ++i) {
                int x = random.nextInt(6) - 3;
                int y = random.nextInt(2) - 1;
                int z = random.nextInt(6) - 3;

                BlockPos blockPos = pos.add(x, y, z);
                BlockState blockState =  world.getBlockState(blockPos);

                /*
                TODO: place wart
                if (world.isAir(blockPos))
                    world.setBlockState(blockPos, null);
                 */

            }

        }

    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        if (!InvokerNyliumBlock.stayAlive(state, world, pos))
            world.setBlockState(pos, VERDINE.getDefaultState());
    }

}
