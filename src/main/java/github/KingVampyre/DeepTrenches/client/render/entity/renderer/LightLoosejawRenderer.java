package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.LightLoosejawLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.LightLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;

public class LightLoosejawRenderer extends CullingEntityRenderer<LightLoosejawEntity> {

    public LightLoosejawRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new LightLoosejawModel());

        this.shadowRadius = 0.4F;
        this.addLayer(new LightLoosejawLayer(this));
    }

    @Override
    protected void applyRotations(LightLoosejawEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

        matrixStackIn.translate(0.0F, 0.08F, -0.005F);
    }

}
