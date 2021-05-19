package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlobfishModel;
import github.KingVampyre.DeepTrenches.core.entity.BlobfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class BlobfishRenderer extends GeoEntityRenderer<BlobfishEntity> {

    public BlobfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlobfishModel());

        this.shadowRadius = 0.3F;
    }

}
