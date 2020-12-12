package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackSeadevilModel;
import github.KingVampyre.DeepTrenches.core.entity.BlackSeadevilEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BlackSeadevilRenderer extends MobEntityRenderer<BlackSeadevilEntity, BlackSeadevilModel> {

    public BlackSeadevilRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackSeadevilModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BlackSeadevilEntity entity) {
        return null;
    }

}
