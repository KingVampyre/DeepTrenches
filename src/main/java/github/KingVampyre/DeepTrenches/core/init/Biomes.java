package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.world.biome.BiomeCreator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

import static net.minecraft.util.registry.Registry.BIOME_KEY;

public class Biomes {

    public static final RegistryKey<Biome> ALMOND_FOREST_KEY;
    public static final RegistryKey<Biome> ALMOND_PLUS_FOREST_KEY;

    public static final Biome ALMOND_FOREST;
    public static final Biome ALMOND_PLUS_FOREST;

    static {
        ALMOND_FOREST_KEY = RegistryKey.of(BIOME_KEY, new Identifier("deep_trenches:almond_forest"));
        ALMOND_PLUS_FOREST_KEY = RegistryKey.of(BIOME_KEY, new Identifier("deep_trenches:almond_plus_forest"));

        ALMOND_FOREST = BiomeCreator.createAlmondForest(0.13F, 0.02F);
        ALMOND_PLUS_FOREST = BiomeCreator.createAlmondPlusForest(0.217F, 0.443F);
    }

}