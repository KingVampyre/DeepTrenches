package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.LightLoosejawEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LightLoosejawModel extends AnimatedGeoModel<LightLoosejawEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/light_loosejaw.geo.json");

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

    private static final Identifier[][] TEXTURES = {
            BIGLAMP_LIGHT_LOOSEJAW,
            GOODYEARS_LIGHT_LOOSEJAW,
            GUERNES_LIGHT_LOOSEJAW,
            LIEMS_LIGHT_LOOSEJAW,
            REMARKABLE_LIGHT_LOOSEJAW,
            SMALL_LIGHT_LOOSEJAW
    };

    @Override
    public Identifier getAnimationFileLocation(LightLoosejawEntity animatable) {
        return new Identifier("deep_trenches:animations/light_loosejaw.json");
    }

    @Override
    public Identifier getModelLocation(LightLoosejawEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(LightLoosejawEntity object) {
        int index = object.getLightStateIndex();
        int type = object.getLoosejawType();

        return TEXTURES[type][index];
    }

    @Override
    public void setLivingAnimations(LightLoosejawEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
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