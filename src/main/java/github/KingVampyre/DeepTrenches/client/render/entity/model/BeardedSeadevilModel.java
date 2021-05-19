package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BeardedSeadevilEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BeardedSeadevilModel extends AnimatedGeoModel<BeardedSeadevilEntity> {

    @Override
    public Identifier getModelLocation(BeardedSeadevilEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(BeardedSeadevilEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(BeardedSeadevilEntity animatable) {
        return new Identifier("deep_trenches:animations/bearded_seadevil.json");
    }

}