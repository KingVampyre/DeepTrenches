package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BeardedSeadevilModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BeardedSeadevilEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class BeardedSeadevilRenderer extends CullingEntityRenderer<BeardedSeadevilEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/bearded_seadevil/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/bearded_seadevil/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/bearded_seadevil/beard_layer.png"),
            new Identifier("deep_trenches:textures/entity/bearded_seadevil/lure_layer.png")
    };

    public BeardedSeadevilRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BeardedSeadevilModel());

        this.shadowRadius = 0.3F;
    }

}