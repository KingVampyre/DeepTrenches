package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.VoidBeastModel;
import github.KingVampyre.DeepTrenches.core.entity.VoidBeastEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class VoidBeastRenderer extends GeoEntityRenderer<VoidBeastEntity> {

    public VoidBeastRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new VoidBeastModel());

        this.shadowRadius = 0.3F;
    }

}
