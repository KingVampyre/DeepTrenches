package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.EntityTypes;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

public class StaspAntennasFeatureRenderer extends SingleRenderLayerFeature<StaspEntity> {

    private static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/stasp.geo.json");

    private static final RenderLayer BRIGHT_BLACK_ANTENNAS = CustomRenderLayer.getBrightTexture(new Identifier("deep_trenches:textures/entity/black_stasp_antennas.png"));
    private static final RenderLayer BRIGHT_STASP_ANTENNAS = CustomRenderLayer.getBrightTexture(new Identifier("deep_trenches:textures/entity/stasp_antennas.png"));

    private static final RenderLayer BLACK_STASP_ANTENNAS = RenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/black_stasp_antennas.png"));
    private static final RenderLayer STASP_ANTENNAS = RenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/stasp_antennas.png"));

    public StaspAntennasFeatureRenderer(IGeoRenderer<StaspEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel(StaspEntity living) {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(StaspEntity living) {

        if(living.getType() == EntityTypes.BLACK_STASP)
            return living.isInvisible() ? BLACK_STASP_ANTENNAS : BRIGHT_BLACK_ANTENNAS;

        return living.isInvisible() ? STASP_ANTENNAS : BRIGHT_STASP_ANTENNAS;
    }

}
