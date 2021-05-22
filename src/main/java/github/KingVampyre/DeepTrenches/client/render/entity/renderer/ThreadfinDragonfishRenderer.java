package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.ThreadfinDragonfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.ThreadfinDragonfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.ThreadfinDragonfishModel.MODEL;

public class ThreadfinDragonfishRenderer extends NoCullingEntityRenderer<ThreadfinDragonfishEntity> {

    private static final RenderLayer[] LAYERS = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/threadfin_dragonfish/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/threadfin_dragonfish/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/threadfin_dragonfish/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/threadfin_dragonfish/lure_layer.png")
    };

    public ThreadfinDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ThreadfinDragonfishModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
