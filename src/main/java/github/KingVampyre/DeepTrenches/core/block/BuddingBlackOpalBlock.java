package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.BuddingClusterBlock;
import github.KingVampyre.DeepTrenches.core.block.enums.BlackOpalBud;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;

public class BuddingBlackOpalBlock extends BuddingClusterBlock {

    public BuddingBlackOpalBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canGrow(Block block) {
        return block != DTBlocks.BLACK_OPAL_CLUSTER;
    }

    @Override
    protected Block getBud() {
        return DTBlocks.SMALL_BLACK_OPAL_BUD;
    }

    @Override
    protected Block grow(Block block) {
        return BlackOpalBud.GROW.apply(BlackOpalBud.values(), block).asBlock();
    }

}
