package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public abstract class SingleRenderLayerFeature<T extends Entity, M extends EntityModel<T>> extends FeatureRenderer<T, M> {

    public SingleRenderLayerFeature(FeatureRendererContext<T, M> context) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        RenderLayer layer = this.getRenderLayer(entity);

        this.getContextModel().render(matrices, vertexConsumers.getBuffer(layer), 15728640, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    protected abstract RenderLayer getRenderLayer(T entity);

}
