package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FlyModel;
import github.KingVampyre.DeepTrenches.core.entity.FlyEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FlyRenderer extends MobEntityRenderer<FlyEntity, FlyModel> {

    public FlyRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FlyModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(FlyEntity entity) {
        return null;
    }

}
