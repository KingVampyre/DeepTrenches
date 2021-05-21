package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.BlackLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.BlackLoosejawModel.MODEL;

public class BlackLoosejawRenderer extends NoCullingEntityRenderer<BlackLoosejawEntity> {

    /*
    private static final Map<LightState, RenderLayer> LAYERS = ImmutableMap
            .<LightState, RenderLayer>builder()
            .put(ALL_LIT, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/all_lit_layer.png"))
            .put(FLANK, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/flank_layer.png"))
            .put(FLANK_AND_LURE, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/flank_and_lure_layer.png"))
            .put(FLANK_AND_SUBORBITAL, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/flank_and_suborbital_layer.png"))
            .put(LURE, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/lure_layer.png"))
            .put(SUBORBITAL, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/suborbital_layer.png"))
            .put(SUBORBITAL_AND_LURE, CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/suborbital_and_lure_layer.png"))
            .build();*/

    public BlackLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackLoosejawModel());

        this.shadowRadius = 0.4F;
        this.addLayer(new BlackLoosejawFinsFeature(this));
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, null));
    }

    @Override
    public void render(BlackLoosejawEntity entity, float entityYaw, float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);

        stack.translate(0.0F, 0.08F, -0.1F);
    }

}
