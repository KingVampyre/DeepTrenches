package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackSeadevilModel;
import github.KingVampyre.DeepTrenches.core.entity.BlackSeadevilEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class BlackSeadevilRenderer extends GeoEntityRenderer<BlackSeadevilEntity> {

    public BlackSeadevilRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackSeadevilModel());

        this.shadowRadius = 0.3F;
    }

}
