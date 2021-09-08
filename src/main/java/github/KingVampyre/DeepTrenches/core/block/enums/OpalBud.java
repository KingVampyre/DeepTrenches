package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.common.block.Bud;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;

public enum OpalBud implements Bud {
    SMALL(DTBlocks.SMALL_OPAL_BUD),
    MEDIUM(DTBlocks.MEDIUM_OPAL_BUD),
    LARGE(DTBlocks.LARGE_OPAL_BUD),
    CLUSTER(DTBlocks.OPAL_CLUSTER)
    ;

    private final Block block;

    OpalBud(Block block) {
        this.block = block;
    }

    @Override
    public Block asBlock() {
        return this.block;
    }

}
