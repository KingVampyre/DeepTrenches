package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BottleFlyMaggotModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BottleFlyMaggotEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class BottleFlyMaggotRenderer extends NoCullingEntityRenderer<BottleFlyMaggotEntity> {

    public BottleFlyMaggotRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BottleFlyMaggotModel());

        this.shadowRadius = 0.3F;
    }

}
