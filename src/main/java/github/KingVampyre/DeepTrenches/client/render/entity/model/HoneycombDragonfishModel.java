package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.HoneycombDragonfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HoneycombDragonfishModel extends AnimatedGeoModel<HoneycombDragonfishEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/honeycomb_dragonfish/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/honeycomb_dragonfish/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/honeycomb_dragonfish/flank.png"),
            new Identifier("deep_trenches:textures/entity/honeycomb_dragonfish/lure.png")
    };

    @Override
    public Identifier getAnimationFileLocation(HoneycombDragonfishEntity animatable) {
        return new Identifier("deep_trenches:animations/honeycomb_dragonfish.json");
    }

    @Override
    public Identifier getModelLocation(HoneycombDragonfishEntity object) {
        return new Identifier("deep_trenches:geo/entity/honeycomb_dragonfish.geo.json");
    }

    @Override
    public Identifier getTextureLocation(HoneycombDragonfishEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}