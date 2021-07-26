package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminusLayerRenderer;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.LightLoosejawModel.MODEL;

public class LightLoosejawLayer extends LuminusLayerRenderer<LightLoosejawEntity> {

    private static final Identifier[] BIGLAMP_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/lure_layer.png")
    };

    private static final Identifier[] GOODYEARS_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/lure_layer.png")
    };

    private static final Identifier[] GUERNES_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/lure_layer.png")
    };

    private static final Identifier[] LIEMS_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/lure_layer.png")
    };

    private static final Identifier[] REMARKABLE_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/lure_layer.png")
    };

    private static final Identifier[] SMALL_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/lure_layer.png")
    };

    private static final Identifier[] FINS = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/translucent_layer.png")
    };

    private static final Identifier[][] TEXTURES = {
            BIGLAMP_LIGHT_LOOSEJAW,
            GOODYEARS_LIGHT_LOOSEJAW,
            GUERNES_LIGHT_LOOSEJAW,
            LIEMS_LIGHT_LOOSEJAW,
            REMARKABLE_LIGHT_LOOSEJAW,
            SMALL_LIGHT_LOOSEJAW
    };

    public LightLoosejawLayer(IGeoRenderer<LightLoosejawEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel() {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(LightLoosejawEntity living) {
        return CustomRenderLayer.getLoosejawFins(FINS[living.getVariant()]);
    }

    @Override
    protected RenderLayer getLuminusRenderLayer(LightLoosejawEntity living) {
        var index = living.getLightStateIndex();
        var variant = living.getVariant();

        return CustomRenderLayer.getBrightOverlay(TEXTURES[variant][index]);
    }

}