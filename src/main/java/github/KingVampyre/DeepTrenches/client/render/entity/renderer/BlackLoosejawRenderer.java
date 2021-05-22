package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.feature.BlackLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousVariantLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.BlackLoosejawModel.MODEL;

public class BlackLoosejawRenderer extends NoCullingEntityRenderer<BlackLoosejawEntity> {

    private static final RenderLayer[] NORTHERN_BLACK_LOOSEJAW = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/northern/all_lit_layer_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/northern/all_unlit_layer_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/northern/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_lure_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_suborbital_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/northern/lure_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/northern/suborbital_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/northern/suborbital_and_lure_layer.png")
    };

    private static final RenderLayer[] SOUTHERN_BLACK_LOOSEJAW = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/southern/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/southern/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/southern/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_lure_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_suborbital_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/southern/lure_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/southern/suborbital_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_loosejaw/southern/suborbital_and_lure_layer.png")
    };

    private static final RenderLayer[][] LAYERS = {
            NORTHERN_BLACK_LOOSEJAW,
            SOUTHERN_BLACK_LOOSEJAW
    };

    public BlackLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackLoosejawModel());

        this.shadowRadius = 0.4F;
        this.addLayer(new BlackLoosejawFinsFeature(this, MODEL));
        this.addLayer(new LuminousVariantLayerFeature<>(this, MODEL, LAYERS));
    }

    @Override
    public void render(BlackLoosejawEntity entity, float entityYaw, float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);

        stack.translate(0.0F, 0.08F, -0.1F);
    }

}
