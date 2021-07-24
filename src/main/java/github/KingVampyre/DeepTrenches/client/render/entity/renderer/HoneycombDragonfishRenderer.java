package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.HoneycombDragonfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.HoneycombDragonfishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class HoneycombDragonfishRenderer extends CullingEntityRenderer<HoneycombDragonfishEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/honeycomb_dragonfish/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/honeycomb_dragonfish/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/honeycomb_dragonfish/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/honeycomb_dragonfish/lure_layer.png")
    };

    public HoneycombDragonfishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HoneycombDragonfishModel());

        this.shadowRadius = 0.3F;
    }

}
