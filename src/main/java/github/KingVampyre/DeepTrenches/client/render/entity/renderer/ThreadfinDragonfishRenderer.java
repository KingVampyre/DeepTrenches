package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.ThreadfinDragonfishModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.ThreadfinDragonfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import java.util.Map;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.ThreadfinDragonfishModel.MODEL;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;

public class ThreadfinDragonfishRenderer extends NoCullingEntityRenderer<ThreadfinDragonfishEntity> {

    private static final Map<LightState, RenderLayer> LAYERS = ImmutableMap
            .<LightState, RenderLayer>builder()
            .put(ALL_LIT, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/threadfin_dragonfish/all_lit_layer.png"))
            .put(FLANK, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/threadfin_dragonfish/flank_layer.png"))
            .put(LURE, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/threadfin_dragonfish/lure_layer.png"))
            .build();

    public ThreadfinDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ThreadfinDragonfishModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
