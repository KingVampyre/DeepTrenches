package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.TelescopefishModel;
import github.KingVampyre.DeepTrenches.core.entity.TelescopefishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TelescopefishEntityRenderer extends MobEntityRenderer<TelescopefishEntity, TelescopefishModel> {

    public TelescopefishEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new TelescopefishModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(TelescopefishEntity entity) {
        return null;
    }

}
