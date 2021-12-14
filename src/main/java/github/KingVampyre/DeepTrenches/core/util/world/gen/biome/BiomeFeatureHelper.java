package github.KingVampyre.DeepTrenches.core.util.world.gen.biome;

import net.minecraft.world.biome.GenerationSettings;

import static net.minecraft.world.gen.GenerationStep.Feature.LAKES;
import static net.minecraft.world.gen.GenerationStep.Feature.VEGETAL_DECORATION;
import static net.minecraft.world.gen.feature.MiscPlacedFeatures.LAKE_LAVA_SURFACE;
import static net.minecraft.world.gen.feature.MiscPlacedFeatures.SPRING_LAVA;

public class BiomeFeatureHelper {

    public static void addClearWaterLakes(GenerationSettings.Builder builder) {
        builder.feature(LAKES, LAKE_LAVA_SURFACE);
    }

    public static void addClearWaterSprings(GenerationSettings.Builder builder) {
        builder.feature(VEGETAL_DECORATION, SPRING_LAVA);
    }

    public static void addVanillaOres(GenerationSettings.Builder builder) {
        BiomeFeatureHelper.addVanillaOres(builder, false);
    }

    public static void addVanillaOres(GenerationSettings.Builder builder, boolean largeCopperOreBlob) {
        /*
        TODO add vanilla-like ores for DT biomes
        builder.feature(UNDERGROUND_ORES, COAL_ORE_UPPER);
        builder.feature(UNDERGROUND_ORES, COAL_ORE_LOWER);
        builder.feature(UNDERGROUND_ORES, IRON_ORE_UPPER);
        builder.feature(UNDERGROUND_ORES, IRON_ORE_MIDDLE);
        builder.feature(UNDERGROUND_ORES, IRON_ORE_SMALL);
        builder.feature(UNDERGROUND_ORES, GOLD_ORE);
        builder.feature(UNDERGROUND_ORES, GOLD_ORE_LOWER);
        builder.feature(UNDERGROUND_ORES, REDSTONE_ORE);
        builder.feature(UNDERGROUND_ORES, REDSTONE_ORE_LOWER);
        builder.feature(UNDERGROUND_ORES, DIAMOND_ORE);
        builder.feature(UNDERGROUND_ORES, DIAMOND_ORE_LARGE);
        builder.feature(UNDERGROUND_ORES, DIAMOND_ORE_BURIED);
        builder.feature(UNDERGROUND_ORES, LAPIS_ORE);
        builder.feature(UNDERGROUND_ORES, LAPIS_ORE_BURIED);
        builder.feature(UNDERGROUND_ORES, largeCopperOreBlob ? COPPER_ORE_LARGE : COPPER_ORE);
        builder.feature(UNDERGROUND_ORES, UndergroundPlacedFeatures.UNDERWATER_MAGMA);
        */
    }

    public static void addClearForestOres(GenerationSettings.Builder builder) {
        BiomeFeatureHelper.addClearForestOres(builder, false);
    }

    public static void addClearForestOres(GenerationSettings.Builder builder, boolean largeCopperOreBlob) {
        /*
        TODO add diorite vanilla ore variants
        builder.feature(UNDERGROUND_ORES, DIORITE_COAL_ORE_UPPER);
        builder.feature(UNDERGROUND_ORES, DIORITE_COAL_ORE_LOWER);
        builder.feature(UNDERGROUND_ORES, DIORITE_IRON_ORE_UPPER);
        builder.feature(UNDERGROUND_ORES, DIORITE_IRON_ORE_MIDDLE);
        builder.feature(UNDERGROUND_ORES, DIORITE_IRON_ORE_SMALL);
        builder.feature(UNDERGROUND_ORES, DIORITE_GOLD_ORE);
        builder.feature(UNDERGROUND_ORES, DIORITE_GOLD_ORE_LOWER);
        builder.feature(UNDERGROUND_ORES, DIORITE_REDSTONE_ORE);
        builder.feature(UNDERGROUND_ORES, DIORITE_REDSTONE_ORE_LOWER);
        builder.feature(UNDERGROUND_ORES, DIORITE_DIAMOND_ORE);
        builder.feature(UNDERGROUND_ORES, DIORITE_DIAMOND_ORE_LARGE);
        builder.feature(UNDERGROUND_ORES, DIORITE_DIAMOND_ORE_BURIED);
        builder.feature(UNDERGROUND_ORES, DIORITE_LAPIS_ORE);
        builder.feature(UNDERGROUND_ORES, DIORITE_LAPIS_ORE_BURIED);
        builder.feature(UNDERGROUND_ORES, largeCopperOreBlob ? DIORITE_COPPER_ORE_LARGE : DIORITE_COPPER_ORE);
        builder.feature(UNDERGROUND_ORES, UndergroundPlacedFeatures.UNDERWATER_MAGMA);
        */
    }

}
