package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.LeavesFlowerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockTags.MURKANTUAN_FLOWER_PLANTABLE;

public class MurkantuanFlowerBlock extends LeavesFlowerBlock {

    public MurkantuanFlowerBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantAt(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(MURKANTUAN_FLOWER_PLANTABLE);
    }

}
