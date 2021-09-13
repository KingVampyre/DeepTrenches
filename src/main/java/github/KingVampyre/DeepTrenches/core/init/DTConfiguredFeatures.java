package github.KingVampyre.DeepTrenches.core.init;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.GreatTrunkPlacer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
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
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.OptionalInt;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockStateProviders.*;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.CLEAR_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTFeatureConfigs.*;
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
    public static final ConfiguredFeature<TreeFeatureConfig, ?> ALMOND_HALF_BEEHIVES;

    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_ALMOND_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_ALMOND_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_ALMOND_MORE_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_ALMOND_HALF_BEEHIVES;

    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_ALMOND_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_ALMOND_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_ALMOND_MORE_BEEHIVES;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_ALMOND_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_FLOWER;
    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_FOREST_FLOWER;

    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_FLOWER_VEGETATION;
    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_FOREST_FLOWER_VEGETATION;

    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_TREE;
    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_FOREST_TREE;

    public static final ConfiguredFeature<?, ?> LAKE_CLEAR_WATER;
    public static final ConfiguredFeature<?, ?> SPRING_CLEAR_WATER;

    public static final ConfiguredFeature<?, ?> ORE_CALCITE;

    protected static ConfiguredFeature<TreeFeatureConfig, ?> createTree(ConfiguredFeature<TreeFeatureConfig, ?> tree, TreeDecorator ...decorators) {
        return Feature.TREE.configure(tree.getConfig().setTreeDecorators(ImmutableList.copyOf(decorators)));
    }

    protected static ConfiguredFeature<?, ?> createTree(RandomFeatureConfig config) {
        return Feature.RANDOM_SELECTOR.configure(config)
                .decorate(SQUARE_HEIGHTMAP_OCEAN_FLOOR_NO_WATER)
                .decorate(COUNT_EXTRA.configure(new CountExtraDecoratorConfig(10, 0.1F, 1)));
    }

    protected static ConfiguredFeature<TreeFeatureConfig, ?> createBlobTree(BlockStateProvider trunk, BlockStateProvider foliage, BlockStateProvider sapling) {
        return Feature.TREE.configure(new TreeFeatureConfig.Builder(trunk, new StraightTrunkPlacer(4, 3, 0), foliage, sapling, new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
    }

    protected static ConfiguredFeature<TreeFeatureConfig, ?> createFancyTree(BlockStateProvider trunk, BlockStateProvider foliage, BlockStateProvider sapling) {
        return Feature.TREE.configure(new TreeFeatureConfig.Builder(trunk, new LargeOakTrunkPlacer(5, 11, 0), foliage, sapling, new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
    }

    protected static ConfiguredFeature<TreeFeatureConfig, ?> createGreatTree(BlockStateProvider trunk, BlockStateProvider foliage, BlockStateProvider sapling) {
        return Feature.TREE.configure(new TreeFeatureConfig.Builder(trunk, new GreatTrunkPlacer(12, 7, 0), foliage, sapling, new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
    }

    protected static ConfiguredFeature<?, ?> createFlower(RandomPatchFeatureConfig config) {
        return Feature.FLOWER.configure(config).decorate(SPREAD_32_ABOVE).decorate(SQUARE_HEIGHTMAP).repeat(2);
    }

    protected static ConfiguredFeature<?, ?> createFlowerVegetation(SimpleRandomFeatureConfig config) {
        return Feature.SIMPLE_RANDOM_SELECTOR.configure(config)
                .repeat(ClampedIntProvider.create(UniformIntProvider.create(-3, 1), 0, 1))
                .decorate(SPREAD_32_ABOVE)
                .decorate(SQUARE_HEIGHTMAP)
                .repeat(5);
    }

    protected static ConfiguredFeature<?, ?> createLake(Block waterBlock) {
        return Feature.LAKE.configure(new SingleStateFeatureConfig(waterBlock.getDefaultState())).range(BOTTOM_TO_TOP).spreadHorizontally().applyChance(4);
    }

    protected static ConfiguredFeature<?, ?> createOre(Block oreBlock) {
        return Feature.ORE.configure(new OreFeatureConfig(BASE_STONE_OVERWORLD, oreBlock.getDefaultState(), 33))
                .uniformRange(YOffset.fixed(0), YOffset.fixed(79))
                .spreadHorizontally()
                .repeat(10);
    }

    protected static ConfiguredFeature<?, ?> createSpring(Fluid fluid) {
        return Feature.SPRING_FEATURE
                .configure(new SpringFeatureConfig(fluid.getDefaultState(), true, 4, 1, ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE)))
                .range(new RangeDecoratorConfig(BiasedToBottomHeightProvider.create(YOffset.getBottom(), YOffset.belowTop(8), 8)))
                .spreadHorizontally()
                .repeat(50);
    }

    static {
        ALMOND = createBlobTree(ALMOND_TRUNK_PROVIDER, ALMOND_FOLIAGE_PROVIDER, ALMOND_SAPLING_PROVIDER);
        CHERRY = createBlobTree(CHERRY_TRUNK_PROVIDER, CHERRY_FOLIAGE_PROVIDER, CHERRY_SAPLING_PROVIDER);
        PIN_CHERRY = createBlobTree(PIN_CHERRY_TRUNK_PROVIDER, PIN_CHERRY_FOLIAGE_PROVIDER, PIN_CHERRY_SAPLING_PROVIDER);

        FANCY_ALMOND = createFancyTree(ALMOND_TRUNK_PROVIDER, ALMOND_FOLIAGE_PROVIDER, ALMOND_SAPLING_PROVIDER);
        FANCY_CHERRY = createFancyTree(CHERRY_TRUNK_PROVIDER, CHERRY_FOLIAGE_PROVIDER, CHERRY_SAPLING_PROVIDER);
        FANCY_PIN_CHERRY = createFancyTree(PIN_CHERRY_TRUNK_PROVIDER, PIN_CHERRY_FOLIAGE_PROVIDER, PIN_CHERRY_SAPLING_PROVIDER);

        GREAT_ALMOND = createGreatTree(ALMOND_TRUNK_PROVIDER, ALMOND_FOLIAGE_PROVIDER, ALMOND_SAPLING_PROVIDER);
        GREAT_CHERRY = createGreatTree(CHERRY_TRUNK_PROVIDER, CHERRY_FOLIAGE_PROVIDER, CHERRY_SAPLING_PROVIDER);
        GREAT_PIN_CHERRY = createGreatTree(PIN_CHERRY_TRUNK_PROVIDER, PIN_CHERRY_FOLIAGE_PROVIDER, PIN_CHERRY_SAPLING_PROVIDER);

        ALMOND_VERY_RARE_BEEHIVES = createTree(ALMOND, VERY_RARE_BEEHIVES_TREES);
        ALMOND_REGULAR_BEEHIVES = createTree(ALMOND, REGULAR_BEEHIVES_TREES);
        ALMOND_MORE_BEEHIVES = createTree(ALMOND, MORE_BEEHIVES_TREES);
        ALMOND_HALF_BEEHIVES = createTree(ALMOND, HALF_BEEHIVES_TREES);

        FANCY_ALMOND_VERY_RARE_BEEHIVES = createTree(FANCY_ALMOND, VERY_RARE_BEEHIVES_TREES);
        FANCY_ALMOND_REGULAR_BEEHIVES = createTree(FANCY_ALMOND, REGULAR_BEEHIVES_TREES);
        FANCY_ALMOND_MORE_BEEHIVES = createTree(FANCY_ALMOND, MORE_BEEHIVES_TREES);
        FANCY_ALMOND_HALF_BEEHIVES = createTree(FANCY_ALMOND, HALF_BEEHIVES_TREES);

        GREAT_ALMOND_VERY_RARE_BEEHIVES = createTree(GREAT_ALMOND, VERY_RARE_BEEHIVES_TREES);
        GREAT_ALMOND_REGULAR_BEEHIVES = createTree(GREAT_ALMOND, REGULAR_BEEHIVES_TREES);
        GREAT_ALMOND_MORE_BEEHIVES = createTree(GREAT_ALMOND, MORE_BEEHIVES_TREES);
        GREAT_ALMOND_HALF_BEEHIVES = createTree(GREAT_ALMOND, HALF_BEEHIVES_TREES);

        ALMOND_FOREST_FLOWER = createFlower(ALMOND_FOREST_FLOWER_CONFIG);
        ALMOND_PLUS_FOREST_FLOWER = createFlower(ALMOND_PLUS_FOREST_FLOWER_CONFIG);

        ALMOND_FOREST_FLOWER_VEGETATION = createFlowerVegetation(ALMOND_FOREST_FLOWER_VEGETATION_CONFIG);
        ALMOND_PLUS_FOREST_FLOWER_VEGETATION = createFlowerVegetation(ALMOND_PLUS_FOREST_FLOWER_VEGETATION_CONFIG);

        ALMOND_FOREST_TREE = createTree(ALMOND_FOREST_TREE_CONFIG);
        ALMOND_PLUS_FOREST_TREE = createTree(ALMOND_PLUS_FOREST_TREE_CONFIG);

        LAKE_CLEAR_WATER = createLake(CLEAR_WATER);

        SPRING_CLEAR_WATER = createSpring(DTFluids.CLEAR_WATER);

        ORE_CALCITE = createOre(CALCITE);
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

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_very_rare_beehives", ALMOND_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_regular_beehives", ALMOND_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_more_beehives", ALMOND_MORE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_half_beehives", ALMOND_HALF_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_very_rare_beehives", FANCY_ALMOND_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_regular_beehives", FANCY_ALMOND_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_more_beehives", FANCY_ALMOND_MORE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond_half_beehives", FANCY_ALMOND_HALF_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_very_rare_beehives", GREAT_ALMOND_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_regular_beehives", GREAT_ALMOND_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_more_beehives", GREAT_ALMOND_MORE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond_half_beehives", GREAT_ALMOND_HALF_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_flower", ALMOND_FOREST_FLOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_flower", ALMOND_PLUS_FOREST_FLOWER);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_flower_vegetation", ALMOND_FOREST_FLOWER_VEGETATION);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_flower_vegetation", ALMOND_PLUS_FOREST_FLOWER_VEGETATION);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_tree", ALMOND_FOREST_TREE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_tree", ALMOND_PLUS_FOREST_TREE);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:lake_clear_water", LAKE_CLEAR_WATER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:spring_clear_water", SPRING_CLEAR_WATER);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:ore_calcite", ORE_CALCITE);
    }

}