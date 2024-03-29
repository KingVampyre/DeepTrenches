package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.SpreadingVineBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import static github.KingVampyre.DeepTrenches.core.init.tag.DTBlockTags.MELALEUCA_FLOWERS_SPREADABLE;

public class MelaleucaFlowersBlock extends SpreadingVineBlock {

    public MelaleucaFlowersBlock(Settings settings) {
        super(settings);
    }

    @Override
    public Boolean canPlantOnTop(BlockState state, BlockView world, BlockPos pos) {
        return state.isIn(MELALEUCA_FLOWERS_SPREADABLE);
    }

}
