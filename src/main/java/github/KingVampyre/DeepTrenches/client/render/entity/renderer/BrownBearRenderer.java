package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BrownBearModel;
import github.KingVampyre.DeepTrenches.core.entity.BrownBearEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BrownBearRenderer extends MobEntityRenderer<BrownBearEntity, BrownBearModel> {

    public BrownBearRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BrownBearModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BrownBearEntity entity) {
        return null;
    }

}
