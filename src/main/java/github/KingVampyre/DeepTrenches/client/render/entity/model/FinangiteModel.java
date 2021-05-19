package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.FinangiteEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FinangiteModel extends AnimatedGeoModel<FinangiteEntity> {

    @Override
    public Identifier getModelLocation(FinangiteEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(FinangiteEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(FinangiteEntity animatable) {
        return new Identifier("deep_trenches:animations/finangite.json");
    }

}