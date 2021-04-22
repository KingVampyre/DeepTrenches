package github.KingVampyre.DeepTrenches.client.mixin;

import github.KingVampyre.DeepTrenches.client.texture.Sprites;
import github.KingVampyre.DeepTrenches.core.init.SignTypes;
import net.minecraft.block.AbstractSignBlock;
import net.minecraft.block.Block;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.SignType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SignBlockEntityRenderer.class)
public class MixinSignBlockEntityRenderer {

    @Inject(method = "getModelTexture", at = @At("HEAD"), cancellable = true)
    private static void getModelTexture(Block block, CallbackInfoReturnable<SpriteIdentifier> callback) {

        if (block instanceof AbstractSignBlock) {
            AbstractSignBlock sign = (AbstractSignBlock) block;
            SignType signType = sign.getSignType();

            if (SignTypes.contains(signType))
                callback.setReturnValue(Sprites.getSignTexture(signType));
        }

    }

}
