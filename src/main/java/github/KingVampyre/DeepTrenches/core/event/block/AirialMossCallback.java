package github.KingVampyre.DeepTrenches.core.event.block;

import github.KingVampyre.DeepTrenches.common.event.block.BlockReplacementCallback;
import github.KingVampyre.DeepTrenches.core.block.enums.AirialMossType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static github.KingVampyre.DeepTrenches.core.init.DTItems.AIRIAL_MOSS;

public class AirialMossCallback implements BlockReplacementCallback {

    public static final AirialMossCallback INSTANCE = new AirialMossCallback();

    @Override
    public ActionResult interact(ItemPlacementContext context) {
        var pos = context.getBlockPos();
        var world = context.getWorld();

        var state = world.getBlockState(pos);
        var block = state.getBlock();

        var type = AirialMossType.from(block);
        var stack = context.getStack();

        if(type != null && stack != null) {
            var item = stack.getItem();

            if(item == AIRIAL_MOSS)
                return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }

}
