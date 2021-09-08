package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.common.block.Bud;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;

public enum BlackOpalBud implements Bud {
    SMALL(DTBlocks.SMALL_BLACK_OPAL_BUD),
    MEDIUM(DTBlocks.MEDIUM_BLACK_OPAL_BUD),
    LARGE(DTBlocks.LARGE_BLACK_OPAL_BUD),
    CLUSTER(DTBlocks.BLACK_OPAL_CLUSTER)
    ;

    private final Block block;

    BlackOpalBud(Block block) {
        this.block = block;
    }

    @Override
    public Block asBlock() {
        return this.block;
    }

}
