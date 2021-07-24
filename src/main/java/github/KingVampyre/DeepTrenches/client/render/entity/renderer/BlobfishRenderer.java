package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlobfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlobfishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class BlobfishRenderer extends CullingEntityRenderer<BlobfishEntity> {

    public BlobfishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BlobfishModel());

        this.shadowRadius = 0.3F;
    }

}
