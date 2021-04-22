package github.KingVampyre.DeepTrenches.client.mixin;

import github.KingVampyre.DeepTrenches.core.init.SignTypes;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

import static net.minecraft.client.render.TexturedRenderLayers.SIGNS_ATLAS_TEXTURE;

@Mixin(TexturedRenderLayers.class)
public class MixinTexturedRenderLayers {

    @Inject(method = "addDefaultTextures", at = @At("HEAD"))
    private static void addDefaultTextures(Consumer<SpriteIdentifier> adder, CallbackInfo ci) {
        SignTypes.steam()
                .map(signType -> "deep_trenches:entity/signs/" + signType.getName())
                .map(Identifier::new)
                .map(id -> new SpriteIdentifier(SIGNS_ATLAS_TEXTURE, id))
                .forEach(adder);
    }

}
