package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BettaModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;

public class BettaRenderer extends NoCullingEntityRenderer<BettaEntity> {

    public BettaRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BettaModel());

        this.shadowRadius = 0.3F;
    }

    @Override
    protected void applyRotations(BettaEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

        if (!entityLiving.isTouchingWater())
            matrixStackIn.translate(0.1F, -0.1F, -0.1F);
        else
            matrixStackIn.translate(0, 0.1F, -0.1F);

        if(entityLiving.isBaby())
            matrixStackIn.translate(0, -0.7F, 0);
    }

}
