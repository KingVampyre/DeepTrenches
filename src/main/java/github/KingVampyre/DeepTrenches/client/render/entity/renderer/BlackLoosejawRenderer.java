package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackLoosejawModel;
import github.KingVampyre.DeepTrenches.common.entity.renderer.DragonfishRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

public class BlackLoosejawRenderer extends DragonfishRenderer<BlackLoosejawEntity, BlackLoosejawModel> {

    public BlackLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackLoosejawModel(), 0.4F);
    }

    @Override
    protected void setupTransforms(BlackLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        matrices.translate(0.0F, 0.08F, -0.1F);
    }

}
