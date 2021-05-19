package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.HoneycombDragonfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HoneycombDragonfishModel extends AnimatedGeoModel<HoneycombDragonfishEntity> {

    @Override
    public Identifier getModelLocation(HoneycombDragonfishEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(HoneycombDragonfishEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(HoneycombDragonfishEntity animatable) {
        return new Identifier("deep_trenches:animations/honeycomb_dragonfish.json");
    }

}