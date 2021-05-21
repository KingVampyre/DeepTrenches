package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.model.GiantHatchetfishModel;
import github.KingVampyre.DeepTrenches.common.entity.ai.mob.LightState;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.GiantHatchetfishEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;

import java.util.Map;
import java.util.Objects;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.GiantHatchetfishModel.MODEL;
import static github.KingVampyre.DeepTrenches.core.init.LightStates.ALL_LIT;

public class GiantHatchetfishRenderer extends NoCullingEntityRenderer<GiantHatchetfishEntity> {

	private static final Map<LightState, RenderLayer> LAYERS = ImmutableMap.of(ALL_LIT, Objects.requireNonNull(CustomRenderLayer.getBrightOverlayTexture("deep_trenches:textures/entity/deep_lake_betta/all_lit_layer.png")));

	public GiantHatchetfishRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new GiantHatchetfishModel());

		this.shadowRadius = 0.3F;
		this.addLayer(new LuminousLayerFeature<>(this, MODEL, LAYERS));
	}

	@Override
	public void render(GiantHatchetfishEntity entity, float entityYaw, float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn, int packedLightIn) {
		super.render(entity, entityYaw, partialTicks, stack, bufferIn, packedLightIn);

		stack.translate(0.0F, 0.0F, 0.15F);
	}

}
