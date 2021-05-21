package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackDragonfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackDragonfishModel extends AnimatedGeoModel<BlackDragonfishEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/bearded_seadevil.geo.json");

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/black_dragonfish/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/black_dragonfish/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/black_dragonfish/flank.png"),
            new Identifier("deep_trenches:textures/entity/black_dragonfish/lure.png")
    };

    @Override
    public Identifier getAnimationFileLocation(BlackDragonfishEntity animatable) {
        return new Identifier("deep_trenches:animations/black_dragonfish.json");
    }

    @Override
    public Identifier getModelLocation(BlackDragonfishEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(BlackDragonfishEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}