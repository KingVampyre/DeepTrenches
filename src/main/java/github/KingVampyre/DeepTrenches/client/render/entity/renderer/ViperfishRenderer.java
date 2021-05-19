package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.ViperfishModel;
import github.KingVampyre.DeepTrenches.core.entity.ViperfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class ViperfishRenderer extends GeoEntityRenderer<ViperfishEntity> {

    public ViperfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ViperfishModel());

        this.shadowRadius = 0.3F;
    }

}
