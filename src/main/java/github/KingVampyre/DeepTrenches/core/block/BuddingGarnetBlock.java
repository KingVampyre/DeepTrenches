package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.BuddingClusterBlock;
import github.KingVampyre.DeepTrenches.core.block.enums.GarnetBud;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;

public class BuddingGarnetBlock extends BuddingClusterBlock {

    public BuddingGarnetBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canGrow(Block block) {
        return block != DTBlocks.GARNET_CLUSTER;
    }

    @Override
    protected Block getBud() {
        return DTBlocks.SMALL_GARNET_BUD;
    }

    @Override
    protected Block grow(Block block) {
        return GarnetBud.GROW.apply(GarnetBud.values(), block).asBlock();
    }

}
