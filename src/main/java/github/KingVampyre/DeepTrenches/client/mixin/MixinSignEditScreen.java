package github.KingVampyre.DeepTrenches.client.mixin;

import github.KingVampyre.DeepTrenches.common.block.entity.renderer.ModSignBlockEntityRenderer;
import github.KingVampyre.DeepTrenches.core.init.BlockEntityTypes;
import net.minecraft.block.AbstractSignBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.gui.screen.ingame.SignEditScreen;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.Function;

@Mixin(SignEditScreen.class)
public class MixinSignEditScreen {

    @Shadow @Final private SignBlockEntity sign;

    @Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/SpriteIdentifier;getVertexConsumer(Lnet/minecraft/client/render/VertexConsumerProvider;Ljava/util/function/Function;)Lnet/minecraft/client/render/VertexConsumer;"))
    private VertexConsumer getVertexConsumer(SpriteIdentifier spriteIdentifier, VertexConsumerProvider vertexConsumers, Function<Identifier, RenderLayer> layerFactory) {

        if(this.sign.getType() == BlockEntityTypes.SIGN) {
            BlockState state = this.sign.getCachedState();
            AbstractSignBlock signBlock = (AbstractSignBlock) state.getBlock();

            Identifier texture = ModSignBlockEntityRenderer.getTexture(signBlock);
            RenderLayer renderLayer = RenderLayer.getEntityCutout(texture);

            return vertexConsumers.getBuffer(renderLayer);
        }

        return spriteIdentifier.getVertexConsumer(vertexConsumers, layerFactory);
    }

}
