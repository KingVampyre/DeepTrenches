package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.common.block.SpreadingVineBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.VineBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VineBlock.class)
public class MixinVineBlock {

    @Inject(method = "shouldConnectTo", at = @At("HEAD"), cancellable = true)
    private static void shouldConnectTo(BlockView world, BlockPos pos, Direction direction, CallbackInfoReturnable<Boolean> cir) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if(block instanceof SpreadingVineBlock) {
            SpreadingVineBlock vineFlowers = (SpreadingVineBlock) block;

            cir.setReturnValue(vineFlowers.canPlantOnTop(state, world, pos));
        }

    }

}
