package github.KingVampyre.DeepTrenches.core.world.biome;

import net.minecraft.world.biome.SpawnSettings;

public class DTSpawnSettings {

    public static SpawnSettings.Builder builder(float probability) {
        return new SpawnSettings.Builder().playerSpawnFriendly().creatureSpawnProbability(probability);
    }

}
