package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.MaggotModel;
import github.KingVampyre.DeepTrenches.core.entity.MaggotEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MaggotRenderer extends MobEntityRenderer<MaggotEntity, MaggotModel> {

    public MaggotRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new MaggotModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(MaggotEntity entity) {
        return null;
    }

}
