package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BettaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BettaModel extends AnimatedGeoModel<BettaEntity> {

    public static final Identifier[] TEXTURES = new Identifier[] {
            new Identifier("deep_trenches:textures/entity/betta/black_blue_betta.png"),
            new Identifier("deep_trenches:textures/entity/betta/blue_betta.png"),
            new Identifier("deep_trenches:textures/entity/betta/colorful_betta.png"),
            new Identifier("deep_trenches:textures/entity/betta/icarus.png"),
            new Identifier("deep_trenches:textures/entity/betta/icarus_junior.png"),
            new Identifier("deep_trenches:textures/entity/betta/icarus_the_third.png"),
            new Identifier("deep_trenches:textures/entity/betta/red_betta.png")
    };

    @Override
    public Identifier getAnimationFileLocation(BettaEntity animatable) {
        return new Identifier("deep_trenches:animations/betta.json");
    }

    @Override
    public Identifier getModelLocation(BettaEntity object) {
        return new Identifier("deep_trenches:geo/entity/betta.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BettaEntity object) {
        return TEXTURES[object.getBettaType()];
    }

    @Override
    public void setLivingAnimations(BettaEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);

        if (entity.isBaby()) {
            IBone root = this.getAnimationProcessor().getBone("root");

            if (root != null) {
                root.setScaleX(0.5F);
                root.setScaleY(0.5F);
                root.setScaleZ(0.5F);
            }

        }

    }

}