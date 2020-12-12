package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.HoneycombDragonfishModel;
import github.KingVampyre.DeepTrenches.core.entity.HoneycombDragonfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class HoneycombDragonfishRenderer extends MobEntityRenderer<HoneycombDragonfishEntity, HoneycombDragonfishModel> {

    public HoneycombDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new HoneycombDragonfishModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(HoneycombDragonfishEntity entity) {
        return null;
    }

}
