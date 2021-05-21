package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DeepLakeBettaModel extends AnimatedGeoModel<DeepLakeBettaEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/body.png"),
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/lure.png")
    };

    @Override
    public Identifier getAnimationFileLocation(DeepLakeBettaEntity animatable) {
        return new Identifier("deep_trenches:animations/deep_lake_betta.json");
    }

    @Override
    public Identifier getModelLocation(DeepLakeBettaEntity object) {
        return new Identifier("deep_trenches:geo/entity/deep_lake_betta.geo.json");
    }

    @Override
    public Identifier getTextureLocation(DeepLakeBettaEntity object) {
        return TEXTURES[object.getLightStateIndex()];
    }

}