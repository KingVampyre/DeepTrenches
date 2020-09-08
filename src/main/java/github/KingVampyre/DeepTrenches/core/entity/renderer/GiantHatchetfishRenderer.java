package github.KingVampyre.DeepTrenches.core.entity.renderer;

import com.mojang.blaze3d.platform.GlStateManager;

import github.KingVampyre.DeepTrenches.common.entity.renderer.TaxonomyRenderer;
import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import github.KingVampyre.DeepTrenches.core.entity.model.DummyModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

public class GiantHatchetfishRenderer extends TaxonomyRenderer<GiantHatchetfishEntity, DummyModel<GiantHatchetfishEntity>> {

	public GiantHatchetfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new DummyModel<>(), 0.3F);
	}

	@Override
	protected void setupTransforms(GiantHatchetfishEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
		super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

		GlStateManager.translatef(0.0F, 0.0F, 0.15F);
	}

}
