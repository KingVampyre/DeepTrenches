package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BarbeledLoosejawModel extends AnimatedGeoModel<BarbeledLoosejawEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/barbeled_loosejaw.geo.json");

    private static final Identifier[] ATLANTIC_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/suborbital_and_lure.png")
    };

    private static final Identifier[] GLOWING_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/suborbital_and_lure.png")
    };

    private static final Identifier[] GRIMALDIS_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/suborbital_and_lure.png")
    };

    private static final Identifier[] MANY_RAYED_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/suborbital_and_lure.png")
    };

    private static final Identifier[] SHINY_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/suborbital_and_lure.png")
    };

    private static final Identifier[] TITTMANNS_BARBELED_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/lure.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/suborbital_and_lure.png")
    };

    private static final Identifier[][] LIT_TEXTURES = {
            ATLANTIC_BARBELED_LOOSEJAW,
            GLOWING_BARBELED_LOOSEJAW,
            GRIMALDIS_BARBELED_LOOSEJAW,
            MANY_RAYED_BARBELED_LOOSEJAW,
            SHINY_BARBELED_LOOSEJAW,
            TITTMANNS_BARBELED_LOOSEJAW
    };

    private static final Identifier[] UNLIT_TEXTURES = {
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/all_unlit.png"),
    };

    @Override
    public Identifier getAnimationFileLocation(BarbeledLoosejawEntity animatable) {
        return new Identifier("deep_trenches:animations/barbeled_loosejaw.json");
    }

    @Override
    public Identifier getModelLocation(BarbeledLoosejawEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(BarbeledLoosejawEntity object) {
        int index = object.getLightStateIndex();
        int variant = object.getVariant();

        return object.isLit() ? LIT_TEXTURES[variant][index] : UNLIT_TEXTURES[variant];
    }

    @Override
    public void setLivingAnimations(BarbeledLoosejawEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);

        if (entity.isBaby()) {
            IBone root = this.getAnimationProcessor().getBone("root");

            if (root != null) {
                root.setScaleX(0.5F);
                root.setScaleY(0.5F);
                root.setScaleZ(0.5F);
            }

        }

    }

}