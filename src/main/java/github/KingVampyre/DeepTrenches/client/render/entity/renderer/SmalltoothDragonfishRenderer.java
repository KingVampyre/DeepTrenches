package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.SmalltoothDragonfishTransparentModel;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SmalltoothDragonfishRenderer extends MobEntityRenderer<SmalltoothDragonfishEntity, SmalltoothDragonfishTransparentModel> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/lure.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital_and_lure.png")
    };

    public SmalltoothDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new SmalltoothDragonfishTransparentModel(), 0.4F);
    }

    @Override
    public Identifier getTexture(SmalltoothDragonfishEntity entity) {
        return TEXTURES[1];
    }

    @Override
    protected void setupTransforms(SmalltoothDragonfishEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        matrices.translate(0.0F, 0.08F, 0.15F);
    }

}
