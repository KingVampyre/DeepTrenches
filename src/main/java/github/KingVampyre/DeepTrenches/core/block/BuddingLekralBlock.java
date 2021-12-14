package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.BuddingClusterBlock;
import net.minecraft.block.Block;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.LEKRAL_CLUSTER;

public class BuddingLekralBlock extends BuddingClusterBlock {

    public BuddingLekralBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canGrow(Block block) {
        return false;
    }

    @Override
    protected Block grow(Block block) {
        return null;
    }

    @Override
    protected Block getBud() {
        return LEKRAL_CLUSTER;
    }

}
