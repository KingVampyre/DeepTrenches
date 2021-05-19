package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.PrinceAxelsWonderfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PrinceAxelsWonderfishModel extends AnimatedGeoModel<PrinceAxelsWonderfishEntity> {

    @Override
    public Identifier getModelLocation(PrinceAxelsWonderfishEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(PrinceAxelsWonderfishEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(PrinceAxelsWonderfishEntity animatable) {
        return new Identifier("deep_trenches:animations/prince_axels_wonderfish.json");
    }

}