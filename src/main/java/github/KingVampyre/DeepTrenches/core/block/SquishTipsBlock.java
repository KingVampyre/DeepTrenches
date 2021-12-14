package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FernBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.SQUISH_TIPS;
import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.SPRILIUM;

public class SquishTipsBlock extends FernBlock {

    public SquishTipsBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(SPRILIUM);
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(pos, SQUISH_TIPS.getDefaultState(), 2);
    }

}
