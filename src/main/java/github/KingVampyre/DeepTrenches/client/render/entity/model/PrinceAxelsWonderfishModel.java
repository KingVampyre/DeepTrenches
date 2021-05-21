package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.PrinceAxelsWonderfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PrinceAxelsWonderfishModel extends AnimatedGeoModel<PrinceAxelsWonderfishEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/prince_axels_wonderfish.geo.json");

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/prince_axels_wonderfish/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/prince_axels_wonderfish/all_unlit.png")
    };

    @Override
    public Identifier getAnimationFileLocation(PrinceAxelsWonderfishEntity animatable) {
        return new Identifier("deep_trenches:animations/prince_axels_wonderfish.json");
    }

    @Override
    public Identifier getModelLocation(PrinceAxelsWonderfishEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(PrinceAxelsWonderfishEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}