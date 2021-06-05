package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BrownBearModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BrownBearEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class BrownBearRenderer extends NoCullingEntityRenderer<BrownBearEntity> {

    public BrownBearRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BrownBearModel());

        this.shadowRadius = 0.3F;
    }

}
