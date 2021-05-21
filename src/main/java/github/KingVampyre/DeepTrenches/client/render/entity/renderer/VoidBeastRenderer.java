package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.VoidBeastModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.VoidBeastEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import java.util.Map;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.VoidBeastModel.MODEL;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;

public class VoidBeastRenderer extends NoCullingEntityRenderer<VoidBeastEntity> {

    private static final Map<LightState, RenderLayer> LAYERS = ImmutableMap
            .<LightState, RenderLayer>builder()
            .put(ALL_LIT, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/void_beast/all_lit_layer.png"))
            .put(TAIL, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/void_beast/tail.png"))
            .put(TONGUE, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/void_beast/tongue.png"))
            .build();

    public VoidBeastRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new VoidBeastModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
