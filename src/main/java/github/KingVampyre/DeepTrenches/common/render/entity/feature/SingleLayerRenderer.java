package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static net.minecraft.client.render.OverlayTexture.DEFAULT_UV;

public abstract class SingleLayerRenderer<T extends LivingEntity & IAnimatable> extends GeoLayerRenderer<T> {

    private final IGeoRenderer<T> renderer;

    public SingleLayerRenderer(IGeoRenderer<T> renderer) {
        super(renderer);

        this.renderer = renderer;
    }

    protected abstract RenderLayer getRenderLayer(T living);

    protected abstract GeoModel getModel();

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumerProvider bufferIn, int packedLightIn, T living, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        var layer = this.getRenderLayer(living);

        if(layer != null)
            this.renderer.render(this.getModel(), living, partialTicks, layer, matrixStackIn, bufferIn, bufferIn.getBuffer(layer), 15728880, DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);

    }

}
