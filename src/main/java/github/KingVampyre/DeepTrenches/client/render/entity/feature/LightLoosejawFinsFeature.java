package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

public class LightLoosejawFinsFeature extends SingleRenderLayerFeature<LightLoosejawEntity> {

    private static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/light_loosejaw.geo.json");

    private static final RenderLayer[] RENDER_LAYERS = {
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/translucent_layer.png"))
    };

    public LightLoosejawFinsFeature(IGeoRenderer<LightLoosejawEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel(LightLoosejawEntity living) {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(LightLoosejawEntity living) {
        return RENDER_LAYERS[living.getLoosejawType()];
    }

}
