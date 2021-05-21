package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.ThreadfinDragonfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ThreadfinDragonfishModel extends AnimatedGeoModel<ThreadfinDragonfishEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/honeycomb_dragonfish.geo.json");

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/threadfin_dragonfish/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/threadfin_dragonfish/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/threadfin_dragonfish/flank.png"),
            new Identifier("deep_trenches:textures/entity/threadfin_dragonfish/lure.png")
    };

    @Override
    public Identifier getAnimationFileLocation(ThreadfinDragonfishEntity animatable) {
        return new Identifier("deep_trenches:animations/threadfin_dragonfish.json");
    }

    @Override
    public Identifier getModelLocation(ThreadfinDragonfishEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(ThreadfinDragonfishEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}