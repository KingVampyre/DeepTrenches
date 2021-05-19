package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BottleFlyModel;
import github.KingVampyre.DeepTrenches.core.entity.BottleFlyEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class BottleFlyRenderer extends GeoEntityRenderer<BottleFlyEntity> {

    public BottleFlyRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BottleFlyModel());

        this.shadowRadius = 0.3F;
    }

}
