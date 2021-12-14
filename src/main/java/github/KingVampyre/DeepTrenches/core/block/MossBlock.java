package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerAbstractLichenBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlowLichenBlock;
import net.minecraft.item.ItemPlacementContext;

import static github.KingVampyre.DeepTrenches.core.init.item.DTItems.MOSS;

public class MossBlock extends GlowLichenBlock {

    public MossBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {

        if (context.getStack().isOf(MOSS))
            return InvokerAbstractLichenBlock.isNotFullBlock(state);

        return true;
    }

}
