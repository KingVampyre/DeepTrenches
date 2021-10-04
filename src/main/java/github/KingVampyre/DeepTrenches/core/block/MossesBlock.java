package github.KingVampyre.DeepTrenches.core.block;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import static net.minecraft.block.Blocks.MOSS_BLOCK;

public class MossesBlock extends FernPlantBlock {

    public MossesBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(MOSS_BLOCK);
    }

}
