package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import github.KingVampyre.DeepTrenches.common.entity.AbstractLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static net.minecraft.client.render.OverlayTexture.DEFAULT_UV;

public abstract class LoosejawFinsLayerRenderer<T extends AbstractLoosejawEntity> extends GeoLayerRenderer<T> {

    protected final Identifier model;
    private final IGeoRenderer<T> renderer;

    public LoosejawFinsLayerRenderer(IGeoRenderer<T> renderer, Identifier model) {
        super(renderer);

        this.model = model;
        this.renderer = renderer;
    }

    protected abstract RenderLayer getRenderLayer(T living);

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumerProvider bufferIn, int packedLightIn, T living, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        var model = this.getEntityModel().getModel(this.model);
        var layer = this.getRenderLayer(living);

        if(!living.isInvisible())
            this.renderer.render(model, living, partialTicks, layer, matrixStackIn, bufferIn, bufferIn.getBuffer(layer), packedLightIn, DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
    }

}
