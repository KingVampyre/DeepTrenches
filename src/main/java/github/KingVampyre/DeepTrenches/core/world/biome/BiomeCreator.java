package github.KingVampyre.DeepTrenches.core.world.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilders;

import static github.KingVampyre.DeepTrenches.core.init.ModConfiguredFeatures.LAKE_CLEAR_WATER;
import static net.minecraft.entity.EntityType.*;
import static net.minecraft.entity.SpawnGroup.*;
import static net.minecraft.world.gen.GenerationStep.Feature.LAKES;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.LAKE_LAVA;

public class BiomeCreator {

    public static Biome createAlmondForest(float depth, float scale) {
        SpawnSettings spawnSettings = new SpawnSettings.Builder()
                .spawn(AMBIENT, new SpawnSettings.SpawnEntry(BAT, 10, 8, 8))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(SHEEP, 8, 2, 6))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(PIG, 3, 2, 2))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(CHICKEN, 1, 1, 1))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(COW, 6, 2, 4))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(WOLF, 2, 1, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SPIDER, 100, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ZOMBIE, 95, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ZOMBIE_VILLAGER, 5, 1, 1))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SKELETON, 100, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(CREEPER, 100, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SLIME, 100, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ENDERMAN, 10, 1, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(WITCH, 5, 1, 1))
                .spawn(UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(GLOW_SQUID, 10, 4, 6))
                .spawn(UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(AXOLOTL, 10, 4, 6))
                .playerSpawnFriendly()
                .build();

        return createAlmondForest(depth, scale, spawnSettings);
    }

    public static Biome createAlmondPlusForest(float depth, float scale) {
        SpawnSettings spawnSettings = new SpawnSettings.Builder()
                .spawn(AMBIENT, new SpawnSettings.SpawnEntry(BAT, 10, 8, 8))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(SHEEP, 8, 2, 6))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(PIG, 3, 2, 2))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(CHICKEN, 1, 1, 1))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(COW, 6, 2, 4))
                .spawn(CREATURE, new SpawnSettings.SpawnEntry(WOLF, 2, 1, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SPIDER, 100, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ZOMBIE, 95, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ZOMBIE_VILLAGER, 5, 1, 1))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SKELETON, 100, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(CREEPER, 100, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(SLIME, 100, 4, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(ENDERMAN, 10, 1, 4))
                .spawn(MONSTER, new SpawnSettings.SpawnEntry(WITCH, 5, 1, 1))
                .spawn(UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(GLOW_SQUID, 10, 4, 6))
                .spawn(UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(AXOLOTL, 10, 4, 6))
                .playerSpawnFriendly()
                .build();

        return createAlmondForest(depth, scale, spawnSettings);
    }

    public static Biome createAlmondForest(float depth, float scale, SpawnSettings spawnSettings) {
        GenerationSettings.Builder builder = new GenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        DefaultBiomeFeatures.addDefaultUndergroundStructures(builder);
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);

        builder.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL);

        DefaultBiomeFeatures.addForestTrees(builder);
        DefaultBiomeFeatures.addForestFlowers(builder);
        DefaultBiomeFeatures.addDefaultFlowers(builder);
        DefaultBiomeFeatures.addForestGrass(builder);
        DefaultBiomeFeatures.addDefaultMushrooms(builder);
        DefaultBiomeFeatures.addDefaultVegetation(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);

        builder.feature(LAKES, LAKE_CLEAR_WATER);
        builder.feature(LAKES, LAKE_LAVA);

        return new Biome.Builder()
                .precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.FOREST)
                .depth(depth)
                .scale(scale)
                .temperature(1.0F)
                .downfall(0.55F)
                .effects(new BiomeEffects.Builder()
                        .waterColor(5218485)
                        .waterFogColor(5095852)
                        .fogColor(8191929)
                        .foliageColor(7261768)
                        .skyColor(3919039)
                        .grassColor(5945150)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build()
                ).spawnSettings(spawnSettings).generationSettings(builder.build()).build();
    }

}