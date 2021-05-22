package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GiantHatchetfishModel extends AnimatedGeoModel<GiantHatchetfishEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/giant_hatchetfish.geo.json");

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/giant_hatchetfish/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/giant_hatchetfish/all_unlit.png")
    };

    @Override
    public Identifier getAnimationFileLocation(GiantHatchetfishEntity animatable) {
        return new Identifier("deep_trenches:animations/giant_hatchetfish.json");
    }

    @Override
    public Identifier getModelLocation(GiantHatchetfishEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(GiantHatchetfishEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}