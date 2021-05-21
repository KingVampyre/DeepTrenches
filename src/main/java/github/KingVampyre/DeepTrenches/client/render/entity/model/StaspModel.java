package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static github.KingVampyre.DeepTrenches.core.init.Components.POLLEN;

public class StaspModel extends AnimatedGeoModel<StaspEntity> {

    private static final Identifier[] ANGRY_TEXTURES = {
            new Identifier("deep_trenches:textures/entity/stasp/black_stasp/angry/black_stasp.png"),
            new Identifier("deep_trenches:textures/entity/stasp/blue_winged_stasp/angry/blue_winged_stasp.png"),
            new Identifier("deep_trenches:textures/entity/stasp/fuchsitra_stasp/angry/fuchsitra_stasp.png"),
            new Identifier("deep_trenches:textures/entity/stasp/orange_winged_stasp/orange_winged_stasp.png")
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

    @Override
    public Identifier getAnimationFileLocation(StaspEntity animatable) {
        return new Identifier("deep_trenches:animations/stasp.json");
    }

    @Override
    public Identifier getModelLocation(StaspEntity object) {
        return new Identifier("deep_trenches:geo/entity/stasp.geo.json");
    }

    @Override
    public Identifier getTextureLocation(StaspEntity object) {
        StaspPollenComponent pollen = (StaspPollenComponent) POLLEN.get(object);
        int type = object.getStaspType();

        if(object.hasAngerTime())
            return pollen.hasAqueanSap() ? ANGRY_WITH_AQUEAN_SAP[type] : pollen.hasPollen() ? ANGRY_WITH_POLLEN[type] : ANGRY_TEXTURES[type];

        return pollen.hasAqueanSap() ? WITH_AQUEAN_SAP[type] : pollen.hasPollen() ? WITH_POLLEN[type] : TEXTURES[type];
    }

}