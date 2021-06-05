package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlueWhaleModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlueWhaleEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class BlueWhaleRenderer extends NoCullingEntityRenderer<BlueWhaleEntity> {

    public BlueWhaleRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BlueWhaleModel());

        this.shadowRadius = 1F;
    }

}
