package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BottleFlyEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BottleFlyModel extends AnimatedGeoModel<BottleFlyEntity> {

    @Override
    public Identifier getModelLocation(BottleFlyEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(BottleFlyEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(BottleFlyEntity animatable) {
        return new Identifier("deep_trenches:animations/bottle_fly.json");
    }

}