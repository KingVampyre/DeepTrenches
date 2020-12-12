package github.KingVampyre.DeepTrenches.client;

import github.KingVampyre.DeepTrenches.client.render.entity.renderer.*;
import github.KingVampyre.DeepTrenches.client.resource.StorceanFoliageColorMapResourceSupplier;
import github.KingVampyre.DeepTrenches.client.resource.StorceanMosoilColorMapResourceSupplier;
import github.KingVampyre.DeepTrenches.client.resource.StorceanWaterColorMapResourceSupplier;
import github.KingVampyre.DeepTrenches.common.block.entity.renderer.ModSignBlockEntityRenderer;
import github.KingVampyre.DeepTrenches.common.render.entity.renderer.ModBoatEntityRenderer;
import github.KingVampyre.DeepTrenches.core.init.BlockEntityTypes;
import github.KingVampyre.DeepTrenches.core.init.ColorMaps;
import github.KingVampyre.DeepTrenches.core.init.EntityTypes;
import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.math.MathHelper;

public class DeepTrenchesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new StorceanFoliageColorMapResourceSupplier());
        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new StorceanMosoilColorMapResourceSupplier());
        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new StorceanWaterColorMapResourceSupplier());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {

            if (world != null && pos != null) {
                ClientWorld client = MinecraftClient.getInstance().world;

                return client.calculateColor(pos, (biome, x, z) -> {
                    double temperature = MathHelper.clamp(biome.getTemperature(), 0.0F, 1.0F);
                    double humidity = MathHelper.clamp(biome.getDownfall(), 0.0F, 1.0F);

                    return ColorMaps.STORCEAN_MOSOIL.getColor(temperature, humidity);
                });
            }

            return ColorMaps.STORCEAN_MOSOIL.getDefaultColor();

        }, ModBlocks.MOSOIL, ModBlocks.REEBLOON);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {

            if (world != null && pos != null) {
                ClientWorld client = MinecraftClient.getInstance().world;

                return client.calculateColor(pos, (biome, d, e) -> {
                    double temperature = biome.getTemperature();
                    double humidity = biome.getDownfall();

                    return ColorMaps.STORCEAN_FOLIAGE.getColor(temperature, humidity);
                });
            }

            return ColorMaps.STORCEAN_FOLIAGE.getDefaultColor();

        }, ModBlocks.AQUEAN_LEAVES);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {

           if(world != null && pos != null)
               return BiomeColors.getFoliageColor(world, pos);

           return FoliageColors.getDefaultColor();

        }, ModBlocks.ALMOND_LEAVES, ModBlocks.BLACK_BIRCH_LEAVES, ModBlocks.EBONY_LEAVES, ModBlocks.PELTOGYNE_LEAVES, ModBlocks.PLUM_LEAVES, ModBlocks.TEAK_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ColorMaps.STORCEAN_MOSOIL.getDefaultColor(), ModBlocks.REEBLOON);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ColorMaps.STORCEAN_MOSOIL.getDefaultColor(), ModBlocks.MOSOIL);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> ColorMaps.STORCEAN_FOLIAGE.getDefaultColor(), ModBlocks.AQUEAN_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 5614908, ModBlocks.ALMOND_LEAVES, ModBlocks.BLACK_BIRCH_LEAVES, ModBlocks.EBONY_LEAVES, ModBlocks.PELTOGYNE_LEAVES, ModBlocks.PLUM_LEAVES, ModBlocks.TEAK_LEAVES);

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

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BONNET_SPURGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BULLTHORN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYCAWLER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GARDEN_PINKS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GYLDELION_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_SPURGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LUPIN_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NATIVE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OPIUM_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_ROSE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPROUND, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_BRAITOR_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REEBLOON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPIKE_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRINLY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPROOM_SPIKE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SWEET_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOPPED_LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VASLAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VELVET_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEEPY_HOLLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALMOND_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ANAMEATA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AQUEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARSHROOKLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_BIRCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COOK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FUNERANITE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GHOSHROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PELTOGYNE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PIN_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURFUNGA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STORTREEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STROOMEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SUNRISE_FUNGUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THUNDERCLOUD_PLUM_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ALMOND_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ANAMEATA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_AQUEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BARSHROOKLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLACK_BIRCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_COOK_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DARK_CROLOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FUCHSITRA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FUNERANITE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GHOSHROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PELTOGYNE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PIN_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PLUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PURFUNGA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SPROOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_STORTREEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_STROOMEAN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SUNRISE_FUNGUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_TEAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_THUNDERCLOUD_PLUM_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUE_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BONNET_SPURGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CHOCOLATE_COSMOS_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CYCAWLER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GARDEN_PINKS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GYLDELION_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_NATIVE_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_OPIUM_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PINK_BRAITOR_FLOWER, RenderLayer.getCutout());
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

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSOIL, RenderLayer.getCutoutMipped());

        BlockEntityRendererRegistry.INSTANCE.register(BlockEntityTypes.SIGN, ModSignBlockEntityRenderer::new);

        /* -------------------------------- Entity Renderers ------------------------------------------- */
        EntityRendererRegistry.INSTANCE.register(EntityTypes.ADAIGGER, (dispatcher, context) -> new AdaiggerRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BEARDED_SEADEVIL, (dispatcher, context) -> new BeardedSeadevilRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.ATLANTIC_BARBELED_LOOSEJAW, (dispatcher, context) -> new BarbeledLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.GLOWING_BARBELED_LOOSEJAW, (dispatcher, context) -> new BarbeledLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.GRIMALDIS_BARBELED_LOOSEJAW, (dispatcher, context) -> new BarbeledLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.MANY_RAYED_BARBELED_LOOSEJAW, (dispatcher, context) -> new BarbeledLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.SHINY_BARBELED_LOOSEJAW, (dispatcher, context) -> new BarbeledLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.TITTMANNS_BARBELED_LOOSEJAW, (dispatcher, context) -> new BarbeledLoosejawRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLACK_BLUE_BETTA, (dispatcher, context) -> new BettaRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLUE_BETTA, (dispatcher, context) -> new BettaRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.COLORFUL_BETTA, (dispatcher, context) -> new BettaRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.ICARUS, (dispatcher, context) -> new BettaRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.ICARUS_JUNIOR, (dispatcher, context) -> new BettaRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.ICARUS_THE_THIRD, (dispatcher, context) -> new BettaRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.RED_BETTA, (dispatcher, context) -> new BettaRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLACK_DRAGONFISH, (dispatcher, context) -> new BlackDragonfishRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLACK_SCABBARD, (dispatcher, context) -> new BlackScabbardRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLACK_SEADEVIL, (dispatcher, context) -> new BlackSeadevilRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLOBFISH, (dispatcher, context) -> new BlobfishRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLUE_WHALE, (dispatcher, context) -> new BlueWhaleRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BOAT, (dispatcher, context) -> new ModBoatEntityRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.BOTTLE_FLY, (dispatcher, context) -> new BottleFlyRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BOTTLE_FLY_MAGGOT, (dispatcher, context) -> new BottleFlyMaggotRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BROWN_BEAR, (dispatcher, context) -> new BrownBearRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.CETACHSAL, (dispatcher, context) -> new CetachsalRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.DEEP_LAKE_BETTA, (dispatcher, context) -> new DeepLakeBettaRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.FANGTOOTH, (dispatcher, context) -> new FangtoothRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.FINANGITE, (dispatcher, context) -> new FinangiteRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.FLY, (dispatcher, context) -> new FlyRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.GIANT_HATCHETFISH, (dispatcher, context) -> new GiantHatchetfishRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.GIANT_SEED_SHRIMP, (dispatcher, context) -> new GiantSeedShrimpRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.HONEYCOMB_DRAGONFISH, (dispatcher, context) -> new HoneycombDragonfishRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.LACERATOR, (dispatcher, context) -> new LaceratorRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.LANCETFISH, (dispatcher, context) -> new LancetfishRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.NORTHERN_BLACK_LOOSEJAW, (dispatcher, context) -> new BlackLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.SOUTHERN_BLACK_LOOSEJAW, (dispatcher, context) -> new BlackLoosejawRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.BIGLAMP_LIGHT_LOOSEJAW, (dispatcher, context) -> new LightLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.GOODYEARS_LIGHT_LOOSEJAW, (dispatcher, context) -> new LightLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.GUERNES_LIGHT_LOOSEJAW, (dispatcher, context) -> new LightLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.LIEMS_LIGHT_LOOSEJAW, (dispatcher, context) -> new LightLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.REMARKABLE_LIGHT_LOOSEJAW, (dispatcher, context) -> new LightLoosejawRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.SMALL_LIGHT_LOOSEJAW, (dispatcher, context) -> new LightLoosejawRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.MAGGOT, (dispatcher, context) -> new MaggotRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.PRINCE_AXELS_WONDERFISH, (dispatcher, context) -> new PrinceAxelsWonderfishRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.SMALLTOOTH_DRAGONFISH, (dispatcher, context) -> new SmalltoothDragonfishRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLACK_STASP, (dispatcher, context) -> new StaspRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.BLUE_WINGED_STASP, (dispatcher, context) -> new StaspRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.FUCHSITRA_STASP, (dispatcher, context) -> new StaspRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.ORANGE_WINGED_STASP, (dispatcher, context) -> new StaspRenderer(dispatcher));

        EntityRendererRegistry.INSTANCE.register(EntityTypes.TELESCOPEFISH, (dispatcher, context) -> new TelescopefishEntityRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.THREADFIN_DRAGONFISH, (dispatcher, context) -> new ThreadfinDragonfishRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.VIPERFISH, (dispatcher, context) -> new ViperfishRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.VOID_BEAST, (dispatcher, context) -> new VoidBeastRenderer(dispatcher));
        EntityRendererRegistry.INSTANCE.register(EntityTypes.WOLFTRAP_SEADEVIL, (dispatcher, context) -> new WolftrapSeadevilRenderer(dispatcher));
    }

}
