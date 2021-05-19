package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.WolftrapSeadevilModel;
import github.KingVampyre.DeepTrenches.core.entity.WolftrapSeadevilEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class WolftrapSeadevilRenderer extends GeoEntityRenderer<WolftrapSeadevilEntity> {

    public WolftrapSeadevilRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new WolftrapSeadevilModel());

        this.shadowRadius = 0.3F;
    }

}
