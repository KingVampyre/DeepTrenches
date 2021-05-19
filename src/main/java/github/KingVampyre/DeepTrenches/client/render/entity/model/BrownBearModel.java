package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BrownBearEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BrownBearModel extends AnimatedGeoModel<BrownBearEntity> {

    @Override
    public Identifier getModelLocation(BrownBearEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(BrownBearEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(BrownBearEntity animatable) {
        return new Identifier("deep_trenches:animations/brown_bear.json");
    }

}