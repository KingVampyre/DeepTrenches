package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.BarbeledLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BarbeledLoosejawModel;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BarbeledLoosejawRenderer extends MobEntityRenderer<BarbeledLoosejawEntity, BarbeledLoosejawModel> {

    private static final Identifier[] ATLANTIC_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/suborbital_and_lure.png")
    };

    private static final Identifier[] GLOWING_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/suborbital_and_lure.png")
    };

    private static final Identifier[] GRIMALDIS_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/suborbital_and_lure.png")
    };

    private static final Identifier[] MANY_RAYED_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/suborbital_and_lure.png")
    };

    private static final Identifier[] SHINY_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/suborbital_and_lure.png")
    };

    private static final Identifier[] TITTMANNS_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/suborbital_and_lure.png")
    };

    public BarbeledLoosejawRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new BarbeledLoosejawModel(), 0.4F);

	    this.addFeature(new BarbeledLoosejawFinsFeature(this));
    }

    @Override
    public Identifier getTexture(BarbeledLoosejawEntity entity) {
        int index = entity.getLightStateIndex();

        switch (entity.getLoosejawType()) {
            case 0:
                return ATLANTIC_BARBELED_LOOSEJAW[index];
            case 1:
                return GLOWING_BARBELED_LOOSEJAW[index];
            case 2:
                return GRIMALDIS_BARBELED_LOOSEJAW[index];
            case 3:
                return MANY_RAYED_BARBELED_LOOSEJAW[index];
            case 4:
                return SHINY_BARBELED_LOOSEJAW[index];
            case 5:
                return TITTMANNS_BARBELED_LOOSEJAW[index];
        }

        return null;
    }

    @Override
    protected void setupTransforms(BarbeledLoosejawEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
        super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

        if(entity.isBaby())
            matrices.translate(0, -0.6F, 0);
        else
            matrices.translate(0.0F, -0.08F, 0.15F);
    }

}
