package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.FangtoothModel;
import github.KingVampyre.DeepTrenches.core.entity.FangtoothEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FangtoothRenderer extends MobEntityRenderer<FangtoothEntity, FangtoothModel> {

    public static final Identifier TEXTURE = new Identifier("deep_trenches:textures/entity/fangtooth.png");

    public FangtoothRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FangtoothModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(FangtoothEntity entity) {
        return TEXTURE;
    }

}
