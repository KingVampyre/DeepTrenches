package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BettaModel;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BettaRenderer extends MobEntityRenderer<BettaEntity, BettaModel> {

    public static final Identifier[] TEXTURES = new Identifier[] {
            new Identifier("deep_trenches:textures/entity/betta/black_blue_betta.png"),
            new Identifier("deep_trenches:textures/entity/betta/blue_betta.png"),
            new Identifier("deep_trenches:textures/entity/betta/colorful_betta.png"),
            new Identifier("deep_trenches:textures/entity/betta/icarus.png"),
            new Identifier("deep_trenches:textures/entity/betta/icarus_junior.png"),
            new Identifier("deep_trenches:textures/entity/betta/icarus_the_third.png"),
            new Identifier("deep_trenches:textures/entity/betta/red_betta.png")
    };

    public BettaRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BettaModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BettaEntity entity) {
        return TEXTURES[entity.getBettaType()];
    }

    @Override
    protected void setupTransforms(BettaEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        if (!entity.isTouchingWater())
            matrices.translate(0.1F, -0.1F, -0.1F);
        else
            matrices.translate(0.0F, 0.1F, -0.1F);

        if(entity.isBaby())
            matrices.translate(0, -0.7F, 0);

    }

}
