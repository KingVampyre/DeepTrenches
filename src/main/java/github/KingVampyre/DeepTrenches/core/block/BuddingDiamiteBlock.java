package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.BuddingClusterBlock;
import github.KingVampyre.DeepTrenches.core.block.enums.DiamondBud;
import github.KingVampyre.DeepTrenches.core.init.block.DTBlocks;
import net.minecraft.block.Block;

public class BuddingDiamiteBlock extends BuddingClusterBlock {

    public BuddingDiamiteBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canGrow(Block block) {
        return block != DTBlocks.DIAMOND_CLUSTER;
    }

    @Override
    protected Block getBud() {
        return DTBlocks.SMALL_DIAMOND_BUD;
    }

    @Override
    protected Block grow(Block block) {
        return DiamondBud.GROW.apply(DiamondBud.values(), block).asBlock();
    }

}
