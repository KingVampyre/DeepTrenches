package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.ViperfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.ViperfishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class ViperfishRenderer extends CullingEntityRenderer<ViperfishEntity> {

    private static final Identifier[] PACIFIC_VIPERFISH = {
            new Identifier("deep_trenches:textures/entity/viperfish/pacific/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/pacific/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/pacific/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/pacific/lure_layer.png")
    };

    private static final Identifier[] SLOANES_VIPERFISH = {
            new Identifier("deep_trenches:textures/entity/viperfish/sloanes/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/sloanes/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/sloanes/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/viperfish/sloanes/lure_layer.png")
    };

    private static final Identifier[][] TEXTURES = {
            PACIFIC_VIPERFISH,
            SLOANES_VIPERFISH
    };
    
    public ViperfishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ViperfishModel());

        this.shadowRadius = 0.3F;
    }

}
