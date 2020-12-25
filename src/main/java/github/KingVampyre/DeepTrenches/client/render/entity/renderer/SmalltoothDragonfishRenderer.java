package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.SmalltoothDragonfishFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.SmalltoothDragonfishModel;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SmalltoothDragonfishRenderer extends MobEntityRenderer<SmalltoothDragonfishEntity, SmalltoothDragonfishModel> {

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
	    super(entityRenderDispatcher, new SmalltoothDragonfishModel(), 0.4F);

	    this.addFeature(new SmalltoothDragonfishFinsFeature(this));
    }

    @Override
    public Identifier getTexture(SmalltoothDragonfishEntity entity) {
        int index = entity.getLightStateIndex();

        return TEXTURES[index];
    }

    @Override
    protected void setupTransforms(SmalltoothDragonfishEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        matrices.translate(0.0F, 0.08F, 0.15F);
    }

}
