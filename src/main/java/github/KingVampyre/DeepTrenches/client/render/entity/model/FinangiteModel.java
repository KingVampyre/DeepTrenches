package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.FinangiteEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FinangiteModel extends AnimatedGeoModel<FinangiteEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/finangite.geo.json");

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/finangite/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/finangite/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/finangite/back.png"),
            new Identifier("deep_trenches:textures/entity/finangite/back_pectoral_fin_front.png"),
            new Identifier("deep_trenches:textures/entity/finangite/back_pectoral_fin_rear.png"),
            new Identifier("deep_trenches:textures/entity/finangite/pectoral_fin.png"),
            new Identifier("deep_trenches:textures/entity/finangite/pectoral_fin_front.png"),
            new Identifier("deep_trenches:textures/entity/finangite/pectoral_fin_rear.png"),
    };

    @Override
    public Identifier getAnimationFileLocation(FinangiteEntity animatable) {
        return new Identifier("deep_trenches:animations/finangite.json");
    }

    @Override
    public Identifier getModelLocation(FinangiteEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(FinangiteEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}