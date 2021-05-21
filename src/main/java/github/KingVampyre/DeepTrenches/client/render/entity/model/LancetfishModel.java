package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.LancetfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LancetfishModel extends AnimatedGeoModel<LancetfishEntity> {

    @Override
    public Identifier getAnimationFileLocation(LancetfishEntity animatable) {
        return new Identifier("deep_trenches:animations/lancetfish.json");
    }

    @Override
    public Identifier getModelLocation(LancetfishEntity object) {
        return new Identifier("deep_trenches:geo/entity/lancetfish.geo.json");
    }

    @Override
    public Identifier getTextureLocation(LancetfishEntity object) {
        return new Identifier("deep_trenches:textures/entity/lancetfish.png");
    }

}