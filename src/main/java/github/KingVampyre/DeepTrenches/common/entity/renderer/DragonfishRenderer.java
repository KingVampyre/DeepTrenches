package github.KingVampyre.DeepTrenches.common.entity.renderer;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public class DragonfishRenderer<T extends MobEntity, M extends EntityModel<T>> extends TaxonomyRenderer<T, M> {

	public DragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher, M model, float shadow) {
		super(entityRenderDispatcher, model, shadow);
	}

	@Override
	public Identifier getTexture(T entity) {
		// TODO get texture from lit component
		return null;
	}

	@Override
	public void render(T mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

		boolean flag = this.isVisible(mobEntity);
		boolean flag1 = !flag && mobEntity.isInvisibleTo(MinecraftClient.getInstance().player);

		if (flag1) {
			GlStateManager.color4f(255, 255, 255, 0.5F);
			GlStateManager.enableBlend();
			GlStateManager.depthMask(!mobEntity.isInvisible());
			GlStateManager.blendFunc(SrcFactor.CONSTANT_ALPHA.field_22545, DstFactor.CONSTANT_ALPHA.field_22528);
			super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
			GlStateManager.blendFunc(SrcFactor.ONE.field_22545, DstFactor.ZERO.field_22528);
			GlStateManager.depthMask(true);
			GlStateManager.disableBlend();

		} else {
			GlStateManager.enableBlend();
			GlStateManager.depthMask(!mobEntity.isInvisible());
			GlStateManager.blendFunc(SrcFactor.SRC_ALPHA.field_22545, DstFactor.ONE_MINUS_SRC_ALPHA.field_22528);
			super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
			GlStateManager.blendFunc(SrcFactor.ONE.field_22545, DstFactor.ZERO.field_22528);
			GlStateManager.disableBlend();
		}
	}

}
