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

import static github.KingVampyre.DeepTrenches.core.init.ModItems.AIRIAL_MOSS;

public class AirialMossCallback implements BlockReplacementCallback {

    public static final AirialMossCallback INSTANCE = new AirialMossCallback();

    @Override
    public ActionResult interact(ItemPlacementContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();

        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        AirialMossType type = AirialMossType.from(block);
        ItemStack stack = context.getStack();

        if(type != null && stack != null) {
            Item item = stack.getItem();

            if(item == AIRIAL_MOSS)
                return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }

}
