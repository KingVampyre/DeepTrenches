package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class BlackLoosejawFinsFeature extends SingleRenderLayerFeature<BlackLoosejawEntity> {

    private static final RenderLayer[] RENDER_LAYERS = {
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/translucent_layer.png"))
    };

    public BlackLoosejawFinsFeature(IGeoRenderer<BlackLoosejawEntity> renderer, Identifier model) {
        super(renderer, model);
    }

    @Override
    protected RenderLayer getRenderLayer(BlackLoosejawEntity living) {
        return RENDER_LAYERS[living.getVariant()];
    }

}
