package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.entity.feature.SmalltoothDragonfishFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.SmalltoothDragonfishModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import java.util.Map;

import static github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState.*;
import static github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState.SUBORBITAL_AND_LURE;

public class SmalltoothDragonfishRenderer extends MobEntityRenderer<SmalltoothDragonfishEntity, SmalltoothDragonfishModel> {

    private static final Map<LightState, Identifier> TEXTURES = ImmutableMap.<LightState, Identifier>builder()
            .put(ALL_LIT, new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/all_lit.png"))
            .put(ALL_UNLIT, new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/all_unlit.png"))
            .put(FLANK, new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank.png"))
            .put(FLANK_AND_LURE, new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_lure.png"))
            .put(FLANK_AND_SUBORBITAL, new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_suborbital.png"))
            .put(LURE, new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/lure.png"))
            .put(SUBORBITAL, new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital.png"))
            .put(SUBORBITAL_AND_LURE, new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital_and_lure.png"))
            .build();

    public SmalltoothDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new SmalltoothDragonfishModel(), 0.4F);

	    this.addFeature(new SmalltoothDragonfishFinsFeature(this));
    }

    @Override
    public Identifier getTexture(SmalltoothDragonfishEntity entity) {
        LightState lightState = entity.getLightState();

        return TEXTURES.get(lightState);
    }

    @Override
    protected void setupTransforms(SmalltoothDragonfishEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        matrices.translate(0.0F, 0.08F, 0.15F);
    }

}
