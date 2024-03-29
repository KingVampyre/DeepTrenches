package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.MaggotModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.MaggotEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class MaggotRenderer extends CullingEntityRenderer<MaggotEntity> {

    public MaggotRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MaggotModel());

        this.shadowRadius = 0.3F;
    }

}
