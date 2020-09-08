package github.KingVampyre.DeepTrenches.common.entity.renderer.feature;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;

public class HeldtemFeatureRenderer<T extends MobEntity, M extends EntityModel<T>> extends FeatureRenderer<T, M> {

	public HeldtemFeatureRenderer(FeatureRendererContext<T, M> context) {
		super(context);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity,
			float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw,
			float headPitch) {

		matrices.push();

		float o = MathHelper.abs(entity.pitch) / 60;

		if (entity.pitch< 0)
			GlStateManager.translatef(0, 1 - o * 0.5F, -1 + o * 0.5F);
		else
			GlStateManager.translatef(0, 1 + o * 0.8F, -1 + o * 0.2F);

		ItemStack itemStack = entity.getMainArm() == Arm.RIGHT ? entity.getMainHandStack() : entity.getOffHandStack();
		MinecraftClient.getInstance().getHeldItemRenderer().renderItem(entity, itemStack, ModelTransformation.Mode.GROUND, false, matrices, vertexConsumers, light);
		
		matrices.pop();
	}

}
