package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.GiantSeedShrimpModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.GiantSeedShrimpEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class GiantSeedShrimpRenderer extends NoCullingEntityRenderer<GiantSeedShrimpEntity> {

    public GiantSeedShrimpRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GiantSeedShrimpModel());

        this.shadowRadius = 0.3F;
    }

}
