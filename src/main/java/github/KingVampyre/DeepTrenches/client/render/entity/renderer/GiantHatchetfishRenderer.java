package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.mojang.blaze3d.platform.GlStateManager;
import github.KingVampyre.DeepTrenches.client.render.entity.model.DummyModel;
import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GiantHatchetfishRenderer extends MobEntityRenderer<GiantHatchetfishEntity, DummyModel<GiantHatchetfishEntity>> {

	public GiantHatchetfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new DummyModel<>(), 0.3F);
	}

	@Override
	public Identifier getTexture(GiantHatchetfishEntity entity) {
		return null;
	}

	@Override
	protected void setupTransforms(GiantHatchetfishEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
		super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

		GlStateManager.translatef(0.0F, 0.0F, 0.15F);
	}

}
