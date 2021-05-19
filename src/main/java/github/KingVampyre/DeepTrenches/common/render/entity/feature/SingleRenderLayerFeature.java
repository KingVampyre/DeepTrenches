package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderer.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

public abstract class SingleRenderLayerFeature<T extends LivingEntity & IAnimatable> extends GeoLayerRenderer<T> {

    private final IGeoRenderer<T> renderer;

    public SingleRenderLayerFeature(IGeoRenderer<T> renderer) {
        super(renderer);

        this.renderer = renderer;
    }

    protected abstract GeoModel getModel(T living);

    protected abstract RenderLayer getRenderLayer(T living);

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumerProvider bufferIn, int packedLightIn, T living, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        RenderLayer layer = this.getRenderLayer(living);
        GeoModel model = this.getModel(living);

        this.renderer.render(model, living, partialTicks, layer, matrixStackIn, bufferIn, bufferIn.getBuffer(layer), packedLightIn, 0, 1.0F, 1.0F, 1.0F, 1.0F);
    }

}
