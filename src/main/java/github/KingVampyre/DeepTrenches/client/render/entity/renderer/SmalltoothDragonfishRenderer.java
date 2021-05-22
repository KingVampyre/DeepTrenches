package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.feature.SmalltoothDragonfishFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.SmalltoothDragonfishModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.SmalltoothDragonfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.SmalltoothDragonfishModel.MODEL;

public class SmalltoothDragonfishRenderer extends NoCullingEntityRenderer<SmalltoothDragonfishEntity> {

	private static final RenderLayer[] LAYERS = {
			CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/smalltooth_dragonfish/all_lit_layer.png"),
			CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/smalltooth_dragonfish/all_unlit_layer.png"),
			CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/smalltooth_dragonfish/flank_layer.png"),
			CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_lure_layer.png"),
			CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/smalltooth_dragonfish/flank_and_suborbital_layer.png"),
			CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/smalltooth_dragonfish/lure_layer.png"),
			CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital_layer.png"),
			CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/smalltooth_dragonfish/suborbital_and_lure_layer.png")
	};

	public SmalltoothDragonfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
	    super(entityRenderDispatcher, new SmalltoothDragonfishModel());

	    this.shadowRadius = 0.4F;
	    this.addLayer(new SmalltoothDragonfishFinsFeature(this, MODEL));
		this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
	}

	@Override
	protected void applyRotations(SmalltoothDragonfishEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

		matrixStackIn.translate(0.0F, 0.08F, 0.15F);
	}

}
