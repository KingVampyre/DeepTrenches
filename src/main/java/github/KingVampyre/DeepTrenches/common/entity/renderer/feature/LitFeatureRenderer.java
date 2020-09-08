package github.KingVampyre.DeepTrenches.common.entity.renderer.feature;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public abstract class LitFeatureRenderer<T extends MobEntity, M extends EntityModel<T>> extends FeatureRenderer<T, M> {

	public LitFeatureRenderer(FeatureRendererContext<T, M> context) {
		super(context);
	}

	protected Identifier getTexture(T entityIn) {
		return null;
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity,
			float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw,
			float headPitch) {
		// TODO render lit layer
		
	}

}
