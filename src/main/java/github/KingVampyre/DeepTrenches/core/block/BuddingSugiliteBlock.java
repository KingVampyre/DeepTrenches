package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.BuddingClusterBlock;
import github.KingVampyre.DeepTrenches.core.block.enums.SugiliteBud;
import github.KingVampyre.DeepTrenches.core.init.block.DTBlocks;
import net.minecraft.block.Block;

public class BuddingSugiliteBlock extends BuddingClusterBlock {

    public BuddingSugiliteBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canGrow(Block block) {
        return block != DTBlocks.SUGILITE_CLUSTER;
    }

    @Override
    protected Block getBud() {
        return DTBlocks.SMALL_SUGILITE_BUD;
    }

    @Override
    protected Block grow(Block block) {
        return SugiliteBud.GROW.apply(SugiliteBud.values(), block).asBlock();
    }

}
