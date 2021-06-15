package github.KingVampyre.DeepTrenches.common.render.entity.renderer;

import github.KingVampyre.DeepTrenches.common.entity.ModBoatEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Quaternion;
import net.minecraft.util.math.Vec3f;

public class ModBoatEntityRenderer extends EntityRenderer<ModBoatEntity> {

	public ModBoatEntityRenderer(EntityRendererFactory.Context context) {
		super(context);

		this.shadowRadius = 0.8F;
	}

	@Override
	public void render(ModBoatEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
		matrices.push();
		matrices.translate(0.0D, 0.375D, 0.0D);
		matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180.0F - yaw));

		float h = (float) entity.getDamageWobbleTicks() - tickDelta;
		float j = entity.getDamageWobbleStrength() - tickDelta;

		if (j < 0.0F)
			j = 0.0F;

		if (h > 0.0F)
			matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(MathHelper.sin(h) * h * j / 10.0F * (float)entity.getDamageWobbleSide()));

		float k = entity.interpolateBubbleWobble(tickDelta);
		if (!MathHelper.approximatelyEquals(k, 0.0F)) {
			matrices.multiply(new Quaternion(new Vec3f(1.0F, 0.0F, 1.0F), entity.interpolateBubbleWobble(tickDelta), true));
		}

		// TODO check boats
		Identifier identifier = null;
		BoatEntityModel entityModel = null;

		matrices.scale(-1.0F, -1.0F, 1.0F);
		matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90.0F));
		entityModel.setAngles(entity, tickDelta, 0.0F, -0.1F, 0.0F, 0.0F);

		VertexConsumer vertexConsumer = vertexConsumers.getBuffer(entityModel.getLayer(identifier));
		entityModel.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);

		if (!entity.isSubmergedInWater()) {
			VertexConsumer vertexConsumer2 = vertexConsumers.getBuffer(RenderLayer.getWaterMask());
			entityModel.getWaterPatch().render(matrices, vertexConsumer2, light, OverlayTexture.DEFAULT_UV);
		}

		matrices.pop();
		super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
	}

	@Override
	public Identifier getTexture(ModBoatEntity entity) {
		return new Identifier("deep_trenches:textures/entity/boat/" + entity.getWoodType().getName() + ".png");
	}

}
