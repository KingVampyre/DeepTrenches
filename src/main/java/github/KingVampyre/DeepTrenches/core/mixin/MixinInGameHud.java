package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static github.KingVampyre.DeepTrenches.client.init.DTTextures.GUI_ACID_CORRODED_ICONS;
import static github.KingVampyre.DeepTrenches.client.init.DTTextures.GUI_GAS_CORRODED_ICONS;
import static github.KingVampyre.DeepTrenches.core.init.DTStatusEffects.*;
import static net.minecraft.entity.effect.StatusEffects.REGENERATION;

@Mixin(InGameHud.class)
public abstract class MixinInGameHud extends DrawableHelper {

    @Shadow
    @Final
    private MinecraftClient client;

    @Shadow
    protected abstract PlayerEntity getCameraPlayer();

    @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/InGameHud;renderStatusBars(Lnet/minecraft/client/util/math/MatrixStack;)V"))
    private void renderIcons(MatrixStack matrices, float tickDelta, CallbackInfo ci) {
        PlayerEntity player = this.getCameraPlayer();

        if(player != null) {
            TextureManager textureManager = this.client.getTextureManager();

            if(player.hasStatusEffect(ACID_CORROSION))
                textureManager.bindTexture(GUI_ACID_CORRODED_ICONS);

            else if(player.hasStatusEffect(GAS_CORROSION))
                textureManager.bindTexture(GUI_GAS_CORRODED_ICONS);

        }

    }

    @Redirect(method = "renderStatusBars", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;hasStatusEffect(Lnet/minecraft/entity/effect/StatusEffect;)Z", ordinal = 0))
    private boolean renderSoulRavening(PlayerEntity playerEntity, StatusEffect effect) {
        return playerEntity.hasStatusEffect(REGENERATION) || playerEntity.hasStatusEffect(SOUL_RAVENING);
    }

}
