package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.WolftrapSeadevilModel;
import github.KingVampyre.DeepTrenches.core.entity.WolftrapSeadevilEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class WolftrapSeadevilRenderer extends MobEntityRenderer<WolftrapSeadevilEntity, WolftrapSeadevilModel> {

    public WolftrapSeadevilRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new WolftrapSeadevilModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(WolftrapSeadevilEntity entity) {
        return null;
    }

}
