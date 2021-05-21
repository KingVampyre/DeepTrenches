package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.LaceratorEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LaceratorModel extends AnimatedGeoModel<LaceratorEntity> {

    @Override
    public Identifier getAnimationFileLocation(LaceratorEntity animatable) {
        return new Identifier("deep_trenches:animations/lacerator.json");
    }

    @Override
    public Identifier getModelLocation(LaceratorEntity object) {
        return new Identifier("deep_trenches:geo/entity/lacerator.geo.json");
    }

    @Override
    public Identifier getTextureLocation(LaceratorEntity object) {
        return new Identifier("deep_trenches:textures/entity/lacerator.png");
    }

}