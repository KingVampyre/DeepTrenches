package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.common.block.Bud;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;

public enum GarnetBud implements Bud {
    SMALL(DTBlocks.SMALL_GARNET_BUD),
    MEDIUM(DTBlocks.MEDIUM_GARNET_BUD),
    LARGE(DTBlocks.LARGE_GARNET_BUD),
    CLUSTER(DTBlocks.GARNET_CLUSTER)
    ;

    private final Block block;

    GarnetBud(Block block) {
        this.block = block;
    }

    @Override
    public Block asBlock() {
        return this.block;
    }

}
