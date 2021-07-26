package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminusLayerRenderer;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.SmalltoothDragonfishModel.MODEL;

public class SmalltoothDragonfishLayer extends LuminusLayerRenderer<SmalltoothDragonfishEntity> {

    private static final Identifier FINS = new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/translucent_layer.png");

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital_and_lure_layer.png")
    };

    public SmalltoothDragonfishLayer(IGeoRenderer<SmalltoothDragonfishEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel() {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(SmalltoothDragonfishEntity living) {
        return CustomRenderLayer.getLoosejawFins(FINS);
    }

    @Override
    protected RenderLayer getLuminusRenderLayer(SmalltoothDragonfishEntity living) {
        return CustomRenderLayer.getBrightOverlay(TEXTURES[living.getLightStateIndex()]);
    }

}
