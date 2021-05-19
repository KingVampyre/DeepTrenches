package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.BlackLoosejawEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlackLoosejawModel extends AnimatedGeoModel<BlackLoosejawEntity> {

    private static final Identifier[] NORTHERN_BLACK_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/northern/suborbital_and_lure.png")
    };

    private static final Identifier[] SOUTHERN_BLACK_LOOSEJAW = {
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/flank_and_suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/lure.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/suborbital.png"),
            new Identifier("deep_trenches:textures/entity/black_loosejaw/southern/suborbital_and_lure.png")
    };

    @Override
    public Identifier getAnimationFileLocation(BlackLoosejawEntity animatable) {
        return new Identifier("deep_trenches:animations/black_loosejaw.json");
    }

    @Override
    public Identifier getModelLocation(BlackLoosejawEntity object) {
        return null;
    }

    @Override
    public Identifier getTextureLocation(BlackLoosejawEntity object) {
        int index = object.getLightStateIndex();

        switch (object.getLoosejawType()) {
            case 0:
                return NORTHERN_BLACK_LOOSEJAW[index];
            case 1:
                return SOUTHERN_BLACK_LOOSEJAW[index];
        }

        return null;
    }

}