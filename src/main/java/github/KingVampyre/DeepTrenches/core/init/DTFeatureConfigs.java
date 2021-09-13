package github.KingVampyre.DeepTrenches.core.init;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placer.BlockPlacer;
import net.minecraft.world.gen.placer.DoublePlantPlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockStateProviders.*;
import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.*;

public class DTFeatureConfigs {

    public static final RandomPatchFeatureConfig ALMOND_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig ALMOND_PLUS_FOREST_FLOWER_CONFIG;

    public static final SimpleRandomFeatureConfig ALMOND_FOREST_FLOWER_VEGETATION_CONFIG;
    public static final SimpleRandomFeatureConfig ALMOND_PLUS_FOREST_FLOWER_VEGETATION_CONFIG;

    public static final RandomPatchFeatureConfig LILAC_CONFIG;

    public static final RandomFeatureConfig ALMOND_FOREST_TREE_CONFIG;
    public static final RandomFeatureConfig ALMOND_PLUS_FOREST_TREE_CONFIG;

    protected static RandomPatchFeatureConfig.Builder builder(BlockStateProvider provider, BlockPlacer placer) {
        return new RandomPatchFeatureConfig.Builder(provider, placer);
    }

    protected static RandomPatchFeatureConfig createDoublePlantConfig(BlockStateProvider provider) {
        return builder(provider, DoublePlantPlacer.INSTANCE).tries(64).cannotProject().build();
    }

    protected static RandomPatchFeatureConfig createFlowerConfig(BlockStateProvider provider) {
        return builder(provider, SimpleBlockPlacer.INSTANCE).tries(64).build();
    }

    static {
        LILAC_CONFIG = createDoublePlantConfig(LILAC_PROVIDER);

        ALMOND_FOREST_FLOWER_CONFIG = createFlowerConfig(ALMOND_FOREST_FLOWER_PROVIDER);
        ALMOND_PLUS_FOREST_FLOWER_CONFIG = createFlowerConfig(ALMOND_PLUS_FOREST_FLOWER_PROVIDER);

        ALMOND_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> Feature.RANDOM_PATCH.configure(LILAC_CONFIG)
        ));

        ALMOND_PLUS_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> Feature.RANDOM_PATCH.configure(LILAC_CONFIG)
        ));

        ALMOND_FOREST_TREE_CONFIG = new RandomFeatureConfig(ImmutableList.of(
                ALMOND_REGULAR_BEEHIVES.withChance(0.25F),
                ALMOND_MORE_BEEHIVES.withChance(0.20F),
                ALMOND_HALF_BEEHIVES.withChance(0.15F),
                FANCY_ALMOND_VERY_RARE_BEEHIVES.withChance(0.25F),
                FANCY_ALMOND_REGULAR_BEEHIVES.withChance(0.20F),
                FANCY_ALMOND_MORE_BEEHIVES.withChance(0.15F),
                FANCY_ALMOND_HALF_BEEHIVES.withChance(0.15F),
                GREAT_ALMOND_VERY_RARE_BEEHIVES.withChance(0.20F),
                GREAT_ALMOND_REGULAR_BEEHIVES.withChance(0.15F),
                GREAT_ALMOND_MORE_BEEHIVES.withChance(0.15F),
                GREAT_ALMOND_HALF_BEEHIVES.withChance(0.15F)
        ), ALMOND_VERY_RARE_BEEHIVES);

        ALMOND_PLUS_FOREST_TREE_CONFIG = new RandomFeatureConfig(ImmutableList.of(
                ALMOND_REGULAR_BEEHIVES.withChance(0.175F),
                ALMOND_MORE_BEEHIVES.withChance(0.12F),
                ALMOND_HALF_BEEHIVES.withChance(0.05F),
                FANCY_ALMOND_VERY_RARE_BEEHIVES.withChance(0.25F),
                FANCY_ALMOND_REGULAR_BEEHIVES.withChance(0.175F),
                FANCY_ALMOND_MORE_BEEHIVES.withChance(0.12F),
                FANCY_ALMOND_HALF_BEEHIVES.withChance(0.05F),
                GREAT_ALMOND_VERY_RARE_BEEHIVES.withChance(0.25F),
                GREAT_ALMOND_REGULAR_BEEHIVES.withChance(0.175F),
                GREAT_ALMOND_MORE_BEEHIVES.withChance(0.12F),
                GREAT_ALMOND_HALF_BEEHIVES.withChance(0.05F),
                ConfiguredFeatures.BIRCH_BEES_002.withChance(0.20F),
                ConfiguredFeatures.BIRCH_BEES_005.withChance(0.20F),
                ConfiguredFeatures.FANCY_OAK_BEES_002.withChance(0.32F),
                ConfiguredFeatures.FANCY_OAK_BEES_05.withChance(0.32F),
                ConfiguredFeatures.OAK_BEES_002.withChance(0.16F),
                ConfiguredFeatures.OAK_BEES_005.withChance(0.16F)
        ), ALMOND_VERY_RARE_BEEHIVES);
    }

}