package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

public class LightLoosejawFinsFeature extends SingleRenderLayerFeature<LightLoosejawEntity> {

    private static final RenderLayer[] RENDER_LAYERS = {
            CustomRenderLayer.getFinsLayer("deep_trenches:textures/entity/light_loosejaw/biglamp/translucent_layer.png"),
            CustomRenderLayer.getFinsLayer("deep_trenches:textures/entity/light_loosejaw/goodyears/translucent_layer.png"),
            CustomRenderLayer.getFinsLayer("deep_trenches:textures/entity/light_loosejaw/guernes/translucent_layer.png"),
            CustomRenderLayer.getFinsLayer("deep_trenches:textures/entity/light_loosejaw/liems/translucent_layer.png"),
            CustomRenderLayer.getFinsLayer("deep_trenches:textures/entity/light_loosejaw/remarkable_light/translucent_layer.png"),
            CustomRenderLayer.getFinsLayer("deep_trenches:textures/entity/light_loosejaw/small_light/translucent_layer.png")
    };

    public LightLoosejawFinsFeature(IGeoRenderer<LightLoosejawEntity> renderer, Identifier model) {
        super(renderer, model);
    }

    @Override
    protected RenderLayer getRenderLayer(LightLoosejawEntity living) {
        return RENDER_LAYERS[living.getVariant()];
    }

}
