package github.KingVampyre.DeepTrenches.core.block.enums;

import github.KingVampyre.DeepTrenches.common.block.Bud;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.Block;

public enum ClinohumiteBud implements Bud {
    SMALL(DTBlocks.SMALL_CLINOHUMITE_BUD),
    MEDIUM(DTBlocks.MEDIUM_CLINOHUMITE_BUD),
    LARGE(DTBlocks.LARGE_CLINOHUMITE_BUD),
    CLUSTER(DTBlocks.CLINOHUMITE_CLUSTER)
    ;

    private final Block block;

    ClinohumiteBud(Block block) {
        this.block = block;
    }

    @Override
    public Block asBlock() {
        return this.block;
    }

}
