package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.DeepLakeBettaModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

import java.util.Map;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.DeepLakeBettaModel.MODEL;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.*;

public class DeepLakeBettaRenderer extends NoCullingEntityRenderer<DeepLakeBettaEntity> {

    private static final Map<LightState, RenderLayer> LAYERS = ImmutableMap
            .<LightState, RenderLayer>builder()
            .put(ALL_LIT, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/deep_lake_betta/all_lit_layer.png"))
            .put(BODY, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/deep_lake_betta/body_layer.png"))
            .put(LURE, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/deep_lake_betta/lure_layer.png"))
            .build();

    public DeepLakeBettaRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new DeepLakeBettaModel());

	    this.shadowRadius = 0.35F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

    @Override
    public void render(DeepLakeBettaEntity entity, float entityYaw, float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);

        stack.translate(0, 1.1F, 0);
    }

}
