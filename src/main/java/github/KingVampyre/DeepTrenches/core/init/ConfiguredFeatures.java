package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.world.gen.trunk.GreatTrunkPlacer;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.OptionalInt;

import static github.KingVampyre.DeepTrenches.core.init.TrunkProviders.*;

public class ConfiguredFeatures {

    public static final ConfiguredFeature<TreeFeatureConfig, ?> ALMOND;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> CHERRY;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> PIN_CHERRY;

    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_ALMOND;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_CHERRY;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_PIN_CHERRY;

    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_ALMOND;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_CHERRY;
    public static final ConfiguredFeature<TreeFeatureConfig, ?> GREAT_PIN_CHERRY;

    static {
        ALMOND = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                ALMOND_TRUNK_PROVIDER,
                new StraightTrunkPlacer(4, 3, 0),
                ALMOND_FOLIAGE_PROVIDER,
                ALMOND_SAPLING_PROVIDER,
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).build());

        CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                CHERRY_TRUNK_PROVIDER,
                new StraightTrunkPlacer(4, 3, 0),
                CHERRY_FOLIAGE_PROVIDER,
                CHERRY_SAPLING_PROVIDER,
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).build());

        PIN_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                PIN_CHERRY_TRUNK_PROVIDER,
                new StraightTrunkPlacer(4, 3, 0),
                PIN_CHERRY_FOLIAGE_PROVIDER,
                PIN_CHERRY_SAPLING_PROVIDER,
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).build());

        FANCY_ALMOND = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                ALMOND_TRUNK_PROVIDER,
                new StraightTrunkPlacer(5, 11, 0),
                ALMOND_FOLIAGE_PROVIDER,
                ALMOND_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).build());

        FANCY_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                CHERRY_TRUNK_PROVIDER,
                new StraightTrunkPlacer(5, 11, 0),
                CHERRY_FOLIAGE_PROVIDER,
                CHERRY_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).build());

        FANCY_PIN_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                PIN_CHERRY_TRUNK_PROVIDER,
                new StraightTrunkPlacer(0, 0, 0),
                PIN_CHERRY_FOLIAGE_PROVIDER,
                PIN_CHERRY_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).build());

        GREAT_ALMOND = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                ALMOND_TRUNK_PROVIDER,
                new GreatTrunkPlacer(7, 11, 0),
                ALMOND_FOLIAGE_PROVIDER,
                ALMOND_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(4), 5),
                new ThreeLayersFeatureSize(1, 0, 1, 1, 2, OptionalInt.empty())
        ).build());

        GREAT_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                CHERRY_TRUNK_PROVIDER,
                new GreatTrunkPlacer(7, 11, 0),
                CHERRY_FOLIAGE_PROVIDER,
                CHERRY_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(4), 5),
                new ThreeLayersFeatureSize(1, 0, 1, 1, 2, OptionalInt.empty())
        ).build());

        GREAT_PIN_CHERRY = Feature.TREE.configure(new TreeFeatureConfig.Builder(
                PIN_CHERRY_TRUNK_PROVIDER,
                new GreatTrunkPlacer(7, 11, 0),
                PIN_CHERRY_FOLIAGE_PROVIDER,
                PIN_CHERRY_SAPLING_PROVIDER,
                new LargeOakFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(4), 5),
                new ThreeLayersFeatureSize(1, 0, 1, 1, 2, OptionalInt.empty())
        ).build());
    }

}