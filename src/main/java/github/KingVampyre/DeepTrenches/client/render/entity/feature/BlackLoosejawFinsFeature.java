package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

public class BlackLoosejawFinsFeature extends SingleRenderLayerFeature<BlackLoosejawEntity, BlackLoosejawModel> {

    private static final RenderLayer[] RENDER_LAYERS = {
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/translucent_layer.png"))
    };

    public BlackLoosejawFinsFeature(FeatureRendererContext<BlackLoosejawEntity, BlackLoosejawModel> context) {
        super(context);
    }

    @Override
    protected RenderLayer getRenderLayer(BlackLoosejawEntity entity) {
        return RENDER_LAYERS[entity.getLoosejawType()];
    }

}
