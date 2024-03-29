package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.GiantHatchetfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GiantHatchetfishRenderer extends CullingEntityRenderer<GiantHatchetfishEntity> {

	private static final Identifier[] TEXTURES = {
			new Identifier("deep_trenches:textures/entity/giant_hatchetfish/all_lit_layer.png"),
			new Identifier("deep_trenches:textures/entity/giant_hatchetfish/all_unlit_layer.png")
	};

	public GiantHatchetfishRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new GiantHatchetfishModel());

		this.shadowRadius = 0.3F;
	}

	@Override
	protected void applyRotations(GiantHatchetfishEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

		matrixStackIn.translate(0.0F, 0.0F, 0.15F);
	}

}
