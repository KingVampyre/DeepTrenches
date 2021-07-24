package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FinangiteModel;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.CullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.FinangiteEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class FinangiteRenderer extends CullingEntityRenderer<FinangiteEntity> {

    private static final Identifier[] TEXTURES = {
            new Identifier("deep_trenches:textures/entity/finangite/all_lit_layer.png"),
            new Identifier("deep_trenches:textures/entity/finangite/all_unlit_layer.png"),
            new Identifier("deep_trenches:textures/entity/finangite/back_layer.png"),
            new Identifier("deep_trenches:textures/entity/finangite/back_pectoral_fin_front_layer.png"),
            new Identifier("deep_trenches:textures/entity/finangite/back_pectoral_fin_rear_layer.png"),
            new Identifier("deep_trenches:textures/entity/finangite/pectoral_fin_layer.png"),
            new Identifier("deep_trenches:textures/entity/finangite/pectoral_fin_front_layer.png"),
            new Identifier("deep_trenches:textures/entity/finangite/pectoral_fin_rear_layer.png")
    };

    public FinangiteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new FinangiteModel());

        this.shadowRadius = 0.3F;
    }

}
