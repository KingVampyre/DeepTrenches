package github.KingVampyre.DeepTrenches.client;

import github.KingVampyre.DeepTrenches.client.color.block.FoliageColorProvider;
import github.KingVampyre.DeepTrenches.client.color.block.MosoilColorProvider;
import github.KingVampyre.DeepTrenches.client.color.block.StorceanFoliageColorProvider;
import github.KingVampyre.DeepTrenches.client.event.client.DTColorCacheLoad;
import github.KingVampyre.DeepTrenches.client.event.client.DTSpriteRegistry;
import github.KingVampyre.DeepTrenches.client.init.DTColorMaps;
import github.KingVampyre.DeepTrenches.client.init.DTFluidRenderHandlers;
import github.KingVampyre.DeepTrenches.client.init.DTSprites;
import github.KingVampyre.DeepTrenches.client.particle.LeakParticle;
import github.KingVampyre.DeepTrenches.client.particle.MarineSnowParticle;
import github.KingVampyre.DeepTrenches.client.particle.StatusEffectParticle;
import github.KingVampyre.DeepTrenches.client.render.entity.renderer.*;
import github.KingVampyre.DeepTrenches.core.init.DTBlockEntityTypes;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import github.KingVampyre.DeepTrenches.core.init.DTEntityTypes;
import github.Louwind.Reload.client.event.client.callback.ColorCacheLoad;
import github.Louwind.Reload.client.resource.ColorMapReloadListener;
import github.Louwind.Reload.client.resource.sprite.BlockSpritesReloadListener;
import github.Louwind.entityutils.core.block.entity.render.FabricSignBlockEntityRenderer;
import github.Louwind.entityutils.core.entity.render.FabricBoatEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.client.render.RenderLayer;

import static github.KingVampyre.DeepTrenches.client.init.DTColorMaps.STORCEAN_FOLIAGE;
import static github.KingVampyre.DeepTrenches.client.init.DTTextures.*;
import static github.KingVampyre.DeepTrenches.core.init.DTFluids.*;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.*;
import static net.minecraft.resource.ResourceType.CLIENT_RESOURCES;
import static net.minecraft.screen.PlayerScreenHandler.BLOCK_ATLAS_TEXTURE;

public class DeepTrenchesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientSpriteRegistryCallback.event(BLOCK_ATLAS_TEXTURE).register(DTSpriteRegistry.INSTANCE);
        ColorCacheLoad.EVENT.register(DTColorCacheLoad.INSTANCE);

        ParticleFactoryRegistry.getInstance().register(ACID_DRIPLET, LeakParticle.AcidDripletFactory::new);
        ParticleFactoryRegistry.getInstance().register(ACID_DRIPPING, LeakParticle.AcidDrippingFactory::new);
        ParticleFactoryRegistry.getInstance().register(ACID_FALLING, LeakParticle.AcidFallingFactory::new);
        ParticleFactoryRegistry.getInstance().register(ACID_LANDING, LeakParticle.AcidLandingFactory::new);

        ParticleFactoryRegistry.getInstance().register(DRIPPING_COLORED_WATER, LeakParticle.ColoredWaterDrippingFactory::new);
        ParticleFactoryRegistry.getInstance().register(FALLING_COLORED_WATER, LeakParticle.ColoredWaterFallingFactory::new);
        ParticleFactoryRegistry.getInstance().register(SPLASHING_COLORED_WATER, LeakParticle.ColoredWaterSplashingFactory::new);

        ParticleFactoryRegistry.getInstance().register(AMBIENT_CORRODED_SKULL, StatusEffectParticle.EntityAmbientFactory::new);
        ParticleFactoryRegistry.getInstance().register(AMBIENT_NEAR_GASEOUS_ACID, StatusEffectParticle.EntityAmbientFactory::new);

        ParticleFactoryRegistry.getInstance().register(ENTITY_CORRODED_SKULL, StatusEffectParticle.EntityFactory::new);
        ParticleFactoryRegistry.getInstance().register(ENTITY_NEAR_GASEOUS_ACID, StatusEffectParticle.EntityFactory::new);

        ParticleFactoryRegistry.getInstance().register(MARINE_SNOW_BIG, MarineSnowParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(MARINE_SNOW_CHUNK, MarineSnowParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(MARINE_SNOW_SMALL, MarineSnowParticle.Factory::new);

        ParticleFactoryRegistry.getInstance().register(STORCEAN_MARINE_SNOW_BIG, MarineSnowParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(STORCEAN_MARINE_SNOW_CHUNK, MarineSnowParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(STORCEAN_MARINE_SNOW_SMALL, MarineSnowParticle.Factory::new);

        /* COLOR MAPS */
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:clear_water_colormap", CLEAR_WATER_COLORMAP, DTColorMaps.CLEAR_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_abyssopelagic_water_colormap", STORCEAN_ABYSSOPELAGIC_WATER_COLORMAP, DTColorMaps.STORCEAN_ABYSSOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_enderpelagic_water_colormap", STORCEAN_ENDERPELAGIC_WATER_COLORMAP, DTColorMaps.STORCEAN_ENDERPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_gasopelagic_water_colormap", STORCEAN_GASOPELAGIC_WATER_COLORMAP, DTColorMaps.STORCEAN_GASOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_hadopelagic_water_colormap", STORCEAN_HADOPELAGIC_WATER_COLORMAP, DTColorMaps.STORCEAN_HADOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_infinipelagic_water_colormap", STORCEAN_INFINIPELAGIC_WATER_COLORMAP, DTColorMaps.STORCEAN_INFINIPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_verdipelagic_water_colormap", STORCEAN_VIRDIPELAGIC_WATER_COLORMAP, DTColorMaps.STORCEAN_VIRDIPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_water_colormap", STORCEAN_WATER_COLORMAP, DTColorMaps.STORCEAN_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_foliage_colormap", STORCEAN_FOLIAGE_COLORMAP, DTColorMaps.STORCEAN_FOLIAGE));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_mosoil_colormap", STORCEAN_MOSOIL_COLORMAP, DTColorMaps.STORCEAN_MOSOIL));

        /* FLUID SPRITES */
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:abyssopelagic_water", DTSprites.ABYSSOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:acid", DTSprites.ACID));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:bathypelagic_water", DTSprites.BATHYPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:brine", DTSprites.BRINE));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:clear_water", DTSprites.CLEAR_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:hadopelagic_water", DTSprites.HADOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:mesopelagic_water", DTSprites.MESOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_abyssopelagic_water", DTSprites.STORCEAN_ABYSSOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_bathypelagic_water", DTSprites.STORCEAN_BATHYPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_enderpelagic_water", DTSprites.STORCEAN_ENDERPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_gasopelagic_water", DTSprites.STORCEAN_GASOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_hadopelagic_water", DTSprites.STORCEAN_HADOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_infinipelagic_water", DTSprites.STORCEAN_INFINIPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_mesopelagic_water", DTSprites.STORCEAN_MESOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_verdipelagic_water", DTSprites.STORCEAN_VIRDIPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_water", DTSprites.STORCEAN_WATER));

        /* FLUID SPRITES */
        FluidRenderHandlerRegistry.INSTANCE.register(ABYSSOPELAGIC_WATER, DTFluidRenderHandlers.ABYSSOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(ACID, DTFluidRenderHandlers.ACID);
        FluidRenderHandlerRegistry.INSTANCE.register(BATHYPELAGIC_WATER, DTFluidRenderHandlers.BATHYPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(BRINE, DTFluidRenderHandlers.BRINE);
        FluidRenderHandlerRegistry.INSTANCE.register(CLEAR_WATER, DTFluidRenderHandlers.CLEAR_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(HADOPELAGIC_WATER, DTFluidRenderHandlers.HADOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(MESOPELAGIC_WATER, DTFluidRenderHandlers.MESOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_ABYSSOPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_ABYSSOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_BATHYPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_BATHYPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_ENDERPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_ENDERPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_GASOPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_GASOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_HADOPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_HADOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_INFINIPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_INFINIPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_MESOPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_MESOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_VIRDIPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_VIRDIPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_WATER, DTFluidRenderHandlers.STORCEAN_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_ABYSSOPELAGIC_WATER, DTFluidRenderHandlers.ABYSSOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_ACID, DTFluidRenderHandlers.ACID);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_BATHYPELAGIC_WATER, DTFluidRenderHandlers.BATHYPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_BRINE, DTFluidRenderHandlers.BRINE);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_CLEAR_WATER, DTFluidRenderHandlers.CLEAR_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_HADOPELAGIC_WATER, DTFluidRenderHandlers.HADOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_MESOPELAGIC_WATER, DTFluidRenderHandlers.MESOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_ABYSSOPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_ABYSSOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_BATHYPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_BATHYPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_ENDERPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_ENDERPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_GASOPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_GASOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_HADOPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_HADOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_INFINIPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_INFINIPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_MESOPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_MESOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_VIRDIPELAGIC_WATER, DTFluidRenderHandlers.STORCEAN_VIRDIPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_WATER, DTFluidRenderHandlers.STORCEAN_WATER);

        /* BLOCK COLORS */
        ColorProviderRegistry.BLOCK.register(MosoilColorProvider.INSTANCE, DTBlocks.MOSOIL, DTBlocks.REEBLOON);
        ColorProviderRegistry.BLOCK.register(StorceanFoliageColorProvider.INSTANCE, DTBlocks.AQUEAN_LEAVES, DTBlocks.FRUCE_LEAVES, DTBlocks.SANGUART_LEAVES);
        ColorProviderRegistry.BLOCK.register(FoliageColorProvider.INSTANCE, DTBlocks.ALMOND_LEAVES, DTBlocks.ANGELS_TRUMPET_LEAVES, DTBlocks.BLACK_BIRCH_LEAVES, DTBlocks.BLUE_MAHOE_LEAVES, DTBlocks.BOTTLEBRUSH_LEAVES, DTBlocks.COOK_PINE_LEAVES, DTBlocks.DARK_RED_ELM_LEAVES, DTBlocks.EBONY_LEAVES, DTBlocks.GUAIACUM_LEAVES, DTBlocks.KLINKII_PINE_LEAVES, DTBlocks.MELALEUCA_LEAVES, DTBlocks.NORFOLK_PINE_LEAVES, DTBlocks.PELTOGYNE_LEAVES, DTBlocks.PLUM_LEAVES, DTBlocks.SEQUOIA_LEAVES, DTBlocks.WENGE_LEAVES);

        /* ITEM COLORS */
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> DTColorMaps.STORCEAN_MOSOIL.getDefaultColor(), DTBlocks.REEBLOON);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> DTColorMaps.STORCEAN_MOSOIL.getDefaultColor(), DTBlocks.MOSOIL);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> STORCEAN_FOLIAGE.getDefaultColor(), DTBlocks.AQUEAN_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 5614908, DTBlocks.ALMOND_LEAVES, DTBlocks.BLACK_BIRCH_LEAVES, DTBlocks.COOK_PINE_LEAVES, DTBlocks.EBONY_LEAVES, DTBlocks.PELTOGYNE_LEAVES, DTBlocks.PLUM_LEAVES, DTBlocks.TEAK_LEAVES);

        /* BLOCK ENTITY RENDERERS */
        BlockEntityRendererRegistry.register(DTBlockEntityTypes.SIGN, FabricSignBlockEntityRenderer::new);

        /* BLOCK RENDER LAYERS */
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_BLACKGREEN_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_BLACKGREEN_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLACKGREEN_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLACKGREEN_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLACKGREEN_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_BROCCOLI_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_BROCCOLI_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_BROCCOLI_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BROCCOLI_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BROCCOLI_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BROCCOLI_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_BUBBLEGUM_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_BUBBLEGUM_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_BUBBLEGUM_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BUBBLEGUM_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BUBBLEGUM_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BUBBLEGUM_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_CABBAGE_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_CABBAGE_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_CABBAGE_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CABBAGE_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CABBAGE_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CABBAGE_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_FLOWERTUBE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_FLOWERTUBE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_FLOWERTUBE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.FLOWERTUBE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.FLOWERTUBE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.FLOWERTUBE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_GARNET_SPIRAL_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_GARNET_SPIRAL_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_GARNET_SPIRAL_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GARNET_SPIRAL_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GARNET_SPIRAL_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GARNET_SPIRAL_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_GLOW_FOREST_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_GLOW_FOREST_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_GLOW_FOREST_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GLOW_FOREST_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GLOW_FOREST_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GLOW_FOREST_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_GLOWTONGUE_TUBE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_GLOWTONGUE_TUBE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GLOWTONGUE_TUBE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GLOWTONGUE_TUBE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GLOWTONGUE_TUBE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_IVORY_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_IVORY_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_IVORY_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.IVORY_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.IVORY_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.IVORY_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_LEKRAL_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_LEKRAL_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_LEKRAL_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LEKRAL_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LEKRAL_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LEKRAL_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_LIME_BRAIN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_LIME_BRAIN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_LIME_BRAIN_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LIME_BRAIN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LIME_BRAIN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LIME_BRAIN_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_LOPHELIA_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_LOPHELIA_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_LOPHELIA_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LOPHELIA_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LOPHELIA_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LOPHELIA_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_PIPE_ORGAN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_PIPE_ORGAN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_PIPE_ORGAN_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_PIPE_ORGAN_TENTACLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PIPE_ORGAN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PIPE_ORGAN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PIPE_ORGAN_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PIPE_ORGAN_TENTACLES, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_RED_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_RED_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_RED_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RED_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RED_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RED_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_SEAFAN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_SEAFAN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_SEAFAN_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SEAFAN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SEAFAN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SEAFAN_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_SKACUR_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_SKACUR_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_SKACUR_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SKACUR_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SKACUR_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SKACUR_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_STRAIGHT_WILLOW_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_STRAIGHT_WILLOW_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.STRAIGHT_WILLOW_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.STRAIGHT_WILLOW_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.STRAIGHT_WILLOW_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_SUNRISE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_SUNRISE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_SUNRISE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SUNRISE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SUNRISE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SUNRISE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_TABLE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_TABLE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_TABLE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TABLE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TABLE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TABLE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_THIN_BLADE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_THIN_BLADE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_THIN_BLADE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.THIN_BLADE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.THIN_BLADE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.THIN_BLADE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_TRUMPETEAR_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_TRUMPETEAR_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DEAD_TRUMPETEAR_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TRUMPETEAR_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TRUMPETEAR_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TRUMPETEAR_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLUE_MAHOE_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.MURKANTUAN_FLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BOTTLEBRUSH_FLOWERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GUAIACUM_FLOWERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.MELALEUCA_FLOWERS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.VYNHERT_LEAF, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.FLALM_THORNS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RHADI_THORNS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.VYNHERT_TENTACLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.VYNHERT_THORNS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.AIRIAL_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.HARSHLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.REEBLOON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SQUISH_TIPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SPROOM_SPIKE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLACK_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLACK_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLUE_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLUE_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BONNET_SPURGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BULLTHORN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CACTLOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CLAWBULB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CYAN_BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CYCAWLER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GARDEN_PINKS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GYLDELION_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LIME_SPURGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.LUPIN_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.MARSH_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.MURKSTEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.NATIVE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.OPIUM_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.ORANGE_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PIGAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PINK_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PINK_MARSH_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PINK_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PINK_ROSE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PURPROUND, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RED_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RED_CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RUBRA_BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SKALK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SPIKE_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SPRIDELION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SPRINLY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SWEET_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TOPPED_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TWISTTRAP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.VASLAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.VELVET_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.WEEPY_HOLLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.WHITE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.WILD_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.YELLOW_VIOLET, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.OBSCRUS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.ALMOND_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.ANAMEATA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.ANGELS_TRUMPET_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.AQUEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BARSHROOKLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLACK_BIRCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLUE_MAHOE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BLUE_SPRUCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BROMYA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.BUBBLETREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CALCEARB_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.COOK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DARK_CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DARK_FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.DARK_RED_ELM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.ENDERHEART_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.FRUCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.FUNERANITE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GHOSHROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GHOSHROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GUAIACUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.JOSHUA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.KLINKII_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.MELALEUCA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.MURKANTUAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.NORFOLK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.ORHPRIS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PELTOGYNE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PIN_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PURFUNGA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RED_ELM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.RHADI_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SANGUART_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SEQUOIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SPROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.STORTREEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.STROOMEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SUNRISE_FUNGUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.TEAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.THUNDERCLOUD_PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.VYNHERT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.WENGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.YEW_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.GRAY_SHAG_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.INKY_CAP_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.PUFFBALL_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.SHELF_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.WHITE_MUSHROOM, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_ALMOND_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_ANAMEATA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_ANGELS_TRUMPET_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_AQUEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BARSHROOKLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BLACK_BIRCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BLUE_MAHOE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BLUE_SPRUCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BOTTLEBRUSH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BROMYA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BUBBLETREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_CALCEARB_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_COOK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_DARK_CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_DARK_FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_DARK_RED_ELM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_ENDERHEART_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_FRUCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_FUGMOS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_FUNERANITE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_GHOSHROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_GUAIACUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_JOSHUA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_KLINKII_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_MELALEUCA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_MURKANTUAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_NORFOLK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_ORHPRIS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_PELTOGYNE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_PIN_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_PURFUNGA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_RARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_RED_ELM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_RHADI_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_SANGUART_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_SEQUOIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_SPROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_STORTREEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_STROOMEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_SUNRISE_FUNGUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_TARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_TEAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_THUNDERCLOUD_PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_VYNHERT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_WENGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_YEW_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BLACK_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BLUE_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BLUE_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_BONNET_SPURGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_CYAN_BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_CYCAWLER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_GARDEN_PINKS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_GYLDELION_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_LIMEFORK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_MARSH_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_NATIVE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_OPIUM_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_PINK_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_PINK_MARSH_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_PINK_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_PINK_ROSE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_SPIKE_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_RED_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_RED_CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_RED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_SPROOM_SPIKE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_SWEET_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_TOPPED_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_TWISTTRAP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_VASLAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_WEEPY_HOLLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_YELLOW_VIOLET, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_GRAY_SHAG_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_INKY_CAP_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_PUFFBALL_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_SHELF_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.POTTED_WHITE_MUSHROOM, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.FLINT_SHARDS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.AIRIAL_MOSS, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.ILMIUM, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(DTBlocks.MOSOIL, RenderLayer.getCutoutMipped());

        /* ------------------------------------------ FLUID RENDER LAYERS ----------------------------------------------------- */
        BlockRenderLayerMap.INSTANCE.putFluid(ABYSSOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_ABYSSOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(ACID, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_ACID, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(BATHYPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_BATHYPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(BRINE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_BRINE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(CLEAR_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_CLEAR_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(HADOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_HADOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(MESOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_MESOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_ABYSSOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_ABYSSOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_BATHYPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_BATHYPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_ENDERPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_ENDERPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_GASOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_GASOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_HADOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_HADOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_INFINIPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_INFINIPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_MESOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_MESOPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_VIRDIPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_VIRDIPELAGIC_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(STORCEAN_WATER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(FLOWING_STORCEAN_WATER, RenderLayer.getTranslucent());

        /* ------------------------------------------ ENTITY RENDERERS ----------------------------------------------------- */
        EntityRendererRegistry.register(DTEntityTypes.ADAIGGER, AdaiggerRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BEARDED_SEADEVIL, BeardedSeadevilRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BARBELED_LOOSEJAW, BarbeledLoosejawRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BOAT, FabricBoatEntityRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BETTA, BettaRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BLACK_DRAGONFISH, BlackDragonfishRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BLACK_SCABBARD, BlackScabbardRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BLACK_SEADEVIL, BlackSeadevilRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BLOBFISH, BlobfishRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BLUE_WHALE, BlueWhaleRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BOTTLE_FLY, BottleFlyRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BOTTLE_FLY_MAGGOT, BottleFlyMaggotRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BROWN_BEAR, BrownBearRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.CETACHSAL, CetachsalRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.DEEP_LAKE_BETTA, DeepLakeBettaRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.FANGTOOTH, FangtoothRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.FINANGITE, FinangiteRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.FLY, FlyRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.GIANT_HATCHETFISH, GiantHatchetfishRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.GIANT_SEED_SHRIMP, GiantSeedShrimpRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.HONEYCOMB_DRAGONFISH, HoneycombDragonfishRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.LACERATOR, LaceratorRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.LANCETFISH, LancetfishRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.BLACK_LOOSEJAW, BlackLoosejawRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.LIGHT_LOOSEJAW, LightLoosejawRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.MAGGOT, MaggotRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.PRINCE_AXELS_WONDERFISH, PrinceAxelsWonderfishRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.SMALLTOOTH_DRAGONFISH, SmalltoothDragonfishRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.STASP, StaspRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.TELESCOPEFISH, TelescopefishEntityRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.THREADFIN_DRAGONFISH, ThreadfinDragonfishRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.VIPERFISH, ViperfishRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.VOID_BEAST, VoidBeastRenderer::new);
        EntityRendererRegistry.register(DTEntityTypes.WOLFTRAP_SEADEVIL, WolftrapSeadevilRenderer::new);
    }

}
