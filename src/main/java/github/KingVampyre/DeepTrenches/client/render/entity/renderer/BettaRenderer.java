package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BettaModel;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class BettaRenderer extends GeoEntityRenderer<BettaEntity> {

    public BettaRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BettaModel());

        this.shadowRadius = 0.3F;
    }

    @Override
    public void render(BettaEntity entity, float entityYaw, float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
        super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);

        if (!entity.isTouchingWater())
            stack.translate(0.1F, -0.1F, -0.1F);
        else
            stack.translate(0, 0.1F, -0.1F);

        if(entity.isBaby())
            stack.translate(0, -0.7F, 0);
    }

}
