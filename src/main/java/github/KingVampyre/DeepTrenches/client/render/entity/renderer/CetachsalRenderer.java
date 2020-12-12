package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.CetachsalModel;
import github.KingVampyre.DeepTrenches.core.entity.CetachsalEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CetachsalRenderer extends MobEntityRenderer<CetachsalEntity, CetachsalModel> {

    public CetachsalRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CetachsalModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(CetachsalEntity entity) {
        return null;
    }

}
