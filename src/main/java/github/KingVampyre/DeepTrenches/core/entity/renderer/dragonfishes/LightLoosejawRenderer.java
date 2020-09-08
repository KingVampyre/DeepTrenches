package github.KingVampyre.DeepTrenches.core.entity.renderer.dragonfishes;

import com.mojang.blaze3d.platform.GlStateManager;

import github.KingVampyre.DeepTrenches.common.entity.renderer.DragonfishRenderer;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import github.KingVampyre.DeepTrenches.core.entity.model.DummyModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

public class LightLoosejawRenderer extends DragonfishRenderer<LightLoosejawEntity, DummyModel<LightLoosejawEntity>> {

    public LightLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new DummyModel<>(), 0.4F);
    }

    @Override
    protected void setupTransforms(LightLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        GlStateManager.translatef(0.0F, 0.08F, -0.005F);
    }

}
