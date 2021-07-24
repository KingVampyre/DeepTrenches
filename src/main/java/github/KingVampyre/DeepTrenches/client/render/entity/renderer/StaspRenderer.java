package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.feature.StaspAntennasLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.StaspModel;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class StaspRenderer extends GeoEntityRenderer<StaspEntity> {

	public StaspRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new StaspModel());

		this.shadowRadius = 0.375F;
		this.addLayer(new StaspAntennasLayer(this));
	}

	@Override
	protected void applyRotations(StaspEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

		matrixStackIn.translate(-0.1F, -1.0F, -0.2F);
	}

	@Override
	public RenderLayer getRenderType(StaspEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
		var texture = this.getTextureLocation(animatable);
		var isInvisible = animatable.isInvisible();

		return CustomRenderLayer.getInvisible(texture, isInvisible);
	}

}