package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackSeadevilModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlackSeadevilEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class BlackSeadevilRenderer extends CullingEntityRenderer<BlackSeadevilEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/black_seadevil/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_seadevil/all_unlit_layer.png")
    };

    public BlackSeadevilRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BlackSeadevilModel());

        this.shadowRadius = 0.3F;
    }

}
