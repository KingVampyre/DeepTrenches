package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackDragonfishModel;
import github.KingVampyre.DeepTrenches.core.entity.BlackDragonfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class BlackDragonfishRenderer extends GeoEntityRenderer<BlackDragonfishEntity> {

    public BlackDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackDragonfishModel());

        this.shadowRadius = 0.3F;
    }

}
