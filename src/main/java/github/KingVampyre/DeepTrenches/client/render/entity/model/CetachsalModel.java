package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.CetachsalEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CetachsalModel extends AnimatedGeoModel<CetachsalEntity> {

    @Override
    public Identifier getModelLocation(CetachsalEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(CetachsalEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(CetachsalEntity animatable) {
        return new Identifier("deep_trenches:animations/cetachsal.json");
    }

}