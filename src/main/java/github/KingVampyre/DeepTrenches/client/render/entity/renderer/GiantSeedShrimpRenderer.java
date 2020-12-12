package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.GiantSeedShrimpModel;
import github.KingVampyre.DeepTrenches.core.entity.GiantSeedShrimpEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GiantSeedShrimpRenderer extends MobEntityRenderer<GiantSeedShrimpEntity, GiantSeedShrimpModel> {

    public GiantSeedShrimpRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new GiantSeedShrimpModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(GiantSeedShrimpEntity entity) {
        return null;
    }

}
