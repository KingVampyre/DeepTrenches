package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SmalltoothDragonfishModel extends AnimatedGeoModel<SmalltoothDragonfishEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/smalltooth_dragonfish.geo.json");

    private static final Identifier[] LIT_TEXTURES = {
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/lure.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital_and_lure.png")
    };

    private static final Identifier UNLIT_TEXTURE = new Identifier("deep_trenches:textures/entity/smalltooth_dragonfish/all_unlit.png");

    @Override
    public Identifier getAnimationFileLocation(SmalltoothDragonfishEntity animatable) {
        return new Identifier("deep_trenches:animations/smalltooth_dragonfish.json");
    }

    @Override
    public Identifier getModelLocation(SmalltoothDragonfishEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(SmalltoothDragonfishEntity object) {
        return object.isLit() ? LIT_TEXTURES[object.getLightStateIndex()] : UNLIT_TEXTURE;
    }

    @Override
    public void setLivingAnimations(SmalltoothDragonfishEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
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