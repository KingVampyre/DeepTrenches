package github.KingVampyre.DeepTrenches.core.init.world;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.core.util.math.intprovider.NegativeConstantIntProvider;
import github.KingVampyre.DeepTrenches.core.world.gen.foliage.*;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.FuchsitraTrunkPlacer;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.GreatTrunkPlacer;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.OptionalInt;
import java.util.function.Supplier;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlockStateProviders.*;
import static github.KingVampyre.DeepTrenches.core.init.world.DTPlacedFeatures.*;
import static net.minecraft.world.gen.feature.TreePlacedFeatures.*;

public class DTFeatureConfigs {

    public static final TreeFeatureConfig ALMOND_TREE_CONFIG;
    public static final TreeFeatureConfig ANAMEATA_TREE_CONFIG;
    public static final TreeFeatureConfig AQUEAN_TREE_CONFIG;
    public static final TreeFeatureConfig BARSHROOKLE_TREE_CONFIG;
    public static final TreeFeatureConfig BLACK_BIRCH_TREE_CONFIG;
    public static final TreeFeatureConfig CHERRY_TREE_CONFIG;
    public static final TreeFeatureConfig COOK_PINE_TREE_CONFIG;
    public static final TreeFeatureConfig CROLOOD_TREE_CONFIG;
    public static final TreeFeatureConfig DARK_CROLOOD_TREE_CONFIG;
    public static final TreeFeatureConfig EBONY_TREE_CONFIG;
    public static final TreeFeatureConfig FUNERANITE_TREE_CONFIG;
    public static final TreeFeatureConfig GHOSHROOM_TREE_CONFIG;
    public static final TreeFeatureConfig PELTOGYNE_TREE_CONFIG;
    public static final TreeFeatureConfig PIN_CHERRY_TREE_CONFIG;
    public static final TreeFeatureConfig PLUM_TREE_CONFIG;
    public static final TreeFeatureConfig PURFUNGA_TREE_CONFIG;
    public static final TreeFeatureConfig SPROOM_TREE_CONFIG;
    public static final TreeFeatureConfig STORTREEAN_TREE_CONFIG;
    public static final TreeFeatureConfig STROOMEAN_TREE_CONFIG;
    public static final TreeFeatureConfig SUNRISE_FUNGUS_TREE_CONFIG;
    public static final TreeFeatureConfig TEAK_TREE_CONFIG;
    public static final TreeFeatureConfig THUNDERCLOUD_PLUM_TREE_CONFIG;

    public static final TreeFeatureConfig FANCY_ALMOND_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_ANAMEATA_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_AQUEAN_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_BLACK_BIRCH_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_CHERRY_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_PIN_CHERRY_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_PLUM_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_TEAK_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_THUNDERCLOUD_PLUM_TREE_CONFIG;

    public static final TreeFeatureConfig GREAT_ALMOND_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_ANAMEATA_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_AQUEAN_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_BLACK_BIRCH_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_CHERRY_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_PIN_CHERRY_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_PLUM_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_TEAK_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_THUNDERCLOUD_PLUM_TREE_CONFIG;

    public static final TreeFeatureConfig FUCHSITRA_TREE_TOWARDS_X_CONFIG;
    public static final TreeFeatureConfig FUCHSITRA_TREE_TOWARDS_Z_CONFIG;
    public static final TreeFeatureConfig FANCY_FUCHSITRA_TREE_TOWARDS_X_CONFIG;
    public static final TreeFeatureConfig FANCY_FUCHSITRA_TREE_TOWARDS_Z_CONFIG;
    public static final TreeFeatureConfig GREAT_FUCHSITRA_TREE_TOWARDS_X_CONFIG;
    public static final TreeFeatureConfig GREAT_FUCHSITRA_TREE_TOWARDS_Z_CONFIG;

    public static final SimpleRandomFeatureConfig FUCHSITRA_TREE_CONFIG;
    public static final SimpleRandomFeatureConfig FANCY_FUCHSITRA_TREE_CONFIG;
    public static final SimpleRandomFeatureConfig GREAT_FUCHSITRA_TREE_CONFIG;

    public static final RandomPatchFeatureConfig BLACK_LILY_CONFIG;
    public static final RandomPatchFeatureConfig LILAC_CONFIG;
    public static final RandomPatchFeatureConfig ORANGE_LILY_CONFIG;
    public static final RandomPatchFeatureConfig VELVET_LILY_CONFIG;

    public static final RandomPatchFeatureConfig ALMOND_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig ALMOND_PLUS_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig BLACK_BIRCH_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig CHERRY_CLIFFS_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig CHERRY_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig PLUM_FOREST_FLOWER_CONFIG;
    public static final RandomPatchFeatureConfig THUNDERCLOUD_PLUM_FOREST_FLOWER_CONFIG;

    protected static TreeFeatureConfig createStraightTreeConfig(BlockStateProvider trunkProvider, BlockStateProvider foliageProvider, FoliagePlacer foliagePlacer, int baseHeight, int firstRandomHeight) {
        return new TreeFeatureConfig.Builder(trunkProvider, new StraightTrunkPlacer(baseHeight, firstRandomHeight, 0), foliageProvider, foliagePlacer, new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build();
    }

    protected static TreeFeatureConfig createAqueanTreeConfig(FoliagePlacer foliagePlacer, int baseHeight, int firstRandomHeight) {
        return createStraightTreeConfig(AQUEAN_TRUNK_PROVIDER, AQUEAN_FOLIAGE_PROVIDER, foliagePlacer, baseHeight, firstRandomHeight);
    }

    protected static TreeFeatureConfig createAqueanTreeConfig() {
        return createAqueanTreeConfig(new AqueanFoliagePlacer(ConstantIntProvider.create(2), NegativeConstantIntProvider.create(-1), 1), 3, 2);
    }

    protected static TreeFeatureConfig createFancyAqueanTreeConfig() {
        return createAqueanTreeConfig(new FancyAqueanFoliagePlacer(ConstantIntProvider.create(3), NegativeConstantIntProvider.create(-2), 2), 4, 3);
    }

    protected static TreeFeatureConfig createGreatAqueanTreeConfig() {
        return createAqueanTreeConfig(new GreatAqueanFoliagePlacer(ConstantIntProvider.create(3), NegativeConstantIntProvider.create(-3), 7), 8, 3);
    }

    protected static TreeFeatureConfig createFuchsitraTreeConfig(FoliagePlacer foliagePlacer, Direction.Axis axis, int baseHeight, int firstRandomHeight, int basementHeight, int basementThickness) {
        return new TreeFeatureConfig.Builder(FUCHSITRA_TRUNK_PROVIDER, new FuchsitraTrunkPlacer(baseHeight, firstRandomHeight, 0, basementHeight, 1, basementThickness, 2, axis), FUCHSITRA_FOLIAGE_PROVIDER, foliagePlacer, new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build();
    }

    protected static TreeFeatureConfig createFuchsitraTreeConfig(Direction.Axis axis) {
        return createStraightTreeConfig(FUCHSITRA_TRUNK_PROVIDER, FUCHSITRA_FOLIAGE_PROVIDER, new FuchsitraFoliagePlacer(ConstantIntProvider.create(2), NegativeConstantIntProvider.create(-1), axis, 7), 8, 6);
    }

    protected static TreeFeatureConfig createFancyFuchsitraTreeConfig(Direction.Axis axis) {
        return createFuchsitraTreeConfig(new FuchsitraFoliagePlacer(ConstantIntProvider.create(2), NegativeConstantIntProvider.create(-1), axis, 7), axis, 10, 7, 0, 0);
    }

    protected static TreeFeatureConfig createGreatFuchsitraTreeConfig(Direction.Axis axis) {
        return createFuchsitraTreeConfig(new FuchsitraFoliagePlacer(ConstantIntProvider.create(2), NegativeConstantIntProvider.create(-1), axis, 7), axis, 12, 2, 5, 4);
    }

    protected static TreeFeatureConfig createPlumTreeConfig(int baseHeight, int firstRandomHeight, int radius, int foliageHeight) {
        return createStraightTreeConfig(PLUM_TRUNK_PROVIDER, PLUM_FOLIAGE_PROVIDER, new PlumFoliagePlacer(ConstantIntProvider.create(radius), NegativeConstantIntProvider.create(-radius), foliageHeight), baseHeight, firstRandomHeight);
    }

    protected static TreeFeatureConfig createBlobTreeConfig(BlockStateProvider trunk, BlockStateProvider foliage) {
        return createStraightTreeConfig(trunk, foliage, new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3), 4, 3);
    }

    protected static TreeFeatureConfig createFancyTreeConfig(BlockStateProvider trunk, BlockStateProvider foliage) {
        return new TreeFeatureConfig.Builder(trunk, new LargeOakTrunkPlacer(5, 11, 0), foliage, new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build();
    }

    protected static TreeFeatureConfig createGreatTreeConfig(BlockStateProvider trunk, BlockStateProvider foliage) {
        return new TreeFeatureConfig.Builder(trunk, new GreatTrunkPlacer(12, 7, 0), foliage, new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build();
    }

    protected static RandomPatchFeatureConfig createRandomPatchFeatureConfig(int tries, int xzSpread, int ySpread, BlockStateProvider provider) {
        return new RandomPatchFeatureConfig(tries, xzSpread, ySpread, () -> Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(provider)).withInAirFilter());
    }

    @SafeVarargs
    protected static SimpleRandomFeatureConfig createSimpleRandomFeatureConfig(Supplier<PlacedFeature> ...suppliers) {
        return new SimpleRandomFeatureConfig(ImmutableList.copyOf(suppliers));
    }

    protected static RandomPatchFeatureConfig createTallFlowerConfig(BlockStateProvider provider) {
        return createRandomPatchFeatureConfig(96, 7, 3, provider);
    }

    protected static RandomPatchFeatureConfig createFlowerConfig(BlockStateProvider provider) {
        return createRandomPatchFeatureConfig(96, 6, 2, provider);
    }

    static {
        ALMOND_TREE_CONFIG = createBlobTreeConfig(ALMOND_TRUNK_PROVIDER, ALMOND_FOLIAGE_PROVIDER);
        ANAMEATA_TREE_CONFIG = createBlobTreeConfig(ANAMEATA_TRUNK_PROVIDER, ANAMEATA_FOLIAGE_PROVIDER);
        AQUEAN_TREE_CONFIG = createAqueanTreeConfig();
        BARSHROOKLE_TREE_CONFIG = createBlobTreeConfig(BARSHROOKLE_TRUNK_PROVIDER, BARSHROOKLE_FOLIAGE_PROVIDER);
        BLACK_BIRCH_TREE_CONFIG = createBlobTreeConfig(BLACK_BIRCH_TRUNK_PROVIDER, BLACK_BIRCH_FOLIAGE_PROVIDER);
        CHERRY_TREE_CONFIG = createBlobTreeConfig(CHERRY_TRUNK_PROVIDER, CHERRY_FOLIAGE_PROVIDER);
        COOK_PINE_TREE_CONFIG = createBlobTreeConfig(COOK_PINE_TRUNK_PROVIDER, COOK_PINE_FOLIAGE_PROVIDER);
        CROLOOD_TREE_CONFIG = createBlobTreeConfig(CROLOOD_TRUNK_PROVIDER, CROLOOD_FOLIAGE_PROVIDER);
        DARK_CROLOOD_TREE_CONFIG = createBlobTreeConfig(DARK_CROLOOD_TRUNK_PROVIDER, DARK_CROLOOD_FOLIAGE_PROVIDER);
        EBONY_TREE_CONFIG = createBlobTreeConfig(EBONY_TRUNK_PROVIDER, EBONY_FOLIAGE_PROVIDER);
        FUNERANITE_TREE_CONFIG = createBlobTreeConfig(FUNERANITE_TRUNK_PROVIDER, FUNERANITE_FOLIAGE_PROVIDER);
        GHOSHROOM_TREE_CONFIG = createBlobTreeConfig(GHOSHROOM_TRUNK_PROVIDER, GHOSHROOM_FOLIAGE_PROVIDER);
        PELTOGYNE_TREE_CONFIG = createBlobTreeConfig(PELTOGYNE_TRUNK_PROVIDER, PELTOGYNE_FOLIAGE_PROVIDER);
        PIN_CHERRY_TREE_CONFIG = createBlobTreeConfig(PIN_CHERRY_TRUNK_PROVIDER, PIN_CHERRY_FOLIAGE_PROVIDER);
        PLUM_TREE_CONFIG = createPlumTreeConfig(6, 3, 2, 5);
        PURFUNGA_TREE_CONFIG = createBlobTreeConfig(PURFUNGA_TRUNK_PROVIDER, PURFUNGA_FOLIAGE_PROVIDER);
        SPROOM_TREE_CONFIG = createBlobTreeConfig(SPROOM_TRUNK_PROVIDER, SPROOM_FOLIAGE_PROVIDER);
        STORTREEAN_TREE_CONFIG = createBlobTreeConfig(STORTREEAN_TRUNK_PROVIDER, STORTREEAN_FOLIAGE_PROVIDER);
        STROOMEAN_TREE_CONFIG = createBlobTreeConfig(STROOMEAN_TRUNK_PROVIDER, STROOMEAN_FOLIAGE_PROVIDER);
        SUNRISE_FUNGUS_TREE_CONFIG = createBlobTreeConfig(SUNRISE_FUNGUS_TRUNK_PROVIDER, SUNRISE_FUNGUS_FOLIAGE_PROVIDER);
        TEAK_TREE_CONFIG = createBlobTreeConfig(TEAK_TRUNK_PROVIDER, TEAK_FOLIAGE_PROVIDER);
        THUNDERCLOUD_PLUM_TREE_CONFIG = createBlobTreeConfig(THUNDERCLOUD_PLUM_TRUNK_PROVIDER, THUNDERCLOUD_PLUM_FOLIAGE_PROVIDER);

        FANCY_ALMOND_TREE_CONFIG = createFancyTreeConfig(ALMOND_TRUNK_PROVIDER, ALMOND_FOLIAGE_PROVIDER);
        FANCY_ANAMEATA_TREE_CONFIG = createFancyTreeConfig(ANAMEATA_TRUNK_PROVIDER, ANAMEATA_FOLIAGE_PROVIDER);
        FANCY_AQUEAN_TREE_CONFIG = createFancyAqueanTreeConfig();
        FANCY_BLACK_BIRCH_TREE_CONFIG = createFancyTreeConfig(BLACK_BIRCH_TRUNK_PROVIDER, BLACK_BIRCH_FOLIAGE_PROVIDER);
        FANCY_CHERRY_TREE_CONFIG = createFancyTreeConfig(CHERRY_TRUNK_PROVIDER, CHERRY_FOLIAGE_PROVIDER);
        FANCY_PIN_CHERRY_TREE_CONFIG = createFancyTreeConfig(PIN_CHERRY_TRUNK_PROVIDER, PIN_CHERRY_FOLIAGE_PROVIDER);
        FANCY_PLUM_TREE_CONFIG = createPlumTreeConfig(8, 4, 3, 7);
        FANCY_TEAK_TREE_CONFIG = createFancyTreeConfig(TEAK_TRUNK_PROVIDER, TEAK_FOLIAGE_PROVIDER);
        FANCY_THUNDERCLOUD_PLUM_TREE_CONFIG = createFancyTreeConfig(THUNDERCLOUD_PLUM_TRUNK_PROVIDER, THUNDERCLOUD_PLUM_FOLIAGE_PROVIDER);

        GREAT_ALMOND_TREE_CONFIG = createGreatTreeConfig(ALMOND_TRUNK_PROVIDER, ALMOND_FOLIAGE_PROVIDER);
        GREAT_ANAMEATA_TREE_CONFIG = createGreatTreeConfig(ANAMEATA_TRUNK_PROVIDER, ANAMEATA_FOLIAGE_PROVIDER);
        GREAT_AQUEAN_TREE_CONFIG = createGreatAqueanTreeConfig();
        GREAT_BLACK_BIRCH_TREE_CONFIG = createGreatTreeConfig(BLACK_BIRCH_TRUNK_PROVIDER, BLACK_BIRCH_FOLIAGE_PROVIDER);
        GREAT_CHERRY_TREE_CONFIG = createGreatTreeConfig(CHERRY_TRUNK_PROVIDER, CHERRY_FOLIAGE_PROVIDER);
        GREAT_PIN_CHERRY_TREE_CONFIG = createGreatTreeConfig(PIN_CHERRY_TRUNK_PROVIDER, PIN_CHERRY_FOLIAGE_PROVIDER);
        GREAT_PLUM_TREE_CONFIG = createPlumTreeConfig(10, 5, 4, 9);
        GREAT_TEAK_TREE_CONFIG = createGreatTreeConfig(TEAK_TRUNK_PROVIDER, TEAK_FOLIAGE_PROVIDER);
        GREAT_THUNDERCLOUD_PLUM_TREE_CONFIG = createGreatTreeConfig(THUNDERCLOUD_PLUM_TRUNK_PROVIDER, THUNDERCLOUD_PLUM_FOLIAGE_PROVIDER);

        FUCHSITRA_TREE_TOWARDS_X_CONFIG = createFuchsitraTreeConfig(Direction.Axis.X);
        FUCHSITRA_TREE_TOWARDS_Z_CONFIG = createFuchsitraTreeConfig(Direction.Axis.Z);
        FANCY_FUCHSITRA_TREE_TOWARDS_X_CONFIG = createFancyFuchsitraTreeConfig(Direction.Axis.X);
        FANCY_FUCHSITRA_TREE_TOWARDS_Z_CONFIG = createFancyFuchsitraTreeConfig(Direction.Axis.Z);
        GREAT_FUCHSITRA_TREE_TOWARDS_X_CONFIG = createGreatFuchsitraTreeConfig(Direction.Axis.X);
        GREAT_FUCHSITRA_TREE_TOWARDS_Z_CONFIG = createGreatFuchsitraTreeConfig(Direction.Axis.Z);

        FUCHSITRA_TREE_CONFIG = createSimpleRandomFeatureConfig(
                () -> FUCHSITRA_TOWARDS_X, () -> FUCHSITRA_TOWARDS_Z
        );
        FANCY_FUCHSITRA_TREE_CONFIG = createSimpleRandomFeatureConfig(
                () -> FANCY_FUCHSITRA_TOWARDS_X, () -> FANCY_FUCHSITRA_TOWARDS_Z
        );
        GREAT_FUCHSITRA_TREE_CONFIG = createSimpleRandomFeatureConfig(
                () -> GREAT_FUCHSITRA_TOWARDS_X, () -> GREAT_FUCHSITRA_TOWARDS_Z
        );

        BLACK_LILY_CONFIG = createTallFlowerConfig(BLACK_LILY_PROVIDER);
        LILAC_CONFIG = createTallFlowerConfig(LILAC_PROVIDER);
        ORANGE_LILY_CONFIG = createTallFlowerConfig(ORANGE_LILY_PROVIDER);
        VELVET_LILY_CONFIG = createTallFlowerConfig(VELVET_LILY_PROVIDER);

        ALMOND_FOREST_FLOWER_CONFIG = createFlowerConfig(ALMOND_FOREST_FLOWER_PROVIDER);
        ALMOND_PLUS_FOREST_FLOWER_CONFIG = createFlowerConfig(ALMOND_PLUS_FOREST_FLOWER_PROVIDER);
        BLACK_BIRCH_FOREST_FLOWER_CONFIG = createFlowerConfig(BLACK_BIRCH_FOREST_FLOWER_PROVIDER);
        CHERRY_CLIFFS_FOREST_FLOWER_CONFIG = createFlowerConfig(CHERRY_CLIFFS_FOREST_FLOWER_PROVIDER);
        CHERRY_FOREST_FLOWER_CONFIG = createFlowerConfig(CHERRY_FOREST_FLOWER_PROVIDER);
        PLUM_FOREST_FLOWER_CONFIG = createFlowerConfig(PLUM_FOREST_FLOWER_PROVIDER);
        THUNDERCLOUD_PLUM_FOREST_FLOWER_CONFIG = createFlowerConfig(THUNDERCLOUD_PLUM_FOREST_FLOWER_PROVIDER);
    }

}