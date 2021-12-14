package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.common.block.Bud;
import github.KingVampyre.DeepTrenches.core.init.block.DTBlocks;
import net.minecraft.block.Block;

public enum DiamondBud implements Bud {
    SMALL(DTBlocks.SMALL_DIAMOND_BUD),
    MEDIUM(DTBlocks.MEDIUM_DIAMOND_BUD),
    LARGE(DTBlocks.LARGE_DIAMOND_BUD),
    CLUSTER(DTBlocks.DIAMOND_CLUSTER)
    ;

    private final Block block;

    DiamondBud(Block block) {
        this.block = block;
    }

    @Override
    public Block asBlock() {
        return this.block;
    }

}
