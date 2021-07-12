package github.KingVampyre.DeepTrenches.core.world.biome;

import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;

import static github.KingVampyre.DeepTrenches.core.init.ModConfiguredFeatures.*;
import static net.minecraft.entity.EntityType.*;
import static net.minecraft.entity.SpawnGroup.*;
import static net.minecraft.world.gen.GenerationStep.Feature.*;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.*;

public class BiomeCreator {

    public static Biome createAlmondForest(float depth, float scale) {
        GenerationSettings.Builder builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, ALMOND_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, ALMOND_FOREST_FLOWER_VEGETATION);
        builder.feature(VEGETAL_DECORATION, ALMOND_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, BROWN_MUSHROOM_NORMAL);

        BiomeEffects biomeEffects = new BiomeEffects.Builder()
                .waterColor(5218485)
                .waterFogColor(5095852)
                .fogColor(10878919)
                .foliageColor(10416724)
                .skyColor(3919039)
                .grassColor(5945150)
                .moodSound(BiomeMoodSound.CAVE)
                .build();

        SpawnSettings spawnSettings = new SpawnSettings.Builder()
                .spawn(AMBIENT, new SpawnSettings.SpawnEntry(BAT, 5, 2, 8))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(SHEEP, 10, 2, 6))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(PIG, 4, 2, 2))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(CHICKEN, 1, 1, 1))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(COW, 6, 2, 4))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(FOX, 1, 2, 3))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(RABBIT, 6, 3, 6))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(WOLF, 1, 1, 2))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SPIDER, 10, 2, 3))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ZOMBIE, 10, 1, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ZOMBIE_VILLAGER, 1, 1, 1))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SKELETON, 10, 1, 2))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(CREEPER, 10, 1, 2))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SLIME, 10, 1, 2))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ENDERMAN, 3, 1, 3))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(WITCH, 2, 1, 1))
                .spawn(UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(GLOW_SQUID, 3, 4, 6))
                .spawn(UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(AXOLOTL, 2, 4, 6))
                .playerSpawnFriendly()
                .creatureSpawnProbability(0.2F)
                .build();

        return createAlmondForest(depth, scale, Biome.Category.FOREST, spawnSettings, biomeEffects, builder);
    }

    public static Biome createAlmondPlusForest(float depth, float scale) {
        GenerationSettings.Builder builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, ALMOND_PLUS_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, ALMOND_PLUS_FOREST_FLOWER_VEGETATION);
        builder.feature(VEGETAL_DECORATION, ALMOND_PLUS_TREE);
        builder.feature(VEGETAL_DECORATION, BROWN_MUSHROOM_NORMAL);

        BiomeEffects biomeEffects = new BiomeEffects.Builder()
                .waterColor(5218485)
                .waterFogColor(5095852)
                .fogColor(10878919)
                .foliageColor(10416724)
                .skyColor(3919039)
                .grassColor(5945150)
                .moodSound(BiomeMoodSound.CAVE)
                .build();

        SpawnSettings spawnSettings = new SpawnSettings.Builder()
                .spawn(AMBIENT, new SpawnSettings.SpawnEntry(BAT, 5, 2, 8))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(SHEEP, 6, 2, 6))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(PIG, 4, 2, 2))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(CHICKEN, 1, 1, 1))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(COW, 6, 2, 4))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(FOX, 1, 2, 4))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(OCELOT, 2, 1, 2))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(RABBIT, 2, 3, 6))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(WOLF, 2, 1, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(CAVE_SPIDER, 8, 1, 2))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SPIDER, 12, 3, 5))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ZOMBIE, 8, 1, 2))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ZOMBIE_VILLAGER, 3, 1, 1))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SKELETON, 8, 1, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(CREEPER, 8, 1, 2))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SLIME, 4, 1, 1))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ENDERMAN, 4, 1, 2))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(WITCH, 3, 1, 1))
                .spawn(UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(GLOW_SQUID, 5, 4, 6))
                .spawn(UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(AXOLOTL, 7, 4, 6))
                .playerSpawnFriendly()
                .creatureSpawnProbability(0.2F)
                .build();

        return createAlmondForest(depth, scale, Biome.Category.JUNGLE, spawnSettings, biomeEffects, builder);
    }

    public static Biome createAlmondForest(float depth, float scale, Biome.Category category, SpawnSettings spawnSettings, BiomeEffects biomeEffects, GenerationSettings.Builder builder) {
        DefaultBiomeFeatures.addDefaultUndergroundStructures(builder);
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);

        builder.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL);

        builder.feature(UNDERGROUND_ORES, ORE_CALCITE);
        builder.feature(UNDERGROUND_ORES, ORE_DIRT);
        builder.feature(UNDERGROUND_ORES, ORE_GRAVEL);
        builder.feature(UNDERGROUND_ORES, ORE_TUFF);
        builder.feature(UNDERGROUND_ORES, ORE_DEEPSLATE);
        builder.feature(UNDERGROUND_DECORATION, RARE_DRIPSTONE_CLUSTER);
        builder.feature(UNDERGROUND_DECORATION, RARE_SMALL_DRIPSTONE);

        builder.feature(VEGETAL_DECORATION, GLOW_LICHEN);
        DefaultBiomeFeatures.addForestGrass(builder);
        DefaultBiomeFeatures.addDefaultVegetation(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);

        builder.feature(VEGETAL_DECORATION, SPRING_CLEAR_WATER);
        builder.feature(VEGETAL_DECORATION, SPRING_LAVA);

        builder.feature(LAKES, LAKE_CLEAR_WATER);
        builder.feature(LAKES, LAKE_LAVA);

        return new Biome.Builder()
                .precipitation(Biome.Precipitation.RAIN)
                .category(category)
                .depth(depth)
                .scale(scale)
                .temperature(1.0F)
                .downfall(0.55F)
                .effects(biomeEffects)
                .spawnSettings(spawnSettings)
                .generationSettings(builder.build())
                .build();
    }

}