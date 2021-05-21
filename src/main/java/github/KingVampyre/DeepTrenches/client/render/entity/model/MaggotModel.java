package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.MaggotEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MaggotModel extends AnimatedGeoModel<MaggotEntity> {

    @Override
    public Identifier getAnimationFileLocation(MaggotEntity animatable) {
        return new Identifier("deep_trenches:animations/maggot.json");
    }

    @Override
    public Identifier getModelLocation(MaggotEntity object) {
        return new Identifier("deep_trenches:geo/entity/maggot.geo.json");
    }

    @Override
    public Identifier getTextureLocation(MaggotEntity object) {
        return new Identifier("deep_trenches:textures/entity/maggot.png");
    }

}