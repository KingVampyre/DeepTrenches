package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FangtoothModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.FangtoothEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

public class FangtoothRenderer extends NoCullingEntityRenderer<FangtoothEntity> {

    public FangtoothRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FangtoothModel());

        this.shadowRadius = 0.3F;
    }

}
