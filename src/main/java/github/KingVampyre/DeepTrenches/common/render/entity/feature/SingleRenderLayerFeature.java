package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public abstract class SingleRenderLayerFeature<T extends LivingEntity & IAnimatable> extends GeoLayerRenderer<T> {

    protected final Identifier model;
    private final IGeoRenderer<T> renderer;

    public SingleRenderLayerFeature(IGeoRenderer<T> renderer, Identifier model) {
        super(renderer);

        this.model = model;
        this.renderer = renderer;
    }

    protected abstract RenderLayer getRenderLayer(T living);

    protected GeoModel getModel(T living) {
        return this.getEntityModel().getModel(this.model);
    }

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumerProvider bufferIn, int packedLightIn, T living, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        RenderLayer layer = this.getRenderLayer(living);
        GeoModel model = this.getModel(living);

        if(layer != null)
            this.renderer.render(model, living, partialTicks, layer, matrixStackIn, bufferIn, bufferIn.getBuffer(layer), packedLightIn, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
    }

}
