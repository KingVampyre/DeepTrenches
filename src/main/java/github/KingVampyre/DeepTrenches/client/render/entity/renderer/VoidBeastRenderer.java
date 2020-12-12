package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.VoidBeastModel;
import github.KingVampyre.DeepTrenches.core.entity.VoidBeastEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class VoidBeastRenderer extends MobEntityRenderer<VoidBeastEntity, VoidBeastModel> {

    public VoidBeastRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new VoidBeastModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(VoidBeastEntity entity) {
        return null;
    }

}
