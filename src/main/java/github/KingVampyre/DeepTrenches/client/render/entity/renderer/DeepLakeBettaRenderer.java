package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.DeepLakeBettaModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.DeepLakeBettaModel.MODEL;

public class DeepLakeBettaRenderer extends NoCullingEntityRenderer<DeepLakeBettaEntity> {

    private static final RenderLayer[] LAYERS = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/deep_lake_betta/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/deep_lake_betta/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/deep_lake_betta/body_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/deep_lake_betta/lure_layer.png")
    };

    public DeepLakeBettaRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new DeepLakeBettaModel());

	    this.shadowRadius = 0.35F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

    @Override
    protected void applyRotations(DeepLakeBettaEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

        matrixStackIn.translate(0, -1.1F, 0);
    }

}
