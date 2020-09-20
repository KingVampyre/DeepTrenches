package github.KingVampyre.DeepTrenches.client.entity.renderer;

import github.KingVampyre.DeepTrenches.core.entity.AdaiggerEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.TridentEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class AdaiggerRenderer extends TridentEntityRenderer {

	private final EntityModel<AdaiggerEntity> model = new EntityModel<AdaiggerEntity>() {

		@Override
		public void setAngles(AdaiggerEntity entity, float limbAngle, float limbDistance, float animationProgress,
				float headYaw, float headPitch) {
			// TODO Auto-generated method stub

		}

		@Override
		public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red,
				float green, float blue, float alpha) {
			// TODO Auto-generated method stub

		}
		
		
	};

	public AdaiggerRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher);
	}

	@Override
	public void render(TridentEntity tridentEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
		matrixStack.push();
    	matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(MathHelper.lerp(g, tridentEntity.prevYaw, tridentEntity.yaw) - 90.0F));
      	matrixStack.multiply(Vector3f.POSITIVE_Z.getDegreesQuaternion(MathHelper.lerp(g, tridentEntity.prevPitch, tridentEntity.pitch) + 90.0F));
		  
		VertexConsumer vertexConsumer = ItemRenderer.getDirectGlintVertexConsumer(vertexConsumerProvider, this.model.getLayer(this.getTexture(tridentEntity)), false, tridentEntity.isEnchanted());
		  
		this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
		matrixStack.pop();

		if (this.hasLabel(tridentEntity))
			this.renderLabelIfPresent(tridentEntity, tridentEntity.getDisplayName(), matrixStack, vertexConsumerProvider, i);

	}

	@Override
	public Identifier getTexture(TridentEntity tridentEntity) {
		return new Identifier("deep_trenches:textures/entity/adaigger.png");
	}

}
