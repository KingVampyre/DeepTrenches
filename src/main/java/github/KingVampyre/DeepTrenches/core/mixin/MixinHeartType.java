package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.core.init.HeartTypes;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.SOUL_DRAINING;

@Mixin(InGameHud.HeartType.class)
public class MixinHeartType {

    @Inject(method = "fromPlayerState", at = @At("HEAD"), cancellable = true)
    private static void fromPlayerState(PlayerEntity player, CallbackInfoReturnable<InGameHud.HeartType> cir) {

        if(player.hasStatusEffect(SOUL_DRAINING))
            cir.setReturnValue(HeartTypes.SOUL_DRAINING);
    }

}
