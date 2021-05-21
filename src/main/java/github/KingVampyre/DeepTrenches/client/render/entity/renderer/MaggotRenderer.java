package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.MaggotModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.MaggotEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

public class MaggotRenderer extends NoCullingEntityRenderer<MaggotEntity> {

    public MaggotRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new MaggotModel());

        this.shadowRadius = 0.3F;
    }

}
