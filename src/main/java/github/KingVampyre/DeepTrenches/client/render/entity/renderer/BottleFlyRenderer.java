package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BottleFlyModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BottleFlyEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class BottleFlyRenderer extends CullingEntityRenderer<BottleFlyEntity> {

    public BottleFlyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BottleFlyModel());

        this.shadowRadius = 0.3F;
    }

}
