package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.ThreadfinDragonfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ThreadfinDragonfishModel extends AnimatedGeoModel<ThreadfinDragonfishEntity> {

    @Override
    public Identifier getModelLocation(ThreadfinDragonfishEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(ThreadfinDragonfishEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(ThreadfinDragonfishEntity animatable) {
        return new Identifier("deep_trenches:animations/threadfin_dragonfish.json");
    }

}