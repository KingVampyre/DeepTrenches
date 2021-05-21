package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FlyModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.FlyEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

public class FlyRenderer extends NoCullingEntityRenderer<FlyEntity> {

    public FlyRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FlyModel());

        this.shadowRadius = 0.3F;
    }

}
