package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.world.biome.BiomeCreator;
import net.minecraft.world.biome.Biome;

public class Biomes {

    public static final Biome ALMOND_FOREST;
    public static final Biome ALMOND_PLUS_FOREST;

    static {
        ALMOND_FOREST = BiomeCreator.createAlmondForest(0.13F, 0.02F);
        ALMOND_PLUS_FOREST = BiomeCreator.createAlmondPlusForest(0.217F, 0.443F);
    }

}