package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.ViperfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ViperfishModel extends AnimatedGeoModel<ViperfishEntity> {

    @Override
    public Identifier getModelLocation(ViperfishEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(ViperfishEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(ViperfishEntity animatable) {
        return new Identifier("deep_trenches:animations/viperfish.json");
    }

}