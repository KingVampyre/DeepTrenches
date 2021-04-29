package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.common.event.block.BlockReplacementCallback;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.ActionResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractBlock.AbstractBlockState.class)
public class MixinAbstractBlockState {

    @Inject(method = "canReplace", at = @At("HEAD"), cancellable = true)
    public void canReplace(ItemPlacementContext context, CallbackInfoReturnable<Boolean> cir) {
        ActionResult result = BlockReplacementCallback.EVENT.invoker().interact(context);

        if (result != ActionResult.PASS)
            cir.setReturnValue(result == ActionResult.SUCCESS);

    }

}
