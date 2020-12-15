package github.KingVampyre.DeepTrenches.common.render.entity.feature;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayers;
import github.KingVampyre.DeepTrenches.common.component.lit.LitComponent;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

import static github.KingVampyre.DeepTrenches.core.init.Components.LIT;
import static net.minecraft.util.registry.Registry.ENTITY_TYPE;

public class LitFeatureRenderer<T extends MobEntity, M extends EntityModel<T>> extends FeatureRenderer<T, M> {

	public LitFeatureRenderer(FeatureRendererContext<T, M> context) {
		super(context);
	}

	protected RenderLayer getLitLayer(T entityIn, LitComponent.State state) {
		Identifier texture = this.getLitTexture(entityIn, state);

		return CustomRenderLayers.getBrightTexture(texture);
	}

	protected Identifier getLitTexture(T entityIn, LitComponent.State state) {
		EntityType<?> type = entityIn.getType();
		Identifier id = ENTITY_TYPE.getId(type);

		return new Identifier(id.getNamespace() + ":textures/entity/" + id.getPath() + "/" + state + "_layer.png");
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
		LitComponent component = LIT.get(entity);
		LitComponent.State state = component.getState();

		if(state != LitComponent.State.ALL_UNLIT) {
			RenderLayer layer = this.getLitLayer(entity, state);
			VertexConsumer vertexConsumer = vertexConsumers.getBuffer(layer);

			this.getContextModel().render(matrices, vertexConsumer, 15728640, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
		}

	}

}
