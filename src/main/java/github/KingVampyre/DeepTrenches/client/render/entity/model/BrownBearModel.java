package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BrownBearEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BrownBearModel extends AnimatedGeoModel<BrownBearEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/brown_bear/grizzly_brown_bear.png"),
            new Identifier("deep_trenches:textures/entity/brown_bear/kamchatka_brown_bear.png"),
            new Identifier("deep_trenches:textures/entity/brown_bear/marsican_brown_bear.png"),
    };

    @Override
    public Identifier getAnimationFileLocation(BrownBearEntity animatable) {
        return new Identifier("deep_trenches:animations/brown_bear.json");
    }

    @Override
    public Identifier getModelLocation(BrownBearEntity object) {
        return new Identifier("deep_trenches:geo/entity/brown_bear.json");
    }

    @Override
    public Identifier getTextureLocation(BrownBearEntity object) {
        return TEXTURES[object.getVariant()];
    }

}