package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

public class StaspAntennasLayerFeature extends SingleRenderLayerFeature<StaspEntity> {

    private static final RenderLayer BRIGHT_BLACK_STASP_ANTENNAS = CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/stasp/black_stasp/antennas.png");
    private static final RenderLayer BRIGHT_STASP_ANTENNAS = CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/stasp/antennas.png");

    private static final RenderLayer BLACK_STASP_ANTENNAS = RenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/stasp/black_stasp/antennas.png"));
    private static final RenderLayer STASP_ANTENNAS = RenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/stasp/antennas.png"));

    public StaspAntennasLayerFeature(IGeoRenderer<StaspEntity> renderer, Identifier model) {
        super(renderer, model);
    }

    @Override
    protected RenderLayer getRenderLayer(StaspEntity living) {

        if(living.getVariant() != 0)
            return living.isInvisible() ? STASP_ANTENNAS : BRIGHT_STASP_ANTENNAS;

        return living.isInvisible() ? BLACK_STASP_ANTENNAS : BRIGHT_BLACK_STASP_ANTENNAS;
    }

}
