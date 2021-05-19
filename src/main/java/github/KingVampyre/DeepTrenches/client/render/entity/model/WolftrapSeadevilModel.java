package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.WolftrapSeadevilEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WolftrapSeadevilModel extends AnimatedGeoModel<WolftrapSeadevilEntity> {

    @Override
    public Identifier getModelLocation(WolftrapSeadevilEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(WolftrapSeadevilEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(WolftrapSeadevilEntity animatable) {
        return new Identifier("deep_trenches:animations/wolftrap_seadevil.json");
    }

}