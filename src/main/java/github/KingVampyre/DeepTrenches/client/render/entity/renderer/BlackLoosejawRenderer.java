package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.BlackLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackLoosejawModel;
import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BlackLoosejawRenderer extends MobEntityRenderer<BlackLoosejawEntity, BlackLoosejawModel> {

    private static final Identifier[] NORTHERN_BLACK_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital_and_lure.png")
    };

    private static final Identifier[] SOUTHERN_BLACK_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/tittmanns/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/tittmanns/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/tittmanns/flank.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/tittmanns/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/tittmanns/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/tittmanns/lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/tittmanns/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/tittmanns/suborbital_and_lure.png")
    };

    public BlackLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackLoosejawModel(), 0.4F);

        this.addFeature(new BlackLoosejawFinsFeature(this));
    }

    @Override
    public Identifier getTexture(BlackLoosejawEntity entity) {

        switch (entity.getLoosejawType()) {
            case 0:
                return NORTHERN_BLACK_LOOSEJAW[1];
            case 1:
                return SOUTHERN_BLACK_LOOSEJAW[1];
        }

        return null;
    }

    @Override
    protected void setupTransforms(BlackLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        matrices.translate(0.0F, 0.08F, -0.1F);
    }

}
