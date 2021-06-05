package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.VoidBeastModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.VoidBeastEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.VoidBeastModel.MODEL;

public class VoidBeastRenderer extends NoCullingEntityRenderer<VoidBeastEntity> {

    private static final RenderLayer[] LAYERS = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/void_beast/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/void_beast/all_unlit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/void_beast/tail_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/void_beast/tongue_layer.png")
    };

    public VoidBeastRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new VoidBeastModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
