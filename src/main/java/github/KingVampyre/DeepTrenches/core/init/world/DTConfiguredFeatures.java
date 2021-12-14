package github.KingVampyre.DeepTrenches.core.init.world;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import github.KingVampyre.DeepTrenches.core.init.DTFluids;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.TreeDecorator;

import java.util.List;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlockStateProviders.*;
import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.CLEAR_WATER;
import static github.KingVampyre.DeepTrenches.core.init.world.DTConfiguredDecorators.*;
import static github.KingVampyre.DeepTrenches.core.init.world.DTFeatureConfigs.*;
import static github.KingVampyre.DeepTrenches.core.init.world.DTOreFeatureTargets.*;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.world.gen.feature.OreConfiguredFeatures.BASE_STONE_OVERWORLD;
import static net.minecraft.world.gen.feature.TreeConfiguredFeatures.*;

public class DTConfiguredFeatures {

    public static final ConfiguredFeature<?, ?> FUCHSITRA_TOWARDS_X;
    public static final ConfiguredFeature<?, ?> FUCHSITRA_TOWARDS_Z;
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

    public static final ConfiguredFeature<?, ?> ALMOND_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> ALMOND_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> ALMOND_MORE_BEES;
    public static final ConfiguredFeature<?, ?> ALMOND_BEES;

    public static final ConfiguredFeature<?, ?> FANCY_ALMOND_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> FANCY_ALMOND_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> FANCY_ALMOND_MORE_BEES;
    public static final ConfiguredFeature<?, ?> FANCY_ALMOND_BEES;

    public static final ConfiguredFeature<?, ?> GREAT_ALMOND_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> GREAT_ALMOND_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> GREAT_ALMOND_MORE_BEES;
    public static final ConfiguredFeature<?, ?> GREAT_ALMOND_BEES;

    public static final ConfiguredFeature<?, ?> AQUEAN_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> AQUEAN_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> AQUEAN_MORE_BEES;
    public static final ConfiguredFeature<?, ?> AQUEAN_BEES;

    public static final ConfiguredFeature<?, ?> FANCY_AQUEAN_VERY_RARE_STASP_NEST;
    public static final ConfiguredFeature<?, ?> FANCY_AQUEAN_REGULAR_STASP_NEST;
    public static final ConfiguredFeature<?, ?> FANCY_AQUEAN_MORE_STASP_NEST;
    public static final ConfiguredFeature<?, ?> FANCY_AQUEAN_STASP_NEST;

    public static final ConfiguredFeature<?, ?> GREAT_AQUEAN_VERY_RARE_STASP_NEST;
    public static final ConfiguredFeature<?, ?> GREAT_AQUEAN_REGULAR_STASP_NEST;
    public static final ConfiguredFeature<?, ?> GREAT_AQUEAN_MORE_STASP_NEST;
    public static final ConfiguredFeature<?, ?> GREAT_AQUEAN_STASP_NEST;

    public static final ConfiguredFeature<?, ?> CHERRY_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> CHERRY_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> CHERRY_MORE_BEES;
    public static final ConfiguredFeature<?, ?> CHERRY_BEES;

    public static final ConfiguredFeature<?, ?> FANCY_CHERRY_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> FANCY_CHERRY_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> FANCY_CHERRY_MORE_BEES;
    public static final ConfiguredFeature<?, ?> FANCY_CHERRY_BEES;

    public static final ConfiguredFeature<?, ?> GREAT_CHERRY_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> GREAT_CHERRY_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> GREAT_CHERRY_MORE_BEES;
    public static final ConfiguredFeature<?, ?> GREAT_CHERRY_BEES;

    public static final ConfiguredFeature<?, ?> PIN_CHERRY_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> PIN_CHERRY_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> PIN_CHERRY_MORE_BEES;
    public static final ConfiguredFeature<?, ?> PIN_CHERRY_BEES;

    public static final ConfiguredFeature<?, ?> FANCY_PIN_CHERRY_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> FANCY_PIN_CHERRY_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> FANCY_PIN_CHERRY_MORE_BEES;
    public static final ConfiguredFeature<?, ?> FANCY_PIN_CHERRY_BEES;

    public static final ConfiguredFeature<?, ?> GREAT_PIN_CHERRY_VERY_RARE_BEES;
    public static final ConfiguredFeature<?, ?> GREAT_PIN_CHERRY_REGULAR_BEES;
    public static final ConfiguredFeature<?, ?> GREAT_PIN_CHERRY_MORE_BEES;
    public static final ConfiguredFeature<?, ?> GREAT_PIN_CHERRY_BEES;

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

    public static final ConfiguredFeature<?, ?> ALMOND_FOREST_FLOWERS;
    public static final ConfiguredFeature<?, ?> ALMOND_PLUS_FOREST_FLOWERS;
    public static final ConfiguredFeature<?, ?> BLACK_BIRCH_FOREST_FLOWERS;
    public static final ConfiguredFeature<?, ?> CHERRY_CLIFFS_FOREST_FLOWERS;
    public static final ConfiguredFeature<?, ?> CHERRY_FOREST_FLOWERS;
    public static final ConfiguredFeature<?, ?> PLUM_FOREST_FLOWERS;
    public static final ConfiguredFeature<?, ?> THUNDERCLOUD_PLUM_FOREST_FLOWERS;

    public static final ConfiguredFeature<?, ?> LAKE_CLEAR_WATER;
    public static final ConfiguredFeature<?, ?> SPRING_CLEAR_WATER;

    /* ORES */
    public static final ConfiguredFeature<?, ?> ORE_CALCITE;

    public static final ConfiguredFeature<?, ?> ORE_ACTINIUM;
    public static final ConfiguredFeature<?, ?> ORE_AQUAMARINE;
    public static final ConfiguredFeature<?, ?> ORE_BLACK_OPAL;
    public static final ConfiguredFeature<?, ?> ORE_BORON;
    public static final ConfiguredFeature<?, ?> ORE_CHALCEDONY;
    public static final ConfiguredFeature<?, ?> ORE_CHARGED_TUNGSTEN;
    public static final ConfiguredFeature<?, ?> ORE_CLINOHUMITE;
    public static final ConfiguredFeature<?, ?> ORE_COAL;
    public static final ConfiguredFeature<?, ?> ORE_COPPER;
    public static final ConfiguredFeature<?, ?> ORE_DIAMOND;
    public static final ConfiguredFeature<?, ?> ORE_DIOPSIDE;
    public static final ConfiguredFeature<?, ?> ORE_ENSTATITE;
    public static final ConfiguredFeature<?, ?> ORE_EMERALD;
    public static final ConfiguredFeature<?, ?> ORE_GARNET;
    public static final ConfiguredFeature<?, ?> ORE_GOLD;
    public static final ConfiguredFeature<?, ?> ORE_IRON;
    public static final ConfiguredFeature<?, ?> ORE_LAPIS;
    public static final ConfiguredFeature<?, ?> ORE_MORGANITE;
    public static final ConfiguredFeature<?, ?> ORE_OPAL;
    public static final ConfiguredFeature<?, ?> ORE_REDSTONE;
    public static final ConfiguredFeature<?, ?> ORE_RUBY;
    public static final ConfiguredFeature<?, ?> ORE_SAPPHIRE;
    public static final ConfiguredFeature<?, ?> ORE_SILICON;
    public static final ConfiguredFeature<?, ?> ORE_SILVER;
    public static final ConfiguredFeature<?, ?> ORE_SPHENE;
    public static final ConfiguredFeature<?, ?> ORE_SPINEL;
    public static final ConfiguredFeature<?, ?> ORE_STORCEAN_SAPPHIRE;
    public static final ConfiguredFeature<?, ?> ORE_STORCEAN_SILICON;
    public static final ConfiguredFeature<?, ?> ORE_STORCEAN_TUNGSTEN;
    public static final ConfiguredFeature<?, ?> ORE_STROXITE;
    public static final ConfiguredFeature<?, ?> ORE_SUGILITE;
    public static final ConfiguredFeature<?, ?> ORE_TANZANITE;
    public static final ConfiguredFeature<?, ?> ORE_TOPAZ;
    public static final ConfiguredFeature<?, ?> ORE_TUNGSTEN;
    public static final ConfiguredFeature<?, ?> ORE_URANIUM;
    public static final ConfiguredFeature<?, ?> ORE_URANOLUMEN;
    public static final ConfiguredFeature<?, ?> ORE_VOID_CRITTERED_DIOPSIDE;

    protected static ConfiguredFeature<?, ?> createTree(TreeFeatureConfig config, TreeDecorator ...decorators) {
        return createTree(new TreeFeatureConfig.Builder(config.trunkProvider, config.trunkPlacer, config.foliageProvider, config.foliagePlacer, config.minimumSize).decorators(ImmutableList.copyOf(decorators)).build());
    }

    protected static ConfiguredFeature<?, ?> createTree(TreeFeatureConfig config) {
        return Feature.TREE.configure(config);
    }

    protected static ConfiguredFeature<?, ?> createSimpleRandomSelector(SimpleRandomFeatureConfig config) {
        return Feature.SIMPLE_RANDOM_SELECTOR.configure(config);
    }

    protected static ConfiguredFeature<?, ?> createHugeMushroom(BlockStateProvider cap, BlockStateProvider stem) {
        return Feature.HUGE_BROWN_MUSHROOM.configure(new HugeMushroomFeatureConfig(cap, stem, 3));
    }

    protected static ConfiguredFeature<?, ?> createRandomPatch(RandomPatchFeatureConfig config) {
        return Feature.RANDOM_PATCH.configure(config);
    }

    protected static ConfiguredFeature<?, ?> createPatchGrass() {
        return createRandomPatch(VegetationConfiguredFeatures.createRandomPatchFeatureConfig(BlockStateProvider.of(Blocks.GRASS), 32));
    }

    protected static ConfiguredFeature<?, ?> createFlower(RandomPatchFeatureConfig config) {
        return Feature.FLOWER.configure(config);
    }

    protected static ConfiguredFeature<?, ?> createLake(Block fluid, Block barrier) {
        return Feature.LAKE.configure(new LakeFeature.Config(BlockStateProvider.of(fluid), BlockStateProvider.of(barrier)));
    }

    protected static ConfiguredFeature<?, ?> createOre(RuleTest test, Block block, int size) {
        return createOre(new OreFeatureConfig(test, block.getDefaultState(), size));
    }

    protected static ConfiguredFeature<?, ?> createOre(List<OreFeatureConfig.Target> targets, float discardOnAirChance, int size) {
        return createOre(new OreFeatureConfig(targets, size, discardOnAirChance));
    }

    protected static ConfiguredFeature<?, ?> createOre(OreFeatureConfig config) {
        return Feature.ORE.configure(config);
    }

    protected static ConfiguredFeature<?, ?> createSpring(Fluid fluid) {
        return Feature.SPRING_FEATURE
                .configure(new SpringFeatureConfig(fluid.getDefaultState(), true, 4, 1, ImmutableSet.of(STONE, GRANITE, DIORITE, ANDESITE)));
    }

    static {
        ALMOND = createTree(ALMOND_TREE_CONFIG);
        ANAMEATA = createTree(ANAMEATA_TREE_CONFIG);
        AQUEAN = createTree(AQUEAN_TREE_CONFIG);
        BARSHROOKLE = createTree(BARSHROOKLE_TREE_CONFIG);
        BLACK_BIRCH = createTree(BLACK_BIRCH_TREE_CONFIG);
        CHERRY = createTree(CHERRY_TREE_CONFIG);
        COOK_PINE = createTree(COOK_PINE_TREE_CONFIG);
        CROLOOD = createTree(CROLOOD_TREE_CONFIG);
        DARK_CROLOOD = createTree(DARK_CROLOOD_TREE_CONFIG);
        EBONY = createTree(EBONY_TREE_CONFIG);
        FUCHSITRA = createSimpleRandomSelector(FUCHSITRA_TREE_CONFIG);
        FUNERANITE = createTree(FUNERANITE_TREE_CONFIG);
        GHOSHROOM = createTree(GHOSHROOM_TREE_CONFIG);
        PELTOGYNE = createTree(PELTOGYNE_TREE_CONFIG);
        PIN_CHERRY = createTree(PIN_CHERRY_TREE_CONFIG);
        PLUM = createTree(PLUM_TREE_CONFIG);
        PURFUNGA = createTree(PURFUNGA_TREE_CONFIG);
        SPROOM = createTree(SPROOM_TREE_CONFIG);
        STORTREEAN = createTree(STORTREEAN_TREE_CONFIG);
        STROOMEAN = createTree(STROOMEAN_TREE_CONFIG);
        SUNRISE_FUNGUS = createTree(SUNRISE_FUNGUS_TREE_CONFIG);
        TEAK = createTree(TEAK_TREE_CONFIG);
        THUNDERCLOUD_PLUM = createTree(THUNDERCLOUD_PLUM_TREE_CONFIG);

        FUCHSITRA_TOWARDS_X = createTree(FUCHSITRA_TREE_TOWARDS_X_CONFIG);
        FUCHSITRA_TOWARDS_Z = createTree(FUCHSITRA_TREE_TOWARDS_Z_CONFIG);
        FANCY_FUCHSITRA_TOWARDS_X = createTree(FANCY_FUCHSITRA_TREE_TOWARDS_X_CONFIG);
        FANCY_FUCHSITRA_TOWARDS_Z = createTree(FANCY_FUCHSITRA_TREE_TOWARDS_Z_CONFIG);
        GREAT_FUCHSITRA_TOWARDS_X = createTree(GREAT_FUCHSITRA_TREE_TOWARDS_X_CONFIG);
        GREAT_FUCHSITRA_TOWARDS_Z = createTree(GREAT_FUCHSITRA_TREE_TOWARDS_Z_CONFIG);

        FANCY_ALMOND = createTree(FANCY_ALMOND_TREE_CONFIG);
        FANCY_ANAMEATA = createTree(FANCY_ANAMEATA_TREE_CONFIG);
        FANCY_AQUEAN = createTree(FANCY_AQUEAN_TREE_CONFIG);
        FANCY_BLACK_BIRCH = createTree(FANCY_BLACK_BIRCH_TREE_CONFIG);
        FANCY_CHERRY = createTree(FANCY_CHERRY_TREE_CONFIG);
        FANCY_FUCHSITRA = createSimpleRandomSelector(FANCY_FUCHSITRA_TREE_CONFIG);
        FANCY_PIN_CHERRY = createTree(FANCY_PIN_CHERRY_TREE_CONFIG);
        FANCY_PLUM = createTree(FANCY_PLUM_TREE_CONFIG);
        FANCY_TEAK = createTree(FANCY_TEAK_TREE_CONFIG);
        FANCY_THUNDERCLOUD_PLUM = createTree(FANCY_THUNDERCLOUD_PLUM_TREE_CONFIG);

        GREAT_ALMOND = createTree(GREAT_ALMOND_TREE_CONFIG);
        GREAT_ANAMEATA = createTree(GREAT_ANAMEATA_TREE_CONFIG);
        GREAT_AQUEAN = createTree(GREAT_AQUEAN_TREE_CONFIG);
        GREAT_BLACK_BIRCH = createTree(GREAT_BLACK_BIRCH_TREE_CONFIG);
        GREAT_CHERRY = createTree(GREAT_CHERRY_TREE_CONFIG);
        GREAT_FUCHSITRA = createSimpleRandomSelector(GREAT_FUCHSITRA_TREE_CONFIG);
        GREAT_PIN_CHERRY = createTree(GREAT_PIN_CHERRY_TREE_CONFIG);
        GREAT_PLUM = createTree(GREAT_PLUM_TREE_CONFIG);
        GREAT_TEAK = createTree(GREAT_TEAK_TREE_CONFIG);
        GREAT_THUNDERCLOUD_PLUM = createTree(GREAT_THUNDERCLOUD_PLUM_TREE_CONFIG);

        ALMOND_VERY_RARE_BEES = createTree(ALMOND_TREE_CONFIG, BEES_0002);
        ALMOND_REGULAR_BEES = createTree(ALMOND_TREE_CONFIG, BEES_002);
        ALMOND_MORE_BEES = createTree(ALMOND_TREE_CONFIG, BEES_005);
        ALMOND_BEES = createTree(ALMOND_TREE_CONFIG, BEES);

        FANCY_ALMOND_VERY_RARE_BEES = createTree(FANCY_ALMOND_TREE_CONFIG, BEES_0002);
        FANCY_ALMOND_REGULAR_BEES = createTree(FANCY_ALMOND_TREE_CONFIG, BEES_002);
        FANCY_ALMOND_MORE_BEES = createTree(FANCY_ALMOND_TREE_CONFIG, BEES_005);
        FANCY_ALMOND_BEES = createTree(FANCY_ALMOND_TREE_CONFIG, BEES);

        GREAT_ALMOND_VERY_RARE_BEES = createTree(GREAT_ALMOND_TREE_CONFIG, BEES_0002);
        GREAT_ALMOND_REGULAR_BEES = createTree(GREAT_ALMOND_TREE_CONFIG, BEES_002);
        GREAT_ALMOND_MORE_BEES = createTree(GREAT_ALMOND_TREE_CONFIG, BEES_005);
        GREAT_ALMOND_BEES = createTree(GREAT_ALMOND_TREE_CONFIG, BEES);

        AQUEAN_VERY_RARE_BEES = createTree(AQUEAN_TREE_CONFIG, VERY_RARE_STASP_NEST_TREES);
        AQUEAN_REGULAR_BEES = createTree(AQUEAN_TREE_CONFIG, REGULAR_STASP_NEST_TREES);
        AQUEAN_MORE_BEES = createTree(AQUEAN_TREE_CONFIG, MORE_STASP_NEST_TREES);
        AQUEAN_BEES = createTree(AQUEAN_TREE_CONFIG, HALF_STASP_NEST_TREES);

        FANCY_AQUEAN_VERY_RARE_STASP_NEST = createTree(AQUEAN_TREE_CONFIG, VERY_RARE_STASP_NEST_TREES);
        FANCY_AQUEAN_REGULAR_STASP_NEST = createTree(AQUEAN_TREE_CONFIG, REGULAR_STASP_NEST_TREES);
        FANCY_AQUEAN_MORE_STASP_NEST = createTree(AQUEAN_TREE_CONFIG, MORE_STASP_NEST_TREES);
        FANCY_AQUEAN_STASP_NEST = createTree(AQUEAN_TREE_CONFIG, HALF_STASP_NEST_TREES);

        GREAT_AQUEAN_VERY_RARE_STASP_NEST = createTree(AQUEAN_TREE_CONFIG, VERY_RARE_STASP_NEST_TREES);
        GREAT_AQUEAN_REGULAR_STASP_NEST = createTree(AQUEAN_TREE_CONFIG, REGULAR_STASP_NEST_TREES);
        GREAT_AQUEAN_MORE_STASP_NEST = createTree(AQUEAN_TREE_CONFIG, MORE_STASP_NEST_TREES);
        GREAT_AQUEAN_STASP_NEST = createTree(AQUEAN_TREE_CONFIG, HALF_STASP_NEST_TREES);

        CHERRY_VERY_RARE_BEES = createTree(CHERRY_TREE_CONFIG, BEES_0002);
        CHERRY_REGULAR_BEES = createTree(CHERRY_TREE_CONFIG, BEES_002);
        CHERRY_MORE_BEES = createTree(CHERRY_TREE_CONFIG, BEES_005);
        CHERRY_BEES = createTree(CHERRY_TREE_CONFIG, BEES);

        FANCY_CHERRY_VERY_RARE_BEES = createTree(FANCY_CHERRY_TREE_CONFIG, BEES_0002);
        FANCY_CHERRY_REGULAR_BEES = createTree(FANCY_CHERRY_TREE_CONFIG, BEES_002);
        FANCY_CHERRY_MORE_BEES = createTree(FANCY_CHERRY_TREE_CONFIG, BEES_005);
        FANCY_CHERRY_BEES = createTree(FANCY_CHERRY_TREE_CONFIG, BEES);

        GREAT_CHERRY_VERY_RARE_BEES = createTree(GREAT_CHERRY_TREE_CONFIG, BEES_0002);
        GREAT_CHERRY_REGULAR_BEES = createTree(GREAT_CHERRY_TREE_CONFIG, BEES_002);
        GREAT_CHERRY_MORE_BEES = createTree(GREAT_CHERRY_TREE_CONFIG, BEES_005);
        GREAT_CHERRY_BEES = createTree(GREAT_CHERRY_TREE_CONFIG, BEES);

        PIN_CHERRY_VERY_RARE_BEES = createTree(PIN_CHERRY_TREE_CONFIG, BEES_0002);
        PIN_CHERRY_REGULAR_BEES = createTree(PIN_CHERRY_TREE_CONFIG, BEES_002);
        PIN_CHERRY_MORE_BEES = createTree(PIN_CHERRY_TREE_CONFIG, BEES_005);
        PIN_CHERRY_BEES = createTree(PIN_CHERRY_TREE_CONFIG, BEES);

        FANCY_PIN_CHERRY_VERY_RARE_BEES = createTree(FANCY_PIN_CHERRY_TREE_CONFIG, BEES_0002);
        FANCY_PIN_CHERRY_REGULAR_BEES = createTree(FANCY_PIN_CHERRY_TREE_CONFIG, BEES_002);
        FANCY_PIN_CHERRY_MORE_BEES = createTree(FANCY_PIN_CHERRY_TREE_CONFIG, BEES_005);
        FANCY_PIN_CHERRY_BEES = createTree(FANCY_PIN_CHERRY_TREE_CONFIG, BEES);

        GREAT_PIN_CHERRY_VERY_RARE_BEES = createTree(GREAT_PIN_CHERRY_TREE_CONFIG, BEES_0002);
        GREAT_PIN_CHERRY_REGULAR_BEES = createTree(GREAT_PIN_CHERRY_TREE_CONFIG, BEES_002);
        GREAT_PIN_CHERRY_MORE_BEES = createTree(GREAT_PIN_CHERRY_TREE_CONFIG, BEES_005);
        GREAT_PIN_CHERRY_BEES = createTree(GREAT_PIN_CHERRY_TREE_CONFIG, BEES);

        BLACK_LILY = createRandomPatch(BLACK_LILY_CONFIG);
        LILAC = createRandomPatch(LILAC_CONFIG);
        ORANGE_LILY = createRandomPatch(ORANGE_LILY_CONFIG);
        VELVET_LILY = createRandomPatch(VELVET_LILY_CONFIG);

        GRAY_SHAG_MUSHROOM = createHugeMushroom(GRAY_SHAG_MUSHROOM_CAP_PROVIDER, GRAY_SHAG_MUSHROOM_STEM_PROVIDER);
        INKY_CAP_MUSHROOM = createHugeMushroom(INKY_CAP_MUSHROOM_CAP_PROVIDER, INKY_CAP_MUSHROOM_STEM_PROVIDER);
        PUFFBALL_MUSHROOM = createHugeMushroom(PUFFBALL_MUSHROOM_CAP_PROVIDER, PUFFBALL_MUSHROOM_STEM_PROVIDER);
        SHELF_MUSHROOM = createHugeMushroom(SHELF_MUSHROOM_CAP_PROVIDER, SHELF_MUSHROOM_STEM_PROVIDER);
        WHITE_MUSHROOM = createHugeMushroom(WHITE_MUSHROOM_CAP_PROVIDER, WHITE_MUSHROOM_STEM_PROVIDER);

        PATCH_GRASS_CLEAR_FOREST = createPatchGrass();

        ALMOND_FOREST_FLOWERS = createFlower(ALMOND_FOREST_FLOWER_CONFIG);
        ALMOND_PLUS_FOREST_FLOWERS = createFlower(ALMOND_PLUS_FOREST_FLOWER_CONFIG);
        BLACK_BIRCH_FOREST_FLOWERS = createFlower(BLACK_BIRCH_FOREST_FLOWER_CONFIG);
        CHERRY_CLIFFS_FOREST_FLOWERS = createFlower(CHERRY_CLIFFS_FOREST_FLOWER_CONFIG);
        CHERRY_FOREST_FLOWERS = createFlower(CHERRY_FOREST_FLOWER_CONFIG);
        PLUM_FOREST_FLOWERS = createFlower(PLUM_FOREST_FLOWER_CONFIG);
        THUNDERCLOUD_PLUM_FOREST_FLOWERS = createFlower(THUNDERCLOUD_PLUM_FOREST_FLOWER_CONFIG);

        LAKE_CLEAR_WATER = createLake(CLEAR_WATER, DIORITE);

        SPRING_CLEAR_WATER = createSpring(DTFluids.CLEAR_WATER);

        ORE_CALCITE = createOre(BASE_STONE_OVERWORLD, CALCITE, 20);

        ORE_ACTINIUM = createOre(ACTINIUM_ORES, 0.0F, 10);
        ORE_AQUAMARINE = createOre(AQUAMARINE_ORES, 0.0F, 10);
        ORE_BLACK_OPAL = createOre(BLACK_OPAL_ORES, 0.0F, 10);
        ORE_BORON = createOre(BORON_ORES, 0.0F, 10);
        ORE_CHALCEDONY = createOre(CHALCEDONY_ORES, 0.0F, 10);
        ORE_CHARGED_TUNGSTEN = createOre(CHARGED_TUNGSTEN_ORES, 0.0F, 10);
        ORE_CLINOHUMITE = createOre(CLINOHUMITE_ORES, 0.0F, 10);
        ORE_COAL = createOre(COAL_ORES, 0.0F, 10);
        ORE_COPPER = createOre(COPPER_ORES, 0.0F, 10);
        ORE_DIAMOND = createOre(DIAMOND_ORES, 0.0F, 10);
        ORE_DIOPSIDE = createOre(DIOPSIDE_ORES, 0.0F, 10);
        ORE_ENSTATITE = createOre(ENSTATITE_ORES, 0.0F, 10);
        ORE_EMERALD = createOre(EMERALD_ORES, 0.0F, 10);
        ORE_GARNET = createOre(GARNET_ORES, 0.0F, 10);
        ORE_GOLD = createOre(GOLD_ORES, 0.0F, 10);
        ORE_IRON = createOre(IRON_ORES, 0.0F, 10);
        ORE_LAPIS = createOre(LAPIS_ORES, 0.0F, 10);
        ORE_MORGANITE = createOre(MORGANITE_ORES, 0.0F, 10);
        ORE_OPAL = createOre(OPAL_ORES, 0.0F, 10);
        ORE_REDSTONE = createOre(REDSTONE_ORES, 0.0F, 10);
        ORE_RUBY = createOre(RUBY_ORES, 0.0F, 10);
        ORE_SAPPHIRE = createOre(SAPPHIRE_ORES, 0.0F, 10);
        ORE_SILICON = createOre(SILICON_ORES, 0.0F, 10);
        ORE_SILVER = createOre(SILVER_ORES, 0.0F, 10);
        ORE_SPHENE = createOre(SPHENE_ORES, 0.0F, 10);
        ORE_SPINEL = createOre(SPINEL_ORES, 0.0F, 10);
        ORE_STORCEAN_SAPPHIRE = createOre(STORCEAN_SAPPHIRE_ORES, 0.0F, 10);
        ORE_STORCEAN_SILICON = createOre(STORCEAN_SILICON_ORES, 0.0F, 10);
        ORE_STORCEAN_TUNGSTEN = createOre(STORCEAN_TUNGSTEN_ORES, 0.0F, 10);
        ORE_STROXITE = createOre(STROXITE_ORES, 0.0F, 10);
        ORE_SUGILITE = createOre(SUGILITE_ORES, 0.0F, 10);
        ORE_TANZANITE = createOre(TANZANITE_ORES, 0.0F, 10);
        ORE_TOPAZ = createOre(TOPAZ_ORES, 0.0F, 10);
        ORE_TUNGSTEN = createOre(TUNGSTEN_ORES, 0.0F, 10);
        ORE_URANIUM = createOre(URANIUM_ORES, 0.0F, 10);
        ORE_URANOLUMEN = createOre(URANOLUMEN_ORES, 0.0F, 10);
        ORE_VOID_CRITTERED_DIOPSIDE = createOre(VOID_CRITTERED_DIOPSIDE_ORES, 0.0F, 10);
    }

    public static void initialize() {
        ConfiguredFeatures.register("deep_trenches:fuchsitra_towards_x", FUCHSITRA_TOWARDS_X);
        ConfiguredFeatures.register("deep_trenches:fuchsitra_towards_z", FUCHSITRA_TOWARDS_Z);
        ConfiguredFeatures.register("deep_trenches:fancy_fuchsitra_towards_x", FANCY_FUCHSITRA_TOWARDS_X);
        ConfiguredFeatures.register("deep_trenches:fancy_fuchsitra_towards_z", FANCY_FUCHSITRA_TOWARDS_Z);
        ConfiguredFeatures.register("deep_trenches:great_fuchsitra_towards_x", GREAT_FUCHSITRA_TOWARDS_X);
        ConfiguredFeatures.register("deep_trenches:great_fuchsitra_towards_z", GREAT_FUCHSITRA_TOWARDS_Z);

        ConfiguredFeatures.register("deep_trenches:almond", ALMOND);
        ConfiguredFeatures.register("deep_trenches:anameata", ANAMEATA);
        ConfiguredFeatures.register("deep_trenches:aquean", AQUEAN);
        ConfiguredFeatures.register("deep_trenches:barshrookle", BARSHROOKLE);
        ConfiguredFeatures.register("deep_trenches:black_birch", BLACK_BIRCH);
        ConfiguredFeatures.register("deep_trenches:cherry", CHERRY);
        ConfiguredFeatures.register("deep_trenches:cook_pine", COOK_PINE);
        ConfiguredFeatures.register("deep_trenches:crolood", CROLOOD);
        ConfiguredFeatures.register("deep_trenches:dark_crolood", DARK_CROLOOD);
        ConfiguredFeatures.register("deep_trenches:ebony", EBONY);
        ConfiguredFeatures.register("deep_trenches:fuchsitra", FUCHSITRA);
        ConfiguredFeatures.register("deep_trenches:funeranite", FUNERANITE);
        ConfiguredFeatures.register("deep_trenches:ghoshroom", GHOSHROOM);
        ConfiguredFeatures.register("deep_trenches:peltogyne", PELTOGYNE);
        ConfiguredFeatures.register("deep_trenches:pin_cherry", PIN_CHERRY);
        ConfiguredFeatures.register("deep_trenches:plum", PLUM);
        ConfiguredFeatures.register("deep_trenches:purfunga", PURFUNGA);
        ConfiguredFeatures.register("deep_trenches:sproom", SPROOM);
        ConfiguredFeatures.register("deep_trenches:stortreean", STORTREEAN);
        ConfiguredFeatures.register("deep_trenches:stroomean", STROOMEAN);
        ConfiguredFeatures.register("deep_trenches:sunrise_fungus", SUNRISE_FUNGUS);
        ConfiguredFeatures.register("deep_trenches:teak", TEAK);
        ConfiguredFeatures.register("deep_trenches:thundercloud_plum", THUNDERCLOUD_PLUM);

        ConfiguredFeatures.register("deep_trenches:fancy_almond", FANCY_ALMOND);
        ConfiguredFeatures.register("deep_trenches:fancy_anameata", FANCY_ANAMEATA);
        ConfiguredFeatures.register("deep_trenches:fancy_aquean", FANCY_AQUEAN);
        ConfiguredFeatures.register("deep_trenches:fancy_black_birch", FANCY_BLACK_BIRCH);
        ConfiguredFeatures.register("deep_trenches:fancy_cherry", FANCY_CHERRY);
        ConfiguredFeatures.register("deep_trenches:fancy_fuchsitra", FANCY_FUCHSITRA);
        ConfiguredFeatures.register("deep_trenches:fancy_pin_cherry", FANCY_PIN_CHERRY);
        ConfiguredFeatures.register("deep_trenches:fancy_plum", FANCY_PLUM);
        ConfiguredFeatures.register("deep_trenches:fancy_teak", FANCY_TEAK);
        ConfiguredFeatures.register("deep_trenches:fancy_thundercloud_plum", FANCY_THUNDERCLOUD_PLUM);

        ConfiguredFeatures.register("deep_trenches:great_almond", GREAT_ALMOND);
        ConfiguredFeatures.register("deep_trenches:great_anameata", GREAT_ANAMEATA);
        ConfiguredFeatures.register("deep_trenches:great_aquean", GREAT_AQUEAN);
        ConfiguredFeatures.register("deep_trenches:great_black_birch", GREAT_BLACK_BIRCH);
        ConfiguredFeatures.register("deep_trenches:great_cherry", GREAT_CHERRY);
        ConfiguredFeatures.register("deep_trenches:great_fuchsitra", GREAT_FUCHSITRA);
        ConfiguredFeatures.register("deep_trenches:great_pin_cherry", GREAT_PIN_CHERRY);
        ConfiguredFeatures.register("deep_trenches:great_plum", GREAT_PLUM);
        ConfiguredFeatures.register("deep_trenches:great_teak", GREAT_TEAK);
        ConfiguredFeatures.register("deep_trenches:great_thundercloud_plum", GREAT_THUNDERCLOUD_PLUM);

        ConfiguredFeatures.register("deep_trenches:almond_very_rare_bees", ALMOND_VERY_RARE_BEES);
        ConfiguredFeatures.register("deep_trenches:almond_regular_bees", ALMOND_REGULAR_BEES);
        ConfiguredFeatures.register("deep_trenches:almond_more_bees", ALMOND_MORE_BEES);
        ConfiguredFeatures.register("deep_trenches:almond_bees", ALMOND_BEES);

        ConfiguredFeatures.register("deep_trenches:fancy_almond_very_rare_bees", FANCY_ALMOND_VERY_RARE_BEES);
        ConfiguredFeatures.register("deep_trenches:fancy_almond_regular_bees", FANCY_ALMOND_REGULAR_BEES);
        ConfiguredFeatures.register("deep_trenches:fancy_almond_more_bees", FANCY_ALMOND_MORE_BEES);
        ConfiguredFeatures.register("deep_trenches:fancy_almond_bees", FANCY_ALMOND_BEES);

        ConfiguredFeatures.register("deep_trenches:great_almond_very_rare_bees", GREAT_ALMOND_VERY_RARE_BEES);
        ConfiguredFeatures.register("deep_trenches:great_almond_regular_bees", GREAT_ALMOND_REGULAR_BEES);
        ConfiguredFeatures.register("deep_trenches:great_almond_more_bees", GREAT_ALMOND_MORE_BEES);
        ConfiguredFeatures.register("deep_trenches:great_almond_bees", GREAT_ALMOND_BEES);

        ConfiguredFeatures.register("deep_trenches:fancy_aquean_very_rare_stasp_nest", FANCY_AQUEAN_VERY_RARE_STASP_NEST);
        ConfiguredFeatures.register("deep_trenches:fancy_aquean_regular_stasp_nest", FANCY_AQUEAN_REGULAR_STASP_NEST);
        ConfiguredFeatures.register("deep_trenches:fancy_aquean_more_stasp_nest", FANCY_AQUEAN_MORE_STASP_NEST);
        ConfiguredFeatures.register("deep_trenches:fancy_aquean_stasp_nest", FANCY_AQUEAN_STASP_NEST);

        ConfiguredFeatures.register("deep_trenches:great_aquean_very_rare_stasp_nest", GREAT_AQUEAN_VERY_RARE_STASP_NEST);
        ConfiguredFeatures.register("deep_trenches:great_aquean_regular_stasp_nest", GREAT_AQUEAN_REGULAR_STASP_NEST);
        ConfiguredFeatures.register("deep_trenches:great_aquean_more_stasp_nest", GREAT_AQUEAN_MORE_STASP_NEST);
        ConfiguredFeatures.register("deep_trenches:great_aquean_stasp_nest", GREAT_AQUEAN_STASP_NEST);

        ConfiguredFeatures.register("deep_trenches:cherry_very_rare_bees", CHERRY_VERY_RARE_BEES);
        ConfiguredFeatures.register("deep_trenches:cherry_regular_bees", CHERRY_REGULAR_BEES);
        ConfiguredFeatures.register("deep_trenches:cherry_more_bees", CHERRY_MORE_BEES);
        ConfiguredFeatures.register("deep_trenches:cherry_bees", CHERRY_BEES);

        ConfiguredFeatures.register("deep_trenches:fancy_cherry_very_rare_bees", FANCY_CHERRY_VERY_RARE_BEES);
        ConfiguredFeatures.register("deep_trenches:fancy_cherry_regular_bees", FANCY_CHERRY_REGULAR_BEES);
        ConfiguredFeatures.register("deep_trenches:fancy_cherry_more_bees", FANCY_CHERRY_MORE_BEES);
        ConfiguredFeatures.register("deep_trenches:fancy_cherry_bees", FANCY_CHERRY_BEES);

        ConfiguredFeatures.register("deep_trenches:great_cherry_very_rare_bees", GREAT_CHERRY_VERY_RARE_BEES);
        ConfiguredFeatures.register("deep_trenches:great_cherry_regular_bees", GREAT_CHERRY_REGULAR_BEES);
        ConfiguredFeatures.register("deep_trenches:great_cherry_more_bees", GREAT_CHERRY_MORE_BEES);
        ConfiguredFeatures.register("deep_trenches:great_cherry_bees", GREAT_CHERRY_BEES);

        ConfiguredFeatures.register("deep_trenches:pin_cherry_very_rare_bees", PIN_CHERRY_VERY_RARE_BEES);
        ConfiguredFeatures.register("deep_trenches:pin_cherry_regular_bees", PIN_CHERRY_REGULAR_BEES);
        ConfiguredFeatures.register("deep_trenches:pin_cherry_more_bees", PIN_CHERRY_MORE_BEES);
        ConfiguredFeatures.register("deep_trenches:pin_cherry_bees", PIN_CHERRY_BEES);

        ConfiguredFeatures.register("deep_trenches:fancy_pin_cherry_very_rare_bees", FANCY_PIN_CHERRY_VERY_RARE_BEES);
        ConfiguredFeatures.register("deep_trenches:fancy_pin_cherry_regular_bees", FANCY_PIN_CHERRY_REGULAR_BEES);
        ConfiguredFeatures.register("deep_trenches:fancy_pin_cherry_more_bees", FANCY_PIN_CHERRY_MORE_BEES);
        ConfiguredFeatures.register("deep_trenches:fancy_pin_cherry_bees", FANCY_PIN_CHERRY_BEES);

        ConfiguredFeatures.register("deep_trenches:great_pin_cherry_very_rare_bees", GREAT_PIN_CHERRY_VERY_RARE_BEES);
        ConfiguredFeatures.register("deep_trenches:great_pin_cherry_regular_bees", GREAT_PIN_CHERRY_REGULAR_BEES);
        ConfiguredFeatures.register("deep_trenches:great_pin_cherry_more_bees", GREAT_PIN_CHERRY_MORE_BEES);
        ConfiguredFeatures.register("deep_trenches:great_pin_cherry_bees", GREAT_PIN_CHERRY_BEES);

        ConfiguredFeatures.register("deep_trenches:black_lily", BLACK_LILY);
        ConfiguredFeatures.register("deep_trenches:lilac", LILAC);
        ConfiguredFeatures.register("deep_trenches:orange_lily", ORANGE_LILY);
        ConfiguredFeatures.register("deep_trenches:velvet_lily", VELVET_LILY);

        ConfiguredFeatures.register("deep_trenches:patch_grass_clear_forest", PATCH_GRASS_CLEAR_FOREST);

        ConfiguredFeatures.register("deep_trenches:almond_forest_flowers", ALMOND_FOREST_FLOWERS);
        ConfiguredFeatures.register("deep_trenches:almond_plus_forest_flowers", ALMOND_PLUS_FOREST_FLOWERS);
        ConfiguredFeatures.register("deep_trenches:black_birch_forest_flowers", BLACK_BIRCH_FOREST_FLOWERS);
        ConfiguredFeatures.register("deep_trenches:cherry_cliffs_forest_flowers", CHERRY_CLIFFS_FOREST_FLOWERS);
        ConfiguredFeatures.register("deep_trenches:cherry_forest_flowers", CHERRY_FOREST_FLOWERS);
        ConfiguredFeatures.register("deep_trenches:plum_forest_flowers", PLUM_FOREST_FLOWERS);
        ConfiguredFeatures.register("deep_trenches:thundercloud_plum_forest_flowers", THUNDERCLOUD_PLUM_FOREST_FLOWERS);

        ConfiguredFeatures.register("deep_trenches:lake_clear_water", LAKE_CLEAR_WATER);
        ConfiguredFeatures.register("deep_trenches:spring_clear_water", SPRING_CLEAR_WATER);

        ConfiguredFeatures.register("deep_trenches:ore_calcite",  ORE_CALCITE);

        ConfiguredFeatures.register("deep_trenches:ore_actinium",  ORE_ACTINIUM);
        ConfiguredFeatures.register("deep_trenches:ore_aquamarine",  ORE_AQUAMARINE);
        ConfiguredFeatures.register("deep_trenches:ore_black_opal",  ORE_BLACK_OPAL);
        ConfiguredFeatures.register("deep_trenches:ore_boron",  ORE_BORON);
        ConfiguredFeatures.register("deep_trenches:ore_chalcedony",  ORE_CHALCEDONY);
        ConfiguredFeatures.register("deep_trenches:ore_charged_tungsten",  ORE_CHARGED_TUNGSTEN);
        ConfiguredFeatures.register("deep_trenches:ore_clinohumite",  ORE_CLINOHUMITE);
        ConfiguredFeatures.register("deep_trenches:ore_coal",  ORE_COAL);
        ConfiguredFeatures.register("deep_trenches:ore_copper",  ORE_COPPER);
        ConfiguredFeatures.register("deep_trenches:ore_diamond",  ORE_DIAMOND);
        ConfiguredFeatures.register("deep_trenches:ore_diopside",  ORE_DIOPSIDE);
        ConfiguredFeatures.register("deep_trenches:ore_enstatite",  ORE_ENSTATITE);
        ConfiguredFeatures.register("deep_trenches:ore_emerald",  ORE_EMERALD);
        ConfiguredFeatures.register("deep_trenches:ore_garnet",  ORE_GARNET);
        ConfiguredFeatures.register("deep_trenches:ore_gold",  ORE_GOLD);
        ConfiguredFeatures.register("deep_trenches:ore_iron",  ORE_IRON);
        ConfiguredFeatures.register("deep_trenches:ore_lapis",  ORE_LAPIS);
        ConfiguredFeatures.register("deep_trenches:ore_morganite",  ORE_MORGANITE);
        ConfiguredFeatures.register("deep_trenches:ore_opal",  ORE_OPAL);
        ConfiguredFeatures.register("deep_trenches:ore_redstone",  ORE_REDSTONE);
        ConfiguredFeatures.register("deep_trenches:ore_ruby",  ORE_RUBY);
        ConfiguredFeatures.register("deep_trenches:ore_sapphire",  ORE_SAPPHIRE);
        ConfiguredFeatures.register("deep_trenches:ore_silicon",  ORE_SILICON);
        ConfiguredFeatures.register("deep_trenches:ore_silver",  ORE_SILVER);
        ConfiguredFeatures.register("deep_trenches:ore_sphene",  ORE_SPHENE);
        ConfiguredFeatures.register("deep_trenches:ore_spinel",  ORE_SPINEL);
        ConfiguredFeatures.register("deep_trenches:ore_storcean_sapphire",  ORE_STORCEAN_SAPPHIRE);
        ConfiguredFeatures.register("deep_trenches:ore_storcean_silicon",  ORE_STORCEAN_SILICON);
        ConfiguredFeatures.register("deep_trenches:ore_storcean_tungsten",  ORE_STORCEAN_TUNGSTEN);
        ConfiguredFeatures.register("deep_trenches:ore_stroxite",  ORE_STROXITE);
        ConfiguredFeatures.register("deep_trenches:ore_sugilite",  ORE_SUGILITE);
        ConfiguredFeatures.register("deep_trenches:ore_tanzanite",  ORE_TANZANITE);
        ConfiguredFeatures.register("deep_trenches:ore_topaz",  ORE_TOPAZ);
        ConfiguredFeatures.register("deep_trenches:ore_tungsten",  ORE_TUNGSTEN);
        ConfiguredFeatures.register("deep_trenches:ore_uranium",  ORE_URANIUM);
        ConfiguredFeatures.register("deep_trenches:ore_uranolumen",  ORE_URANOLUMEN);
        ConfiguredFeatures.register("deep_trenches:ore_void_crittered_diopside",  ORE_VOID_CRITTERED_DIOPSIDE);
    }

}