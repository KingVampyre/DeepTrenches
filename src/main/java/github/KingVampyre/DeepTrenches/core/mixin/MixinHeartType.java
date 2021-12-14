package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static github.KingVampyre.DeepTrenches.core.init.entity.DTStatusEffects.SOUL_DRAINING;

@Mixin(InGameHud.HeartType.class)
public class MixinHeartType {

    @Inject(method = "fromPlayerState", at = @At("HEAD"), cancellable = true)
    private static void fromPlayerState(PlayerEntity player, CallbackInfoReturnable<InGameHud.HeartType> cir) {

        if(player.hasStatusEffect(SOUL_DRAINING))
            cir.setReturnValue(InGameHud.HeartType.WITHERED);
    }

}
