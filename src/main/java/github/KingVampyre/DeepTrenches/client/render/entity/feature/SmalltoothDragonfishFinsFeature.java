package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LoosejawFinsLayerRenderer;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class SmalltoothDragonfishFinsFeature extends LoosejawFinsLayerRenderer<SmalltoothDragonfishEntity> {

    private static final RenderLayer LAYER = CustomRenderLayer.getLoosejawFins(new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/translucent_layer.png"));

    public SmalltoothDragonfishFinsFeature(IGeoRenderer<SmalltoothDragonfishEntity> renderer, Identifier model) {
        super(renderer, model);
    }

    @Override
    protected RenderLayer getRenderLayer(SmalltoothDragonfishEntity living) {
        return LAYER;
    }

}
