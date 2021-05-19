package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.TelescopefishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TelescopefishModel extends AnimatedGeoModel<TelescopefishEntity> {

    @Override
    public Identifier getAnimationFileLocation(TelescopefishEntity animatable) {
        return new Identifier("deep_trenches:animations/telescopefish.json");
    }

    @Override
    public Identifier getModelLocation(TelescopefishEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(TelescopefishEntity object) {
        return new Identifier("deep_trenches:textures/entity/telescopefish.png");
    }

}