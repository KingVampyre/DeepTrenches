package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.WolftrapSeadevilEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WolftrapSeadevilModel extends AnimatedGeoModel<WolftrapSeadevilEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/wolftrap_seadevil.geo.json");

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/wolftrap_seadevil/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/wolftrap_seadevil/all_unlit.png")
    };

    @Override
    public Identifier getAnimationFileLocation(WolftrapSeadevilEntity animatable) {
        return new Identifier("deep_trenches:animations/wolftrap_seadevil.json");
    }

    @Override
    public Identifier getModelLocation(WolftrapSeadevilEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(WolftrapSeadevilEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}