package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackScabbardEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackScabbardModel extends AnimatedGeoModel<BlackScabbardEntity> {

    @Override
    public Identifier getAnimationFileLocation(BlackScabbardEntity animatable) {
        return new Identifier("deep_trenches:animations/black_scabbard.json");
    }

    @Override
    public Identifier getModelLocation(BlackScabbardEntity object) {
        return new Identifier("deep_trenches:geo/entity/black_scabbard.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BlackScabbardEntity object) {
        return new Identifier("deep_trenches:textures/entity/black_scabbard.png");
    }

}