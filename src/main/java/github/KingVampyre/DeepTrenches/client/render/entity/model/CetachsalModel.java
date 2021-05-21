package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.CetachsalEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CetachsalModel extends AnimatedGeoModel<CetachsalEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/cetachsal/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/cetachsal/all_unlit.png")
    };

    @Override
    public Identifier getAnimationFileLocation(CetachsalEntity animatable) {
        return new Identifier("deep_trenches:animations/cetachsal.json");
    }

    @Override
    public Identifier getModelLocation(CetachsalEntity object) {
        return new Identifier("deep_trenches:geo/entity/cetachsal.geo.json");
    }

    @Override
    public Identifier getTextureLocation(CetachsalEntity object) {
//      TODO return TEXTURES[object.getLightStateIndex()];
        return TEXTURES[0];
    }

}