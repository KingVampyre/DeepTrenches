package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BottleFlyModel;
import github.KingVampyre.DeepTrenches.core.entity.BottleFlyEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BottleFlyRenderer extends MobEntityRenderer<BottleFlyEntity, BottleFlyModel> {

    public BottleFlyRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BottleFlyModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BottleFlyEntity entity) {
        return null;
    }

}
