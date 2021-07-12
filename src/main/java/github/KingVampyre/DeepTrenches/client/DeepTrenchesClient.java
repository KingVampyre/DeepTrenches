package github.KingVampyre.DeepTrenches.client;

import github.KingVampyre.DeepTrenches.client.color.block.FoliageColorProvider;
import github.KingVampyre.DeepTrenches.client.color.block.MosoilColorProvider;
import github.KingVampyre.DeepTrenches.client.color.block.StorceanFoliageColorProvider;
import github.KingVampyre.DeepTrenches.client.init.ColorMaps;
import github.KingVampyre.DeepTrenches.client.init.FluidRenderHandlers;
import github.KingVampyre.DeepTrenches.client.init.Sprites;
import github.KingVampyre.DeepTrenches.client.particle.LeakParticle;
import github.KingVampyre.DeepTrenches.client.particle.MarineSnowParticle;
import github.KingVampyre.DeepTrenches.client.particle.StatusEffectParticle;
import github.KingVampyre.DeepTrenches.client.render.entity.renderer.*;
import github.KingVampyre.DeepTrenches.core.init.BlockEntityTypes;
import github.KingVampyre.DeepTrenches.core.init.EntityTypes;
import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
import github.Louwind.Reload.client.resource.ColorMapReloadListener;
import github.Louwind.Reload.client.resource.sprite.BlockSpritesReloadListener;
import github.Louwind.entityutils.core.block.entity.render.FabricSignBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.world.BiomeColorCache;

import static github.KingVampyre.DeepTrenches.client.init.ColorMaps.STORCEAN_FOLIAGE;
import static github.KingVampyre.DeepTrenches.client.init.Textures.*;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.*;
import static github.KingVampyre.DeepTrenches.core.init.ParticleTypes.*;
import static net.minecraft.resource.ResourceType.CLIENT_RESOURCES;
import static net.minecraft.screen.PlayerScreenHandler.BLOCK_ATLAS_TEXTURE;

public class DeepTrenchesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
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

        /* ------------------------------------------ COLOR MAPS ----------------------------------------------------- */
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:clear_water_colormap", CLEAR_WATER_COLORMAP, ColorMaps.CLEAR_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_abyssopelagic_water_colormap", STORCEAN_ABYSSOPELAGIC_WATER_COLORMAP, ColorMaps.STORCEAN_ABYSSOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_enderpelagic_water_colormap", STORCEAN_ENDERPELAGIC_WATER_COLORMAP, ColorMaps.STORCEAN_ENDERPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_gasopelagic_water_colormap", STORCEAN_GASOPELAGIC_WATER_COLORMAP, ColorMaps.STORCEAN_GASOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_hadopelagic_water_colormap", STORCEAN_HADOPELAGIC_WATER_COLORMAP, ColorMaps.STORCEAN_HADOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_infinipelagic_water_colormap", STORCEAN_INFINIPELAGIC_WATER_COLORMAP, ColorMaps.STORCEAN_INFINIPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_verdipelagic_water_colormap", STORCEAN_VIRDIPELAGIC_WATER_COLORMAP, ColorMaps.STORCEAN_VIRDIPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_water_colormap", STORCEAN_WATER_COLORMAP, ColorMaps.STORCEAN_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_foliage_colormap", STORCEAN_FOLIAGE_COLORMAP, ColorMaps.STORCEAN_FOLIAGE));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new ColorMapReloadListener("deep_trenches:storcean_mosoil_colormap", STORCEAN_MOSOIL_COLORMAP, ColorMaps.STORCEAN_MOSOIL));

        /* ------------------------------------------ FLUID SPRITES ----------------------------------------------------- */
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:abyssopelagic_water", Sprites.ABYSSOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:acid", Sprites.ACID));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:bathypelagic_water", Sprites.BATHYPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:brine", Sprites.BRINE));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:clear_water", Sprites.CLEAR_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:hadopelagic_water", Sprites.HADOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:mesopelagic_water", Sprites.MESOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_abyssopelagic_water", Sprites.STORCEAN_ABYSSOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_bathypelagic_water", Sprites.STORCEAN_BATHYPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_enderpelagic_water", Sprites.STORCEAN_ENDERPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_gasopelagic_water", Sprites.STORCEAN_GASOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_hadopelagic_water", Sprites.STORCEAN_HADOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_infinipelagic_water", Sprites.STORCEAN_INFINIPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_mesopelagic_water", Sprites.STORCEAN_MESOPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_verdipelagic_water", Sprites.STORCEAN_VIRDIPELAGIC_WATER));
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(new BlockSpritesReloadListener("deep_trenches:storcean_water", Sprites.STORCEAN_WATER));

        /* ------------------------------------------ FLUID SPRITES ----------------------------------------------------- */
        FluidRenderHandlerRegistry.INSTANCE.register(ABYSSOPELAGIC_WATER, FluidRenderHandlers.ABYSSOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(ACID, FluidRenderHandlers.ACID);
        FluidRenderHandlerRegistry.INSTANCE.register(BATHYPELAGIC_WATER, FluidRenderHandlers.BATHYPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(BRINE, FluidRenderHandlers.BRINE);
        FluidRenderHandlerRegistry.INSTANCE.register(CLEAR_WATER, FluidRenderHandlers.CLEAR_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(HADOPELAGIC_WATER, FluidRenderHandlers.HADOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(MESOPELAGIC_WATER, FluidRenderHandlers.MESOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_ABYSSOPELAGIC_WATER, FluidRenderHandlers.STORCEAN_ABYSSOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_BATHYPELAGIC_WATER, FluidRenderHandlers.STORCEAN_BATHYPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_ENDERPELAGIC_WATER, FluidRenderHandlers.STORCEAN_ENDERPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_GASOPELAGIC_WATER, FluidRenderHandlers.STORCEAN_GASOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_HADOPELAGIC_WATER, FluidRenderHandlers.STORCEAN_HADOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_INFINIPELAGIC_WATER, FluidRenderHandlers.STORCEAN_INFINIPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_MESOPELAGIC_WATER, FluidRenderHandlers.STORCEAN_MESOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_VIRDIPELAGIC_WATER, FluidRenderHandlers.STORCEAN_VIRDIPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(STORCEAN_WATER, FluidRenderHandlers.STORCEAN_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_ABYSSOPELAGIC_WATER, FluidRenderHandlers.ABYSSOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_ACID, FluidRenderHandlers.ACID);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_BATHYPELAGIC_WATER, FluidRenderHandlers.BATHYPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_BRINE, FluidRenderHandlers.BRINE);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_CLEAR_WATER, FluidRenderHandlers.CLEAR_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_HADOPELAGIC_WATER, FluidRenderHandlers.HADOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_MESOPELAGIC_WATER, FluidRenderHandlers.MESOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_ABYSSOPELAGIC_WATER, FluidRenderHandlers.STORCEAN_ABYSSOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_BATHYPELAGIC_WATER, FluidRenderHandlers.STORCEAN_BATHYPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_ENDERPELAGIC_WATER, FluidRenderHandlers.STORCEAN_ENDERPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_GASOPELAGIC_WATER, FluidRenderHandlers.STORCEAN_GASOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_HADOPELAGIC_WATER, FluidRenderHandlers.STORCEAN_HADOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_INFINIPELAGIC_WATER, FluidRenderHandlers.STORCEAN_INFINIPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_MESOPELAGIC_WATER, FluidRenderHandlers.STORCEAN_MESOPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_VIRDIPELAGIC_WATER, FluidRenderHandlers.STORCEAN_VIRDIPELAGIC_WATER);
        FluidRenderHandlerRegistry.INSTANCE.register(FLOWING_STORCEAN_WATER, FluidRenderHandlers.STORCEAN_WATER);

        /* ------------------------------------------ TEXTURE ATLAS ----------------------------------------------------- */
        ClientSpriteRegistryCallback.event(BLOCK_ATLAS_TEXTURE).register((atlas, registry) -> {
            registry.register(ABYSSOPELAGIC_WATER_FLOW);
            registry.register(ABYSSOPELAGIC_WATER_STILL);
            registry.register(ACID_FLOW);
            registry.register(ACID_STILL);
            registry.register(BATHYPELAGIC_WATER_FLOW);
            registry.register(BATHYPELAGIC_WATER_STILL);
            registry.register(BRINE_FLOW);
            registry.register(BRINE_STILL);
            registry.register(CLEAR_WATER_FLOW);
            registry.register(CLEAR_WATER_STILL);
            registry.register(HADOPELAGIC_WATER_FLOW);
            registry.register(HADOPELAGIC_WATER_STILL);
            registry.register(MESOPELAGIC_WATER_FLOW);
            registry.register(MESOPELAGIC_WATER_STILL);
            registry.register(STORCEAN_ABYSSOPELAGIC_WATER_FLOW);
            registry.register(STORCEAN_ABYSSOPELAGIC_WATER_STILL);
            registry.register(STORCEAN_BATHYPELAGIC_WATER_FLOW);
            registry.register(STORCEAN_BATHYPELAGIC_WATER_STILL);
            registry.register(STORCEAN_ENDERPELAGIC_WATER_FLOW);
            registry.register(STORCEAN_ENDERPELAGIC_WATER_STILL);
            registry.register(STORCEAN_GASOPELAGIC_WATER_FLOW);
            registry.register(STORCEAN_GASOPELAGIC_WATER_STILL);
            registry.register(STORCEAN_HADOPELAGIC_WATER_FLOW);
            registry.register(STORCEAN_HADOPELAGIC_WATER_STILL);
            registry.register(STORCEAN_INFINIPELAGIC_WATER_FLOW);
            registry.register(STORCEAN_INFINIPELAGIC_WATER_STILL);
            registry.register(STORCEAN_MESOPELAGIC_WATER_FLOW);
            registry.register(STORCEAN_MESOPELAGIC_WATER_STILL);
            registry.register(STORCEAN_VIRDIPELAGIC_WATER_FLOW);
            registry.register(STORCEAN_VIRDIPELAGIC_WATER_STILL);
            registry.register(STORCEAN_WATER_FLOW);
            registry.register(STORCEAN_WATER_STILL);
        });

        /* ------------------------------------------ BLOCK COLORS ----------------------------------------------------- */
        ColorProviderRegistry.BLOCK.register(MosoilColorProvider.INSTANCE, ModBlocks.MOSOIL, ModBlocks.REEBLOON);
        ColorProviderRegistry.BLOCK.register(StorceanFoliageColorProvider.INSTANCE, ModBlocks.AQUEAN_LEAVES, ModBlocks.FRUCE_LEAVES, ModBlocks.SANGUART_LEAVES);
        ColorProviderRegistry.BLOCK.register(FoliageColorProvider.INSTANCE, ModBlocks.ALMOND_LEAVES, ModBlocks.ANGELS_TRUMPET_LEAVES, ModBlocks.BLACK_BIRCH_LEAVES, ModBlocks.BLUE_MAHOE_LEAVES, ModBlocks.BOTTLEBRUSH_LEAVES, ModBlocks.COOK_PINE_LEAVES, ModBlocks.DARK_RED_ELM_LEAVES, ModBlocks.EBONY_LEAVES, ModBlocks.GUAIACUM_LEAVES, ModBlocks.KLINKII_PINE_LEAVES, ModBlocks.MELALEUCA_LEAVES, ModBlocks.NORFOLK_PINE_LEAVES, ModBlocks.PELTOGYNE_LEAVES, ModBlocks.PLUM_LEAVES, ModBlocks.SEQUOIA_LEAVES, ModBlocks.WENGE_LEAVES);

        /* ------------------------------------------ ITEM COLORS ----------------------------------------------------- */
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ColorMaps.STORCEAN_MOSOIL.getDefaultColor(), ModBlocks.REEBLOON);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ColorMaps.STORCEAN_MOSOIL.getDefaultColor(), ModBlocks.MOSOIL);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> STORCEAN_FOLIAGE.getDefaultColor(), ModBlocks.AQUEAN_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 5614908, ModBlocks.ALMOND_LEAVES, ModBlocks.BLACK_BIRCH_LEAVES, ModBlocks.COOK_PINE_LEAVES, ModBlocks.EBONY_LEAVES, ModBlocks.PELTOGYNE_LEAVES, ModBlocks.PLUM_LEAVES, ModBlocks.TEAK_LEAVES);

        /* ------------------------------------------ BLOCK ENTITY RENDERERS ----------------------------------------------------- */
        BlockEntityRendererRegistry.INSTANCE.register(BlockEntityTypes.SIGN, FabricSignBlockEntityRenderer::new);

        /* ------------------------------------------ BLOCK RENDER LAYERS ----------------------------------------------------- */
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_BLACKGREEN_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_BLACKGREEN_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_BLACKGREEN_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACKGREEN_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACKGREEN_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACKGREEN_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_BROCCOLI_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_BROCCOLI_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_BROCCOLI_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROCCOLI_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROCCOLI_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROCCOLI_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_BUBBLEGUM_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_BUBBLEGUM_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_BUBBLEGUM_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUBBLEGUM_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUBBLEGUM_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUBBLEGUM_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_CABBAGE_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_CABBAGE_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_CABBAGE_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CABBAGE_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CABBAGE_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CABBAGE_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_FLOWERTUBE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_FLOWERTUBE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_FLOWERTUBE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLOWERTUBE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLOWERTUBE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLOWERTUBE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GARNET_SPIRAL_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GARNET_SPIRAL_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GARNET_SPIRAL_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GARNET_SPIRAL_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GARNET_SPIRAL_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GARNET_SPIRAL_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLOW_FOREST_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLOW_FOREST_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLOW_FOREST_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_FOREST_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_FOREST_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_FOREST_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLOWTONGUE_TUBE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLOWTONGUE_TUBE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLOWTONGUE_TUBE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWTONGUE_TUBE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWTONGUE_TUBE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWTONGUE_TUBE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_IVORY_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_IVORY_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_IVORY_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IVORY_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IVORY_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IVORY_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_LIME_BRAIN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_LIME_BRAIN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_LIME_BRAIN_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_BRAIN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_BRAIN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_BRAIN_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_LOPHELIA_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_LOPHELIA_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_LOPHELIA_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LOPHELIA_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LOPHELIA_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LOPHELIA_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_PIPE_ORGAN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_PIPE_ORGAN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_PIPE_ORGAN_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_PIPE_ORGAN_TENTACLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PIPE_ORGAN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PIPE_ORGAN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PIPE_ORGAN_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PIPE_ORGAN_TENTACLES, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_RED_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_RED_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_RED_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_TREE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_TREE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_TREE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_SEAFAN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_SEAFAN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_SEAFAN_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEAFAN_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEAFAN_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEAFAN_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_STRAIGHT_WILLOW_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_STRAIGHT_WILLOW_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_STRAIGHT_WILLOW_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAIGHT_WILLOW_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAIGHT_WILLOW_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAIGHT_WILLOW_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_SUNRISE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_SUNRISE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_SUNRISE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SUNRISE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SUNRISE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SUNRISE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_TABLE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_TABLE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_TABLE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TABLE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TABLE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TABLE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_THIN_BLADE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_THIN_BLADE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_THIN_BLADE_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THIN_BLADE_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THIN_BLADE_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THIN_BLADE_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_TRUMPETEAR_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_TRUMPETEAR_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_TRUMPETEAR_CORAL_WALL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TRUMPETEAR_CORAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TRUMPETEAR_CORAL_FAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TRUMPETEAR_CORAL_WALL_FAN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_MAHOE_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MURKANTUAN_FLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BOTTLEBRUSH_FLOWERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GUAIACUM_FLOWERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MELALEUCA_FLOWERS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VYNHERT_LEAF, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLALM_THORNS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RHADI_THORNS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VYNHERT_TENTACLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VYNHERT_THORNS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AIRIAL_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HARSHLES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REEBLOON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SQUISH_TIPS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPROOM_SPIKE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BONNET_SPURGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BULLTHORN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CACTLOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLAWBULB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYCAWLER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GARDEN_PINKS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GYLDELION_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_SPURGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LUPIN_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MARSH_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MURKSTEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NATIVE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OPIUM_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PIGAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_MARSH_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_ROSE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPROUND, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBRA_BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SKALK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPIKE_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRIDELION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRINLY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SWEET_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOPPED_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VASLAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VELVET_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEEPY_HOLLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILD_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_VIOLET, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OBSCRUS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALMOND_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ANAMEATA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ANGELS_TRUMPET_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AQUEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARSHROOKLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_BIRCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_MAHOE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_SPRUCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROMYA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUBBLETREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CALCEARB_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_RED_ELM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDERHEART_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FRUCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FUNERANITE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GHOSHROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GHOSHROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GUAIACUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JOSHUA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KLINKII_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MELALEUCA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MURKANTUAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NORFOLK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORHPRIS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PELTOGYNE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PIN_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURFUNGA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_ELM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RHADI_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SANGUART_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEQUOIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STORTREEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STROOMEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SUNRISE_FUNGUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THUNDERCLOUD_PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VYNHERT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WENGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YEW_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ALMOND_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ANAMEATA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ANGELS_TRUMPET_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_AQUEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BARSHROOKLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLACK_BIRCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUE_MAHOE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUE_SPRUCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BOTTLEBRUSH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BROMYA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BUBBLETREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CALCEARB_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_COOK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DARK_CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DARK_FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DARK_RED_ELM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ENDERHEART_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FRUCE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FUGMOS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FUNERANITE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GHOSHROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GUAIACUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_JOSHUA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_KLINKII_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_MELALEUCA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_MURKANTUAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_NORFOLK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ORHPRIS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PELTOGYNE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PIN_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PURFUNGA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RED_ELM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RHADI_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SANGUART_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SEQUOIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SPROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_STORTREEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_STROOMEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SUNRISE_FUNGUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_TARK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_TEAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_THUNDERCLOUD_PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_VYNHERT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WENGE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_YEW_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLACK_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUE_PANSY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUE_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BONNET_SPURGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CYAN_BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CYCAWLER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GARDEN_PINKS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GYLDELION_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_MARSH_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_NATIVE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_OPIUM_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PINK_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PINK_MARSH_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PINK_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PINK_ROSE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SPIKE_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RED_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RED_CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SPROOM_SPIKE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SWEET_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_TOPPED_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_VASLAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WEEPY_HOLLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_YELLOW_VIOLET, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AIRIAL_MOSS, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSOIL, RenderLayer.getCutoutMipped());

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
        EntityRendererRegistry.INSTANCE.register(EntityTypes.ADAIGGER, AdaiggerRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BEARDED_SEADEVIL, BeardedSeadevilRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BARBELED_LOOSEJAW, BarbeledLoosejawRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BETTA, BettaRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLACK_DRAGONFISH, BlackDragonfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLACK_SCABBARD, BlackScabbardRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLACK_SEADEVIL, BlackSeadevilRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLOBFISH, BlobfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLUE_WHALE, BlueWhaleRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BOTTLE_FLY, BottleFlyRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BOTTLE_FLY_MAGGOT, BottleFlyMaggotRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BROWN_BEAR, BrownBearRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.CETACHSAL, CetachsalRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.DEEP_LAKE_BETTA, DeepLakeBettaRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.FANGTOOTH, FangtoothRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.FINANGITE, FinangiteRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.FLY, FlyRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.GIANT_HATCHETFISH, GiantHatchetfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.GIANT_SEED_SHRIMP, GiantSeedShrimpRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.HONEYCOMB_DRAGONFISH, HoneycombDragonfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.LACERATOR, LaceratorRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.LANCETFISH, LancetfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLACK_LOOSEJAW, BlackLoosejawRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.LIGHT_LOOSEJAW, LightLoosejawRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.MAGGOT, MaggotRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.PRINCE_AXELS_WONDERFISH, PrinceAxelsWonderfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.SMALLTOOTH_DRAGONFISH, SmalltoothDragonfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.STASP, StaspRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.TELESCOPEFISH, TelescopefishEntityRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.THREADFIN_DRAGONFISH, ThreadfinDragonfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.VIPERFISH, ViperfishRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.VOID_BEAST, VoidBeastRenderer::new);
        EntityRendererRegistry.INSTANCE.register(EntityTypes.WOLFTRAP_SEADEVIL, WolftrapSeadevilRenderer::new);
    }

}
