package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BottleFlyEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BottleFlyModel extends AnimatedGeoModel<BottleFlyEntity> {

    public static final Identifier[] TEXTURES = new Identifier[] {
            new Identifier("deep_trenches:textures/entity/bottle_fly/blue_bottle_fly.png"),
            new Identifier("deep_trenches:textures/entity/bottle_fly/common_blue_bottle_fly.png"),
            new Identifier("deep_trenches:textures/entity/bottle_fly/common_green_bottle_fly.png"),
            new Identifier("deep_trenches:textures/entity/bottle_fly/golden_bottle_fly.png"),
            new Identifier("deep_trenches:textures/entity/bottle_fly/green_bottle_fly.png"),
            new Identifier("deep_trenches:textures/entity/bottle_fly/old_bottle_fly.png"),
            new Identifier("deep_trenches:textures/entity/bottle_fly/purple_bottle_fly.png"),
            new Identifier("deep_trenches:textures/entity/bottle_fly/red_bottle_fly.png"),
            new Identifier("deep_trenches:textures/entity/bottle_fly/silver_bottle_fly.png")
    };

    @Override
    public Identifier getAnimationFileLocation(BottleFlyEntity animatable) {
        return new Identifier("deep_trenches:animations/bottle_fly.json");
    }

    @Override
    public Identifier getModelLocation(BottleFlyEntity object) {
        return new Identifier("deep_trenches:animations/bottle_fly.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BottleFlyEntity object) {
        return TEXTURES[object.getVariant()];
    }

}