package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.VoidBeastEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VoidBeastModel extends AnimatedGeoModel<VoidBeastEntity> {

    @Override
    public Identifier getModelLocation(VoidBeastEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(VoidBeastEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(VoidBeastEntity animatable) {
        return new Identifier("deep_trenches:animations/void_beast.json");
    }

}