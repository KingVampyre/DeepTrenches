package github.KingVampyre.DeepTrenches.common.event.block;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.ActionResult;

@FunctionalInterface
public interface BlockReplacementCallback {

    Event<BlockReplacementCallback> EVENT = EventFactory.createArrayBacked(BlockReplacementCallback.class,
            (listeners) -> (context) -> {
                for (BlockReplacementCallback event : listeners) {
                    ActionResult result = event.interact(context);

                    if (result != ActionResult.PASS) {
                        return result;
                    }
                }

                return ActionResult.PASS;
            }
    );

    ActionResult interact(ItemPlacementContext context);

}
