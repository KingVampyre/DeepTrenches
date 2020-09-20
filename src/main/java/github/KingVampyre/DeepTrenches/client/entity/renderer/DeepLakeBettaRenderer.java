package github.KingVampyre.DeepTrenches.client.entity.renderer;

import com.mojang.blaze3d.platform.GlStateManager;

import github.KingVampyre.DeepTrenches.common.entity.renderer.TaxonomyRenderer;
import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import github.KingVampyre.DeepTrenches.client.entity.model.DummyModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

public class DeepLakeBettaRenderer extends TaxonomyRenderer<DeepLakeBettaEntity, DummyModel<DeepLakeBettaEntity>> {

    public DeepLakeBettaRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	super(entityRenderDispatcher, new DummyModel<>(), 0.35F);
    }
	
	@Override
    protected void setupTransforms(DeepLakeBettaEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

		GlStateManager.translatef(0, 1.1F, 0);
    }
}
