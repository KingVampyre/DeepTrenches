package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackDragonfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackDragonfishModel extends AnimatedGeoModel<BlackDragonfishEntity> {

    @Override
    public Identifier getModelLocation(BlackDragonfishEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(BlackDragonfishEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(BlackDragonfishEntity animatable) {
        return new Identifier("deep_trenches:animations/black_dragonfish.json");
    }

}