package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FinangiteModel;
import github.KingVampyre.DeepTrenches.core.entity.FinangiteEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FinangiteRenderer extends MobEntityRenderer<FinangiteEntity, FinangiteModel> {

    public FinangiteRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FinangiteModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(FinangiteEntity entity) {
        return null;
    }

}
