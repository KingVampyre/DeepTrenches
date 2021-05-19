package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.DeepLakeBettaModel;
import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class DeepLakeBettaRenderer extends GeoEntityRenderer<DeepLakeBettaEntity> {

    public DeepLakeBettaRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new DeepLakeBettaModel());

	    this.shadowRadius = 0.35F;
    }

}
