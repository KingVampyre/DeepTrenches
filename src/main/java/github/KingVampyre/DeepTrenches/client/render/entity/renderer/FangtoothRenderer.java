package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FangtoothModel;
import github.KingVampyre.DeepTrenches.core.entity.FangtoothEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FangtoothRenderer extends MobEntityRenderer<FangtoothEntity, FangtoothModel> {

    public FangtoothRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FangtoothModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(FangtoothEntity entity) {
        return null;
    }

}
