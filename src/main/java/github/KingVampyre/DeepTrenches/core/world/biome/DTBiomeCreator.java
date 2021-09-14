package github.KingVampyre.DeepTrenches.core.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;

import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.*;
import static github.KingVampyre.DeepTrenches.core.world.biome.DTBiomeEffects.*;
import static net.minecraft.entity.EntityType.*;
import static net.minecraft.entity.SpawnGroup.*;
import static net.minecraft.world.biome.Biome.Category.FOREST;
import static net.minecraft.world.biome.Biome.Category.JUNGLE;
import static net.minecraft.world.biome.Biome.Precipitation.RAIN;
import static net.minecraft.world.gen.GenerationStep.Feature.*;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.*;
import static net.minecraft.world.gen.feature.ConfiguredStructureFeatures.RUINED_PORTAL;

public class DTBiomeCreator {

    public static Biome createAlmondForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, ALMOND_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, ALMOND_FOREST_FLOWER_VEGETATION);
        builder.feature(VEGETAL_DECORATION, ALMOND_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, BROWN_MUSHROOM_NORMAL);

        var spawnSettings = new SpawnSettings.Builder()
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

        return createAlmondForest(FOREST, spawnSettings, builder);
    }

    public static Biome createAlmondPlusForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, ALMOND_PLUS_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, ALMOND_PLUS_FOREST_FLOWER_VEGETATION);
        builder.feature(VEGETAL_DECORATION, ALMOND_PLUS_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, BROWN_MUSHROOM_NORMAL);

        var spawnSettings = new SpawnSettings.Builder()
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

        return createAlmondForest(JUNGLE, spawnSettings, builder);
    }

    public static Biome createBlackBirchForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);
        var spawnSettings = DTSpawnSettings.builder(0.8F).build();

        return createForest(RAIN, FOREST, 0.9F, 0.57F, BLACK_BIRCH_FOREST, spawnSettings, builder);
    }

    public static Biome createCherryCliffsForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);
        var spawnSettings = DTSpawnSettings.builder(0.6F).build();

        return createForest(RAIN, FOREST, 0.9F, 0.56F, CHERRY_CLIFFS_FOREST, spawnSettings, builder);

    }

    public static Biome createCherryForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);
        var spawnSettings = DTSpawnSettings.builder(0.6F).build();

        return createForest(RAIN, FOREST, 0.9F, 0.56F, CHERRY_FOREST, spawnSettings, builder);
    }

    public static Biome createPlumForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);
        var spawnSettings = DTSpawnSettings.builder(0.6F).build();

        return createForest(RAIN, FOREST, 1.1F, 0.6F, PLUM_FOREST, spawnSettings, builder);
    }

    public static Biome createThundercloudPlumForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);
        var spawnSettings = DTSpawnSettings.builder(0.6F).build();

        return createForest(RAIN, FOREST, 0.76F, 0.47F, THUNDERCLOUD_PLUM_FOREST, spawnSettings, builder);
    }

    protected static Biome createAlmondForest(Biome.Category category, SpawnSettings spawnSettings, GenerationSettings.Builder builder) {
        // TODO ore calcite upper/lower
        builder.feature(UNDERGROUND_ORES, PROTOTYPE_ORE_DIRT);
        builder.feature(UNDERGROUND_ORES, PROTOTYPE_ORE_GRAVEL);
        builder.feature(UNDERGROUND_ORES, ORE_CALCITE);
        builder.feature(UNDERGROUND_ORES, PROTOTYPE_ORE_TUFF);

        builder.feature(VEGETAL_DECORATION, PROTOTYPE_GLOW_LICHEN);
        builder.feature(VEGETAL_DECORATION, SPRING_CLEAR_WATER);
        builder.feature(VEGETAL_DECORATION, SPRING_LAVA);

        builder.feature(LAKES, LAKE_CLEAR_WATER);
        builder.feature(LAKES, LAKE_LAVA);

        return createForest(RAIN, category, 1.0F, 0.55F, ALMOND_FOREST, spawnSettings, builder);
    }

    protected static Biome createForest(Biome.Precipitation precipitation, Biome.Category category, float temperature, float downfall, BiomeEffects biomeEffects, SpawnSettings spawnSettings, GenerationSettings.Builder builder) {
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(builder);
        DefaultBiomeFeatures.addDefaultVegetation(builder);
        DefaultBiomeFeatures.addDripstone(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addForestGrass(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
        DefaultBiomeFeatures.addLandCarvers(builder);

        builder.structureFeature(RUINED_PORTAL);

        return new Biome.Builder()
                .precipitation(precipitation)
                .category(category)
                .temperature(temperature)
                .downfall(downfall)
                .effects(biomeEffects)
                .spawnSettings(spawnSettings)
                .generationSettings(builder.build())
                .build();
    }

}