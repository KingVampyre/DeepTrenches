package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.CetachsalModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.CetachsalEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class CetachsalRenderer extends CullingEntityRenderer<CetachsalEntity> {

    private static final Identifier[] LAYERS = {
            new Identifier("deep_trenches:textures/entity/cetachsal/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/cetachsal/all_unlit_layer.png")
    };

    public CetachsalRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CetachsalModel());

        this.shadowRadius = 0.3F;
    }

}
