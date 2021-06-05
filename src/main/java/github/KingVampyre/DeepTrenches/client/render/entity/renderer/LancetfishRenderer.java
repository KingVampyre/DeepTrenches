package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.LancetfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.LancetfishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class LancetfishRenderer extends NoCullingEntityRenderer<LancetfishEntity> {

    public LancetfishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new LancetfishModel());

        this.shadowRadius = 0.3F;
    }

}
