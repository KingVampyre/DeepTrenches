package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.CetachsalModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.CetachsalEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.CetachsalModel.MODEL;

public class CetachsalRenderer extends NoCullingEntityRenderer<CetachsalEntity> {

    private static final RenderLayer[] LAYERS = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/cetachsal/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/cetachsal/all_unlit_layer.png")
    };

    public CetachsalRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CetachsalModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
