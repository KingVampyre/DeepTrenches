package github.KingVampyre.DeepTrenches.common.entity.renderer;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

import static net.minecraft.util.registry.Registry.*;

public class MobRenderer<T extends MobEntity, M extends EntityModel<T>> extends MobEntityRenderer<T, M> {

	public MobRenderer(EntityRenderDispatcher entityRenderDispatcher, M model, float shadow) {
		super(entityRenderDispatcher, model, shadow);
	}
	
	@Override
	public Identifier getTexture(T entity) {
		EntityType<?> entityType = entity.getType();
		Identifier id = ENTITY_TYPE.getId(entityType);

		return this.getTexture(entity, entityType, id);
	}

	public Identifier getTexture(T entity, EntityType<?> entityType, Identifier id) {
		return new Identifier(id.getNamespace() + ":textures/entity/" + id.getPath() + ".png");
	}

}
