package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.entity.feature.LightLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.LightLoosejawModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import java.util.Map;

import static github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState.*;

public class LightLoosejawRenderer extends MobEntityRenderer<LightLoosejawEntity, LightLoosejawModel> {

    private static final Map<LightState, Identifier> BIGLAMP_LIGHT_LOOSEJAW = ImmutableMap.<LightState, Identifier>builder()
            .put(ALL_LIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/all_lit.png"))
            .put(ALL_UNLIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/all_unlit.png"))
            .put(FLANK, new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/flank.png"))
            .put(LURE, new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/lure.png"))
            .build();

    private static final Map<LightState, Identifier> GOODYEARS_LIGHT_LOOSEJAW = ImmutableMap.<LightState, Identifier>builder()
            .put(ALL_LIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/all_lit.png"))
            .put(ALL_UNLIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/all_unlit.png"))
            .put(FLANK, new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/flank.png"))
            .put(LURE, new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/lure.png"))
            .build();

    private static final Map<LightState, Identifier> GUERNES_LIGHT_LOOSEJAW = ImmutableMap.<LightState, Identifier>builder()
            .put(ALL_LIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/all_lit.png"))
            .put(ALL_UNLIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/all_unlit.png"))
            .put(FLANK, new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/flank.png"))
            .put(LURE, new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/lure.png"))
            .build();

    private static final Map<LightState, Identifier> LIEMS_LIGHT_LOOSEJAW = ImmutableMap.<LightState, Identifier>builder()
            .put(ALL_LIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/all_lit.png"))
            .put(ALL_UNLIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/all_unlit.png"))
            .put(FLANK, new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/flank.png"))
            .put(LURE, new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/lure.png"))
            .build();

    private static final Map<LightState, Identifier> REMARKABLE_LIGHT_LOOSEJAW = ImmutableMap.<LightState, Identifier>builder()
            .put(ALL_LIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/all_lit.png"))
            .put(ALL_UNLIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/all_unlit.png"))
            .put(FLANK, new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/flank.png"))
            .put(LURE, new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/lure.png"))
            .put(RECOGNITION, new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/recognition.png"))
            .build();

    private static final Map<LightState, Identifier> SMALL_LIGHT_LOOSEJAW = ImmutableMap.<LightState, Identifier>builder()
            .put(ALL_LIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/all_lit.png"))
            .put(ALL_UNLIT, new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/all_unlit.png"))
            .put(FLANK, new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/flank.png"))
            .put(LURE, new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/lure.png"))
            .build();
    
    public LightLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LightLoosejawModel(), 0.4F);

        this.addFeature(new LightLoosejawFinsFeature(this));
    }

    @Override
    public Identifier getTexture(LightLoosejawEntity entity) {
        LightState lightState = entity.getLightState();

        switch (entity.getLoosejawType()) {
            case 0:
                return BIGLAMP_LIGHT_LOOSEJAW.get(lightState);
            case 1:
                return GOODYEARS_LIGHT_LOOSEJAW.get(lightState);
            case 2:
                return GUERNES_LIGHT_LOOSEJAW.get(lightState);
            case 3:
                return LIEMS_LIGHT_LOOSEJAW.get(lightState);
            case 4:
                return REMARKABLE_LIGHT_LOOSEJAW.get(lightState);
            case 5:
                return SMALL_LIGHT_LOOSEJAW.get(lightState);
        }

        return null;
    }

    @Override
    protected void setupTransforms(LightLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        matrices.translate(0.0F, 0.08F, -0.005F);
    }

}
