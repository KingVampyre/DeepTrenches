package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.DeepLakeBettaModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DeepLakeBettaRenderer extends CullingEntityRenderer<DeepLakeBettaEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/body_layer.png"),
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/lure_layer.png")
    };

    public DeepLakeBettaRenderer(EntityRendererFactory.Context ctx) {
	    super(ctx, new DeepLakeBettaModel());

	    this.shadowRadius = 0.35F;
    }

    @Override
    protected void applyRotations(DeepLakeBettaEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

        matrixStackIn.translate(0, -1.1F, 0);
    }

}
