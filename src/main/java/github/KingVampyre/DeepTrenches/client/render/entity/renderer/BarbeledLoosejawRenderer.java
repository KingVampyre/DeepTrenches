package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.BarbeledLoosejawLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BarbeledLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;

public class BarbeledLoosejawRenderer extends CullingEntityRenderer<BarbeledLoosejawEntity> {

	public BarbeledLoosejawRenderer(EntityRendererFactory.Context ctx) {
	    super(ctx, new BarbeledLoosejawModel());

	    this.shadowRadius = 0.4F;
	    this.addLayer(new BarbeledLoosejawLayer(this));
	}

	@Override
	protected void applyRotations(BarbeledLoosejawEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

		if(entityLiving.isBaby())
			matrixStackIn.translate(0, -0.6F, 0);
		else
			matrixStackIn.translate(0, -0.08F, 0.15F);
	}

}
