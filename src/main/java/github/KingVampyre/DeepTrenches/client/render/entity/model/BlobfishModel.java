package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlobfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlobfishModel extends AnimatedGeoModel<BlobfishEntity> {

    @Override
    public Identifier getAnimationFileLocation(BlobfishEntity animatable) {
        return new Identifier("deep_trenches:animations/blobfish.json");
    }

    @Override
    public Identifier getModelLocation(BlobfishEntity object) {
        return new Identifier("deep_trenches:geo/entity/blobfish.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BlobfishEntity object) {
        return new Identifier("deep_trenches:textures/entity/blobfish.png");
    }

}