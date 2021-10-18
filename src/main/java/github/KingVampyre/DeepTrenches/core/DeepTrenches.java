package github.KingVampyre.DeepTrenches.core;

import github.KingVampyre.DeepTrenches.client.event.client.DTClientSpriteRegistry;
import github.KingVampyre.DeepTrenches.client.event.client.DTColorCacheLoad;
import github.KingVampyre.DeepTrenches.client.init.*;
import github.KingVampyre.DeepTrenches.common.event.block.BlockReplacementCallback;
import github.KingVampyre.DeepTrenches.core.event.block.AirialMossCallback;
import github.KingVampyre.DeepTrenches.core.event.block.IlmiumCallback;
import github.KingVampyre.DeepTrenches.core.event.entity.AllowSleepyStatusEffect;
import github.KingVampyre.DeepTrenches.core.init.*;
import github.Louwind.Reload.client.event.client.callback.ColorCacheLoad;
import github.Louwind.entityutils.core.block.entity.render.FabricSignBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import software.bernie.geckolib3.GeckoLib;

import static net.minecraft.screen.PlayerScreenHandler.BLOCK_ATLAS_TEXTURE;

public class  DeepTrenches implements ModInitializer, ClientModInitializer {

	@Override
    public void onInitialize() {
		/* THIRD PARTY LIBS */
		GeckoLib.initialize();
		/* GAME OBJECTS */
		DTBlocks.initialize();
		DTItems.initialize();
		DTFluids.initialize();
		DTBlockEntityTypes.initialize();
		DTEntityTypes.initialize();
		DTEnchantments.initialize();
		DTParticleTypes.initialize();
		DTFuelRegistry.initialize();
		/* WORLD GEN */
		DTFoliagePlacerTypes.initialize();
		DTTrunkPlacerTypes.initialize();
		DTTreeDecorators.initialize();
		DTConfiguredFeatures.initialize();
		DTBiomes.initialize();
		/* EVENTS */
		BlockReplacementCallback.EVENT.register(AirialMossCallback.INSTANCE);
		BlockReplacementCallback.EVENT.register(IlmiumCallback.INSTANCE);
		EntitySleepEvents.ALLOW_SLEEPING.register(AllowSleepyStatusEffect.INSTANCE);
    }

	@Override
	public void onInitializeClient() {
		/* LAYERING */
		DTBlockRenderLayers.initialize();
		DTFluidRenderLayers.initialize();
		/* COLORING */
		DTColorMaps.initialize();
		DTBlockColors.initialize();
		DTItemColors.initialize();
		/* TEXTURING */
		DTSpriteLoaders.initialize();
		/* FACTORIES */
		DTParticleFactories.initialize();
		/* RENDERING */
		DTEntityRenderers.initialize();
		DTFluidRenderHandlers.initialize();
		BlockEntityRendererRegistry.register(DTBlockEntityTypes.SIGN, FabricSignBlockEntityRenderer::new);
		/* EVENTS */
		ClientSpriteRegistryCallback.event(BLOCK_ATLAS_TEXTURE).register(DTClientSpriteRegistry.INSTANCE);
		ColorCacheLoad.EVENT.register(DTColorCacheLoad.INSTANCE);
	}

}