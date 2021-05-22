package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.ViperfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousVariantLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.ViperfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.ViperfishModel.MODEL;

public class ViperfishRenderer extends NoCullingEntityRenderer<ViperfishEntity> {

    private static final RenderLayer[] PACIFIC_VIPERFISH = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/viperfish/pacific/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/viperfish/pacific/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/viperfish/pacific/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/viperfish/pacific/lure_layer.png")
    };

    private static final RenderLayer[] SLOANES_VIPERFISH = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/viperfish/sloanes/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/viperfish/sloanes/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/viperfish/sloanes/flank_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/viperfish/sloanes/lure_layer.png")
    };

    private static final RenderLayer[][] LAYERS = {
            PACIFIC_VIPERFISH,
            SLOANES_VIPERFISH
    };

    public ViperfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ViperfishModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousVariantLayerFeature<>(this, MODEL, LAYERS));
    }

}
