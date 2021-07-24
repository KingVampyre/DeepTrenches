package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleLayerRenderer;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.StaspModel.MODEL;

public class StaspAntennasLayer extends SingleLayerRenderer<StaspEntity> {

    private static final RenderLayer BLACK_STASP_ANTENNAS = CustomRenderLayer.getBrightOverlay(new Identifier("deep_trenches:textures/entity/stasp/black_stasp/antennas.png"));
    private static final RenderLayer STASP_ANTENNAS = CustomRenderLayer.getBrightOverlay(new Identifier("deep_trenches:textures/entity/stasp/antennas.png"));

    public StaspAntennasLayer(IGeoRenderer<StaspEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel() {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(StaspEntity living) {
        return living.getVariant() != 0 ? STASP_ANTENNAS : BLACK_STASP_ANTENNAS;
    }

}
