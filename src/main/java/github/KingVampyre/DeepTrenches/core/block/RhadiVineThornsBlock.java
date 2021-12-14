package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.StorceanVineThornsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import static github.KingVampyre.DeepTrenches.core.init.tag.DTBlockTags.RHADI_LOGS;

public class RhadiVineThornsBlock extends StorceanVineThornsBlock {

    public RhadiVineThornsBlock(Settings settings) {
        super(settings);
    }

    @Override
    public Boolean canPlantOnTop(BlockState state, BlockView world, BlockPos pos) {
        return state.isIn(RHADI_LOGS);
    }

}
