package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.ThreadfinDragonfishModel;
import github.KingVampyre.DeepTrenches.core.entity.ThreadfinDragonfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class ThreadfinDragonfishRenderer extends GeoEntityRenderer<ThreadfinDragonfishEntity> {

    public ThreadfinDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ThreadfinDragonfishModel());

        this.shadowRadius = 0.3F;
    }

}
