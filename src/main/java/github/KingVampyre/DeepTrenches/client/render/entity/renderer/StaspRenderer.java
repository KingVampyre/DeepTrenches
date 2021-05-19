package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.StaspAntennasFeatureRenderer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.StaspModel;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class StaspRenderer extends GeoEntityRenderer<StaspEntity> {

	public StaspRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new StaspModel());

		this.shadowRadius = 0.35F;
		this.addLayer(new StaspAntennasFeatureRenderer(this));
	}

	@Override
	public void render(StaspEntity entity, float entityYaw, float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);

		stack.translate(-0.1F, -1F, -0.2F);
	}

}
