package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.WolftrapSeadevilModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.WolftrapSeadevilEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.WolftrapSeadevilModel.MODEL;

public class WolftrapSeadevilRenderer extends NoCullingEntityRenderer<WolftrapSeadevilEntity> {

    private static final RenderLayer[] LAYERS = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/wolftrap_seadevil/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/wolftrap_seadevil/all_unlit_layer.png")
    };

    public WolftrapSeadevilRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new WolftrapSeadevilModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
