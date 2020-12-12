package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.ViperfishModel;
import github.KingVampyre.DeepTrenches.core.entity.ViperfishEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ViperfishRenderer extends MobEntityRenderer<ViperfishEntity, ViperfishModel> {

    public ViperfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ViperfishModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(ViperfishEntity entity) {
        return null;
    }

}
