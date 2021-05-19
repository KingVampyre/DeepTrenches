package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackSeadevilEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackSeadevilModel extends AnimatedGeoModel<BlackSeadevilEntity> {
    @Override
    public Identifier getModelLocation(BlackSeadevilEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(BlackSeadevilEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(BlackSeadevilEntity animatable) {
        return new Identifier("deep_trenches:animations/black_seadevil.json");
    }

}