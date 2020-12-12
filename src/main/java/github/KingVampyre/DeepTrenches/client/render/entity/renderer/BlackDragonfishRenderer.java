package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackDragonfishModel;
import github.KingVampyre.DeepTrenches.core.entity.BlackDragonfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BlackDragonfishRenderer extends MobEntityRenderer<BlackDragonfishEntity, BlackDragonfishModel> {

    public BlackDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackDragonfishModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BlackDragonfishEntity entity) {
        return null;
    }

}
