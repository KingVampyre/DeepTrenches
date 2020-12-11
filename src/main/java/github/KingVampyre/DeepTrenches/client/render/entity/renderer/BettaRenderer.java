package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.mojang.blaze3d.platform.GlStateManager;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BettaModel;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BettaRenderer extends MobEntityRenderer<BettaEntity, BettaModel> {

    public static final Identifier BLACK_BLUE_BETTA = new Identifier("deep_trenches:textures/entity/black_blue_betta.png");
    public static final Identifier BLUE_BETTA = new Identifier("deep_trenches:textures/entity/blue_betta.png");
    public static final Identifier COLORFUL_BETTA = new Identifier("deep_trenches:textures/entity/colorful_betta.png");
    public static final Identifier ICARUS = new Identifier("deep_trenches:textures/entity/icarus.png");
    public static final Identifier ICARUS_JUNIOR = new Identifier("deep_trenches:textures/entity/icarus_junior.png");
    public static final Identifier ICARUS_THE_THIRD = new Identifier("deep_trenches:textures/entity/icarus_the_third.png");
    public static final Identifier RED_BETTA = new Identifier("deep_trenches:textures/entity/red_betta.png");

    protected final Identifier texture;

    public BettaRenderer(EntityRenderDispatcher entityRenderDispatcher, Identifier texture) {
        super(entityRenderDispatcher, new BettaModel(), 0.3F);

        this.texture = texture;
    }

    @Override
    public Identifier getTexture(BettaEntity entity) {
        return this.texture;
    }

    @Override
    protected void setupTransforms(BettaEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        GlStateManager.translatef(0.0F, -0.1F, -0.1F);
    }

}
