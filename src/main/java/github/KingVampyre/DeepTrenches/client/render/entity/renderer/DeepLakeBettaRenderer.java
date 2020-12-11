package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.DeepLakeBettaModel;
import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DeepLakeBettaRenderer extends MobEntityRenderer<DeepLakeBettaEntity, DeepLakeBettaModel> {

    public DeepLakeBettaRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new DeepLakeBettaModel(), 0.35F);
    }

    @Override
    public Identifier getTexture(DeepLakeBettaEntity entity) {
        return new Identifier("deep_trenches:textures/entity/deep_lake_betta/all_lit.png");
    }

	@Override
    protected void setupTransforms(DeepLakeBettaEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

		matrices.translate(0, 1.1F, 0);
    }
}
