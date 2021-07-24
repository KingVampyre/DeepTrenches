package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.DoubleLayerRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.BlackLoosejawModel.MODEL;

public class BlackLoosejawLayer extends DoubleLayerRenderer<BlackLoosejawEntity> {

    private static final Identifier[] NORTHERN_BLACK_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital_and_lure_layer.png")
    };

    private static final Identifier[] SOUTHERN_BLACK_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/suborbital_and_lure_layer.png")
    };

    private static final Identifier[] FINS = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/translucent_layer.png")
    };

    private static final Identifier[][] TEXTURES = {
            NORTHERN_BLACK_LOOSEJAW,
            SOUTHERN_BLACK_LOOSEJAW
    };

    public BlackLoosejawLayer(IGeoRenderer<BlackLoosejawEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel() {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(BlackLoosejawEntity living) {
        return CustomRenderLayer.getLoosejawFins(FINS[living.getVariant()]);
    }

    @Override
    protected RenderLayer getSecondaryRenderLayer(BlackLoosejawEntity living) {
        var index = living.getLightStateIndex();
        var variant = living.getVariant();

        return CustomRenderLayer.getBrightOverlay(TEXTURES[variant][index]);
    }

}