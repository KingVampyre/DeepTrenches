package github.KingVampyre.DeepTrenches.core.init.world;

import github.KingVampyre.DeepTrenches.core.util.world.gen.biome.BiomeCreatorHelper;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

import static net.minecraft.util.registry.BuiltinRegistries.BIOME;
import static net.minecraft.util.registry.Registry.BIOME_KEY;

public class DTBiomes {

    public static final RegistryKey<Biome> ALMOND_FOREST_KEY;
    public static final RegistryKey<Biome> ALMOND_PLUS_FOREST_KEY;
    public static final RegistryKey<Biome> BLACK_BIRCH_FOREST_KEY;
    public static final RegistryKey<Biome> CHERRY_CLIFFS_FOREST_KEY;
    public static final RegistryKey<Biome> CHERRY_FOREST_KEY;
    public static final RegistryKey<Biome> PLUM_FOREST_KEY;
    public static final RegistryKey<Biome> THUNDERCLOUD_PLUM_FOREST_KEY;

    public static final Biome ALMOND_FOREST;
    public static final Biome ALMOND_PLUS_FOREST;
    public static final Biome BLACK_BIRCH_FOREST;
    public static final Biome CHERRY_CLIFFS_FOREST;
    public static final Biome CHERRY_FOREST;
    public static final Biome PLUM_FOREST;
    public static final Biome THUNDERCLOUD_PLUM_FOREST;

    protected static RegistryKey<Biome> key(String id) {
        return RegistryKey.of(BIOME_KEY, new Identifier(id));
    }

    static {
        ALMOND_FOREST_KEY = key("deep_trenches:almond_forest");
        ALMOND_PLUS_FOREST_KEY = key("deep_trenches:almond_plus_forest");
        BLACK_BIRCH_FOREST_KEY = key("deep_trenches:black_birch_forest");
        CHERRY_CLIFFS_FOREST_KEY = key("deep_trenches:cherry_cliffs_forest");
        CHERRY_FOREST_KEY = key("deep_trenches:cherry_forest");
        PLUM_FOREST_KEY = key("deep_trenches:plum_forest");
        THUNDERCLOUD_PLUM_FOREST_KEY = key("deep_trenches:thundercloud_plum_forest");

        ALMOND_FOREST = BiomeCreatorHelper.createAlmondForest();
        ALMOND_PLUS_FOREST = BiomeCreatorHelper.createAlmondPlusForest();
        BLACK_BIRCH_FOREST = BiomeCreatorHelper.createBlackBirchForest();
        CHERRY_CLIFFS_FOREST = BiomeCreatorHelper.createCherryCliffsForest();
        CHERRY_FOREST = BiomeCreatorHelper.createCherryForest();
        PLUM_FOREST = BiomeCreatorHelper.createPlumForest();
        THUNDERCLOUD_PLUM_FOREST = BiomeCreatorHelper.createThundercloudPlumForest();
    }

    public static void initialize() {
        BuiltinRegistries.add(BIOME, ALMOND_FOREST_KEY.getValue(), ALMOND_FOREST);
        BuiltinRegistries.add(BIOME, ALMOND_PLUS_FOREST_KEY.getValue(), ALMOND_PLUS_FOREST);
        BuiltinRegistries.add(BIOME, BLACK_BIRCH_FOREST_KEY.getValue(), BLACK_BIRCH_FOREST);
        BuiltinRegistries.add(BIOME, CHERRY_CLIFFS_FOREST_KEY.getValue(), CHERRY_CLIFFS_FOREST);
        BuiltinRegistries.add(BIOME, CHERRY_FOREST_KEY.getValue(), CHERRY_FOREST);
        BuiltinRegistries.add(BIOME, PLUM_FOREST_KEY.getValue(), PLUM_FOREST);
        BuiltinRegistries.add(BIOME, THUNDERCLOUD_PLUM_FOREST_KEY.getValue(), THUNDERCLOUD_PLUM_FOREST);
    }

}