package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.ThreadfinDragonfishModel;
import github.KingVampyre.DeepTrenches.core.entity.ThreadfinDragonfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ThreadfinDragonfishRenderer extends MobEntityRenderer<ThreadfinDragonfishEntity, ThreadfinDragonfishModel> {

    public ThreadfinDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ThreadfinDragonfishModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(ThreadfinDragonfishEntity entity) {
        return null;
    }

}
