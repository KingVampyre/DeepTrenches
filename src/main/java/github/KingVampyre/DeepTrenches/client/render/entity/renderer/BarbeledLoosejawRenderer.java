package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BarbeledLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.DragonfishRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

public class BarbeledLoosejawRenderer extends DragonfishRenderer<BarbeledLoosejawEntity, BarbeledLoosejawModel> {

    public BarbeledLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new BarbeledLoosejawModel(), 0.4F);
    }

    @Override
    protected void setupTransforms(BarbeledLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        if(entity.isBaby())
            matrices.translate(0, -0.6F, 0);
        else
            matrices.translate(0.0F, -0.08F, 0.15F);
    }

}
