package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerAbstractLichenBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlowLichenBlock;
import net.minecraft.item.ItemPlacementContext;

import static github.KingVampyre.DeepTrenches.core.init.item.DTItems.LICHEN;

public class LichenBlock extends GlowLichenBlock {

    public LichenBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {

        if (context.getStack().isOf(LICHEN))
            return InvokerAbstractLichenBlock.isNotFullBlock(state);

        return true;
    }

}
