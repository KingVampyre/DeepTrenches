package github.KingVampyre.DeepTrenches.client.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.DoubleLayerRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.BarbeledLoosejawModel.MODEL;

public class BarbeledLoosejawLayer extends DoubleLayerRenderer<BarbeledLoosejawEntity> {

    private static final Identifier[] ATLANTIC_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_and_lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_and_suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/suborbital_and_lure_layer.png")
    };

    private static final Identifier[] GLOWING_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_and_lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_and_suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/suborbital_and_lure_layer.png")
    };

    private static final Identifier[] GRIMALDIS_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_and_lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_and_suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/suborbital_and_lure_layer.png")
    };

    private static final Identifier[] MANY_RAYED_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_and_lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_and_suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/suborbital_and_lure_layer.png")
    };

    private static final Identifier[] SHINY_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_and_lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_and_suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/suborbital_and_lure_layer.png")
    };

    private static final Identifier[] TITTMANNS_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_and_lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_and_suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/lure_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/suborbital_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/suborbital_and_lure_layer.png")
    };

    private static final Identifier[] FINS = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/translucent_layer.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/translucent_layer.png")
    };

    private static final Identifier[][] TEXTURES = {
            ATLANTIC_BARBELED_LOOSEJAW,
            GLOWING_BARBELED_LOOSEJAW,
            GRIMALDIS_BARBELED_LOOSEJAW,
            MANY_RAYED_BARBELED_LOOSEJAW,
            SHINY_BARBELED_LOOSEJAW,
            TITTMANNS_BARBELED_LOOSEJAW
    };

    public BarbeledLoosejawLayer(IGeoRenderer<BarbeledLoosejawEntity> renderer) {
        super(renderer);
    }

    @Override
    protected GeoModel getModel() {
        return this.getEntityModel().getModel(MODEL);
    }

    @Override
    protected RenderLayer getRenderLayer(BarbeledLoosejawEntity living) {
        return CustomRenderLayer.getLoosejawFins(FINS[living.getVariant()]);
    }

    @Override
    protected RenderLayer getSecondaryRenderLayer(BarbeledLoosejawEntity living) {
        var index = living.getLightStateIndex();
        var variant = living.getVariant();

        return CustomRenderLayer.getBrightOverlay(TEXTURES[variant][index]);
    }

}