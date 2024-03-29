package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StaspModel extends AnimatedGeoModel<StaspEntity> {

    private static final Identifier[] ANGRY_TEXTURES = {
            new Identifier("deep_trenches:textures/entity/stasp/black_stasp/angry/black_stasp.png"),
            new Identifier("deep_trenches:textures/entity/stasp/blue_winged_stasp/angry/blue_winged_stasp.png"),
            new Identifier("deep_trenches:textures/entity/stasp/fuchsitra_stasp/angry/fuchsitra_stasp.png"),
            new Identifier("deep_trenches:textures/entity/stasp/orange_winged_stasp/angry/orange_winged_stasp.png")
    };

    private static final Identifier[] ANGRY_WITH_AQUEAN_SAP = {
            new Identifier("deep_trenches:textures/entity/stasp/black_stasp/angry/with_aquean_sap.png"),
            new Identifier("deep_trenches:textures/entity/stasp/blue_winged_stasp/angry/with_aquean_sap.png"),
            new Identifier("deep_trenches:textures/entity/stasp/fuchsitra_stasp/angry/with_aquean_sap.png"),
            new Identifier("deep_trenches:textures/entity/stasp/orange_winged_stasp/angry/with_aquean_sap.png")
    };

    private static final Identifier[] ANGRY_WITH_POLLEN = {
            new Identifier("deep_trenches:textures/entity/stasp/black_stasp/angry/with_pollen.png"),
            new Identifier("deep_trenches:textures/entity/stasp/blue_winged_stasp/angry/with_pollen.png"),
            new Identifier("deep_trenches:textures/entity/stasp/fuchsitra_stasp/angry/with_pollen.png"),
            new Identifier("deep_trenches:textures/entity/stasp/orange_winged_stasp/angry/with_pollen.png")
    };

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/stasp/black_stasp/black_stasp.png"),
            new Identifier("deep_trenches:textures/entity/stasp/blue_winged_stasp/blue_winged_stasp.png"),
            new Identifier("deep_trenches:textures/entity/stasp/fuchsitra_stasp/fuchsitra_stasp.png"),
            new Identifier("deep_trenches:textures/entity/stasp/orange_winged_stasp/orange_winged_stasp.png")
    };

    private static final Identifier[] WITH_AQUEAN_SAP = {
            new Identifier("deep_trenches:textures/entity/stasp/black_stasp/with_aquean_sap.png"),
            new Identifier("deep_trenches:textures/entity/stasp/blue_winged_stasp/with_aquean_sap.png"),
            new Identifier("deep_trenches:textures/entity/stasp/fuchsitra_stasp/with_aquean_sap.png"),
            new Identifier("deep_trenches:textures/entity/stasp/orange_winged_stasp/with_aquean_sap.png")
    };

    private static final Identifier[] WITH_POLLEN = {
            new Identifier("deep_trenches:textures/entity/stasp/black_stasp/with_pollen.png"),
            new Identifier("deep_trenches:textures/entity/stasp/blue_winged_stasp/with_pollen.png"),
            new Identifier("deep_trenches:textures/entity/stasp/fuchsitra_stasp/with_pollen.png"),
            new Identifier("deep_trenches:textures/entity/stasp/orange_winged_stasp/with_pollen.png")
    };

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/stasp.geo.json");

    @Override
    public Identifier getAnimationFileLocation(StaspEntity animatable) {
        return new Identifier("deep_trenches:animations/stasp.json");
    }

    @Override
    public Identifier getModelLocation(StaspEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(StaspEntity object) {
        // TODO POLLEN & SAP TEXTURES
        int type = object.getVariant();

        return object.hasAngerTime() ? ANGRY_TEXTURES[type] : TEXTURES[type];
    }

}