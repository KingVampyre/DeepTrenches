package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.PrinceAxelsWonderfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.PrinceAxelsWonderfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.PrinceAxelsWonderfishModel.MODEL;

public class PrinceAxelsWonderfishRenderer extends CullingEntityRenderer<PrinceAxelsWonderfishEntity> {

    private static final RenderLayer[] LAYERS = {
            CustomRenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/prince_axels_wonderfish/all_lit_layer.png")),
            CustomRenderLayer.getEntityCutout(new Identifier("deep_trenches:textures/entity/prince_axels_wonderfish/all_unlit_layer.png"))
    };

    public PrinceAxelsWonderfishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PrinceAxelsWonderfishModel());

        this.shadowRadius = 0.3F;
        this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
    }

}
