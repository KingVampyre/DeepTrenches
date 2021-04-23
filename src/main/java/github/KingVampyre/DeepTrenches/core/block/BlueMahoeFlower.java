package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.LeavesFlowerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import static github.KingVampyre.DeepTrenches.core.init.ModBlockTags.BLUE_MAHOE_FLOWER_PLANTABLE;

public class BlueMahoeFlower extends LeavesFlowerBlock {

    public BlueMahoeFlower(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BLUE_MAHOE_FLOWER_PLANTABLE);
    }

}
