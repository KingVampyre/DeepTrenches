package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackScabbardModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlackScabbardEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;

public class BlackScabbardRenderer extends CullingEntityRenderer<BlackScabbardEntity> {

    public BlackScabbardRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BlackScabbardModel());

        this.shadowRadius = 0.3F;
    }

}
