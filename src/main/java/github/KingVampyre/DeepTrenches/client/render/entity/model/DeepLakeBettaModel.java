package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.DeepLakeBettaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DeepLakeBettaModel extends AnimatedGeoModel<DeepLakeBettaEntity> {

    @Override
    public Identifier getAnimationFileLocation(DeepLakeBettaEntity animatable) {
        return new Identifier("deep_trenches:animations/deep_lake_betta.json");
    }

    @Override
    public Identifier getModelLocation(DeepLakeBettaEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(DeepLakeBettaEntity object) {
        return new Identifier("deep_trenches:textures/entity/deep_lake_betta/all_lit.png");
    }

}