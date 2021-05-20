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
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/translucent_layer.png"))
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
