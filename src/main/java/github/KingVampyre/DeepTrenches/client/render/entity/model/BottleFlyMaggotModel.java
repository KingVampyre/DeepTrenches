package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BottleFlyMaggotEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BottleFlyMaggotModel extends AnimatedGeoModel<BottleFlyMaggotEntity> {

    @Override
    public Identifier getAnimationFileLocation(BottleFlyMaggotEntity animatable) {
        return new Identifier("deep_trenches:animations/bottle_fly_maggot.json");
    }

    @Override
    public Identifier getModelLocation(BottleFlyMaggotEntity object) {
        return new Identifier("deep_trenches:geo/entity/bottle_fly_maggot.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BottleFlyMaggotEntity object) {
        return new Identifier("deep_trenches:textures/entity/bottle_fly_maggot.png");
    }

}