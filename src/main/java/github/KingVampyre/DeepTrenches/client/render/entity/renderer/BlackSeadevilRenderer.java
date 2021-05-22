package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackSeadevilModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlackSeadevilEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.BlackSeadevilModel.MODEL;

public class BlackSeadevilRenderer extends NoCullingEntityRenderer<BlackSeadevilEntity> {

    private static final RenderLayer[] LAYERS = {
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_seadevil/all_lit_layer.png"),
            CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/black_seadevil/all_unlit_layer.png")
    };

    public BlackSeadevilRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackSeadevilModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
