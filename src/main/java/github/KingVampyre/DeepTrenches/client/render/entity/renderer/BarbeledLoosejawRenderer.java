package github.KingVampyre.DeepTrenches.client.render.entity.renderer;

import github.KingVampyre.DeepTrenches.client.render.CustomRenderLayer;
import github.KingVampyre.DeepTrenches.client.render.entity.feature.BarbeledLoosejawFinsFeature;
import github.KingVampyre.DeepTrenches.client.render.entity.model.BarbeledLoosejawModel;
import github.KingVampyre.DeepTrenches.common.render.entity.feature.LuminousVariantLayerFeature;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.NoCullingEntityRenderer;
import github.KingVampyre.DeepTrenches.core.entity.BarbeledLoosejawEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import static github.KingVampyre.DeepTrenches.client.render.entity.model.BarbeledLoosejawModel.MODEL;

public class BarbeledLoosejawRenderer extends NoCullingEntityRenderer<BarbeledLoosejawEntity> {

	private static final RenderLayer[] ATLANTIC_BARBELED_LOOSEJAW = {
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/all_lit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/all_unlit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_and_lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/flank_and_suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/atlantic/suborbital_and_lure_layer.png"))
	};

	private static final RenderLayer[] GLOWING_BARBELED_LOOSEJAW = {
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/all_lit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/all_unlit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_and_lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/flank_and_suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/glowing/suborbital_and_lure_layer.png"))
	};

	private static final RenderLayer[] GRIMALDIS_BARBELED_LOOSEJAW = {
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/all_lit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/all_unlit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_and_lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/flank_and_suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/grimaldis/suborbital_and_lure_layer.png"))
	};

	private static final RenderLayer[] MANY_RAYED_BARBELED_LOOSEJAW = {
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/all_lit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/all_unlit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_and_lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/flank_and_suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/many_rayed/suborbital_and_lure_layer.png"))
	};

	private static final RenderLayer[] SHINY_BARBELED_LOOSEJAW = {
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/all_lit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/all_unlit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_and_lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/flank_and_suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/shiny/suborbital_and_lure_layer.png"))
	};

	private static final RenderLayer[] TITTMANNS_BARBELED_LOOSEJAW = {
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/all_lit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/all_unlit_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_and_lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/flank_and_suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/lure_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/suborbital_layer.png")),
			CustomRenderLayer.getBrightOverlayTexture(new Identifier("deep_trenches:textures/entity/barbeled_loosejaw/tittmanns/suborbital_and_lure_layer.png"))
	};

	private static final RenderLayer[][] LAYERS = {
			ATLANTIC_BARBELED_LOOSEJAW,
			GLOWING_BARBELED_LOOSEJAW,
			GRIMALDIS_BARBELED_LOOSEJAW,
			MANY_RAYED_BARBELED_LOOSEJAW,
			SHINY_BARBELED_LOOSEJAW,
			TITTMANNS_BARBELED_LOOSEJAW
	};

	public BarbeledLoosejawRenderer(EntityRendererFactory.Context ctx) {
	    super(ctx, new BarbeledLoosejawModel());

	    this.shadowRadius = 0.4F;
	    this.addLayer(new BarbeledLoosejawFinsFeature(this));
		this.addLayer(new LuminousVariantLayerFeature<>(this, MODEL, LAYERS));
	}

	@Override
	protected void applyRotations(BarbeledLoosejawEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

		if(entityLiving.isBaby())
			matrixStackIn.translate(0, -0.6F, 0);
		else
			matrixStackIn.translate(0, -0.08F, 0.15F);
	}

}
