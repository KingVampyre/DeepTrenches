package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.SingleRenderLayerFeature;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

public class SmalltoothDragonfishFinsFeature extends SingleRenderLayerFeature<SmalltoothDragonfishEntity> {

    private static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/smalltooth_dragonfish.geo.json");

    private static final RenderLayer TEXTURE = CustomRenderLayer.getLoosejawFinsLayer(new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/translucent_layer.png"));

    public SmalltoothDragonfishFinsFeature(IGeoRenderer<SmalltoothDragonfishEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel(SmalltoothDragonfishEntity living) {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(SmalltoothDragonfishEntity living) {
        return TEXTURE;
    }

}
