package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.FinangiteModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.FinangiteEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import java.util.Map;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.FinangiteModel.MODEL;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;

public class FinangiteRenderer extends NoCullingEntityRenderer<FinangiteEntity> {

    private static final Map<LightState, RenderLayer> LAYERS = ImmutableMap
            .<LightState, RenderLayer>builder()
            .put(ALL_LIT, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/finangite/all_lit_layer.png"))
            .put(BACK, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/finangite/back_layer.png"))
            .put(BACK_PECTORAL_FIN_FRONT, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/finangite/back_pectoral_fin_front.png"))
            .put(BACK_PECTORAL_FIN_REAR, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/finangite/back_pectoral_fin_rear.png"))
            .put(PECTORAL_FIN, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/finangite/pectoral_fin.png"))
            .put(PECTORAL_FIN_FRONT, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/finangite/pectoral_fin_front.png"))
            .put(PECTORAL_FIN_REAR, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/finangite/pectoral_fin_rear.png"))
            .build();

    public FinangiteRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FinangiteModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
