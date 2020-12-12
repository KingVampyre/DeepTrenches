package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BeardedSeadevilModel;
import github.KingVampyre.DeepTrenches.core.entity.BeardedSeadevilEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BeardedSeadevilRenderer extends MobEntityRenderer<BeardedSeadevilEntity, BeardedSeadevilModel> {

    public BeardedSeadevilRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BeardedSeadevilModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BeardedSeadevilEntity entity) {
        return null;
    }

}
