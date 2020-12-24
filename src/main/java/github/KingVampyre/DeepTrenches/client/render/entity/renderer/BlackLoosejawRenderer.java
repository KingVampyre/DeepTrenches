package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.entity.feature.BlackLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackLoosejawModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import java.util.Map;

import static github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState.*;

public class BlackLoosejawRenderer extends MobEntityRenderer<BlackLoosejawEntity, BlackLoosejawModel> {

    private static final Map<LightState, Identifier> NORTHERN_BLACK_LOOSEJAW = ImmutableMap.<LightState, Identifier>builder()
            .put(ALL_LIT, new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_lit.png"))
            .put(ALL_UNLIT, new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_unlit.png"))
            .put(FLANK, new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank.png"))
            .put(FLANK_AND_LURE, new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_lure.png"))
            .put(FLANK_AND_SUBORBITAL, new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_suborbital.png"))
            .put(LURE, new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/lure.png"))
            .put(SUBORBITAL, new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital.png"))
            .put(SUBORBITAL_AND_LURE, new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital_and_lure.png"))
            .build();

    private static final Map<LightState, Identifier> SOUTHERN_BLACK_LOOSEJAW = ImmutableMap.<LightState, Identifier>builder()
            .put(ALL_LIT, new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/all_lit.png"))
            .put(ALL_UNLIT, new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/all_unlit.png"))
            .put(FLANK, new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank.png"))
            .put(FLANK_AND_LURE, new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_lure.png"))
            .put(FLANK_AND_SUBORBITAL, new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_suborbital.png"))
            .put(LURE, new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/lure.png"))
            .put(SUBORBITAL, new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/suborbital.png"))
            .put(SUBORBITAL_AND_LURE, new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/suborbital_and_lure.png"))
            .build();

    public BlackLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackLoosejawModel(), 0.4F);

        this.addFeature(new BlackLoosejawFinsFeature(this));
    }

    @Override
    public Identifier getTexture(BlackLoosejawEntity entity) {
        LightState lightState = entity.getLightState();

        switch (entity.getLoosejawType()) {
            case 0:
                return NORTHERN_BLACK_LOOSEJAW.get(lightState);
            case 1:
                return SOUTHERN_BLACK_LOOSEJAW.get(lightState);
        }

        return null;
    }

    @Override
    protected void setupTransforms(BlackLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        matrices.translate(0.0F, 0.08F, -0.1F);
    }

}
