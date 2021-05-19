package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.HoneycombDragonfishModel;
import github.KingVampyre.DeepTrenches.core.entity.HoneycombDragonfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class HoneycombDragonfishRenderer extends GeoEntityRenderer<HoneycombDragonfishEntity> {

    public HoneycombDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new HoneycombDragonfishModel());

        this.shadowRadius = 0.3F;
    }

}
