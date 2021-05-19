package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.TelescopefishModel;
import github.KingVampyre.DeepTrenches.core.entity.TelescopefishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class TelescopefishEntityRenderer extends GeoEntityRenderer<TelescopefishEntity> {

    public TelescopefishEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new TelescopefishModel());

        this.shadowRadius = 0.3F;
    }

}
