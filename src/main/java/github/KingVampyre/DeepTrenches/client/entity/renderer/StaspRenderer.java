package github.KingVampyre.DeepTrenches.client.entity.renderer;

import com.mojang.blaze3d.platform.GlStateManager;

import github.KingVampyre.DeepTrenches.common.entity.renderer.TaxonomyRenderer;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.client.entity.model.DummyModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

public class StaspRenderer extends TaxonomyRenderer<StaspEntity, DummyModel<StaspEntity>> {

	public StaspRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new DummyModel<>(), 0.75F);
	}

	@Override
	protected void setupTransforms(StaspEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
		super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

		GlStateManager.translatef(-0.1F, 1F, -0.2F);
	}

}
