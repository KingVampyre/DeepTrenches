package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackDragonfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BlackDragonfishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class BlackDragonfishRenderer extends CullingEntityRenderer<BlackDragonfishEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/black_dragonfish/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_dragonfish/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_dragonfish/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/black_dragonfish/lure_layer.png")
    };

    public BlackDragonfishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BlackDragonfishModel());

        this.shadowRadius = 0.3F;
    }

}
