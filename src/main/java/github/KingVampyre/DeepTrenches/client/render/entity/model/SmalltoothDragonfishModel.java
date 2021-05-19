package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SmalltoothDragonfishModel extends AnimatedGeoModel<SmalltoothDragonfishEntity> {

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

    @Override
    public Identifier getAnimationFileLocation(SmalltoothDragonfishEntity animatable) {
        return new Identifier("deep_trenches:animations/smalltooth_dragonfish.json");
    }

    @Override
    public Identifier getModelLocation(SmalltoothDragonfishEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(SmalltoothDragonfishEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}