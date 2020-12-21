package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.entity.model.StaspModel;
import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.EntityTypes;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class StaspAntennasFeatureRenderer extends FeatureRenderer<StaspEntity, StaspModel> {

    private static final RenderLayer BRIGHT_BLACK_ANTENNAS = CustomRenderLayer.getBrightTexture(new Identifier("deep_trenches:textures/entity/black_stasp_antennas.png"));
    private static final RenderLayer BRIGHT_STASP_ANTENNAS = CustomRenderLayer.getBrightTexture(new Identifier("deep_trenches:textures/entity/stasp_antennas.png"));

    private static final RenderLayer BLACK_STASP_ANTENNAS = RenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/black_stasp_antennas.png"));
    private static final RenderLayer STASP_ANTENNAS = RenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/stasp_antennas.png"));

    public StaspAntennasFeatureRenderer(FeatureRendererContext<StaspEntity, StaspModel> context) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, StaspEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        RenderLayer layer = this.getStaspAntennas(entity);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(layer);

        this.getContextModel().render(matrices, vertexConsumer, 15728640, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    protected RenderLayer getStaspAntennas(StaspEntity stasp) {

        if(stasp.getType() == EntityTypes.BLACK_STASP)
            return stasp.isInvisible() ? BLACK_STASP_ANTENNAS : BRIGHT_BLACK_ANTENNAS;

        return stasp.isInvisible() ? STASP_ANTENNAS : BRIGHT_STASP_ANTENNAS;
    }

}
