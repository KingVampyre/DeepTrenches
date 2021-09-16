package github.KingVampyre.DeepTrenches.core.event.block;

import github.KingVampyre.DeepTrenches.common.event.block.BlockReplacementCallback;
import github.KingVampyre.DeepTrenches.core.block.enums.IlmiumType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.ActionResult;

import static github.KingVampyre.DeepTrenches.core.init.DTItems.ILMIUM;
import static net.minecraft.util.ActionResult.PASS;
import static net.minecraft.util.ActionResult.SUCCESS;

public class IlmiumCallback implements BlockReplacementCallback {

    public static final IlmiumCallback INSTANCE = new IlmiumCallback();

    @Override
    public ActionResult interact(ItemPlacementContext context) {
        var pos = context.getBlockPos();
        var world = context.getWorld();

        var state = world.getBlockState(pos);
        var block = state.getBlock();

        var type = IlmiumType.from(block);
        var stack = context.getStack();

        if(type != null && stack != null) {
            var item = stack.getItem();

            if(item == ILMIUM)
                return SUCCESS;
        }

        return PASS;
    }

}
