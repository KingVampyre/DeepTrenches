package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DeepLakeBettaModel extends AnimatedGeoModel<DeepLakeBettaEntity> {

    public static final Identifier MODEL = new Identifier("deep_trenches:geo/entity/deep_lake_betta.geo.json");

    private static final Identifier[] LIT_TEXTURES = {
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/body.png"),
            new Identifier("deep_trenches:textures/entity/deep_lake_betta/lure.png")
    };

    private static final Identifier UNLIT_TEXTURE = new Identifier("deep_trenches:textures/entity/deep_lake_betta/all_unlit.png");

    @Override
    public Identifier getAnimationFileLocation(DeepLakeBettaEntity animatable) {
        return new Identifier("deep_trenches:animations/deep_lake_betta.json");
    }

    @Override
    public Identifier getModelLocation(DeepLakeBettaEntity object) {
        return MODEL;
    }

    @Override
    public Identifier getTextureLocation(DeepLakeBettaEntity object) {
        return object.isLit() ? LIT_TEXTURES[object.getLightStateIndex()] : UNLIT_TEXTURE;
    }

}