package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.HoneycombDragonfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.HoneycombDragonfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.HoneycombDragonfishModel.MODEL;

public class HoneycombDragonfishRenderer extends NoCullingEntityRenderer<HoneycombDragonfishEntity> {

    private static final RenderLayer[] LAYERS = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/honeycomb_dragonfish/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/honeycomb_dragonfish/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/honeycomb_dragonfish/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/honeycomb_dragonfish/lure_layer.png")
    };

    public HoneycombDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new HoneycombDragonfishModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
