package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

public class BarbeledLoosejawFinsFeature extends SingleRenderLayerFeature<BarbeledLoosejawEntity> {

    private static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/barbeled_loosejaw.json");

    private static final RenderLayer[] RENDER_LAYERS = {
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/translucent_layer.png"))
    };

    public BarbeledLoosejawFinsFeature(IGeoRenderer<BarbeledLoosejawEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel(BarbeledLoosejawEntity entity) {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(BarbeledLoosejawEntity living) {
        return RENDER_LAYERS[living.getLoosejawType()];
    }

}
