package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LoosejawFinsLayerRenderer;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class LightLoosejawFinsFeature extends LoosejawFinsLayerRenderer<LightLoosejawEntity> {

    private static final RenderLayer[] RENDER_LAYERS = {
            CustomRenderLayer.getLoosejawFins(new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFins(new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFins(new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFins(new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFins(new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFins(new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/translucent_layer.png"))
    };

    public LightLoosejawFinsFeature(IGeoRenderer<LightLoosejawEntity> renderer, Identifier model) {
        super(renderer, model);
    }

    @Override
    protected RenderLayer getRenderLayer(LightLoosejawEntity living) {
        return RENDER_LAYERS[living.getVariant()];
    }

}
