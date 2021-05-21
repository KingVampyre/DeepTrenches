package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackSeadevilEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackSeadevilModel extends AnimatedGeoModel<BlackSeadevilEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/black_seadevil/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/black_seadevil/all_unlit.png")
    };

    @Override
    public Identifier getAnimationFileLocation(BlackSeadevilEntity animatable) {
        return new Identifier("deep_trenches:animations/black_seadevil.json");
    }

    @Override
    public Identifier getModelLocation(BlackSeadevilEntity object) {
        return new Identifier("deep_trenches:geo/model/black_seadevil.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BlackSeadevilEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}