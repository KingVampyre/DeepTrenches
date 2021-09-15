package github.KingVampyre.DeepTrenches.core.world.biome;

import net.minecraft.world.biome.GenerationSettings;

import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.LAKE_CLEAR_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.SPRING_CLEAR_WATER;
import static net.minecraft.world.gen.GenerationStep.Feature.LAKES;
import static net.minecraft.world.gen.GenerationStep.Feature.VEGETAL_DECORATION;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.LAKE_LAVA;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.SPRING_LAVA;

public class DTBiomeFeatures {

    public static void addClearWaterLakes(GenerationSettings.Builder builder) {
        builder.feature(LAKES, LAKE_CLEAR_WATER);
        builder.feature(LAKES, LAKE_LAVA);
    }

    public static void addClearWaterSprings(GenerationSettings.Builder builder) {
        builder.feature(VEGETAL_DECORATION, SPRING_CLEAR_WATER);
        builder.feature(VEGETAL_DECORATION, SPRING_LAVA);
    }

}
