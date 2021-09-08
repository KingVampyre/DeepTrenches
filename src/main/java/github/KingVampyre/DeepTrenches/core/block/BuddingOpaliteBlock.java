package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.BuddingClusterBlock;
import github.KingVampyre.DeepTrenches.core.block.enums.OpalBud;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;

public class BuddingOpaliteBlock extends BuddingClusterBlock {

    public BuddingOpaliteBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canGrow(Block block) {
        return block != DTBlocks.OPAL_CLUSTER;
    }

    @Override
    protected Block getBud() {
        return DTBlocks.SMALL_OPAL_BUD;
    }

    @Override
    protected Block grow(Block block) {
        return OpalBud.GROW.apply(OpalBud.values(), block).asBlock();
    }

}
