package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FlyModel;
import github.KingVampyre.DeepTrenches.core.entity.FlyEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class FlyRenderer extends GeoEntityRenderer<FlyEntity> {

    public FlyRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FlyModel());

        this.shadowRadius = 0.3F;
    }

}
