package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BottleFlyModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BottleFlyEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

public class BottleFlyRenderer extends NoCullingEntityRenderer<BottleFlyEntity> {

    public BottleFlyRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BottleFlyModel());

        this.shadowRadius = 0.3F;
    }

}
