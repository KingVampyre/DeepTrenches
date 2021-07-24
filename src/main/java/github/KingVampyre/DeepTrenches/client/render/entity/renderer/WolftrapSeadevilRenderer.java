package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.WolftrapSeadevilModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.WolftrapSeadevilEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.WolftrapSeadevilModel.MODEL;

public class WolftrapSeadevilRenderer extends CullingEntityRenderer<WolftrapSeadevilEntity> {

    private static final RenderLayer[] LAYERS = {
            CustomRenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/wolftrap_seadevil/all_lit_layer.png")),
            CustomRenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/wolftrap_seadevil/all_unlit_layer.png"))
    };

    public WolftrapSeadevilRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WolftrapSeadevilModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
