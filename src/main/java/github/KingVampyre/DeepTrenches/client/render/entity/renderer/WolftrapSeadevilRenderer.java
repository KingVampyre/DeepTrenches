package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.WolftrapSeadevilModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.WolftrapSeadevilEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class WolftrapSeadevilRenderer extends CullingEntityRenderer<WolftrapSeadevilEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/wolftrap_seadevil/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/wolftrap_seadevil/all_unlit_layer.png")
    };

    public WolftrapSeadevilRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WolftrapSeadevilModel());

        this.shadowRadius = 0.3F;
    }

}
