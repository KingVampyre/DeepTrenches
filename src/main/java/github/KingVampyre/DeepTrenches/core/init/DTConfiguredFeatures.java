package github.KingVampyre.DeepTrenches.core.init;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.GreatTrunkPlacer;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ClampedIntProvider;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.heightprovider.BiasedToBottomHeightProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.OptionalInt;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockStateProviders.*;
import static github.KingVampyre.DeepTrenches.core.init.DTFeatureConfigs.*;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.CLEAR_WATER;
import static net.minecraft.block.Blocks.CALCITE;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;
import static net.minecraft.world.gen.decorator.Decorator.COUNT_EXTRA;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.*;
import static net.minecraft.world.gen.feature.OreFeatureConfig.Rules.BASE_STONE_OVERWORLD;

public class DTConfiguredFeatures {

    public static final ConfiguredFeature<TreeFeatureConfig, ?> ALMOND;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> CHERRY;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> PIN_CHERRY;

    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_ALMOND;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_CHERRY;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_PIN_CHERRY;

    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_ALMOND;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_CHERRY;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_PIN_CHERRY;

    public static final ConfiguredFeature<TreeFeatureConfig, ?> ALMOND_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> ALMOND_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> ALMOND_MORE_BEEHIVES;

    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_ALMOND_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_ALMOND_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_ALMOND_MORE_BEEHIVES;

    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_ALMOND_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_ALMOND_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_ALMOND_MORE_BEEHIVES;

    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_FLOWER;
    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_FLOWER_VEGETATION;
    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_TREE;

    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_FOREST_FLOWER;
    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_FOREST_FLOWER_VEGETATION;
    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_TREE;

    public static final ConfiguredFeature<?, ?> LAKE_CLEAR_WATER;
    public static final ConfiguredFeature<?, ?> SPRING_CLEAR_WATER;

    public static final ConfiguredFeature<?, ?> ORE_CALCITE;

    static {
        ALMOND = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                ALMOND_TRUNK_PROVIDER,
                new StraightTrunkPlacer(4, 3, 0),
                ALMOND_FOLIAGE_PROVIDER,
                ALMOND_SAPLING_PROVIDER,
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build());

        CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                CHERRY_TRUNK_PROVIDER,
                new StraightTrunkPlacer(4, 3, 0),
                CHERRY_FOLIAGE_PROVIDER,
                CHERRY_SAPLING_PROVIDER,
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build());

        PIN_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                PIN_CHERRY_TRUNK_PROVIDER,
                new StraightTrunkPlacer(4, 3, 0),
                PIN_CHERRY_FOLIAGE_PROVIDER,
                PIN_CHERRY_SAPLING_PROVIDER,
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build());

        FANCY_ALMOND = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                ALMOND_TRUNK_PROVIDER,
                new LargeOakTrunkPlacer(5, 11, 0),
                ALMOND_FOLIAGE_PROVIDER,
                ALMOND_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).ignoreVines().build());

        FANCY_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                CHERRY_TRUNK_PROVIDER,
                new LargeOakTrunkPlacer(5, 11, 0),
                CHERRY_FOLIAGE_PROVIDER,
                CHERRY_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).ignoreVines().build());

        FANCY_PIN_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                PIN_CHERRY_TRUNK_PROVIDER,
                new LargeOakTrunkPlacer(5, 11, 0),
                PIN_CHERRY_FOLIAGE_PROVIDER,
                PIN_CHERRY_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).ignoreVines().build());

        GREAT_ALMOND = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                ALMOND_TRUNK_PROVIDER,
                new GreatTrunkPlacer(12, 7, 0),
                ALMOND_FOLIAGE_PROVIDER,
                ALMOND_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).ignoreVines().build());

        GREAT_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                CHERRY_TRUNK_PROVIDER,
                new GreatTrunkPlacer(12, 7, 0),
                CHERRY_FOLIAGE_PROVIDER,
                CHERRY_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).ignoreVines().build());

        GREAT_PIN_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                PIN_CHERRY_TRUNK_PROVIDER,
                new GreatTrunkPlacer(12, 7, 0),
                PIN_CHERRY_FOLIAGE_PROVIDER,
                PIN_CHERRY_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).ignoreVines().build());

        ALMOND_VERY_RARE_BEEHIVES = Feature.TREE.configure(ALMOND.getConfig().setTreeDecorators(ImmutableList.of(VERY_RARE_BEEHIVES_TREES)));
        ALMOND_REGULAR_BEEHIVES = Feature.TREE.configure(ALMOND.getConfig().setTreeDecorators(ImmutableList.of(REGULAR_BEEHIVES_TREES)));
        ALMOND_MORE_BEEHIVES = Feature.TREE.configure(ALMOND.getConfig().setTreeDecorators(ImmutableList.of(MORE_BEEHIVES_TREES)));

        FANCY_ALMOND_VERY_RARE_BEEHIVES = Feature.TREE.configure(FANCY_ALMOND.getConfig().setTreeDecorators(ImmutableList.of(VERY_RARE_BEEHIVES_TREES)));
        FANCY_ALMOND_REGULAR_BEEHIVES = Feature.TREE.configure(FANCY_ALMOND.getConfig().setTreeDecorators(ImmutableList.of(REGULAR_BEEHIVES_TREES)));
        FANCY_ALMOND_MORE_BEEHIVES = Feature.TREE.configure(FANCY_ALMOND.getConfig().setTreeDecorators(ImmutableList.of(MORE_BEEHIVES_TREES)));

        GREAT_ALMOND_VERY_RARE_BEEHIVES = Feature.TREE.configure(GREAT_ALMOND.getConfig().setTreeDecorators(ImmutableList.of(VERY_RARE_BEEHIVES_TREES)));
        GREAT_ALMOND_REGULAR_BEEHIVES = Feature.TREE.configure(GREAT_ALMOND.getConfig().setTreeDecorators(ImmutableList.of(REGULAR_BEEHIVES_TREES)));
        GREAT_ALMOND_MORE_BEEHIVES = Feature.TREE.configure(GREAT_ALMOND.getConfig().setTreeDecorators(ImmutableList.of(MORE_BEEHIVES_TREES)));

        ALMOND_FOREST_FLOWER = Feature.FLOWER.configure(ALMOND_FOREST_FLOWER_CONFIG)
                .decorate(SPREAD_32_ABOVE)
                .decorate(SQUARE_HEIGHTMAP).repeat(2);

        ALMOND_FOREST_FLOWER_VEGETATION = Feature.SIMPLE_RANDOM_SELECTOR.configure(ALMOND_FOREST_FLOWER_VEGETATION_CONFIG)
                .repeat(ClampedIntProvider.create(UniformIntProvider.create(-3, 1), 0, 1))
                .decorate(SPREAD_32_ABOVE)
                .decorate(SQUARE_HEIGHTMAP)
                .repeat(5);

        ALMOND_FOREST_TREE = Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(
                FANCY_ALMOND_REGULAR_BEEHIVES.withChance(0.35F),
                GREAT_ALMOND_REGULAR_BEEHIVES.withChance(0.3F)
        ), ALMOND_VERY_RARE_BEEHIVES))
                .decorate(SQUARE_HEIGHTMAP_OCEAN_FLOOR_NO_WATER)
                .decorate(COUNT_EXTRA.configure(new CountExtraDecoratorConfig(10, 0.1F, 1)));

        ALMOND_PLUS_FOREST_FLOWER = Feature.FLOWER.configure(ALMOND_PLUS_FOREST_FLOWER_CONFIG)
                .decorate(SPREAD_32_ABOVE)
                .decorate(SQUARE_HEIGHTMAP).repeat(2);

        ALMOND_PLUS_FOREST_FLOWER_VEGETATION = Feature.SIMPLE_RANDOM_SELECTOR.configure(ALMOND_PLUS_FOREST_FLOWER_VEGETATION_CONFIG)
                .repeat(ClampedIntProvider.create(UniformIntProvider.create(-3, 1), 0, 1))
                .decorate(SPREAD_32_ABOVE)
                .decorate(SQUARE_HEIGHTMAP)
                .repeat(5);

        ALMOND_PLUS_TREE = Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(
                FANCY_ALMOND_REGULAR_BEEHIVES.withChance(0.175F),
                GREAT_ALMOND_REGULAR_BEEHIVES.withChance(0.15F),
                ConfiguredFeatures.BIRCH_BEES_002.withChance(0.1F),
                ConfiguredFeatures.FANCY_OAK_BEES_002.withChance(0.32F),
                ConfiguredFeatures.OAK_BEES_002.withChance(0.08F)
        ), ALMOND_VERY_RARE_BEEHIVES))
                .decorate(SQUARE_HEIGHTMAP_OCEAN_FLOOR_NO_WATER)
                .decorate(COUNT_EXTRA.configure(new CountExtraDecoratorConfig(10, 0.1F, 1)));

        LAKE_CLEAR_WATER = (Feature.LAKE
                .configure(new SingleStateFeatureConfig(CLEAR_WATER.getDefaultState()))
                .range(BOTTOM_TO_TOP)
                .spreadHorizontally()
        ).applyChance(4);

        SPRING_CLEAR_WATER = Feature.SPRING_FEATURE
                .configure(new SpringFeatureConfig(DTFluids.CLEAR_WATER.getDefaultState(), true, 4, 1, ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE)))
                .range(new RangeDecoratorConfig(BiasedToBottomHeightProvider.create(YOffset.getBottom(), YOffset.belowTop(8), 8)))
                .spreadHorizontally()
                .repeat(50);

        ORE_CALCITE = (Feature.ORE.configure(new OreFeatureConfig(BASE_STONE_OVERWORLD, CALCITE.getDefaultState(), 33))
                .uniformRange(YOffset.fixed(0), YOffset.fixed(79))
                .spreadHorizontally()
                .repeat(10));
    }

    public static void initialize() {
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond", ALMOND);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry", CHERRY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:pin_cherry", PIN_CHERRY);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond", FANCY_ALMOND);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_cherry", FANCY_CHERRY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_pin_cherry", FANCY_PIN_CHERRY);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond", GREAT_ALMOND);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_cherry", GREAT_CHERRY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_pin_cherry", GREAT_PIN_CHERRY);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_flower", ALMOND_FOREST_FLOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_flower_vegetation", ALMOND_FOREST_FLOWER_VEGETATION);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_tree", ALMOND_FOREST_TREE);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_very_rare_beehives", ALMOND_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_regular_beehives", ALMOND_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_more_beehives", ALMOND_MORE_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_very_rare_beehives", FANCY_ALMOND_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_regular_beehives", FANCY_ALMOND_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_more_beehives", FANCY_ALMOND_MORE_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_very_rare_beehives", GREAT_ALMOND_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_regular_beehives", GREAT_ALMOND_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_more_beehives", GREAT_ALMOND_MORE_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_flower", ALMOND_PLUS_FOREST_FLOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_flower_vegetation", ALMOND_PLUS_FOREST_FLOWER_VEGETATION);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_tree", ALMOND_PLUS_TREE);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:lake_clear_water", LAKE_CLEAR_WATER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:spring_clear_water", SPRING_CLEAR_WATER);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:ore_calcite", ORE_CALCITE);
    }

}