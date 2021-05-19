package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.DeepLakeBettaModel;
import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class DeepLakeBettaRenderer extends GeoEntityRenderer<DeepLakeBettaEntity> {

    public DeepLakeBettaRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new DeepLakeBettaModel());

	    this.shadowRadius = 0.35F;
    }

    @Override
    public void render(DeepLakeBettaEntity entity, float entityYaw, float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);

        stack.translate(0, 1.1F, 0);
    }

}
