package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.VoidBeastEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VoidBeastModel extends AnimatedGeoModel<VoidBeastEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/void_beast/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/void_beast/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/void_beast/tail.png"),
            new Identifier("deep_trenches:textures/entity/void_beast/tongue.png")
    };

    @Override
    public Identifier getAnimationFileLocation(VoidBeastEntity animatable) {
        return new Identifier("deep_trenches:animations/void_beast.json");
    }

    @Override
    public Identifier getModelLocation(VoidBeastEntity object) {
        return new Identifier("deep_trenches:geo/entity/void_beast.geo.json");
    }

    @Override
    public Identifier getTextureLocation(VoidBeastEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}