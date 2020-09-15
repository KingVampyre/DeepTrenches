package github.KingVampyre.DeepTrenches.client.mixin;

import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.SOUL_DRAINING;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.SOUL_RAVENING;
import static net.minecraft.entity.effect.StatusEffects.REGENERATION;
import static net.minecraft.entity.effect.StatusEffects.WITHER;

@Mixin(InGameHud.class)
public class InGameHudMixin {

    @Redirect(method = "renderStatusBars", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;hasStatusEffect(Lnet/minecraft/entity/effect/StatusEffect;)Z", ordinal = 0))
    private boolean renderSoulRavening(PlayerEntity playerEntity, StatusEffect effect) {
        return playerEntity.hasStatusEffect(REGENERATION) || playerEntity.hasStatusEffect(SOUL_RAVENING);
    }

    @Redirect(method = "renderStatusBars", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;hasStatusEffect(Lnet/minecraft/entity/effect/StatusEffect;)Z", ordinal = 2))
    private boolean renderSoulDraining(PlayerEntity playerEntity, StatusEffect effect) {
        return playerEntity.hasStatusEffect(WITHER) || playerEntity.hasStatusEffect(SOUL_DRAINING);
    }

}
