package github.KingVampyre.DeepTrenches.core.init;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.RandomFeatureConfig;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.SimpleRandomFeatureConfig;
import net.minecraft.world.gen.placer.BlockPlacer;
import net.minecraft.world.gen.placer.DoublePlantPlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockStateProviders.*;
import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.*;

public class DTFeatureConfigs {

    public static final RandomPatchFeatureConfig ALMOND_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig ALMOND_PLUS_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig BLACK_BIRCH_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig CHERRY_CLIFFS_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig CHERRY_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig PLUM_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig THUNDERCLOUD_PLUM_FOREST_FLOWER_CONFIG;

    public static final SimpleRandomFeatureConfig ALMOND_FOREST_FLOWER_VEGETATION_CONFIG;
    public static final SimpleRandomFeatureConfig ALMOND_PLUS_FOREST_FLOWER_VEGETATION_CONFIG;
    public static final SimpleRandomFeatureConfig BLACK_BIRCH_FOREST_FLOWER_VEGETATION_CONFIG;
    public static final SimpleRandomFeatureConfig CHERRY_CLIFFS_FOREST_FLOWER_VEGETATION_CONFIG;
    public static final SimpleRandomFeatureConfig CHERRY_FOREST_FLOWER_VEGETATION_CONFIG;
    public static final SimpleRandomFeatureConfig PLUM_FOREST_FLOWER_VEGETATION_CONFIG;
    public static final SimpleRandomFeatureConfig THUNDERCLOUD_PLUM_FOREST_FLOWER_VEGETATION_CONFIG;

    public static final RandomPatchFeatureConfig BLACK_LILY_CONFIG;
    public static final RandomPatchFeatureConfig LILAC_CONFIG;
    public static final RandomPatchFeatureConfig ORANGE_LILY_CONFIG;
    public static final RandomPatchFeatureConfig VELVET_LILY_CONFIG;

    public static final RandomPatchFeatureConfig PATCH_CLEAR_FOREST_GRASS_CONFIG;

    public static final RandomFeatureConfig ALMOND_FOREST_TREE_CONFIG;
    public static final RandomFeatureConfig ALMOND_PLUS_FOREST_TREE_CONFIG;
    public static final RandomFeatureConfig BLACK_BIRCH_FOREST_TREE_CONFIG;
    public static final RandomFeatureConfig CHERRY_CLIFFS_FOREST_TREE_CONFIG;
    public static final RandomFeatureConfig CHERRY_FOREST_TREE_CONFIG;
    public static final RandomFeatureConfig PLUM_FOREST_TREE_CONFIG;
    public static final RandomFeatureConfig THUNDERCLOUD_PLUM_FOREST_TREE_CONFIG;

    protected static RandomPatchFeatureConfig.Builder builder(BlockStateProvider provider, BlockPlacer placer) {
        return new RandomPatchFeatureConfig.Builder(provider, placer);
    }

    protected static RandomPatchFeatureConfig createDoublePlacerConfig(BlockStateProvider provider, int tries) {
        return builder(provider, DoublePlantPlacer.INSTANCE).tries(tries).cannotProject().build();
    }

    protected static RandomPatchFeatureConfig createSimplePlacerConfig(BlockStateProvider provider, int tries) {
        return builder(provider, SimpleBlockPlacer.INSTANCE).tries(tries).build();
    }

    protected static RandomPatchFeatureConfig createSimplePlacerConfig(BlockStateProvider provider) {
        return createSimplePlacerConfig(provider, 64);
    }

    static {
        BLACK_LILY_CONFIG = createDoublePlacerConfig(BLACK_LILY_PROVIDER, 64);
        LILAC_CONFIG = createDoublePlacerConfig(LILAC_PROVIDER, 64);
        ORANGE_LILY_CONFIG = createDoublePlacerConfig(ORANGE_LILY_PROVIDER, 32);
        VELVET_LILY_CONFIG = createDoublePlacerConfig(VELVET_LILY_PROVIDER, 32);

        PATCH_CLEAR_FOREST_GRASS_CONFIG = createSimplePlacerConfig(PATCH_CLEAR_FOREST_GRASS_PROVIDER, 32);

        ALMOND_FOREST_FLOWER_CONFIG = createSimplePlacerConfig(ALMOND_FOREST_FLOWER_PROVIDER);
        ALMOND_PLUS_FOREST_FLOWER_CONFIG = createSimplePlacerConfig(ALMOND_PLUS_FOREST_FLOWER_PROVIDER);
        BLACK_BIRCH_FOREST_FLOWER_CONFIG = createSimplePlacerConfig(BLACK_BIRCH_FOREST_FLOWER_PROVIDER);
        CHERRY_CLIFFS_FOREST_FLOWER_CONFIG = createSimplePlacerConfig(CHERRY_CLIFFS_FOREST_FLOWER_PROVIDER);
        CHERRY_FOREST_FLOWER_CONFIG = createSimplePlacerConfig(CHERRY_FOREST_FLOWER_PROVIDER);
        PLUM_FOREST_FLOWER_CONFIG = createSimplePlacerConfig(PLUM_FOREST_FLOWER_PROVIDER);
        THUNDERCLOUD_PLUM_FOREST_FLOWER_CONFIG = createSimplePlacerConfig(THUNDERCLOUD_PLUM_FOREST_FLOWER_PROVIDER);

        ALMOND_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> LILAC
        ));

        ALMOND_PLUS_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> LILAC
        ));

        BLACK_BIRCH_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> BLACK_LILY,
                () -> ORANGE_LILY,
                () -> VELVET_LILY
        ));

        CHERRY_CLIFFS_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> LILAC
        ));

        CHERRY_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> LILAC
        ));

        PLUM_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> ORANGE_LILY,
                () -> VELVET_LILY
        ));

        THUNDERCLOUD_PLUM_FOREST_FLOWER_VEGETATION_CONFIG = new SimpleRandomFeatureConfig(ImmutableList.of(
                () -> LILAC
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

        BLACK_BIRCH_FOREST_TREE_CONFIG = new RandomFeatureConfig(ImmutableList.of(

        ), BLACK_BIRCH);

        CHERRY_CLIFFS_FOREST_TREE_CONFIG = new RandomFeatureConfig(ImmutableList.of(
                CHERRY_REGULAR_BEEHIVES.withChance(0.25F),
                CHERRY_MORE_BEEHIVES.withChance(0.20F),
                CHERRY_HALF_BEEHIVES.withChance(0.15F),
                FANCY_CHERRY_VERY_RARE_BEEHIVES.withChance(0.25F),
                FANCY_CHERRY_REGULAR_BEEHIVES.withChance(0.20F),
                FANCY_CHERRY_MORE_BEEHIVES.withChance(0.15F),
                FANCY_CHERRY_HALF_BEEHIVES.withChance(0.15F),
                GREAT_CHERRY_VERY_RARE_BEEHIVES.withChance(0.20F),
                GREAT_CHERRY_REGULAR_BEEHIVES.withChance(0.15F),
                GREAT_CHERRY_MORE_BEEHIVES.withChance(0.15F),
                GREAT_CHERRY_HALF_BEEHIVES.withChance(0.15F)
        ), CHERRY_VERY_RARE_BEEHIVES);

        CHERRY_FOREST_TREE_CONFIG = new RandomFeatureConfig(ImmutableList.of(
                CHERRY_REGULAR_BEEHIVES.withChance(0.25F),
                CHERRY_MORE_BEEHIVES.withChance(0.20F),
                CHERRY_HALF_BEEHIVES.withChance(0.15F),
                FANCY_CHERRY_VERY_RARE_BEEHIVES.withChance(0.25F),
                FANCY_CHERRY_REGULAR_BEEHIVES.withChance(0.20F),
                FANCY_CHERRY_MORE_BEEHIVES.withChance(0.15F),
                FANCY_CHERRY_HALF_BEEHIVES.withChance(0.15F),
                GREAT_CHERRY_VERY_RARE_BEEHIVES.withChance(0.20F),
                GREAT_CHERRY_REGULAR_BEEHIVES.withChance(0.15F),
                GREAT_CHERRY_MORE_BEEHIVES.withChance(0.15F),
                GREAT_CHERRY_HALF_BEEHIVES.withChance(0.15F)
        ), CHERRY_VERY_RARE_BEEHIVES);

        PLUM_FOREST_TREE_CONFIG = new RandomFeatureConfig(ImmutableList.of(

        ), PLUM);

        THUNDERCLOUD_PLUM_FOREST_TREE_CONFIG = new RandomFeatureConfig(ImmutableList.of(

        ), THUNDERCLOUD_PLUM);

    }

}