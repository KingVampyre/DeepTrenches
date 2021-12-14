package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.common.block.Bud;
import github.KingVampyre.DeepTrenches.core.init.block.DTBlocks;
import net.minecraft.block.Block;

public enum SapphireBud implements Bud {
    SMALL(DTBlocks.SMALL_SAPPHIRE_BUD),
    MEDIUM(DTBlocks.MEDIUM_SAPPHIRE_BUD),
    LARGE(DTBlocks.LARGE_SAPPHIRE_BUD),
    CLUSTER(DTBlocks.SAPPHIRE_CLUSTER)
    ;

    private final Block block;

    SapphireBud(Block block) {
        this.block = block;
    }

    @Override
    public Block asBlock() {
        return this.block;
    }

}
