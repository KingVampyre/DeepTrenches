package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlueWhaleModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlueWhaleEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

public class BlueWhaleRenderer extends NoCullingEntityRenderer<BlueWhaleEntity> {

    public BlueWhaleRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlueWhaleModel());

        this.shadowRadius = 1F;
    }

}
