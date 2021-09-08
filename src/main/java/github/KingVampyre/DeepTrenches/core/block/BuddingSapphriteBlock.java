package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.BuddingClusterBlock;
import github.KingVampyre.DeepTrenches.core.block.enums.SapphireBud;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;

public class BuddingSapphriteBlock extends BuddingClusterBlock {

    public BuddingSapphriteBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canGrow(Block block) {
        return block != DTBlocks.SAPPHIRE_CLUSTER;
    }

    @Override
    protected Block getBud() {
        return DTBlocks.SMALL_SAPPHIRE_BUD;
    }

    @Override
    protected Block grow(Block block) {
        return SapphireBud.GROW.apply(SapphireBud.values(), block).asBlock();
    }

}
