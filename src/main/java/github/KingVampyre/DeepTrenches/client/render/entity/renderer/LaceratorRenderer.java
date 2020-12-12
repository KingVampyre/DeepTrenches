package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.LaceratorModel;
import github.KingVampyre.DeepTrenches.core.entity.LaceratorEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class LaceratorRenderer extends MobEntityRenderer<LaceratorEntity, LaceratorModel> {

    public LaceratorRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LaceratorModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(LaceratorEntity entity) {
        return null;
    }

}
