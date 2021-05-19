package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.BarbeledLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BarbeledLoosejawModel;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class BarbeledLoosejawRenderer extends GeoEntityRenderer<BarbeledLoosejawEntity> {

    public BarbeledLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new BarbeledLoosejawModel());

	    this.shadowRadius = 0.4F;
	    this.addLayer(new BarbeledLoosejawFinsFeature(this));
    }

	@Override
	public void render(BarbeledLoosejawEntity entity, float entityYaw, float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);

		if(entity.isBaby())
			stack.translate(0, -0.6F, 0);
		else
			stack.translate(0, -0.08F, 0.15F);
	}

}
