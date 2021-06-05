package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.TelescopefishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.TelescopefishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class TelescopefishEntityRenderer extends NoCullingEntityRenderer<TelescopefishEntity> {

    public TelescopefishEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new TelescopefishModel());

        this.shadowRadius = 0.3F;
    }

}
