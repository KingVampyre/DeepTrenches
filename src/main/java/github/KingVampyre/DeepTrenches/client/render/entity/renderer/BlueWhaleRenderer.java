package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlueWhaleModel;
import github.KingVampyre.DeepTrenches.core.entity.BlueWhaleEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class BlueWhaleRenderer extends GeoEntityRenderer<BlueWhaleEntity> {

    public BlueWhaleRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlueWhaleModel());

        this.shadowRadius = 1F;
    }

}
