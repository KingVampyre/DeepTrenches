package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackLoosejawModel extends AnimatedGeoModel<BlackLoosejawEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/black_loosejaw.geo.json");

    private static final Identifier[] NORTHERN_BLACK_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital_and_lure.png")
    };

    private static final Identifier[] SOUTHERN_BLACK_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/suborbital_and_lure.png")
    };

    private static final Identifier[][] LIT_TEXTURES = {
            NORTHERN_BLACK_LOOSEJAW,
            SOUTHERN_BLACK_LOOSEJAW
    };

    private static final Identifier[] UNLIT_TEXTURES = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/all_unlit.png")
    };

    @Override
    public Identifier getAnimationFileLocation(BlackLoosejawEntity animatable) {
        return new Identifier("deep_trenches:animations/black_loosejaw.json");
    }

    @Override
    public Identifier getModelLocation(BlackLoosejawEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(BlackLoosejawEntity object) {
        var variant = object.getVariant();

        return object.isLit() ? LIT_TEXTURES[variant][object.getLightStateIndex()] : UNLIT_TEXTURES[variant];
    }

    @Override
    public void setLivingAnimations(BlackLoosejawEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
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