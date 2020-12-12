package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlobfishModel;
import github.KingVampyre.DeepTrenches.core.entity.BlobfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BlobfishRenderer extends MobEntityRenderer<BlobfishEntity, BlobfishModel> {

    public BlobfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlobfishModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BlobfishEntity entity) {
        return null;
    }

}
