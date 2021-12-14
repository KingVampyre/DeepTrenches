package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.BuddingClusterBlock;
import github.KingVampyre.DeepTrenches.core.block.enums.ClinohumiteBud;
import github.KingVampyre.DeepTrenches.core.init.block.DTBlocks;
import net.minecraft.block.Block;

public class BuddingClinohumiteBlock extends BuddingClusterBlock {

    public BuddingClinohumiteBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canGrow(Block block) {
        return block != DTBlocks.CLINOHUMITE_CLUSTER;
    }

    @Override
    protected Block getBud() {
        return DTBlocks.SMALL_CLINOHUMITE_BUD;
    }

    @Override
    protected Block grow(Block block) {
        return ClinohumiteBud.GROW.apply(ClinohumiteBud.values(), block).asBlock();
    }

}
