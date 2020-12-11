package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.entity.feature.StaspAntennasFeatureRenderer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.StaspModel;
import github.KingVampyre.DeepTrenches.core.component.StaspPollenComponent;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;

import static net.minecraft.util.registry.Registry.ENTITY_TYPE;

@Environment(EnvType.CLIENT)
public class StaspRenderer extends MobEntityRenderer<StaspEntity, StaspModel> {

	public StaspRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new StaspModel(), 0.35F);

		this.addFeature(new StaspAntennasFeatureRenderer(this));
	}

	@Override
	public Identifier getTexture(StaspEntity entity) {
		EntityType<?> entityType = entity.getType();
		Identifier id = ENTITY_TYPE.getId(entityType);

		StaspPollenComponent pollen = (StaspPollenComponent) Components.POLLEN.get(entity);

		String namespace = id.getNamespace();
		String path = id.getPath();

		if(entity.hasAngerTime()) {

			if(pollen.hasAqueanSap())
				return new Identifier(namespace + ":textures/entity/" + path + "/angry/with_aquean_sap.png");

			if(pollen.hasPollen())
				return new Identifier(namespace + ":textures/entity/" + path + "/angry/with_pollen.png");

			return new Identifier(namespace + ":textures/entity/" + path + "/angry/" + path + ".png");
		}

		if(pollen.hasAqueanSap())
			return new Identifier(namespace + ":textures/entity/" + path + "/with_aquean_sap.png");

		if(pollen.hasPollen())
			return new Identifier(namespace + ":textures/entity/" + path + "/with_pollen.png");

		return new Identifier(namespace + ":textures/entity/" + path + "/" + path + ".png");
	}

	@Override
	protected void setupTransforms(StaspEntity entity, MatrixStack matrices, float animationProgress, float bodyYaw, float tickDelta) {
		super.setupTransforms(entity, matrices, animationProgress, bodyYaw, tickDelta);

		matrices.translate(-0.1F, -1F, -0.2F);
	}

}
