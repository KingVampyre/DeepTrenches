package github.KingVampyre.DeepTrenches.common.render.entity.renderer;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

import static net.minecraft.util.registry.Registry.ENTITY_TYPE;

public class DragonfishRenderer<T extends MobEntity, M extends EntityModel<T>> extends MobEntityRenderer<T, M> {

	public DragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher, M model, float shadow) {
		super(entityRenderDispatcher, model, shadow);
	}

	@Override
	public Identifier getTexture(T entity) {
		EntityType<?> type = entity.getType();
		Identifier id = ENTITY_TYPE.getId(type);

		return new Identifier(id.getNamespace() + ":textures/entity/" + id.getPath() + "/all_unlit.png");
	}

}
