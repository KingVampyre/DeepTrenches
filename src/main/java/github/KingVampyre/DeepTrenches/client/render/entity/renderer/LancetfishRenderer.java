package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.LancetfishModel;
import github.KingVampyre.DeepTrenches.core.entity.LancetfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class LancetfishRenderer extends MobEntityRenderer<LancetfishEntity, LancetfishModel> {

    public LancetfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new LancetfishModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(LancetfishEntity entity) {
        return null;
    }

}
