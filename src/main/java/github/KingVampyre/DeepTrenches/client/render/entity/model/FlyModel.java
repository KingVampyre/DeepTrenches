package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.FlyEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FlyModel extends AnimatedGeoModel<FlyEntity> {

    @Override
    public Identifier getModelLocation(FlyEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(FlyEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(FlyEntity animatable) {
        return new Identifier("deep_trenches:animations/fly.json");
    }

}