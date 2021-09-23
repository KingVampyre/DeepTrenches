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
import static net.minecraft.world.biome.Biome.Category.FOREST;
import static net.minecraft.world.biome.Biome.Category.JUNGLE;
import static net.minecraft.world.gen.GenerationStep.Feature.*;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.*;

public class DTBiomeCreator {

    public static Biome createAlmondForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, ALMOND_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, ALMOND_FOREST_FLOWER_VEGETATION);
        builder.feature(VEGETAL_DECORATION, ALMOND_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, BROWN_MUSHROOM_NORMAL);

        var settings = DTSpawnSettings.builder(0.2F);

        DTSpawnSettings.ambient(settings, BAT, 5, 2, 8);
        DTSpawnSettings.creature(settings, CHICKEN, 1, 1, 1);
        DTSpawnSettings.creature(settings, COW, 6, 2, 4);
        DTSpawnSettings.creature(settings, FOX, 1, 2, 3);
        DTSpawnSettings.creature(settings, PIG, 4, 2, 2);
        DTSpawnSettings.creature(settings, RABBIT, 6, 3, 6);
        DTSpawnSettings.creature(settings, SHEEP, 10, 2, 6);
        DTSpawnSettings.creature(settings, WOLF, 1, 1, 2);
        DTSpawnSettings.monster(settings, CREEPER, 10, 1, 2);
        DTSpawnSettings.monster(settings, ENDERMAN, 3, 1, 3);
        DTSpawnSettings.monster(settings, SKELETON, 10, 1, 2);
        DTSpawnSettings.monster(settings, SLIME, 10, 1, 2);
        DTSpawnSettings.monster(settings, SPIDER, 10, 2, 3);
        DTSpawnSettings.monster(settings, WITCH, 2, 1, 1);
        DTSpawnSettings.monster(settings, ZOMBIE, 10, 1, 4);
        DTSpawnSettings.monster(settings, ZOMBIE_VILLAGER, 1, 1, 1);
        DTSpawnSettings.undergroundWaterCreature(settings, AXOLOTL, 2, 4, 6);
        DTSpawnSettings.undergroundWaterCreature(settings, GLOW_SQUID, 3, 4, 6);

        return createAlmondForest(FOREST, settings.build(), builder);
    }

    public static Biome createAlmondPlusForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, ALMOND_PLUS_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, ALMOND_PLUS_FOREST_FLOWER_VEGETATION);
        builder.feature(VEGETAL_DECORATION, ALMOND_PLUS_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, BROWN_MUSHROOM_NORMAL);

        var settings = DTSpawnSettings.builder(0.2F);

        DTSpawnSettings.ambient(settings, BAT, 5, 2, 8);
        DTSpawnSettings.creature(settings, CHICKEN, 1, 1, 1);
        DTSpawnSettings.creature(settings, COW, 6, 2, 4);
        DTSpawnSettings.creature(settings, FOX, 1, 2, 4);
        DTSpawnSettings.creature(settings, OCELOT, 2, 1, 2);
        DTSpawnSettings.creature(settings, PIG, 4, 2, 2);
        DTSpawnSettings.creature(settings, RABBIT, 2, 3, 6);
        DTSpawnSettings.creature(settings, SHEEP, 6, 2, 6);
        DTSpawnSettings.creature(settings, WOLF, 2, 1, 4);
        DTSpawnSettings.monster(settings, CAVE_SPIDER, 8, 1, 2);
        DTSpawnSettings.monster(settings, CREEPER, 8, 1, 2);
        DTSpawnSettings.monster(settings, ENDERMAN, 4, 1, 2);
        DTSpawnSettings.monster(settings, SPIDER, 12, 3, 5);
        DTSpawnSettings.monster(settings, SKELETON, 8, 1, 4);
        DTSpawnSettings.monster(settings, SLIME, 4, 1, 1);
        DTSpawnSettings.monster(settings, WITCH, 3, 1, 1);
        DTSpawnSettings.monster(settings, ZOMBIE, 8, 1, 2);
        DTSpawnSettings.monster(settings, ZOMBIE_VILLAGER, 3, 1, 1);
        DTSpawnSettings.undergroundWaterCreature(settings, AXOLOTL, 7, 4, 6);
        DTSpawnSettings.undergroundWaterCreature(settings, GLOW_SQUID, 5, 4, 6);

        return createAlmondForest(JUNGLE, settings.build(), builder);
    }

    public static Biome createBlackBirchForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        DefaultBiomeFeatures.addDefaultMushrooms(builder);
        builder.feature(VEGETAL_DECORATION, BLACK_BIRCH_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, BLACK_BIRCH_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, BLACK_BIRCH_FOREST_FLOWER_VEGETATION);

        var settings = DTSpawnSettings.builder(0.25F);

        DTSpawnSettings.ambient(settings, AXOLOTL, 4, 1, 4);
        DTSpawnSettings.ambient(settings, BAT, 40, 2, 12);
        DTSpawnSettings.creature(settings, COW, 16, 2, 4);
        DTSpawnSettings.creature(settings, GOAT, 4, 1, 4);
        DTSpawnSettings.creature(settings, LLAMA, 13, 2, 6);
        DTSpawnSettings.creature(settings, PIG, 14, 2, 6);
        DTSpawnSettings.creature(settings, RABBIT, 4, 1, 4);
        DTSpawnSettings.creature(settings, SHEEP, 12, 2, 2);
        DTSpawnSettings.creature(settings, WOLF, 6, 1, 8);
        DTSpawnSettings.monster(settings, CREEPER, 4, 1, 3);
        DTSpawnSettings.monster(settings, SKELETON, 15, 2, 4);
        DTSpawnSettings.monster(settings, SLIME, 4, 1, 2);
        DTSpawnSettings.monster(settings, SPIDER, 6, 2, 2);
        DTSpawnSettings.monster(settings, WITCH, 2, 1, 3);
        DTSpawnSettings.monster(settings, ZOMBIE, 16, 1, 2);
        DTSpawnSettings.monster(settings, ZOMBIE_VILLAGER, 7, 2, 3);
        DTSpawnSettings.undergroundWaterCreature(settings, AXOLOTL, 30, 4, 10);
        DTSpawnSettings.undergroundWaterCreature(settings, GLOW_SQUID, 25, 4, 8);

        return createClearForest(FOREST, 0.9F, 0.57F, true, BLACK_BIRCH_FOREST, settings.build(), builder);
    }

    public static Biome createCherryCliffsForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, CHERRY_CLIFFS_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, CHERRY_CLIFFS_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, CHERRY_CLIFFS_FOREST_FLOWER_VEGETATION);

        var settings = DTSpawnSettings.builder(0.25F);

        DTSpawnSettings.ambient(settings, BAT, 20, 0, 6);
        DTSpawnSettings.creature(settings, CAT, 14, 1, 2);
        DTSpawnSettings.creature(settings, CHICKEN, 14, 1, 6);
        DTSpawnSettings.creature(settings, COW, 16, 2, 4);
        DTSpawnSettings.creature(settings, GOAT, 30, 2, 4);
        DTSpawnSettings.creature(settings, FOX, 12, 2, 4);
        DTSpawnSettings.creature(settings, PARROT, 16, 2, 4);
        DTSpawnSettings.creature(settings, PIG, 12, 2, 2);
        DTSpawnSettings.creature(settings, RABBIT, 20, 3, 8);
        DTSpawnSettings.creature(settings, SHEEP, 22, 2, 8);
        DTSpawnSettings.creature(settings, WOLF, 4, 2, 4);
        DTSpawnSettings.monster(settings, ENDERMAN, 6, 1, 4);
        DTSpawnSettings.monster(settings, SKELETON, 6, 1, 4);
        DTSpawnSettings.monster(settings, SPIDER, 6, 4, 4);
        DTSpawnSettings.monster(settings, WITCH, 1, 1, 2);
        DTSpawnSettings.monster(settings, ZOMBIE, 4, 1, 2);
        DTSpawnSettings.monster(settings, ZOMBIE_VILLAGER, 4, 1, 3);
        DTSpawnSettings.undergroundWaterCreature(settings, AXOLOTL, 4, 1, 2);
        DTSpawnSettings.undergroundWaterCreature(settings, GLOW_SQUID, 8, 2, 6);

        return createClearForest(FOREST, 0.9F, 0.56F, true, CHERRY_CLIFFS_FOREST, settings.build(), builder);
    }

    public static Biome createCherryForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, CHERRY_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, CHERRY_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, CHERRY_FOREST_FLOWER_VEGETATION);

        var settings = DTSpawnSettings.builder(0.2F);

        DTSpawnSettings.ambient(settings, BAT, 5, 0, 3);
        DTSpawnSettings.creature(settings, CAT, 4, 1, 2);
        DTSpawnSettings.creature(settings, CHICKEN, 8, 1, 4);
        DTSpawnSettings.creature(settings, COW, 10, 2, 4);
        DTSpawnSettings.creature(settings, GOAT, 2, 1, 1);
        DTSpawnSettings.creature(settings, FOX, 2, 1, 3);
        DTSpawnSettings.creature(settings, PARROT, 2, 2, 4);
        DTSpawnSettings.creature(settings, PIG, 8, 2, 2);
        DTSpawnSettings.creature(settings, RABBIT, 15, 2, 3);
        DTSpawnSettings.creature(settings, SHEEP, 15, 1, 2);
        DTSpawnSettings.creature(settings, WOLF, 1, 2, 3);
        DTSpawnSettings.monster(settings, ENDERMAN, 5, 1, 2);
        DTSpawnSettings.monster(settings, SKELETON, 55, 1, 2);
        DTSpawnSettings.monster(settings, SPIDER, 60, 2, 4);
        DTSpawnSettings.monster(settings, WITCH, 5, 1, 2);
        DTSpawnSettings.monster(settings, ZOMBIE, 65, 1, 2);
        DTSpawnSettings.monster(settings, ZOMBIE_VILLAGER, 5, 1, 2);
        DTSpawnSettings.undergroundWaterCreature(settings, AXOLOTL, 1, 1, 2);
        DTSpawnSettings.undergroundWaterCreature(settings, GLOW_SQUID, 4, 2, 4);

        return createClearForest(FOREST, 0.9F, 0.56F, true, CHERRY_FOREST, settings.build(), builder);
    }

    public static Biome createPlumForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, PLUM_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, PLUM_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, PLUM_FOREST_FLOWER_VEGETATION);

        var settings = DTSpawnSettings.builder(0.25F);

        DTSpawnSettings.ambient(settings, BAT, 25, 2, 6);
        DTSpawnSettings.creature(settings, CHICKEN, 4, 1, 1);
        DTSpawnSettings.creature(settings, COW, 16, 2, 4);
        DTSpawnSettings.creature(settings, FOX, 14, 2, 4);
        DTSpawnSettings.creature(settings, PARROT, 8, 2, 6);
        DTSpawnSettings.creature(settings, PIG, 20, 2, 8);
        DTSpawnSettings.creature(settings, RABBIT, 20, 3, 6);
        DTSpawnSettings.creature(settings, SHEEP, 8, 2, 6);
        DTSpawnSettings.monster(settings, ENDERMAN, 4, 1, 4);
        DTSpawnSettings.monster(settings, SKELETON, 4, 1, 2);
        DTSpawnSettings.monster(settings, SPIDER, 15, 4, 8);
        DTSpawnSettings.monster(settings, WITCH, 6, 1, 4);
        DTSpawnSettings.monster(settings, ZOMBIE, 6, 1, 4);
        DTSpawnSettings.monster(settings, ZOMBIE_VILLAGER, 8, 2, 4);
        DTSpawnSettings.undergroundWaterCreature(settings, AXOLOTL, 15, 4, 6);
        DTSpawnSettings.undergroundWaterCreature(settings, GLOW_SQUID, 30, 4, 6);

        return createClearForest(FOREST, 1.1F, 0.6F, true, PLUM_FOREST, settings.build(), builder);
    }

    public static Biome createThundercloudPlumForest() {
        var builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        builder.feature(VEGETAL_DECORATION, THUNDERCLOUD_PLUM_FOREST_TREE);
        builder.feature(VEGETAL_DECORATION, THUNDERCLOUD_PLUM_FOREST_FLOWER);
        builder.feature(VEGETAL_DECORATION, THUNDERCLOUD_PLUM_FOREST_FLOWER_VEGETATION);

        var settings = DTSpawnSettings.builder(0.25F);

        DTSpawnSettings.ambient(settings, BAT, 40, 2, 8);
        DTSpawnSettings.creature(settings, CHICKEN, 4, 1, 1);
        DTSpawnSettings.creature(settings, COW, 16, 2, 4);
        DTSpawnSettings.creature(settings, FOX, 6, 2, 3);
        DTSpawnSettings.creature(settings, PARROT, 12, 2, 6);
        DTSpawnSettings.creature(settings, PIG, 15, 2, 6);
        DTSpawnSettings.creature(settings, RABBIT, 20, 3, 6);
        DTSpawnSettings.creature(settings, SHEEP, 14, 2, 6);
        DTSpawnSettings.creature(settings, WOLF, 20, 4, 8);
        DTSpawnSettings.monster(settings, CREEPER, 2, 1, 1);
        DTSpawnSettings.monster(settings, ENDERMAN, 4, 1, 4);
        DTSpawnSettings.monster(settings, SKELETON, 6, 1, 3);
        DTSpawnSettings.monster(settings, SPIDER, 20, 4, 8);
        DTSpawnSettings.monster(settings, WITCH, 10, 1, 4);
        DTSpawnSettings.monster(settings, ZOMBIE, 6, 1, 4);
        DTSpawnSettings.monster(settings, ZOMBIE_VILLAGER, 8, 2, 4);
        DTSpawnSettings.undergroundWaterCreature(settings, AXOLOTL, 4, 2, 6);
        DTSpawnSettings.undergroundWaterCreature(settings, GLOW_SQUID, 15, 4, 4);

        return createClearForest(FOREST, 0.76F, 0.47F, true, THUNDERCLOUD_PLUM_FOREST, settings.build(), builder);
    }

    protected static Biome createAlmondForest(Biome.Category category, SpawnSettings spawnSettings, GenerationSettings.Builder builder) {
        // TODO ore calcite upper/lower
        builder.feature(UNDERGROUND_ORES, PROTOTYPE_ORE_DIRT);
        builder.feature(UNDERGROUND_ORES, PROTOTYPE_ORE_GRAVEL);
        builder.feature(UNDERGROUND_ORES, ORE_CALCITE);
        builder.feature(UNDERGROUND_ORES, PROTOTYPE_ORE_TUFF);
        builder.feature(VEGETAL_DECORATION, PROTOTYPE_GLOW_LICHEN);

        return createClearForest(category, 1.0F, 0.55F, false, ALMOND_FOREST, spawnSettings, builder);
    }

    protected static Biome createClearForest(Biome.Category category, float temperature, float downfall, boolean mineables, BiomeEffects biomeEffects, SpawnSettings spawnSettings, GenerationSettings.Builder builder) {
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addDefaultVegetation(builder);
        DefaultBiomeFeatures.addDripstone(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addForestGrass(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addLargeFerns(builder);

        DTBiomeFeatures.addClearForestGrass(builder);
        DTBiomeFeatures.addClearWaterLakes(builder);
        DTBiomeFeatures.addClearWaterSprings(builder);

        if(mineables)
            DefaultBiomeFeatures.addMineables(builder);

        // TODO RUINED PORTAL

        return new Biome.Builder()
                .precipitation(Biome.Precipitation.RAIN)
                .category(category)
                .temperature(temperature)
                .downfall(downfall)
                .effects(biomeEffects)
                .spawnSettings(spawnSettings)
                .generationSettings(builder.build())
                .build();
    }

}