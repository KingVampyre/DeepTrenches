package github.KingVampyre.DeepTrenches.core.init;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.SimpleRandomFeatureConfig;
import net.minecraft.world.gen.placer.DoublePlantPlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockStateProviders.*;

public class DTFeatureConfigs {

    public static final RandomPatchFeatureConfig ALMOND_FOREST_FLOWER_CONFIG;
    public static final SimpleRandomFeatureConfig ALMOND_FOREST_FLOWER_VEGETATION_CONFIG;

    public static final RandomPatchFeatureConfig ALMOND_PLUS_FOREST_FLOWER_CONFIG;
    public static final SimpleRandomFeatureConfig ALMOND_PLUS_FOREST_FLOWER_VEGETATION_CONFIG;

    public static final RandomPatchFeatureConfig LILAC_CONFIG;

    static {
        LILAC_CONFIG = new RandomPatchFeatureConfig.Builder(LILAC_PROVIDER, DoublePlantPlacer.INSTANCE)
                .tries(64)
                .cannotProject()
                .build();

        ALMOND_FOREST_FLOWER_CONFIG = new RandomPatchFeatureConfig.Builder(ALMOND_FOREST_FLOWER_PROVIDER, SimpleBlockPlacer.INSTANCE)
                .tries(64)
                .build();

        ALMOND_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> Feature.RANDOM_PATCH.configure(LILAC_CONFIG)
        ));

        ALMOND_PLUS_FOREST_FLOWER_CONFIG = new RandomPatchFeatureConfig.Builder(ALMOND_PLUS_FOREST_FLOWER_PROVIDER, SimpleBlockPlacer.INSTANCE)
                .tries(64)
                .build();

        ALMOND_PLUS_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> Feature.RANDOM_PATCH.configure(LILAC_CONFIG)
        ));
    }

}