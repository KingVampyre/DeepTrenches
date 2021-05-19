package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.FangtoothEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FangtoothModel extends AnimatedGeoModel<FangtoothEntity> {

    @Override
    public Identifier getAnimationFileLocation(FangtoothEntity animatable) {
        return new Identifier("deep_trenches:animations/fangtooth.json");
    }

    @Override
    public Identifier getModelLocation(FangtoothEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(FangtoothEntity object) {
        return new Identifier("deep_trenches:textures/entity/fangtooth.png");
    }

}