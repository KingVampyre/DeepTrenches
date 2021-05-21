package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BeardedSeadevilEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BeardedSeadevilModel extends AnimatedGeoModel<BeardedSeadevilEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/bearded_seadevil.geo.json");

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/bearded_seadevil/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/bearded_seadevil/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/bearded_seadevil/beard.png"),
            new Identifier("deep_trenches:textures/entity/bearded_seadevil/lure.png")
    };

    @Override
    public Identifier getAnimationFileLocation(BeardedSeadevilEntity animatable) {
        return new Identifier("deep_trenches:animations/bearded_seadevil.json");
    }

    @Override
    public Identifier getModelLocation(BeardedSeadevilEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(BeardedSeadevilEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}