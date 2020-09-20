package github.KingVampyre.DeepTrenches.client.entity.renderer;

import com.mojang.blaze3d.platform.GlStateManager;

import github.KingVampyre.DeepTrenches.common.entity.renderer.DragonfishRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import github.KingVampyre.DeepTrenches.client.entity.model.DummyModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

public class BarbeledLoosejawRenderer extends DragonfishRenderer<BarbeledLoosejawEntity, DummyModel<BarbeledLoosejawEntity>> {

    public BarbeledLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	super(entityRenderDispatcher, new DummyModel<>(), 0.4F);
    }

    @Override
    protected void setupTransforms(BarbeledLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);
        
        GlStateManager.translatef(0.0F, 0.08F, 0.15F);
    }

}
