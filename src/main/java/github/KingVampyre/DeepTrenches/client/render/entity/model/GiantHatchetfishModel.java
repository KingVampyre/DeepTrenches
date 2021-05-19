package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GiantHatchetfishModel extends AnimatedGeoModel<GiantHatchetfishEntity> {

    @Override
    public Identifier getAnimationFileLocation(GiantHatchetfishEntity animatable) {
        return new Identifier("deep_trenches:animations/giant_hatchetfish.json");
    }

    @Override
    public Identifier getModelLocation(GiantHatchetfishEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(GiantHatchetfishEntity object) {
        return new Identifier("deep_trenches:textures/entity/giant_hatchetfish/all_lit.png");
    }

}