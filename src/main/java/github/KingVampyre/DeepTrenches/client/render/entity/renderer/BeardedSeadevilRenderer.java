package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BeardedSeadevilModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BeardedSeadevilEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import java.util.Map;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.BeardedSeadevilModel.MODEL;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;

public class BeardedSeadevilRenderer extends NoCullingEntityRenderer<BeardedSeadevilEntity> {

    private static final Map<LightState, RenderLayer> LAYERS = ImmutableMap
            .<LightState, RenderLayer>builder()
            .put(ALL_LIT, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/bearded_seadevil/all_lit_layer.png"))
            .put(BEARD, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/bearded_seadevil/beard_layer.png"))
            .put(LURE, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/bearded_seadevil/lure_layer.png"))
            .build();

    public BeardedSeadevilRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BeardedSeadevilModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}