package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.StaspAntennasLayerFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.StaspModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.StaspModel.MODEL;

public class StaspRenderer extends NoCullingEntityRenderer<StaspEntity> {

	public StaspRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new StaspModel());

		this.shadowRadius = 0.375F;
		this.addLayer(new StaspAntennasLayerFeature(this, MODEL));
	}

	@Override
	protected void applyRotations(StaspEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

		matrixStackIn.translate(-0.1F, -1.0F, -0.2F);
	}

}
