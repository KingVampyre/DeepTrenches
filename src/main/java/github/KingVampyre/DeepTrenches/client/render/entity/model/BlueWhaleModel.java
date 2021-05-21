package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlueWhaleEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueWhaleModel extends AnimatedGeoModel<BlueWhaleEntity> {

    @Override
    public Identifier getAnimationFileLocation(BlueWhaleEntity animatable) {
        return new Identifier("deep_trenches:animations/blue_whale.json");
    }

    @Override
    public Identifier getModelLocation(BlueWhaleEntity object) {
        return new Identifier("deep_trenches:geo/entity/blue_whale.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BlueWhaleEntity object) {
        return new Identifier("deep_trenches:textures/entity/blue_whale.png");
    }

}