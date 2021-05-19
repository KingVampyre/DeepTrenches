package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.GiantSeedShrimpEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GiantSeedShrimpModel extends AnimatedGeoModel<GiantSeedShrimpEntity> {

    @Override
    public Identifier getAnimationFileLocation(GiantSeedShrimpEntity animatable) {
        return new Identifier("deep_trenches:animations/giant_seed_shrimp.json");
    }

    @Override
    public Identifier getModelLocation(GiantSeedShrimpEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(GiantSeedShrimpEntity object) {
        return new Identifier("deep_trenches:textures/entity/giant_seed_shrimp.png");
    }

}