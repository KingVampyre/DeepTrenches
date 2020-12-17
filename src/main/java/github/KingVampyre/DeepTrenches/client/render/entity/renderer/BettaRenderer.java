package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BettaModel;
import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import github.KingVampyre.DeepTrenches.core.init.EntityTypes;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;

public class BettaRenderer extends MobEntityRenderer<BettaEntity, BettaModel> {

    public static final ImmutableMap<EntityType<?>, Identifier> TEXTURES = ImmutableMap.<EntityType<?>, Identifier>builder()
            .put(EntityTypes.BLACK_BLUE_BETTA, new Identifier("deep_trenches:textures/entity/betta/black_blue_betta.png"))
            .put(EntityTypes.BLUE_BETTA, new Identifier("deep_trenches:textures/entity/betta/blue_betta.png"))  
            .put(EntityTypes.COLORFUL_BETTA, new Identifier("deep_trenches:textures/entity/betta/colorful_betta.png"))
            .put(EntityTypes.ICARUS, new Identifier("deep_trenches:textures/entity/betta/icarus.png"))
            .put(EntityTypes.ICARUS_JUNIOR, new Identifier("deep_trenches:textures/entity/betta/icarus_junior.png"))
            .put(EntityTypes.ICARUS_THE_THIRD, new Identifier("deep_trenches:textures/entity/betta/icarus_the_third.png"))
            .put(EntityTypes.RED_BETTA, new Identifier("deep_trenches:textures/entity/betta/red_betta.png"))
            .build();

    public BettaRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BettaModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BettaEntity entity) {
        EntityType<?> type = entity.getType();

        return TEXTURES.get(type);
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
