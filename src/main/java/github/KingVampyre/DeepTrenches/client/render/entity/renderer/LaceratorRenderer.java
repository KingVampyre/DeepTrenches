package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.LaceratorModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.LaceratorEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class LaceratorRenderer extends NoCullingEntityRenderer<LaceratorEntity> {

    public LaceratorRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new LaceratorModel());

        this.shadowRadius = 0.3F;
    }

}
