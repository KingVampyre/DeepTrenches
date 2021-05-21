package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlobfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlobfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

public class BlobfishRenderer extends NoCullingEntityRenderer<BlobfishEntity> {

    public BlobfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlobfishModel());

        this.shadowRadius = 0.3F;
    }

}
