package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.common.block.Bud;
import github.KingVampyre.DeepTrenches.core.init.block.DTBlocks;
import net.minecraft.block.Block;

public enum SugiliteBud implements Bud {
    SMALL(DTBlocks.SMALL_SUGILITE_BUD),
    MEDIUM(DTBlocks.MEDIUM_SUGILITE_BUD),
    LARGE(DTBlocks.LARGE_SUGILITE_BUD),
    CLUSTER(DTBlocks.SUGILITE_CLUSTER)
    ;

    private final Block block;

    SugiliteBud(Block block) {
        this.block = block;
    }

    @Override
    public Block asBlock() {
        return this.block;
    }

}
