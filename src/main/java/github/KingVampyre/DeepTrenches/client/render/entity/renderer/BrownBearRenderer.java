package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BrownBearModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BrownBearEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

public class BrownBearRenderer extends NoCullingEntityRenderer<BrownBearEntity> {

    public BrownBearRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BrownBearModel());

        this.shadowRadius = 0.3F;
    }

}
