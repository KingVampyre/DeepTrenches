package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

public class BlackLoosejawFinsFeature extends SingleRenderLayerFeature<BlackLoosejawEntity> {

    private static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/black_loosejaw.json");

    private static final RenderLayer[] RENDER_LAYERS = {
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/translucent_layer.png")),
            CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/translucent_layer.png"))
    };

    public BlackLoosejawFinsFeature(IGeoRenderer<BlackLoosejawEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel(BlackLoosejawEntity living) {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(BlackLoosejawEntity living) {
        return RENDER_LAYERS[living.getLoosejawType()];
    }

}
