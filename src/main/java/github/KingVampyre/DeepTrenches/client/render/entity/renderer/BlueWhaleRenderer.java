package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlueWhaleModel;
import github.KingVampyre.DeepTrenches.core.entity.BlueWhaleEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BlueWhaleRenderer extends MobEntityRenderer<BlueWhaleEntity, BlueWhaleModel> {

    public static final Identifier TEXTURE = new Identifier("deep_trenches:textures/entity/blue_whale.png");

    public BlueWhaleRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlueWhaleModel(), 1F);
    }

    @Override
    public Identifier getTexture(BlueWhaleEntity entity) {
        return TEXTURE;
    }

}
