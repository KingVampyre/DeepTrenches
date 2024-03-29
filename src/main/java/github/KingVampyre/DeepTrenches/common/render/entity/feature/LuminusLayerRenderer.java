package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Luminous;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static net.minecraft.client.render.OverlayTexture.DEFAULT_UV;

public abstract class LuminusLayerRenderer<T extends LivingEntity & IAnimatable & Luminous> extends SingleLayerRenderer<T> {

    protected final IGeoRenderer<T> renderer;

    public LuminusLayerRenderer(IGeoRenderer<T> renderer) {
        super(renderer);

        this.renderer = renderer;
    }

    protected abstract RenderLayer getLuminusRenderLayer(T living);

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumerProvider bufferIn, int packedLightIn, T living, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        super.render(matrixStackIn, bufferIn, packedLightIn, living, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch);

        if(living.isLit()) {
            var layer = this.getLuminusRenderLayer(living);

            if(layer != null)
                this.renderer.render(this.getModel(), living, partialTicks, layer, matrixStackIn, bufferIn, bufferIn.getBuffer(layer), 15728880, DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
        }

    }

}