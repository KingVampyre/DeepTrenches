package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FlyModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.FlyEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class FlyRenderer extends NoCullingEntityRenderer<FlyEntity> {

    public FlyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new FlyModel());

        this.shadowRadius = 0.3F;
    }

}
