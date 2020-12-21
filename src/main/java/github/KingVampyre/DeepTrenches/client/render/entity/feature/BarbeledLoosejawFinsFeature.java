package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BarbeledLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

public class BarbeledLoosejawFinsFeature extends SingleRenderLayerFeature<BarbeledLoosejawEntity, BarbeledLoosejawModel> {

    private static final RenderLayer[] RENDER_LAYERS = {
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/translucent_layer.png"))
    };

    public BarbeledLoosejawFinsFeature(FeatureRendererContext<BarbeledLoosejawEntity, BarbeledLoosejawModel> context) {
        super(context);
    }

    @Override
    protected RenderLayer getRenderLayer(BarbeledLoosejawEntity entity) {
        return RENDER_LAYERS[entity.getLoosejawType()];
    }

}
