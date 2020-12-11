package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.GiantHatchetfishModel;
import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GiantHatchetfishRenderer extends MobEntityRenderer<GiantHatchetfishEntity, GiantHatchetfishModel> {

	public GiantHatchetfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new GiantHatchetfishModel(), 0.3F);
	}

	@Override
	public Identifier getTexture(GiantHatchetfishEntity entity) {
		return new Identifier("deep_trenches:textures/entity/giant_hatchetfish/all_lit.png");
	}

	@Override
	protected void setupTransforms(GiantHatchetfishEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
		super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

		matrices.translate(0.0F, 0.0F, 0.15F);
	}

}
