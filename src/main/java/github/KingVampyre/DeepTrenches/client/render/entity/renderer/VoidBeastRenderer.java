package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.VoidBeastModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.VoidBeastEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class VoidBeastRenderer extends CullingEntityRenderer<VoidBeastEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/void_beast/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/void_beast/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/void_beast/tail_layer.png"),
            new Identifier("deep_trenches:textures/entity/void_beast/tongue_layer.png")
    };

    public VoidBeastRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new VoidBeastModel());

        this.shadowRadius = 0.3F;
    }

}
