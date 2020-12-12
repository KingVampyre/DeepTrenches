package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.model.BlackScabbardModel;
import github.KingVampyre.DeepTrenches.core.entity.BlackScabbardEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BlackScabbardRenderer extends MobEntityRenderer<BlackScabbardEntity, BlackScabbardModel> {

    public static final Identifier TEXTURE = new Identifier("deep_trenches:textures/entity/black_scabbard.png");

    public BlackScabbardRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BlackScabbardModel(), 0.3F);
    }

    @Override
    public Identifier getTexture(BlackScabbardEntity entity) {
        return TEXTURE;
    }

}
