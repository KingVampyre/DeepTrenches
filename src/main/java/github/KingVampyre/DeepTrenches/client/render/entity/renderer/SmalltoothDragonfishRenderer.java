package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.SmalltoothDragonfishFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.SmalltoothDragonfishModel;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class SmalltoothDragonfishRenderer extends GeoEntityRenderer<SmalltoothDragonfishEntity> {

    public SmalltoothDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new SmalltoothDragonfishModel());

	    this.shadowRadius = 0.4F;
	    this.addLayer(new SmalltoothDragonfishFinsFeature(this));
    }

	@Override
	public void render(SmalltoothDragonfishEntity entity, float entityYaw, float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);

		stack.translate(0.0F, 0.08F, 0.15F);
	}

}
