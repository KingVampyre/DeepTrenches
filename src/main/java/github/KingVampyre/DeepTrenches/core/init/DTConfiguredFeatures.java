package github.KingVampyre.DeepTrenches.core.init;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.math.intprovider.ClampedIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.heightprovider.BiasedToBottomHeightProvider;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.TreeDecorator;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockStateProviders.*;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.*;
import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredDecorators.*;
import static github.KingVampyre.DeepTrenches.core.init.DTFeatureConfigs.*;
import static net.minecraft.block.Blocks.CALCITE;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;
import static net.minecraft.world.gen.decorator.Decorator.COUNT_EXTRA;
import static net.minecraft.world.gen.feature.ConfiguredFeatures.Decorators.*;
import static net.minecraft.world.gen.feature.OreFeatureConfig.Rules.BASE_STONE_OVERWORLD;

public class DTConfiguredFeatures {

    public static final ConfiguredFeature<?, ?> FUCHSITRA_TREE_TOWARDS_X;
    public static final ConfiguredFeature<?, ?> FUCHSITRA_TREE_TOWARDS_Z;
    public static final ConfiguredFeature<?, ?> FANCY_FUCHSITRA_TOWARDS_X;
    public static final ConfiguredFeature<?, ?> FANCY_FUCHSITRA_TOWARDS_Z;
    public static final ConfiguredFeature<?, ?> GREAT_FUCHSITRA_TOWARDS_X;
    public static final ConfiguredFeature<?, ?> GREAT_FUCHSITRA_TOWARDS_Z;

    public static final ConfiguredFeature<?, ?> ALMOND;
    public static final ConfiguredFeature<?, ?> ANAMEATA;
    public static final ConfiguredFeature<?, ?> AQUEAN;
    public static final ConfiguredFeature<?, ?> BARSHROOKLE;
    public static final ConfiguredFeature<?, ?> BLACK_BIRCH;
    public static final ConfiguredFeature<?, ?> CHERRY;
    public static final ConfiguredFeature<?, ?> COOK_PINE;
    public static final ConfiguredFeature<?, ?> CROLOOD;
    public static final ConfiguredFeature<?, ?> DARK_CROLOOD;
    public static final ConfiguredFeature<?, ?> EBONY;
    public static final ConfiguredFeature<?, ?> FUCHSITRA;
    public static final ConfiguredFeature<?, ?> FUNERANITE;
    public static final ConfiguredFeature<?, ?> GHOSHROOM;
    public static final ConfiguredFeature<?, ?> PELTOGYNE;
    public static final ConfiguredFeature<?, ?> PIN_CHERRY;
    public static final ConfiguredFeature<?, ?> PLUM;
    public static final ConfiguredFeature<?, ?> PURFUNGA;
    public static final ConfiguredFeature<?, ?> SPROOM;
    public static final ConfiguredFeature<?, ?> STORTREEAN;
    public static final ConfiguredFeature<?, ?> STROOMEAN;
    public static final ConfiguredFeature<?, ?> SUNRISE_FUNGUS;
    public static final ConfiguredFeature<?, ?> TEAK;
    public static final ConfiguredFeature<?, ?> THUNDERCLOUD_PLUM;

    public static final ConfiguredFeature<?, ?> FANCY_ALMOND;
    public static final ConfiguredFeature<?, ?> FANCY_ANAMEATA;
    public static final ConfiguredFeature<?, ?> FANCY_AQUEAN;
    public static final ConfiguredFeature<?, ?> FANCY_BLACK_BIRCH;
    public static final ConfiguredFeature<?, ?> FANCY_CHERRY;
    public static final ConfiguredFeature<?, ?> FANCY_FUCHSITRA;
    public static final ConfiguredFeature<?, ?> FANCY_PIN_CHERRY;
    public static final ConfiguredFeature<?, ?> FANCY_PLUM;
    public static final ConfiguredFeature<?, ?> FANCY_TEAK;
    public static final ConfiguredFeature<?, ?> FANCY_THUNDERCLOUD_PLUM;

    public static final ConfiguredFeature<?, ?> GREAT_ALMOND;
    public static final ConfiguredFeature<?, ?> GREAT_ANAMEATA;
    public static final ConfiguredFeature<?, ?> GREAT_AQUEAN;
    public static final ConfiguredFeature<?, ?> GREAT_BLACK_BIRCH;
    public static final ConfiguredFeature<?, ?> GREAT_CHERRY;
    public static final ConfiguredFeature<?, ?> GREAT_FUCHSITRA;
    public static final ConfiguredFeature<?, ?> GREAT_PIN_CHERRY;
    public static final ConfiguredFeature<?, ?> GREAT_PLUM;
    public static final ConfiguredFeature<?, ?> GREAT_TEAK;
    public static final ConfiguredFeature<?, ?> GREAT_THUNDERCLOUD_PLUM;

    public static final ConfiguredFeature<?, ?> ALMOND_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> ALMOND_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> ALMOND_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> ALMOND_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> FANCY_ALMOND_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> FANCY_ALMOND_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> FANCY_ALMOND_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> FANCY_ALMOND_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> GREAT_ALMOND_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> GREAT_ALMOND_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> GREAT_ALMOND_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> GREAT_ALMOND_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> AQUEAN_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> AQUEAN_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> AQUEAN_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> AQUEAN_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> FANCY_AQUEAN_VERY_RARE_STASP_NEST;
    public static final ConfiguredFeature<?, ?> FANCY_AQUEAN_REGULAR_STASP_NEST;
    public static final ConfiguredFeature<?, ?> FANCY_AQUEAN_MORE_STASP_NEST;
    public static final ConfiguredFeature<?, ?> FANCY_AQUEAN_HALF_STASP_NEST;

    public static final ConfiguredFeature<?, ?> GREAT_AQUEAN_VERY_RARE_STASP_NEST;
    public static final ConfiguredFeature<?, ?> GREAT_AQUEAN_REGULAR_STASP_NEST;
    public static final ConfiguredFeature<?, ?> GREAT_AQUEAN_MORE_STASP_NEST;
    public static final ConfiguredFeature<?, ?> GREAT_AQUEAN_HALF_STASP_NEST;

    public static final ConfiguredFeature<?, ?> CHERRY_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> CHERRY_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> CHERRY_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> CHERRY_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> FANCY_CHERRY_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> FANCY_CHERRY_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> FANCY_CHERRY_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> FANCY_CHERRY_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> GREAT_CHERRY_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> GREAT_CHERRY_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> GREAT_CHERRY_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> GREAT_CHERRY_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> PIN_CHERRY_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> PIN_CHERRY_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> PIN_CHERRY_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> PIN_CHERRY_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> FANCY_PIN_CHERRY_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> FANCY_PIN_CHERRY_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> FANCY_PIN_CHERRY_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> FANCY_PIN_CHERRY_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> GREAT_PIN_CHERRY_VERY_RARE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> GREAT_PIN_CHERRY_REGULAR_BEEHIVES;
    public static final ConfiguredFeature<?, ?> GREAT_PIN_CHERRY_MORE_BEEHIVES;
    public static final ConfiguredFeature<?, ?> GREAT_PIN_CHERRY_HALF_BEEHIVES;

    public static final ConfiguredFeature<?, ?> BLACK_LILY;
    public static final ConfiguredFeature<?, ?> LILAC;
    public static final ConfiguredFeature<?, ?> ORANGE_LILY;
    public static final ConfiguredFeature<?, ?> VELVET_LILY;

    public static final ConfiguredFeature<?, ?> GRAY_SHAG_MUSHROOM;
    public static final ConfiguredFeature<?, ?> INKY_CAP_MUSHROOM;
    public static final ConfiguredFeature<?, ?> PUFFBALL_MUSHROOM;
    public static final ConfiguredFeature<?, ?> SHELF_MUSHROOM;
    public static final ConfiguredFeature<?, ?> WHITE_MUSHROOM;

    public static final ConfiguredFeature<?, ?> PATCH_GRASS_CLEAR_FOREST;

    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_FLOWER;
    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_FOREST_FLOWER;
    public static final ConfiguredFeature<?, ?> BLACK_BIRCH_FOREST_FLOWER;
    public static final ConfiguredFeature<?, ?> CHERRY_CLIFFS_FOREST_FLOWER;
    public static final ConfiguredFeature<?, ?> CHERRY_FOREST_FLOWER;
    public static final ConfiguredFeature<?, ?> PLUM_FOREST_FLOWER;
    public static final ConfiguredFeature<?, ?> THUNDERCLOUD_PLUM_FOREST_FLOWER;

    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_FLOWER_VEGETATION;
    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_FOREST_FLOWER_VEGETATION;
    public static final ConfiguredFeature<?, ?> BLACK_BIRCH_FOREST_FLOWER_VEGETATION;
    public static final ConfiguredFeature<?, ?> CHERRY_CLIFFS_FOREST_FLOWER_VEGETATION;
    public static final ConfiguredFeature<?, ?> CHERRY_FOREST_FLOWER_VEGETATION;
    public static final ConfiguredFeature<?, ?> PLUM_FOREST_FLOWER_VEGETATION;
    public static final ConfiguredFeature<?, ?> THUNDERCLOUD_PLUM_FOREST_FLOWER_VEGETATION;

    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_TREE;
    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_FOREST_TREE;
    public static final ConfiguredFeature<?, ?> BLACK_BIRCH_FOREST_TREE;
    public static final ConfiguredFeature<?, ?> CHERRY_CLIFFS_FOREST_TREE;
    public static final ConfiguredFeature<?, ?> CHERRY_FOREST_TREE;
    public static final ConfiguredFeature<?, ?> PLUM_FOREST_TREE;
    public static final ConfiguredFeature<?, ?> THUNDERCLOUD_PLUM_FOREST_TREE;

    public static final ConfiguredFeature<?, ?> LAKE_CLEAR_WATER;
    public static final ConfiguredFeature<?, ?> SPRING_CLEAR_WATER;

    public static final ConfiguredFeature<?, ?> ORE_CALCITE_UPPER;
    public static final ConfiguredFeature<?, ?> ORE_CALCITE_LOWER;

    protected static ConfiguredFeature<?, ?> createBeehiveTree(TreeFeatureConfig config, TreeDecorator ...decorators) {
        return Feature.TREE.configure(new TreeFeatureConfig.Builder(config.trunkProvider, config.trunkPlacer, config.foliageProvider, config.foliagePlacer, config.minimumSize).decorators(ImmutableList.copyOf(decorators)).build());
    }

    protected static ConfiguredFeature<?, ?> createTree(TreeFeatureConfig config, Block sapling) {
        return Feature.TREE.configure(config).method_38670(sapling);
    }

    protected static ConfiguredFeature<?, ?> createTree(SimpleRandomFeatureConfig config, Block sapling) {
        return Feature.SIMPLE_RANDOM_SELECTOR.configure(config).method_38670(sapling);
    }

    protected static ConfiguredFeature<?, ?> createTreeSelector(RandomFeatureConfig config) {
        return Feature.RANDOM_SELECTOR.configure(config).decorate(SQUARE_HEIGHTMAP_OCEAN_FLOOR_NO_WATER).decorate(COUNT_EXTRA.configure(new CountExtraDecoratorConfig(10, 0.1F, 1)));
    }

    protected static ConfiguredFeature<?, ?> createHugeMushroom(BlockStateProvider cap, BlockStateProvider stem) {
        return Feature.HUGE_BROWN_MUSHROOM.configure(new HugeMushroomFeatureConfig(cap, stem, 3));
    }

    protected static ConfiguredFeature<?, ?> createRandomPatch(RandomPatchFeatureConfig config) {
        return Feature.RANDOM_PATCH.configure(config);
    }

    protected static ConfiguredFeature<?, ?> createPatchGrass(RandomPatchFeatureConfig config) {
        return createRandomPatch(config).decorate(HEIGHTMAP_WORLD_SURFACE).spreadHorizontally().repeat(2);
    }

    protected static ConfiguredFeature<?, ?> createTallFlower(RandomPatchFeatureConfig config) {
        return createRandomPatch(config).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).applyChance(3);
    }

    protected static ConfiguredFeature<?, ?> createFlower(RandomPatchFeatureConfig config) {
        return Feature.FLOWER.configure(config)
                .decorate(SQUARE_HEIGHTMAP)
                .applyChance(2)
                .repeat(3);
    }

    protected static ConfiguredFeature<?, ?> createFlowerVegetation(SimpleRandomFeatureConfig config) {
        return Feature.SIMPLE_RANDOM_SELECTOR.configure(config)
                .repeat(ClampedIntProvider.create(UniformIntProvider.create(-3, 1), 0, 1))
                .decorate(SQUARE_HEIGHTMAP)
                .applyChance(7);
    }

    protected static ConfiguredFeature<?, ?> createLake(Block waterBlock) {
        return Feature.LAKE.configure(new SingleStateFeatureConfig(waterBlock.getDefaultState())).range(BOTTOM_TO_TOP).spreadHorizontally().applyChance(4);
    }

    protected static ConfiguredFeature<?, ?> createOreUpper(Block oreBlock) {
        return Feature.ORE.configure(new OreFeatureConfig(BASE_STONE_OVERWORLD, oreBlock.getDefaultState(), 64)).uniformRange(YOffset.fixed(64), YOffset.fixed(128)).spreadHorizontally().applyChance(6);
    }

    protected static ConfiguredFeature<?, ?> createOreLower(Block oreBlock) {
        return Feature.ORE.configure(new OreFeatureConfig(BASE_STONE_OVERWORLD, oreBlock.getDefaultState(), 64)).uniformRange(YOffset.fixed(0), YOffset.fixed(60)).spreadHorizontally().repeat(2);
    }

    protected static ConfiguredFeature<?, ?> createSpring(Fluid fluid) {
        return Feature.SPRING_FEATURE
                .configure(new SpringFeatureConfig(fluid.getDefaultState(), true, 4, 1, ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE)))
                .range(new RangeDecoratorConfig(BiasedToBottomHeightProvider.create(YOffset.getBottom(), YOffset.belowTop(8), 8)))
                .spreadHorizontally()
                .repeat(50);
    }

    static {
        FUCHSITRA_TREE_TOWARDS_X = createTree(FUCHSITRA_TREE_TOWARDS_X_CONFIG, FUCHSITRA_SAPLING);
        FUCHSITRA_TREE_TOWARDS_Z = createTree(FUCHSITRA_TREE_TOWARDS_Z_CONFIG, FUCHSITRA_SAPLING);
        FANCY_FUCHSITRA_TOWARDS_X = createTree(FANCY_FUCHSITRA_TREE_TOWARDS_X_CONFIG, FUCHSITRA_SAPLING);
        FANCY_FUCHSITRA_TOWARDS_Z = createTree(FANCY_FUCHSITRA_TREE_TOWARDS_Z_CONFIG, FUCHSITRA_SAPLING);
        GREAT_FUCHSITRA_TOWARDS_X = createTree(GREAT_FUCHSITRA_TREE_TOWARDS_X_CONFIG, FUCHSITRA_SAPLING);
        GREAT_FUCHSITRA_TOWARDS_Z = createTree(GREAT_FUCHSITRA_TREE_TOWARDS_Z_CONFIG, FUCHSITRA_SAPLING);

        ALMOND = createTree(ALMOND_TREE_CONFIG, ALMOND_SAPLING);
        ANAMEATA = createTree(ANAMEATA_TREE_CONFIG, ANAMEATA_SAPLING);
        AQUEAN = createTree(AQUEAN_TREE_CONFIG, AQUEAN_SAPLING);
        BARSHROOKLE = createTree(BARSHROOKLE_TREE_CONFIG, BARSHROOKLE_SAPLING);
        BLACK_BIRCH = createTree(BLACK_BIRCH_TREE_CONFIG, BLACK_BIRCH_SAPLING);
        CHERRY = createTree(CHERRY_TREE_CONFIG, CHERRY_SAPLING);
        COOK_PINE = createTree(COOK_PINE_TREE_CONFIG, COOK_PINE_SAPLING);
        CROLOOD = createTree(CROLOOD_TREE_CONFIG, CROLOOD_SAPLING);
        DARK_CROLOOD = createTree(DARK_CROLOOD_TREE_CONFIG, DARK_CROLOOD_SAPLING);
        EBONY = createTree(EBONY_TREE_CONFIG, EBONY_SAPLING);
        FUCHSITRA = createTree(FUCHSITRA_TREE_CONFIG, FUCHSITRA_SAPLING);
        FUNERANITE = createTree(FUNERANITE_TREE_CONFIG, FUNERANITE_SAPLING);
        GHOSHROOM = createTree(GHOSHROOM_TREE_CONFIG, GHOSHROOM_SAPLING);
        PELTOGYNE = createTree(PELTOGYNE_TREE_CONFIG, PELTOGYNE_SAPLING);
        PIN_CHERRY = createTree(PIN_CHERRY_TREE_CONFIG, PIN_CHERRY_SAPLING);
        PLUM = createTree(PLUM_TREE_CONFIG, PLUM_SAPLING);
        PURFUNGA = createTree(PURFUNGA_TREE_CONFIG, PURFUNGA_SAPLING);
        SPROOM = createTree(SPROOM_TREE_CONFIG, SPROOM_SAPLING);
        STORTREEAN = createTree(STORTREEAN_TREE_CONFIG, STORTREEAN_SAPLING);
        STROOMEAN = createTree(STROOMEAN_TREE_CONFIG, STROOMEAN_SAPLING);
        SUNRISE_FUNGUS = createTree(SUNRISE_FUNGUS_TREE_CONFIG, SUNRISE_FUNGUS_SAPLING);
        TEAK = createTree(TEAK_TREE_CONFIG, TEAK_SAPLING);
        THUNDERCLOUD_PLUM = createTree(THUNDERCLOUD_PLUM_TREE_CONFIG, THUNDERCLOUD_PLUM_SAPLING);

        FANCY_ALMOND = createTree(FANCY_ALMOND_TREE_CONFIG, ALMOND_SAPLING);
        FANCY_ANAMEATA = createTree(FANCY_ANAMEATA_TREE_CONFIG, ANAMEATA_SAPLING);
        FANCY_AQUEAN = createTree(FANCY_AQUEAN_TREE_CONFIG, AQUEAN_SAPLING);
        FANCY_BLACK_BIRCH = createTree(FANCY_BLACK_BIRCH_TREE_CONFIG, BLACK_BIRCH_SAPLING);
        FANCY_CHERRY = createTree(FANCY_CHERRY_TREE_CONFIG, CHERRY_SAPLING);
        FANCY_FUCHSITRA = createTree(FANCY_FUCHSITRA_TREE_CONFIG, FUCHSITRA_SAPLING);
        FANCY_PIN_CHERRY = createTree(FANCY_PIN_CHERRY_TREE_CONFIG, PIN_CHERRY_SAPLING);
        FANCY_PLUM = createTree(FANCY_PLUM_TREE_CONFIG, PLUM_SAPLING);
        FANCY_TEAK = createTree(FANCY_TEAK_TREE_CONFIG, TEAK_SAPLING);
        FANCY_THUNDERCLOUD_PLUM = createTree(FANCY_THUNDERCLOUD_PLUM_TREE_CONFIG, THUNDERCLOUD_PLUM_SAPLING);

        GREAT_ALMOND = createTree(GREAT_ALMOND_TREE_CONFIG, ALMOND_SAPLING);
        GREAT_ANAMEATA = createTree(GREAT_ANAMEATA_TREE_CONFIG, ANAMEATA_SAPLING);
        GREAT_AQUEAN = createTree(GREAT_AQUEAN_TREE_CONFIG, AQUEAN_SAPLING);
        GREAT_BLACK_BIRCH = createTree(GREAT_BLACK_BIRCH_TREE_CONFIG, BLACK_BIRCH_SAPLING);
        GREAT_CHERRY = createTree(GREAT_CHERRY_TREE_CONFIG, CHERRY_SAPLING);
        GREAT_FUCHSITRA = createTree(GREAT_FUCHSITRA_TREE_CONFIG, FUCHSITRA_SAPLING);
        GREAT_PIN_CHERRY = createTree(GREAT_PIN_CHERRY_TREE_CONFIG, PIN_CHERRY_SAPLING);
        GREAT_PLUM = createTree(GREAT_PLUM_TREE_CONFIG, PLUM_SAPLING);
        GREAT_TEAK = createTree(GREAT_TEAK_TREE_CONFIG, TEAK_SAPLING);
        GREAT_THUNDERCLOUD_PLUM = createTree(GREAT_THUNDERCLOUD_PLUM_TREE_CONFIG, THUNDERCLOUD_PLUM_SAPLING);

        ALMOND_VERY_RARE_BEEHIVES = createBeehiveTree(ALMOND_TREE_CONFIG, VERY_RARE_BEEHIVES_TREES);
        ALMOND_REGULAR_BEEHIVES = createBeehiveTree(ALMOND_TREE_CONFIG, REGULAR_BEEHIVES_TREES);
        ALMOND_MORE_BEEHIVES = createBeehiveTree(ALMOND_TREE_CONFIG, MORE_BEEHIVES_TREES);
        ALMOND_HALF_BEEHIVES = createBeehiveTree(ALMOND_TREE_CONFIG, HALF_BEEHIVES_TREES);

        FANCY_ALMOND_VERY_RARE_BEEHIVES = createBeehiveTree(FANCY_ALMOND_TREE_CONFIG, VERY_RARE_BEEHIVES_TREES);
        FANCY_ALMOND_REGULAR_BEEHIVES = createBeehiveTree(FANCY_ALMOND_TREE_CONFIG, REGULAR_BEEHIVES_TREES);
        FANCY_ALMOND_MORE_BEEHIVES = createBeehiveTree(FANCY_ALMOND_TREE_CONFIG, MORE_BEEHIVES_TREES);
        FANCY_ALMOND_HALF_BEEHIVES = createBeehiveTree(FANCY_ALMOND_TREE_CONFIG, HALF_BEEHIVES_TREES);

        GREAT_ALMOND_VERY_RARE_BEEHIVES = createBeehiveTree(GREAT_ALMOND_TREE_CONFIG, VERY_RARE_BEEHIVES_TREES);
        GREAT_ALMOND_REGULAR_BEEHIVES = createBeehiveTree(GREAT_ALMOND_TREE_CONFIG, REGULAR_BEEHIVES_TREES);
        GREAT_ALMOND_MORE_BEEHIVES = createBeehiveTree(GREAT_ALMOND_TREE_CONFIG, MORE_BEEHIVES_TREES);
        GREAT_ALMOND_HALF_BEEHIVES = createBeehiveTree(GREAT_ALMOND_TREE_CONFIG, HALF_BEEHIVES_TREES);

        AQUEAN_VERY_RARE_BEEHIVES = createBeehiveTree(AQUEAN_TREE_CONFIG, VERY_RARE_STASP_NEST_TREES);
        AQUEAN_REGULAR_BEEHIVES = createBeehiveTree(AQUEAN_TREE_CONFIG, REGULAR_STASP_NEST_TREES);
        AQUEAN_MORE_BEEHIVES = createBeehiveTree(AQUEAN_TREE_CONFIG, MORE_STASP_NEST_TREES);
        AQUEAN_HALF_BEEHIVES = createBeehiveTree(AQUEAN_TREE_CONFIG, HALF_STASP_NEST_TREES);

        FANCY_AQUEAN_VERY_RARE_STASP_NEST = createBeehiveTree(AQUEAN_TREE_CONFIG, VERY_RARE_STASP_NEST_TREES);
        FANCY_AQUEAN_REGULAR_STASP_NEST = createBeehiveTree(AQUEAN_TREE_CONFIG, REGULAR_STASP_NEST_TREES);
        FANCY_AQUEAN_MORE_STASP_NEST = createBeehiveTree(AQUEAN_TREE_CONFIG, MORE_STASP_NEST_TREES);
        FANCY_AQUEAN_HALF_STASP_NEST = createBeehiveTree(AQUEAN_TREE_CONFIG, HALF_STASP_NEST_TREES);

        GREAT_AQUEAN_VERY_RARE_STASP_NEST = createBeehiveTree(AQUEAN_TREE_CONFIG, VERY_RARE_STASP_NEST_TREES);
        GREAT_AQUEAN_REGULAR_STASP_NEST = createBeehiveTree(AQUEAN_TREE_CONFIG, REGULAR_STASP_NEST_TREES);
        GREAT_AQUEAN_MORE_STASP_NEST = createBeehiveTree(AQUEAN_TREE_CONFIG, MORE_STASP_NEST_TREES);
        GREAT_AQUEAN_HALF_STASP_NEST = createBeehiveTree(AQUEAN_TREE_CONFIG, HALF_STASP_NEST_TREES);

        CHERRY_VERY_RARE_BEEHIVES = createBeehiveTree(CHERRY_TREE_CONFIG, VERY_RARE_BEEHIVES_TREES);
        CHERRY_REGULAR_BEEHIVES = createBeehiveTree(CHERRY_TREE_CONFIG, REGULAR_BEEHIVES_TREES);
        CHERRY_MORE_BEEHIVES = createBeehiveTree(CHERRY_TREE_CONFIG, MORE_BEEHIVES_TREES);
        CHERRY_HALF_BEEHIVES = createBeehiveTree(CHERRY_TREE_CONFIG, HALF_BEEHIVES_TREES);

        FANCY_CHERRY_VERY_RARE_BEEHIVES = createBeehiveTree(FANCY_CHERRY_TREE_CONFIG, VERY_RARE_BEEHIVES_TREES);
        FANCY_CHERRY_REGULAR_BEEHIVES = createBeehiveTree(FANCY_CHERRY_TREE_CONFIG, REGULAR_BEEHIVES_TREES);
        FANCY_CHERRY_MORE_BEEHIVES = createBeehiveTree(FANCY_CHERRY_TREE_CONFIG, MORE_BEEHIVES_TREES);
        FANCY_CHERRY_HALF_BEEHIVES = createBeehiveTree(FANCY_CHERRY_TREE_CONFIG, HALF_BEEHIVES_TREES);

        GREAT_CHERRY_VERY_RARE_BEEHIVES = createBeehiveTree(GREAT_CHERRY_TREE_CONFIG, VERY_RARE_BEEHIVES_TREES);
        GREAT_CHERRY_REGULAR_BEEHIVES = createBeehiveTree(GREAT_CHERRY_TREE_CONFIG, REGULAR_BEEHIVES_TREES);
        GREAT_CHERRY_MORE_BEEHIVES = createBeehiveTree(GREAT_CHERRY_TREE_CONFIG, MORE_BEEHIVES_TREES);
        GREAT_CHERRY_HALF_BEEHIVES = createBeehiveTree(GREAT_CHERRY_TREE_CONFIG, HALF_BEEHIVES_TREES);

        PIN_CHERRY_VERY_RARE_BEEHIVES = createBeehiveTree(PIN_CHERRY_TREE_CONFIG, VERY_RARE_BEEHIVES_TREES);
        PIN_CHERRY_REGULAR_BEEHIVES = createBeehiveTree(PIN_CHERRY_TREE_CONFIG, REGULAR_BEEHIVES_TREES);
        PIN_CHERRY_MORE_BEEHIVES = createBeehiveTree(PIN_CHERRY_TREE_CONFIG, MORE_BEEHIVES_TREES);
        PIN_CHERRY_HALF_BEEHIVES = createBeehiveTree(PIN_CHERRY_TREE_CONFIG, HALF_BEEHIVES_TREES);

        FANCY_PIN_CHERRY_VERY_RARE_BEEHIVES = createBeehiveTree(FANCY_PIN_CHERRY_TREE_CONFIG, VERY_RARE_BEEHIVES_TREES);
        FANCY_PIN_CHERRY_REGULAR_BEEHIVES = createBeehiveTree(FANCY_PIN_CHERRY_TREE_CONFIG, REGULAR_BEEHIVES_TREES);
        FANCY_PIN_CHERRY_MORE_BEEHIVES = createBeehiveTree(FANCY_PIN_CHERRY_TREE_CONFIG, MORE_BEEHIVES_TREES);
        FANCY_PIN_CHERRY_HALF_BEEHIVES = createBeehiveTree(FANCY_PIN_CHERRY_TREE_CONFIG, HALF_BEEHIVES_TREES);

        GREAT_PIN_CHERRY_VERY_RARE_BEEHIVES = createBeehiveTree(GREAT_PIN_CHERRY_TREE_CONFIG, VERY_RARE_BEEHIVES_TREES);
        GREAT_PIN_CHERRY_REGULAR_BEEHIVES = createBeehiveTree(GREAT_PIN_CHERRY_TREE_CONFIG, REGULAR_BEEHIVES_TREES);
        GREAT_PIN_CHERRY_MORE_BEEHIVES = createBeehiveTree(GREAT_PIN_CHERRY_TREE_CONFIG, MORE_BEEHIVES_TREES);
        GREAT_PIN_CHERRY_HALF_BEEHIVES = createBeehiveTree(GREAT_PIN_CHERRY_TREE_CONFIG, HALF_BEEHIVES_TREES);

        BLACK_LILY = createTallFlower(BLACK_LILY_CONFIG);
        LILAC = createTallFlower(LILAC_CONFIG);
        ORANGE_LILY = createTallFlower(ORANGE_LILY_CONFIG);
        VELVET_LILY = createTallFlower(VELVET_LILY_CONFIG);

        GRAY_SHAG_MUSHROOM = createHugeMushroom(GRAY_SHAG_MUSHROOM_CAP_PROVIDER, GRAY_SHAG_MUSHROOM_STEM_PROVIDER);
        INKY_CAP_MUSHROOM = createHugeMushroom(INKY_CAP_MUSHROOM_CAP_PROVIDER, INKY_CAP_MUSHROOM_STEM_PROVIDER);
        PUFFBALL_MUSHROOM = createHugeMushroom(PUFFBALL_MUSHROOM_CAP_PROVIDER, PUFFBALL_MUSHROOM_STEM_PROVIDER);
        SHELF_MUSHROOM = createHugeMushroom(SHELF_MUSHROOM_CAP_PROVIDER, SHELF_MUSHROOM_STEM_PROVIDER);
        WHITE_MUSHROOM = createHugeMushroom(WHITE_MUSHROOM_CAP_PROVIDER, WHITE_MUSHROOM_STEM_PROVIDER);

        PATCH_GRASS_CLEAR_FOREST = createPatchGrass(PATCH_GRASS_CLEAR_FOREST_CONFIG);

        ALMOND_FOREST_FLOWER = createFlower(ALMOND_FOREST_FLOWER_CONFIG);
        ALMOND_PLUS_FOREST_FLOWER = createFlower(ALMOND_PLUS_FOREST_FLOWER_CONFIG);
        BLACK_BIRCH_FOREST_FLOWER = createFlower(BLACK_BIRCH_FOREST_FLOWER_CONFIG);
        CHERRY_CLIFFS_FOREST_FLOWER = createFlower(CHERRY_CLIFFS_FOREST_FLOWER_CONFIG);
        CHERRY_FOREST_FLOWER = createFlower(CHERRY_FOREST_FLOWER_CONFIG);
        PLUM_FOREST_FLOWER = createFlower(PLUM_FOREST_FLOWER_CONFIG);
        THUNDERCLOUD_PLUM_FOREST_FLOWER = createFlower(THUNDERCLOUD_PLUM_FOREST_FLOWER_CONFIG);

        ALMOND_FOREST_FLOWER_VEGETATION = createFlowerVegetation(ALMOND_FOREST_FLOWER_VEGETATION_CONFIG);
        ALMOND_PLUS_FOREST_FLOWER_VEGETATION = createFlowerVegetation(ALMOND_PLUS_FOREST_FLOWER_VEGETATION_CONFIG);
        BLACK_BIRCH_FOREST_FLOWER_VEGETATION = createFlowerVegetation(BLACK_BIRCH_FOREST_FLOWER_VEGETATION_CONFIG);
        CHERRY_CLIFFS_FOREST_FLOWER_VEGETATION = createFlowerVegetation(CHERRY_CLIFFS_FOREST_FLOWER_VEGETATION_CONFIG);
        CHERRY_FOREST_FLOWER_VEGETATION = createFlowerVegetation(CHERRY_FOREST_FLOWER_VEGETATION_CONFIG);
        PLUM_FOREST_FLOWER_VEGETATION = createFlowerVegetation(PLUM_FOREST_FLOWER_VEGETATION_CONFIG);
        THUNDERCLOUD_PLUM_FOREST_FLOWER_VEGETATION = createFlowerVegetation(THUNDERCLOUD_PLUM_FOREST_FLOWER_VEGETATION_CONFIG);

        ALMOND_FOREST_TREE = createTreeSelector(new RandomFeatureConfig(ImmutableList.of(
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
        ), ALMOND_VERY_RARE_BEEHIVES));

        ALMOND_PLUS_FOREST_TREE = createTreeSelector(new RandomFeatureConfig(ImmutableList.of(
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
                ConfiguredFeatures.FANCY_OAK_BEES_005.withChance(0.32F),
                ConfiguredFeatures.OAK_BEES_002.withChance(0.16F),
                ConfiguredFeatures.OAK_BEES_005.withChance(0.16F)
        ), ALMOND_VERY_RARE_BEEHIVES));

        BLACK_BIRCH_FOREST_TREE = createTreeSelector(new RandomFeatureConfig(ImmutableList.of(

        ), BLACK_BIRCH));

        CHERRY_CLIFFS_FOREST_TREE = createTreeSelector(new RandomFeatureConfig(ImmutableList.of(
                CHERRY_REGULAR_BEEHIVES.withChance(0.55F),
                CHERRY_MORE_BEEHIVES.withChance(0.07F),
                CHERRY_HALF_BEEHIVES.withChance(0.05F),
                FANCY_CHERRY_VERY_RARE_BEEHIVES.withChance(0.25F),
                FANCY_CHERRY_REGULAR_BEEHIVES.withChance(0.20F),
                FANCY_CHERRY_MORE_BEEHIVES.withChance(0.10F),
                FANCY_CHERRY_HALF_BEEHIVES.withChance(0.10F),
                GREAT_CHERRY_VERY_RARE_BEEHIVES.withChance(0.25F),
                GREAT_CHERRY_REGULAR_BEEHIVES.withChance(0.15F),
                GREAT_CHERRY_MORE_BEEHIVES.withChance(0.10F),
                GREAT_CHERRY_HALF_BEEHIVES.withChance(0.10F)
        ), CHERRY_VERY_RARE_BEEHIVES));

        CHERRY_FOREST_TREE = createTreeSelector(new RandomFeatureConfig(ImmutableList.of(
                CHERRY_REGULAR_BEEHIVES.withChance(0.55F),
                CHERRY_MORE_BEEHIVES.withChance(0.07F),
                CHERRY_HALF_BEEHIVES.withChance(0.05F),
                FANCY_CHERRY_VERY_RARE_BEEHIVES.withChance(0.35F),
                FANCY_CHERRY_REGULAR_BEEHIVES.withChance(0.30F),
                FANCY_CHERRY_MORE_BEEHIVES.withChance(0.10F),
                FANCY_CHERRY_HALF_BEEHIVES.withChance(0.10F),
                GREAT_CHERRY_VERY_RARE_BEEHIVES.withChance(0.25F),
                GREAT_CHERRY_REGULAR_BEEHIVES.withChance(0.15F),
                GREAT_CHERRY_MORE_BEEHIVES.withChance(0.10F),
                GREAT_CHERRY_HALF_BEEHIVES.withChance(0.10F)
        ), CHERRY_VERY_RARE_BEEHIVES));

        PLUM_FOREST_TREE = createTreeSelector(new RandomFeatureConfig(ImmutableList.of(

        ), PLUM));

        THUNDERCLOUD_PLUM_FOREST_TREE = createTreeSelector(new RandomFeatureConfig(ImmutableList.of(

        ), THUNDERCLOUD_PLUM));

        LAKE_CLEAR_WATER = createLake(CLEAR_WATER);

        SPRING_CLEAR_WATER = createSpring(DTFluids.CLEAR_WATER);

        ORE_CALCITE_LOWER = createOreLower(CALCITE);
        ORE_CALCITE_UPPER = createOreUpper(CALCITE);
    }

    public static void initialize() {
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fuchsitra_tree_towards_x", FUCHSITRA_TREE_TOWARDS_X);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fuchsitra_tree_towards_z", FUCHSITRA_TREE_TOWARDS_Z);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_fuchsitra_tree_towards_x", FANCY_FUCHSITRA_TOWARDS_X);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_fuchsitra_tree_towards_z", FANCY_FUCHSITRA_TOWARDS_Z);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_fuchsitra_tree_towards_x", GREAT_FUCHSITRA_TOWARDS_X);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_fuchsitra_tree_towards_z", GREAT_FUCHSITRA_TOWARDS_Z);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond", ALMOND);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:anameata", ANAMEATA);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:aquean", AQUEAN);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:barshrookle", BARSHROOKLE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:black_birch", BLACK_BIRCH);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry", CHERRY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cook_pine", COOK_PINE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:crolood", CROLOOD);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:dark_crolood", DARK_CROLOOD);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:ebony", EBONY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fuchsitra", FUCHSITRA);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:funeranite", FUNERANITE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:ghoshroom", GHOSHROOM);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:peltogyne", PELTOGYNE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:pin_cherry", PIN_CHERRY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:plum", PLUM);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:purfunga", PURFUNGA);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:sproom", SPROOM);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:stortreean", STORTREEAN);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:stroomean", STROOMEAN);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:sunrise_fungus", SUNRISE_FUNGUS);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:teak", TEAK);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:thundercloud_plum", THUNDERCLOUD_PLUM);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_almond", FANCY_ALMOND);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_anameata", FANCY_ANAMEATA);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_aquean", FANCY_AQUEAN);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_black_birch", FANCY_BLACK_BIRCH);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_cherry", FANCY_CHERRY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_fuchsitra", FANCY_FUCHSITRA);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_pin_cherry", FANCY_PIN_CHERRY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_plum", FANCY_PLUM);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_teak", FANCY_TEAK);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_thundercloud_plum", FANCY_THUNDERCLOUD_PLUM);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_almond", GREAT_ALMOND);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_anameata", GREAT_ANAMEATA);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_aquean", GREAT_AQUEAN);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_black_birch", GREAT_BLACK_BIRCH);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_cherry", GREAT_CHERRY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_fuchsitra", GREAT_FUCHSITRA);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_pin_cherry", GREAT_PIN_CHERRY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_plum", GREAT_PLUM);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_teak", GREAT_TEAK);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_thundercloud_plum", GREAT_THUNDERCLOUD_PLUM);

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

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_aquean_very_rare_stasp_nest", FANCY_AQUEAN_VERY_RARE_STASP_NEST);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_aquean_regular_stasp_nest", FANCY_AQUEAN_REGULAR_STASP_NEST);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_aquean_more_stasp_nest", FANCY_AQUEAN_MORE_STASP_NEST);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_aquean_half_stasp_nest", FANCY_AQUEAN_HALF_STASP_NEST);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_aquean_very_rare_stasp_nest", GREAT_AQUEAN_VERY_RARE_STASP_NEST);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_aquean_regular_stasp_nest", GREAT_AQUEAN_REGULAR_STASP_NEST);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_aquean_more_stasp_nest", GREAT_AQUEAN_MORE_STASP_NEST);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_aquean_half_stasp_nest", GREAT_AQUEAN_HALF_STASP_NEST);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_very_rare_beehives", CHERRY_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_regular_beehives", CHERRY_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_more_beehives", CHERRY_MORE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_half_beehives", CHERRY_HALF_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_cherry_very_rare_beehives", FANCY_CHERRY_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_cherry_regular_beehives", FANCY_CHERRY_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_cherry_more_beehives", FANCY_CHERRY_MORE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_cherry_half_beehives", FANCY_CHERRY_HALF_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_cherry_very_rare_beehives", GREAT_CHERRY_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_cherry_regular_beehives", GREAT_CHERRY_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_cherry_more_beehives", GREAT_CHERRY_MORE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_cherry_half_beehives", GREAT_CHERRY_HALF_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:pin_cherry_very_rare_beehives", PIN_CHERRY_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:pin_cherry_regular_beehives", PIN_CHERRY_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:pin_cherry_more_beehives", PIN_CHERRY_MORE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:pin_cherry_half_beehives", PIN_CHERRY_HALF_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_pin_cherry_very_rare_beehives", FANCY_PIN_CHERRY_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_pin_cherry_regular_beehives", FANCY_PIN_CHERRY_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_pin_cherry_more_beehives", FANCY_PIN_CHERRY_MORE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:fancy_pin_cherry_half_beehives", FANCY_PIN_CHERRY_HALF_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_pin_cherry_very_rare_beehives", GREAT_PIN_CHERRY_VERY_RARE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_pin_cherry_regular_beehives", GREAT_PIN_CHERRY_REGULAR_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_pin_cherry_more_beehives", GREAT_PIN_CHERRY_MORE_BEEHIVES);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:great_pin_cherry_half_beehives", GREAT_PIN_CHERRY_HALF_BEEHIVES);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:black_lily", BLACK_LILY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:lilac", LILAC);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:orange_lily", ORANGE_LILY);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:velvet_lily", VELVET_LILY);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:patch_grass_clear_forest", PATCH_GRASS_CLEAR_FOREST);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_flower", ALMOND_FOREST_FLOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_flower", ALMOND_PLUS_FOREST_FLOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:black_birch_forest_flower", BLACK_BIRCH_FOREST_FLOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_cliffs_forest_flower", CHERRY_CLIFFS_FOREST_FLOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_forest_flower", CHERRY_FOREST_FLOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:plum_forest_flower", PLUM_FOREST_FLOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:thundercloud_plum_forest_flower", THUNDERCLOUD_PLUM_FOREST_FLOWER);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_flower_vegetation", ALMOND_FOREST_FLOWER_VEGETATION);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_flower_vegetation", ALMOND_PLUS_FOREST_FLOWER_VEGETATION);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:black_birch_forest_flower_vegetation", BLACK_BIRCH_FOREST_FLOWER_VEGETATION);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_cliffs_forest_flower_vegetation", CHERRY_CLIFFS_FOREST_FLOWER_VEGETATION);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_forest_flower_vegetation", CHERRY_FOREST_FLOWER_VEGETATION);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:plum_forest_flower_vegetation", PLUM_FOREST_FLOWER_VEGETATION);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:thundercloud_plum_forest_flower_vegetation", THUNDERCLOUD_PLUM_FOREST_FLOWER_VEGETATION);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_forest_tree", ALMOND_FOREST_TREE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:almond_plus_forest_tree", ALMOND_PLUS_FOREST_TREE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:black_birch_forest_tree", BLACK_BIRCH_FOREST_TREE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_cliffs_forest_tree", CHERRY_CLIFFS_FOREST_TREE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:cherry_forest_tree", CHERRY_FOREST_TREE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:plum_forest_tree", PLUM_FOREST_TREE);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:thundercloud_plum_forest_tree", THUNDERCLOUD_PLUM_FOREST_TREE);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:lake_clear_water", LAKE_CLEAR_WATER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:spring_clear_water", SPRING_CLEAR_WATER);

        Registry.register(CONFIGURED_FEATURE, "deep_trenches:ore_calcite_lower", ORE_CALCITE_LOWER);
        Registry.register(CONFIGURED_FEATURE, "deep_trenches:ore_calcite_upper", ORE_CALCITE_UPPER);
    }

}