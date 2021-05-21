package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.LancetfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.LancetfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;

public class LancetfishRenderer extends NoCullingEntityRenderer<LancetfishEntity> {

    public LancetfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LancetfishModel());

        this.shadowRadius = 0.3F;
    }

}
