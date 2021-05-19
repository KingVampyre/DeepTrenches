package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.LaceratorModel;
import github.KingVampyre.DeepTrenches.core.entity.LaceratorEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class LaceratorRenderer extends GeoEntityRenderer<LaceratorEntity> {

    public LaceratorRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LaceratorModel());

        this.shadowRadius = 0.3F;
    }

}
