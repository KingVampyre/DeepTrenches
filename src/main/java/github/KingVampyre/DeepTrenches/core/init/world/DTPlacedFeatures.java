package github.KingVampyre.DeepTrenches.core.init.world;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.Block;
import net.minecraft.util.math.intprovider.ClampedIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.*;
import static net.minecraft.world.gen.feature.PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP;

public class DTPlacedFeatures {

    public static final PlacedFeature FUCHSITRA_TOWARDS_X;
    public static final PlacedFeature FUCHSITRA_TOWARDS_Z;
    public static final PlacedFeature FANCY_FUCHSITRA_TOWARDS_X;
    public static final PlacedFeature FANCY_FUCHSITRA_TOWARDS_Z;
    public static final PlacedFeature GREAT_FUCHSITRA_TOWARDS_X;
    public static final PlacedFeature GREAT_FUCHSITRA_TOWARDS_Z;

    public static final PlacedFeature ALMOND;
    public static final PlacedFeature ANAMEATA;
    public static final PlacedFeature AQUEAN;
    public static final PlacedFeature BARSHROOKLE;
    public static final PlacedFeature BLACK_BIRCH;
    public static final PlacedFeature CHERRY;
    public static final PlacedFeature COOK_PINE;
    public static final PlacedFeature CROLOOD;
    public static final PlacedFeature DARK_CROLOOD;
    public static final PlacedFeature EBONY;
    public static final PlacedFeature FUCHSITRA;
    public static final PlacedFeature FUNERANITE;
    public static final PlacedFeature GHOSHROOM;
    public static final PlacedFeature PELTOGYNE;
    public static final PlacedFeature PIN_CHERRY;
    public static final PlacedFeature PLUM;
    public static final PlacedFeature PURFUNGA;
    public static final PlacedFeature SPROOM;
    public static final PlacedFeature STORTREEAN;
    public static final PlacedFeature STROOMEAN;
    public static final PlacedFeature SUNRISE_FUNGUS;
    public static final PlacedFeature TEAK;
    public static final PlacedFeature THUNDERCLOUD_PLUM;

    public static final PlacedFeature ALMOND_VERY_RARE_BEES;
    public static final PlacedFeature ALMOND_REGULAR_BEES;
    public static final PlacedFeature ALMOND_MORE_BEES;
    public static final PlacedFeature ALMOND_BEES;

    public static final PlacedFeature FANCY_ALMOND_VERY_RARE_BEES;
    public static final PlacedFeature FANCY_ALMOND_REGULAR_BEES;
    public static final PlacedFeature FANCY_ALMOND_MORE_BEES;
    public static final PlacedFeature FANCY_ALMOND_BEES;

    public static final PlacedFeature GREAT_ALMOND_VERY_RARE_BEES;
    public static final PlacedFeature GREAT_ALMOND_REGULAR_BEES;
    public static final PlacedFeature GREAT_ALMOND_MORE_BEES;
    public static final PlacedFeature GREAT_ALMOND_BEES;

    public static final PlacedFeature AQUEAN_VERY_RARE_BEES;
    public static final PlacedFeature AQUEAN_REGULAR_BEES;
    public static final PlacedFeature AQUEAN_MORE_BEES;
    public static final PlacedFeature AQUEAN_BEES;

    public static final PlacedFeature FANCY_AQUEAN_VERY_RARE_STASP_NEST;
    public static final PlacedFeature FANCY_AQUEAN_REGULAR_STASP_NEST;
    public static final PlacedFeature FANCY_AQUEAN_MORE_STASP_NEST;
    public static final PlacedFeature FANCY_AQUEAN_STASP_NEST;

    public static final PlacedFeature GREAT_AQUEAN_VERY_RARE_STASP_NEST;
    public static final PlacedFeature GREAT_AQUEAN_REGULAR_STASP_NEST;
    public static final PlacedFeature GREAT_AQUEAN_MORE_STASP_NEST;
    public static final PlacedFeature GREAT_AQUEAN_STASP_NEST;

    public static final PlacedFeature CHERRY_VERY_RARE_BEES;
    public static final PlacedFeature CHERRY_REGULAR_BEES;
    public static final PlacedFeature CHERRY_MORE_BEES;
    public static final PlacedFeature CHERRY_BEES;

    public static final PlacedFeature FANCY_CHERRY_VERY_RARE_BEES;
    public static final PlacedFeature FANCY_CHERRY_REGULAR_BEES;
    public static final PlacedFeature FANCY_CHERRY_MORE_BEES;
    public static final PlacedFeature FANCY_CHERRY_BEES;

    public static final PlacedFeature GREAT_CHERRY_VERY_RARE_BEES;
    public static final PlacedFeature GREAT_CHERRY_REGULAR_BEES;
    public static final PlacedFeature GREAT_CHERRY_MORE_BEES;
    public static final PlacedFeature GREAT_CHERRY_BEES;

    public static final PlacedFeature PIN_CHERRY_VERY_RARE_BEES;
    public static final PlacedFeature PIN_CHERRY_REGULAR_BEES;
    public static final PlacedFeature PIN_CHERRY_MORE_BEES;
    public static final PlacedFeature PIN_CHERRY_BEES;

    public static final PlacedFeature FANCY_PIN_CHERRY_VERY_RARE_BEES;
    public static final PlacedFeature FANCY_PIN_CHERRY_REGULAR_BEES;
    public static final PlacedFeature FANCY_PIN_CHERRY_MORE_BEES;
    public static final PlacedFeature FANCY_PIN_CHERRY_BEES;

    public static final PlacedFeature GREAT_PIN_CHERRY_VERY_RARE_BEES;
    public static final PlacedFeature GREAT_PIN_CHERRY_REGULAR_BEES;
    public static final PlacedFeature GREAT_PIN_CHERRY_MORE_BEES;
    public static final PlacedFeature GREAT_PIN_CHERRY_BEES;

    public static final PlacedFeature ALMOND_FOREST_FLOWERS;
    public static final PlacedFeature ALMOND_PLUS_FOREST_FLOWERS;
    public static final PlacedFeature BLACK_BIRCH_FOREST_FLOWERS;
    public static final PlacedFeature CHERRY_CLIFFS_FOREST_FLOWERS;
    public static final PlacedFeature CHERRY_FOREST_FLOWERS;
    public static final PlacedFeature PLUM_FOREST_FLOWERS;
    public static final PlacedFeature THUNDERCLOUD_PLUM_FOREST_FLOWERS;

    public static final PlacedFeature ALMOND_FOREST_TREES;
    public static final PlacedFeature ALMOND_PLUS_FOREST_TREES;
    public static final PlacedFeature BLACK_BIRCH_FOREST_TREES;
    public static final PlacedFeature CHERRY_CLIFFS_FOREST_TREES;
    public static final PlacedFeature CHERRY_FOREST_TREES;
    public static final PlacedFeature PLUM_FOREST_TREES;
    public static final PlacedFeature THUNDERCLOUD_PLUM_FOREST_TREES;

    protected static PlacedFeature withFilter(ConfiguredFeature<?, ?> configuredFeature, Block block) {
        return configuredFeature.withWouldSurviveFilter(block);
    }

    protected static PlacedFeature withFlowerModifiers(ConfiguredFeature<?, ?> configuredFeature) {
        return configuredFeature.withPlacement(RarityFilterPlacementModifier.of(7), SquarePlacementModifier.of(), MOTION_BLOCKING_HEIGHTMAP, CountPlacementModifier.of(ClampedIntProvider.create(UniformIntProvider.create(-3, 1), 0, 1)), BiomePlacementModifier.of());
    }

    protected static PlacedFeature withCountExtra(ConfiguredFeature<?, ?> configuredFeature, int count, float extraChance, int extraCount) {
        return configuredFeature.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(count, extraChance, extraCount)));
    }

    protected static ConfiguredFeature<?, ?> createRandomSelector(RandomFeatureConfig config) {
        return Feature.RANDOM_SELECTOR.configure(config);
    }

    static {
        FUCHSITRA_TOWARDS_X = withFilter(DTConfiguredFeatures.FUCHSITRA_TOWARDS_X, FUCHSITRA_SAPLING);
        FUCHSITRA_TOWARDS_Z = withFilter(DTConfiguredFeatures.FUCHSITRA_TOWARDS_Z, FUCHSITRA_SAPLING);
        FANCY_FUCHSITRA_TOWARDS_X = withFilter(DTConfiguredFeatures.FANCY_FUCHSITRA_TOWARDS_X, FUCHSITRA_SAPLING);
        FANCY_FUCHSITRA_TOWARDS_Z = withFilter(DTConfiguredFeatures.FANCY_FUCHSITRA_TOWARDS_Z, FUCHSITRA_SAPLING);
        GREAT_FUCHSITRA_TOWARDS_X = withFilter(DTConfiguredFeatures.GREAT_FUCHSITRA_TOWARDS_X, FUCHSITRA_SAPLING);
        GREAT_FUCHSITRA_TOWARDS_Z = withFilter(DTConfiguredFeatures.GREAT_FUCHSITRA_TOWARDS_Z, FUCHSITRA_SAPLING);

        ALMOND = withFilter(DTConfiguredFeatures.ALMOND, ALMOND_SAPLING);
        ANAMEATA = withFilter(DTConfiguredFeatures.ANAMEATA, ANAMEATA_SAPLING);
        AQUEAN = withFilter(DTConfiguredFeatures.AQUEAN, AQUEAN_SAPLING);
        BARSHROOKLE = withFilter(DTConfiguredFeatures.BARSHROOKLE, BARSHROOKLE_SAPLING);
        BLACK_BIRCH = withFilter(DTConfiguredFeatures.BLACK_BIRCH, BLACK_BIRCH_SAPLING);
        CHERRY = withFilter(DTConfiguredFeatures.CHERRY, CHERRY_SAPLING);
        COOK_PINE = withFilter(DTConfiguredFeatures.COOK_PINE, COOK_PINE_SAPLING);
        CROLOOD = withFilter(DTConfiguredFeatures.CROLOOD, CROLOOD_SAPLING);
        DARK_CROLOOD = withFilter(DTConfiguredFeatures.DARK_CROLOOD, DARK_CROLOOD_SAPLING);
        EBONY = withFilter(DTConfiguredFeatures.EBONY, EBONY_SAPLING);
        FUCHSITRA = withFilter(DTConfiguredFeatures.FUCHSITRA, FUCHSITRA_SAPLING);
        FUNERANITE = withFilter(DTConfiguredFeatures.FUNERANITE, FUNERANITE_SAPLING);
        GHOSHROOM = withFilter(DTConfiguredFeatures.GHOSHROOM, GHOSHROOM_SAPLING);
        PELTOGYNE = withFilter(DTConfiguredFeatures.PELTOGYNE, PELTOGYNE_SAPLING);
        PIN_CHERRY = withFilter(DTConfiguredFeatures.PIN_CHERRY, PIN_CHERRY_SAPLING);
        PLUM = withFilter(DTConfiguredFeatures.PLUM, PLUM_SAPLING);
        PURFUNGA = withFilter(DTConfiguredFeatures.PURFUNGA, PURFUNGA_SAPLING);
        SPROOM = withFilter(DTConfiguredFeatures.SPROOM, SPROOM_SAPLING);
        STORTREEAN = withFilter(DTConfiguredFeatures.STORTREEAN, STORTREEAN_SAPLING);
        STROOMEAN = withFilter(DTConfiguredFeatures.STROOMEAN, STROOMEAN_SAPLING);
        SUNRISE_FUNGUS = withFilter(DTConfiguredFeatures.SUNRISE_FUNGUS, SUNRISE_FUNGUS_SAPLING);
        TEAK = withFilter(DTConfiguredFeatures.TEAK, TEAK_SAPLING);
        THUNDERCLOUD_PLUM = withFilter(DTConfiguredFeatures.THUNDERCLOUD_PLUM, THUNDERCLOUD_PLUM_SAPLING);

        ALMOND_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.ALMOND_VERY_RARE_BEES, ALMOND_SAPLING);
        ALMOND_REGULAR_BEES = withFilter(DTConfiguredFeatures.ALMOND_REGULAR_BEES, ALMOND_SAPLING);
        ALMOND_MORE_BEES = withFilter(DTConfiguredFeatures.ALMOND_MORE_BEES, ALMOND_SAPLING);
        ALMOND_BEES = withFilter(DTConfiguredFeatures.ALMOND_BEES, ALMOND_SAPLING);

        FANCY_ALMOND_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.FANCY_ALMOND_VERY_RARE_BEES, ALMOND_SAPLING);
        FANCY_ALMOND_REGULAR_BEES = withFilter(DTConfiguredFeatures.FANCY_ALMOND_REGULAR_BEES, ALMOND_SAPLING);
        FANCY_ALMOND_MORE_BEES = withFilter(DTConfiguredFeatures.FANCY_ALMOND_MORE_BEES, ALMOND_SAPLING);
        FANCY_ALMOND_BEES = withFilter(DTConfiguredFeatures.FANCY_ALMOND_BEES, ALMOND_SAPLING);

        GREAT_ALMOND_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.GREAT_ALMOND_VERY_RARE_BEES, ALMOND_SAPLING);
        GREAT_ALMOND_REGULAR_BEES = withFilter(DTConfiguredFeatures.GREAT_ALMOND_REGULAR_BEES, ALMOND_SAPLING);
        GREAT_ALMOND_MORE_BEES = withFilter(DTConfiguredFeatures.GREAT_ALMOND_MORE_BEES, ALMOND_SAPLING);
        GREAT_ALMOND_BEES = withFilter(DTConfiguredFeatures.GREAT_ALMOND_BEES, ALMOND_SAPLING);

        AQUEAN_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.AQUEAN_BEES,AQUEAN_SAPLING);
        AQUEAN_REGULAR_BEES = withFilter(DTConfiguredFeatures.AQUEAN_BEES, AQUEAN_SAPLING);
        AQUEAN_MORE_BEES = withFilter(DTConfiguredFeatures.AQUEAN_BEES, AQUEAN_SAPLING);
        AQUEAN_BEES = withFilter(DTConfiguredFeatures.AQUEAN_BEES, AQUEAN_SAPLING);

        FANCY_AQUEAN_VERY_RARE_STASP_NEST = withFilter(DTConfiguredFeatures.FANCY_AQUEAN_VERY_RARE_STASP_NEST, AQUEAN_SAPLING);
        FANCY_AQUEAN_REGULAR_STASP_NEST = withFilter(DTConfiguredFeatures.FANCY_AQUEAN_REGULAR_STASP_NEST, AQUEAN_SAPLING);
        FANCY_AQUEAN_MORE_STASP_NEST = withFilter(DTConfiguredFeatures.FANCY_AQUEAN_MORE_STASP_NEST, AQUEAN_SAPLING);
        FANCY_AQUEAN_STASP_NEST = withFilter(DTConfiguredFeatures.FANCY_AQUEAN_STASP_NEST, AQUEAN_SAPLING);

        GREAT_AQUEAN_VERY_RARE_STASP_NEST = withFilter(DTConfiguredFeatures.GREAT_AQUEAN_VERY_RARE_STASP_NEST, AQUEAN_SAPLING);
        GREAT_AQUEAN_REGULAR_STASP_NEST = withFilter(DTConfiguredFeatures.GREAT_AQUEAN_REGULAR_STASP_NEST, AQUEAN_SAPLING);
        GREAT_AQUEAN_MORE_STASP_NEST = withFilter(DTConfiguredFeatures.GREAT_AQUEAN_MORE_STASP_NEST, AQUEAN_SAPLING);
        GREAT_AQUEAN_STASP_NEST = withFilter(DTConfiguredFeatures.GREAT_AQUEAN_STASP_NEST, AQUEAN_SAPLING);

        CHERRY_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.CHERRY_VERY_RARE_BEES, CHERRY_SAPLING);
        CHERRY_REGULAR_BEES = withFilter(DTConfiguredFeatures.CHERRY_REGULAR_BEES, CHERRY_SAPLING);
        CHERRY_MORE_BEES = withFilter(DTConfiguredFeatures.CHERRY_MORE_BEES, CHERRY_SAPLING);
        CHERRY_BEES = withFilter(DTConfiguredFeatures.CHERRY_BEES, CHERRY_SAPLING);

        FANCY_CHERRY_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.FANCY_CHERRY_VERY_RARE_BEES, CHERRY_SAPLING);
        FANCY_CHERRY_REGULAR_BEES = withFilter(DTConfiguredFeatures.FANCY_CHERRY_REGULAR_BEES, CHERRY_SAPLING);
        FANCY_CHERRY_MORE_BEES = withFilter(DTConfiguredFeatures.FANCY_CHERRY_MORE_BEES, CHERRY_SAPLING);
        FANCY_CHERRY_BEES = withFilter(DTConfiguredFeatures.FANCY_CHERRY_BEES, CHERRY_SAPLING);

        GREAT_CHERRY_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.GREAT_CHERRY_VERY_RARE_BEES, CHERRY_SAPLING);
        GREAT_CHERRY_REGULAR_BEES = withFilter(DTConfiguredFeatures.GREAT_CHERRY_REGULAR_BEES, CHERRY_SAPLING);
        GREAT_CHERRY_MORE_BEES = withFilter(DTConfiguredFeatures.GREAT_CHERRY_MORE_BEES, CHERRY_SAPLING);
        GREAT_CHERRY_BEES = withFilter(DTConfiguredFeatures.GREAT_CHERRY_BEES, CHERRY_SAPLING);

        PIN_CHERRY_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.PIN_CHERRY_VERY_RARE_BEES, PIN_CHERRY_SAPLING);
        PIN_CHERRY_REGULAR_BEES = withFilter(DTConfiguredFeatures.PIN_CHERRY_REGULAR_BEES, PIN_CHERRY_SAPLING);
        PIN_CHERRY_MORE_BEES = withFilter(DTConfiguredFeatures.PIN_CHERRY_MORE_BEES, PIN_CHERRY_SAPLING);
        PIN_CHERRY_BEES = withFilter(DTConfiguredFeatures.PIN_CHERRY_BEES, PIN_CHERRY_SAPLING);

        FANCY_PIN_CHERRY_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.FANCY_PIN_CHERRY_VERY_RARE_BEES, PIN_CHERRY_SAPLING);
        FANCY_PIN_CHERRY_REGULAR_BEES = withFilter(DTConfiguredFeatures.FANCY_PIN_CHERRY_REGULAR_BEES, PIN_CHERRY_SAPLING);
        FANCY_PIN_CHERRY_MORE_BEES = withFilter(DTConfiguredFeatures.FANCY_PIN_CHERRY_MORE_BEES, PIN_CHERRY_SAPLING);
        FANCY_PIN_CHERRY_BEES = withFilter(DTConfiguredFeatures.FANCY_PIN_CHERRY_BEES, PIN_CHERRY_SAPLING);

        GREAT_PIN_CHERRY_VERY_RARE_BEES = withFilter(DTConfiguredFeatures.GREAT_PIN_CHERRY_VERY_RARE_BEES, PIN_CHERRY_SAPLING);
        GREAT_PIN_CHERRY_REGULAR_BEES = withFilter(DTConfiguredFeatures.GREAT_PIN_CHERRY_REGULAR_BEES, PIN_CHERRY_SAPLING);
        GREAT_PIN_CHERRY_MORE_BEES = withFilter(DTConfiguredFeatures.GREAT_PIN_CHERRY_MORE_BEES, PIN_CHERRY_SAPLING);
        GREAT_PIN_CHERRY_BEES = withFilter(DTConfiguredFeatures.GREAT_PIN_CHERRY_BEES, PIN_CHERRY_SAPLING);

        ALMOND_FOREST_FLOWERS = withFlowerModifiers(DTConfiguredFeatures.ALMOND_FOREST_FLOWERS);
        ALMOND_PLUS_FOREST_FLOWERS = withFlowerModifiers(DTConfiguredFeatures.ALMOND_PLUS_FOREST_FLOWERS);
        BLACK_BIRCH_FOREST_FLOWERS = withFlowerModifiers(DTConfiguredFeatures.BLACK_BIRCH_FOREST_FLOWERS);
        CHERRY_CLIFFS_FOREST_FLOWERS = withFlowerModifiers(DTConfiguredFeatures.CHERRY_CLIFFS_FOREST_FLOWERS);
        CHERRY_FOREST_FLOWERS = withFlowerModifiers(DTConfiguredFeatures.CHERRY_FOREST_FLOWERS);
        PLUM_FOREST_FLOWERS = withFlowerModifiers(DTConfiguredFeatures.PLUM_FOREST_FLOWERS);
        THUNDERCLOUD_PLUM_FOREST_FLOWERS = withFlowerModifiers(DTConfiguredFeatures.THUNDERCLOUD_PLUM_FOREST_FLOWERS);

        ALMOND_FOREST_TREES = withCountExtra(createRandomSelector(new RandomFeatureConfig(ImmutableList.of(
                new RandomFeatureEntry(DTPlacedFeatures.ALMOND_REGULAR_BEES, 0.25F),
                new RandomFeatureEntry(DTPlacedFeatures.ALMOND_MORE_BEES, 0.20F),
                new RandomFeatureEntry(DTPlacedFeatures.ALMOND_BEES, 0.15F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_ALMOND_VERY_RARE_BEES, 0.25F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_ALMOND_REGULAR_BEES, 0.20F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_ALMOND_MORE_BEES, 0.15F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_ALMOND_BEES, 0.15F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_ALMOND_VERY_RARE_BEES, 0.20F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_ALMOND_REGULAR_BEES, 0.15F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_ALMOND_MORE_BEES, 0.15F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_ALMOND_BEES, 0.15F)
        ), DTPlacedFeatures.ALMOND)), 10, 0.1F, 2);

        ALMOND_PLUS_FOREST_TREES = withCountExtra(createRandomSelector(new RandomFeatureConfig(ImmutableList.of(
                new RandomFeatureEntry(DTPlacedFeatures.ALMOND_REGULAR_BEES, 0.175F),
                new RandomFeatureEntry(DTPlacedFeatures.ALMOND_MORE_BEES, 0.12F),
                new RandomFeatureEntry(DTPlacedFeatures.ALMOND_BEES, 0.05F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_ALMOND_VERY_RARE_BEES, 0.25F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_ALMOND_REGULAR_BEES, 0.175F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_ALMOND_MORE_BEES, 0.12F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_ALMOND_BEES, 0.05F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_ALMOND_VERY_RARE_BEES, 0.25F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_ALMOND_REGULAR_BEES, 0.175F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_ALMOND_MORE_BEES, 0.12F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_ALMOND_BEES, 0.05F),
                new RandomFeatureEntry(TreePlacedFeatures.BIRCH_BEES_002, 0.20F),
                new RandomFeatureEntry(TreePlacedFeatures.FANCY_OAK_BEES_002, 0.32F),
                new RandomFeatureEntry(TreePlacedFeatures.OAK_BEES_002, 0.16F)
        ), DTPlacedFeatures.ALMOND)), 10, 0.1F, 1);

        BLACK_BIRCH_FOREST_TREES = withCountExtra(createRandomSelector(new RandomFeatureConfig(ImmutableList.of(

        ), DTPlacedFeatures.BLACK_BIRCH)), 10, 0.1F, 1);

        CHERRY_CLIFFS_FOREST_TREES = withCountExtra(createRandomSelector(new RandomFeatureConfig(ImmutableList.of(
                new RandomFeatureEntry(DTPlacedFeatures.CHERRY_REGULAR_BEES, 0.55F),
                new RandomFeatureEntry(DTPlacedFeatures.CHERRY_MORE_BEES, 0.07F),
                new RandomFeatureEntry(DTPlacedFeatures.CHERRY_BEES, 0.05F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_CHERRY_VERY_RARE_BEES, 0.25F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_CHERRY_REGULAR_BEES, 0.20F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_CHERRY_MORE_BEES, 0.10F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_CHERRY_BEES, 0.10F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_CHERRY_VERY_RARE_BEES, 0.25F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_CHERRY_REGULAR_BEES, 0.15F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_CHERRY_MORE_BEES, 0.10F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_CHERRY_BEES, 0.10F)
        ), DTPlacedFeatures.CHERRY)), 10, 0.1F, 1);

        CHERRY_FOREST_TREES = withCountExtra(createRandomSelector(new RandomFeatureConfig(ImmutableList.of(
                new RandomFeatureEntry(DTPlacedFeatures.CHERRY_REGULAR_BEES, 0.55F),
                new RandomFeatureEntry(DTPlacedFeatures.CHERRY_MORE_BEES, 0.07F),
                new RandomFeatureEntry(DTPlacedFeatures.CHERRY_BEES, 0.05F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_CHERRY_VERY_RARE_BEES, 0.35F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_CHERRY_REGULAR_BEES, 0.30F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_CHERRY_MORE_BEES, 0.10F),
                new RandomFeatureEntry(DTPlacedFeatures.FANCY_CHERRY_BEES, 0.10F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_CHERRY_VERY_RARE_BEES, 0.25F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_CHERRY_REGULAR_BEES, 0.15F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_CHERRY_MORE_BEES, 0.10F),
                new RandomFeatureEntry(DTPlacedFeatures.GREAT_CHERRY_BEES, 0.10F)
        ), DTPlacedFeatures.CHERRY)), 10, 0.1F, 1);

        PLUM_FOREST_TREES = withCountExtra(createRandomSelector(new RandomFeatureConfig(ImmutableList.of(

        ), DTPlacedFeatures.PLUM)), 10, 0.1F, 1);

        THUNDERCLOUD_PLUM_FOREST_TREES = withCountExtra(createRandomSelector(new RandomFeatureConfig(ImmutableList.of(

        ), DTPlacedFeatures.THUNDERCLOUD_PLUM)), 10, 0.1F, 1);
    }

    public static void initialize() {
        PlacedFeatures.register("deep_trenches:fuchsitra_towards_x", FUCHSITRA_TOWARDS_X);
        PlacedFeatures.register("deep_trenches:fuchsitra_towards_z", FUCHSITRA_TOWARDS_Z);
        PlacedFeatures.register("deep_trenches:fancy_fuchsitra_towards_x", FANCY_FUCHSITRA_TOWARDS_X);
        PlacedFeatures.register("deep_trenches:fancy_fuchsitra_towards_z", FANCY_FUCHSITRA_TOWARDS_Z);
        PlacedFeatures.register("deep_trenches:great_fuchsitra_towards_x", GREAT_FUCHSITRA_TOWARDS_X);
        PlacedFeatures.register("deep_trenches:great_fuchsitra_towards_z", GREAT_FUCHSITRA_TOWARDS_Z);

        PlacedFeatures.register("deep_trenches:almond", ALMOND);
        PlacedFeatures.register("deep_trenches:anameata", ANAMEATA);
        PlacedFeatures.register("deep_trenches:aquean", AQUEAN);
        PlacedFeatures.register("deep_trenches:barshrookle", BARSHROOKLE);
        PlacedFeatures.register("deep_trenches:black_birch", BLACK_BIRCH);
        PlacedFeatures.register("deep_trenches:cherry", CHERRY);
        PlacedFeatures.register("deep_trenches:cook_pine", COOK_PINE);
        PlacedFeatures.register("deep_trenches:crolood", CROLOOD);
        PlacedFeatures.register("deep_trenches:dark_crolood", DARK_CROLOOD);
        PlacedFeatures.register("deep_trenches:ebony", EBONY);
        PlacedFeatures.register("deep_trenches:fuchsitra", FUCHSITRA);
        PlacedFeatures.register("deep_trenches:funeranite", FUNERANITE);
        PlacedFeatures.register("deep_trenches:ghoshroom", GHOSHROOM);
        PlacedFeatures.register("deep_trenches:peltogyne", PELTOGYNE);
        PlacedFeatures.register("deep_trenches:pin_cherry", PIN_CHERRY);
        PlacedFeatures.register("deep_trenches:plum", PLUM);
        PlacedFeatures.register("deep_trenches:purfunga", PURFUNGA);
        PlacedFeatures.register("deep_trenches:sproom", SPROOM);
        PlacedFeatures.register("deep_trenches:stortreean", STORTREEAN);
        PlacedFeatures.register("deep_trenches:stroomean", STROOMEAN);
        PlacedFeatures.register("deep_trenches:sunrise_fungus", SUNRISE_FUNGUS);
        PlacedFeatures.register("deep_trenches:teak", TEAK);
        PlacedFeatures.register("deep_trenches:thundercloud_plum", THUNDERCLOUD_PLUM);

        PlacedFeatures.register("deep_trenches:almond_very_rare_bees", ALMOND_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:almond_regular_bees", ALMOND_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:almond_more_bees", ALMOND_MORE_BEES);
        PlacedFeatures.register("deep_trenches:almond_bees", ALMOND_BEES);

        PlacedFeatures.register("deep_trenches:fancy_almond_very_rare_bees", FANCY_ALMOND_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:fancy_almond_regular_bees", FANCY_ALMOND_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:fancy_almond_more_bees", FANCY_ALMOND_MORE_BEES);
        PlacedFeatures.register("deep_trenches:fancy_almond_bees", FANCY_ALMOND_BEES);

        PlacedFeatures.register("deep_trenches:great_almond_very_rare_bees", GREAT_ALMOND_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:great_almond_regular_bees", GREAT_ALMOND_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:great_almond_more_bees", GREAT_ALMOND_MORE_BEES);
        PlacedFeatures.register("deep_trenches:great_almond_bees", GREAT_ALMOND_BEES);

        PlacedFeatures.register("deep_trenches:aquean_very_rare_bees", AQUEAN_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:aquean_regular_bees", AQUEAN_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:aquean_more_bees", AQUEAN_MORE_BEES);
        PlacedFeatures.register("deep_trenches:aquean_bees", AQUEAN_BEES);

        PlacedFeatures.register("deep_trenches:fancy_aquean_very_rare_stasp_nest", FANCY_AQUEAN_VERY_RARE_STASP_NEST);
        PlacedFeatures.register("deep_trenches:fancy_aquean_regular_stasp_nest", FANCY_AQUEAN_REGULAR_STASP_NEST);
        PlacedFeatures.register("deep_trenches:fancy_aquean_more_stasp_nest", FANCY_AQUEAN_MORE_STASP_NEST);
        PlacedFeatures.register("deep_trenches:fancy_aquean_stasp_nest", FANCY_AQUEAN_STASP_NEST);

        PlacedFeatures.register("deep_trenches:great_aquean_very_rare_stasp_nest", GREAT_AQUEAN_VERY_RARE_STASP_NEST);
        PlacedFeatures.register("deep_trenches:great_aquean_regular_stasp_nest", GREAT_AQUEAN_REGULAR_STASP_NEST);
        PlacedFeatures.register("deep_trenches:great_aquean_more_stasp_nest", GREAT_AQUEAN_MORE_STASP_NEST);
        PlacedFeatures.register("deep_trenches:great_aquean_stasp_nest", GREAT_AQUEAN_STASP_NEST);

        PlacedFeatures.register("deep_trenches:cherry_very_rare_bees", CHERRY_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:cherry_regular_bees", CHERRY_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:cherry_more_bees", CHERRY_MORE_BEES);
        PlacedFeatures.register("deep_trenches:cherry_bees", CHERRY_BEES);

        PlacedFeatures.register("deep_trenches:fancy_cherry_very_rare_bees", FANCY_CHERRY_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:fancy_cherry_regular_bees", FANCY_CHERRY_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:fancy_cherry_more_bees", FANCY_CHERRY_MORE_BEES);
        PlacedFeatures.register("deep_trenches:fancy_cherry_bees", FANCY_CHERRY_BEES);

        PlacedFeatures.register("deep_trenches:great_cherry_very_rare_bees", GREAT_CHERRY_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:great_cherry_regular_bees", GREAT_CHERRY_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:great_cherry_more_bees", GREAT_CHERRY_MORE_BEES);
        PlacedFeatures.register("deep_trenches:great_cherry_bees", GREAT_CHERRY_BEES);

        PlacedFeatures.register("deep_trenches:pin_cherry_very_rare_bees", PIN_CHERRY_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:pin_cherry_regular_bees", PIN_CHERRY_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:pin_cherry_more_bees", PIN_CHERRY_MORE_BEES);
        PlacedFeatures.register("deep_trenches:pin_cherry_bees", PIN_CHERRY_BEES);

        PlacedFeatures.register("deep_trenches:fancy_pin_cherry_very_rare_bees", FANCY_PIN_CHERRY_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:fancy_pin_cherry_regular_bees", FANCY_PIN_CHERRY_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:fancy_pin_cherry_more_bees", FANCY_PIN_CHERRY_MORE_BEES);
        PlacedFeatures.register("deep_trenches:fancy_pin_cherry_bees", FANCY_PIN_CHERRY_BEES);

        PlacedFeatures.register("deep_trenches:great_pin_cherry_very_rare_bees", GREAT_PIN_CHERRY_VERY_RARE_BEES);
        PlacedFeatures.register("deep_trenches:great_pin_cherry_regular_bees", GREAT_PIN_CHERRY_REGULAR_BEES);
        PlacedFeatures.register("deep_trenches:great_pin_cherry_more_bees", GREAT_PIN_CHERRY_MORE_BEES);
        PlacedFeatures.register("deep_trenches:great_pin_cherry_bees", GREAT_PIN_CHERRY_BEES);

        PlacedFeatures.register("deep_trenches:almond_forest_flowers", ALMOND_FOREST_FLOWERS);
        PlacedFeatures.register("deep_trenches:almond_plus_forest_flowers", ALMOND_PLUS_FOREST_FLOWERS);
        PlacedFeatures.register("deep_trenches:black_birch_forest_flowers", BLACK_BIRCH_FOREST_FLOWERS);
        PlacedFeatures.register("deep_trenches:cherry_cliffs_forest_flowers", CHERRY_CLIFFS_FOREST_FLOWERS);
        PlacedFeatures.register("deep_trenches:cherry_forest_flowers", CHERRY_FOREST_FLOWERS);
        PlacedFeatures.register("deep_trenches:plum_forest_flowers", PLUM_FOREST_FLOWERS);
        PlacedFeatures.register("deep_trenches:thundercloud_plum_forest_flowers", THUNDERCLOUD_PLUM_FOREST_FLOWERS);

        PlacedFeatures.register("deep_trenches:almond_forest_trees", ALMOND_FOREST_TREES);
        PlacedFeatures.register("deep_trenches:almond_plus_forest_trees", ALMOND_PLUS_FOREST_TREES);
        PlacedFeatures.register("deep_trenches:black_birch_forest_trees", BLACK_BIRCH_FOREST_TREES);
        PlacedFeatures.register("deep_trenches:cherry_cliffs_forest_trees", CHERRY_CLIFFS_FOREST_TREES);
        PlacedFeatures.register("deep_trenches:cherry_forest_trees", CHERRY_FOREST_TREES);
        PlacedFeatures.register("deep_trenches:plum_forest_trees", PLUM_FOREST_TREES);
        PlacedFeatures.register("deep_trenches:thundercloud_plum_forest_trees", THUNDERCLOUD_PLUM_FOREST_TREES);
    }

}
