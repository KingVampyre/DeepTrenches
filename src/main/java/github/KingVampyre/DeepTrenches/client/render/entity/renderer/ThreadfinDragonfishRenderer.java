package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.ThreadfinDragonfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.ThreadfinDragonfishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class ThreadfinDragonfishRenderer extends CullingEntityRenderer<ThreadfinDragonfishEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/threadfin_dragonfish/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/threadfin_dragonfish/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/threadfin_dragonfish/flank_layer.png"),
            new Identifier("deep_trenches:textures/entity/threadfin_dragonfish/lure_layer.png")
    };

    public ThreadfinDragonfishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ThreadfinDragonfishModel());

        this.shadowRadius = 0.3F;
    }

}
