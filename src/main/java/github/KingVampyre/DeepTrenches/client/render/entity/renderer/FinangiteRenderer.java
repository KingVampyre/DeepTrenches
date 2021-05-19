package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FinangiteModel;
import github.KingVampyre.DeepTrenches.core.entity.FinangiteEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class FinangiteRenderer extends GeoEntityRenderer<FinangiteEntity> {

    public FinangiteRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FinangiteModel());

        this.shadowRadius = 0.3F;
    }

}
