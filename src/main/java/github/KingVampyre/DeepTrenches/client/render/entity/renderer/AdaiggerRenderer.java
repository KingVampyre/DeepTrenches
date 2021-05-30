package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.core.entity.AdaiggerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class AdaiggerRenderer extends EntityRenderer<AdaiggerEntity> {

	public static final Identifier TEXTURE = new Identifier("deep_trenches:textures/entity/adaigger.png");

	public AdaiggerRenderer(EntityRendererFactory.Context ctx) {
		super(ctx);
	}

	@Override
	public void render(AdaiggerEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
		super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
	}

	@Override
	public Identifier getTexture(AdaiggerEntity entity) {
		return TEXTURE;
	}

}