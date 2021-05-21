package github.KingVampyre.DeepTrenches.client.render.entity.model;

import github.KingVampyre.DeepTrenches.core.entity.ViperfishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ViperfishModel extends AnimatedGeoModel<ViperfishEntity> {

    private static final Identifier[] PACIFIC_VIPERFISH = {
            new Identifier("deep_trenches:textures/entity/viperfish/pacific/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/pacific/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/pacific/flank.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/pacific/lure.png")
    };

    private static final Identifier[] SLOANES_VIPERFISH = {
            new Identifier("deep_trenches:textures/entity/viperfish/sloanes/all_lit.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/sloanes/all_unlit.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/sloanes/flank.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/sloanes/lure.png")
    };

    private static final Identifier[][] TEXTURES = {
            PACIFIC_VIPERFISH,
            SLOANES_VIPERFISH
    };

    @Override
    public Identifier getAnimationFileLocation(ViperfishEntity animatable) {
        return new Identifier("deep_trenches:animations/viperfish.json");
    }

    @Override
    public Identifier getModelLocation(ViperfishEntity object) {
        return new Identifier("deep_trenches:geo/entity/viperfish.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ViperfishEntity object) {
        int index = object.getLightStateIndex();
        int type = 0;
//      TODO int type = object.getViperfishType();

        return TEXTURES[type][index];
    }

}