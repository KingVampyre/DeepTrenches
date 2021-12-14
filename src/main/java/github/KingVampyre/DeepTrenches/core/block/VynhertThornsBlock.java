package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.StorceanThornsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import static github.KingVampyre.DeepTrenches.core.init.tag.DTBlockTags.VYNHERT_LOGS;

public class VynhertThornsBlock extends StorceanThornsBlock {

    public VynhertThornsBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantAt(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(VYNHERT_LOGS);
    }

}
