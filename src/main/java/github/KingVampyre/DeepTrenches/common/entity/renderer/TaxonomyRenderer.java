package github.KingVampyre.DeepTrenches.common.entity.renderer;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public class TaxonomyRenderer<T extends MobEntity, M extends EntityModel<T>> extends MobEntityRenderer<T, M> {

	public TaxonomyRenderer(EntityRenderDispatcher entityRenderDispatcher, M model, float shadow) {
		super(entityRenderDispatcher, model, shadow);
	}
	
	@Override
	public Identifier getTexture(T entity) {
		// TODO get texture from taxonomy component
		return null;
	}

}
