package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FernBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.AIRIAL_MOSS;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.AIRIAL_BUSH;

public class AirialBushBlock extends FernBlock {

    public AirialBushBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(AIRIAL_MOSS);
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(pos, AIRIAL_BUSH.getDefaultState(), 2);
    }

}
