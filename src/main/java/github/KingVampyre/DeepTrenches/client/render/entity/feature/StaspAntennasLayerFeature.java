package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.StaspModel.MODEL;

public class StaspAntennasLayerFeature extends GeoLayerRenderer<StaspEntity> {

    private static final RenderLayer BRIGHT_BLACK_STASP_ANTENNAS = CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/stasp/black_stasp/antennas.png"));
    private static final RenderLayer BRIGHT_STASP_ANTENNAS = CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/stasp/antennas.png"));

    private static final RenderLayer BLACK_STASP_ANTENNAS = CustomRenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/stasp/black_stasp/antennas.png"));
    private static final RenderLayer STASP_ANTENNAS = CustomRenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/stasp/antennas.png"));

    private final IGeoRenderer<StaspEntity> renderer;

    public StaspAntennasLayerFeature(IGeoRenderer<StaspEntity> renderer) {
        super(renderer);

        this.renderer = renderer;
    }

    @Override
    public void render(MatrixStack matrixStackIn, VertexConsumerProvider bufferIn, int packedLightIn, StaspEntity living, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        var layer = this.getRenderLayer(living);

        this.renderer.render(this.getEntityModel().getModel(MODEL), living, partialTicks, layer, matrixStackIn, bufferIn, bufferIn.getBuffer(layer), 15728880, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    protected RenderLayer getRenderLayer(StaspEntity living) {

        if(living.getVariant() != 0)
            return living.isInvisible() ? STASP_ANTENNAS : BRIGHT_STASP_ANTENNAS;

        return living.isInvisible() ? BLACK_STASP_ANTENNAS : BRIGHT_BLACK_STASP_ANTENNAS;
    }

}
