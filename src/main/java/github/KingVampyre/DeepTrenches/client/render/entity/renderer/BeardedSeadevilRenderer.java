package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BeardedSeadevilModel;
import github.KingVampyre.DeepTrenches.core.entity.BeardedSeadevilEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class BeardedSeadevilRenderer extends GeoEntityRenderer<BeardedSeadevilEntity> {

    public BeardedSeadevilRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BeardedSeadevilModel());

        this.shadowRadius = 0.3F;
    }

}
