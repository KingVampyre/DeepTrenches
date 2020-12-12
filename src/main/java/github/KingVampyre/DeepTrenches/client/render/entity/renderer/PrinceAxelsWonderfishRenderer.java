package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.PrinceAxelsWonderfishModel;
import github.KingVampyre.DeepTrenches.core.entity.PrinceAxelsWonderfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class PrinceAxelsWonderfishRenderer extends MobEntityRenderer<PrinceAxelsWonderfishEntity, PrinceAxelsWonderfishModel> {

    public PrinceAxelsWonderfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new PrinceAxelsWonderfishModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(PrinceAxelsWonderfishEntity entity) {
        return null;
    }

}
