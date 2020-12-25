package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.LightLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.LightLoosejawModel;
import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class LightLoosejawRenderer extends MobEntityRenderer<LightLoosejawEntity, LightLoosejawModel> {

    private static final Identifier[] BIGLAMP_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/flank.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/biglamp/lure.png"),
    };

    private static final Identifier[] GOODYEARS_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/flank.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/goodyears/lure.png"),
    };

    private static final Identifier[] GUERNES_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/flank.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/guernes/lure.png"),
    };

    private static final Identifier[] LIEMS_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/flank.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/liems/lure.png"),
    };

    private static final Identifier[] REMARKABLE_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/flank.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/remarkable_light/lure.png"),
    };

    private static final Identifier[] SMALL_LIGHT_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/flank.png"),
            new Identifier("deep_trenches:textures/entity/light_loosejaw/small_light/lure.png"),
    };
    
    public LightLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LightLoosejawModel(), 0.4F);

        this.addFeature(new LightLoosejawFinsFeature(this));
    }

    @Override
    public Identifier getTexture(LightLoosejawEntity entity) {
        int index = entity.getLightStateIndex();

        switch (entity.getLoosejawType()) {
            case 0:
                return BIGLAMP_LIGHT_LOOSEJAW[index];
            case 1:
                return GOODYEARS_LIGHT_LOOSEJAW[index];
            case 2:
                return GUERNES_LIGHT_LOOSEJAW[index];
            case 3:
                return LIEMS_LIGHT_LOOSEJAW[index];
            case 4:
                return REMARKABLE_LIGHT_LOOSEJAW[index];
            case 5:
                return SMALL_LIGHT_LOOSEJAW[index];
        }

        return null;
    }

    @Override
    protected void setupTransforms(LightLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        matrices.translate(0.0F, 0.08F, -0.005F);
    }

}
