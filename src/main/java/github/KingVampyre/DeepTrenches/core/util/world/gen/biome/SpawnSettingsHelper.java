package github.KingVampyre.DeepTrenches.core.util.world.gen.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.SpawnSettings;

import static net.minecraft.entity.SpawnGroup.*;

public class SpawnSettingsHelper {

    public static SpawnSettings.Builder builder(float probability) {
        return new SpawnSettings.Builder().creatureSpawnProbability(probability);
    }

    public static void ambient(SpawnSettings.Builder builder, EntityType<?> type, int weight, int min, int max) {
        builder.spawn(AMBIENT, new SpawnSettings.SpawnEntry(type, weight, min, max));
    }

    public static void creature(SpawnSettings.Builder builder, EntityType<?> type, int weight, int min, int max) {
        builder.spawn(CREATURE, new SpawnSettings.SpawnEntry(type, weight, min, max));
    }

    public static void monster(SpawnSettings.Builder builder, EntityType<?> type, int weight, int min, int max) {
        builder.spawn(MONSTER, new SpawnSettings.SpawnEntry(type, weight, min, max));
    }

    public static void undergroundWaterCreature(SpawnSettings.Builder builder, EntityType<?> type, int weight, int min, int max) {
        builder.spawn(UNDERGROUND_WATER_CREATURE, new SpawnSettings.SpawnEntry(type, weight, min, max));
    }

}
