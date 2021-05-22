package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.FlyEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FlyModel extends AnimatedGeoModel<FlyEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/fly/brown_fly.png"),
            new Identifier("deep_trenches:textures/entity/fly/fly.png"),
            new Identifier("deep_trenches:textures/entity/fly/phaonia_fly.png"),
            new Identifier("deep_trenches:textures/entity/fly/root_fly.png")
    };

    @Override
    public Identifier getAnimationFileLocation(FlyEntity animatable) {
        return new Identifier("deep_trenches:animations/fly.json");
    }

    @Override
    public Identifier getModelLocation(FlyEntity object) {
        return new Identifier("deep_trenches:geo/entity/fly.geo.json");
    }

    @Override
    public Identifier getTextureLocation(FlyEntity object) {
        return TEXTURES[object.getVariant()];
    }

}