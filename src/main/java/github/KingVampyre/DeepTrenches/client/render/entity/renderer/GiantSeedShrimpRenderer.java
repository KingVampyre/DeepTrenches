package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.GiantHatchetfishModel;
import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GiantSeedShrimpRenderer extends MobEntityRenderer<GiantHatchetfishEntity, GiantHatchetfishModel> {

    public GiantSeedShrimpRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new GiantHatchetfishModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(GiantHatchetfishEntity entity) {
        return null;
    }

}
