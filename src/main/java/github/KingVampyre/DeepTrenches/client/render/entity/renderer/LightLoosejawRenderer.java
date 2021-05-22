package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.feature.LightLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.LightLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousVariantLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.LightLoosejawModel.MODEL;

public class LightLoosejawRenderer extends NoCullingEntityRenderer<LightLoosejawEntity> {

    private static final RenderLayer[] BIGLAMP_LIGHT_LOOSEJAW = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/biglamp/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/biglamp/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/biglamp/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/biglamp/lure_layer.png"),
    };

    private static final RenderLayer[] GOODYEARS_LIGHT_LOOSEJAW = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/goodyears/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/goodyears/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/goodyears/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/goodyears/lure_layer.png"),
    };

    private static final RenderLayer[] GUERNES_LIGHT_LOOSEJAW = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/guernes/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/guernes/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/guernes/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/guernes/lure_layer.png"),
    };

    private static final RenderLayer[] LIEMS_LIGHT_LOOSEJAW = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/liems/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/liems/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/liems/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/liems/lure_layer.png"),
    };

    private static final RenderLayer[] REMARKABLE_LIGHT_LOOSEJAW = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/remarkable_light/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/remarkable_light/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/remarkable_light/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/remarkable_light/lure_layer.png"),
    };

    private static final RenderLayer[] SMALL_LIGHT_LOOSEJAW = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/small_light/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/small_light/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/small_light/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/light_loosejaw/small_light/lure_layer.png"),
    };

    private static final RenderLayer[][] LAYERS = {
            BIGLAMP_LIGHT_LOOSEJAW,
            GOODYEARS_LIGHT_LOOSEJAW,
            GUERNES_LIGHT_LOOSEJAW,
            LIEMS_LIGHT_LOOSEJAW,
            REMARKABLE_LIGHT_LOOSEJAW,
            SMALL_LIGHT_LOOSEJAW
    };

    public LightLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LightLoosejawModel());

        this.shadowRadius = 0.4F;
        this.addLayer(new LightLoosejawFinsFeature(this, MODEL));
        this.addLayer(new LuminousVariantLayerFeature<>(this, MODEL, LAYERS));
    }

    @Override
    protected void applyRotations(LightLoosejawEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

        matrixStackIn.translate(0.0F, 0.08F, -0.005F);
    }

}
