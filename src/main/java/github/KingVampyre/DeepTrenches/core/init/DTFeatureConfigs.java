package github.KingVampyre.DeepTrenches.core.init;

import com.google.common.collect.ImmutableList;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.GreatTrunkPlacer;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.placer.BlockPlacer;
import net.minecraft.world.gen.placer.DoublePlantPlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.OptionalInt;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockStateProviders.*;
import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.*;

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
    public static final TreeFeatureConfig FUCHSITRA_TREE_CONFIG;
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
    public static final TreeFeatureConfig FANCY_FUCHSITRA_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_PIN_CHERRY_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_PLUM_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_TEAK_TREE_CONFIG;
    public static final TreeFeatureConfig FANCY_THUNDERCLOUD_PLUM_TREE_CONFIG;

    public static final TreeFeatureConfig GREAT_ALMOND_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_ANAMEATA_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_AQUEAN_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_BLACK_BIRCH_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_CHERRY_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_FUCHSITRA_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_PIN_CHERRY_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_PLUM_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_TEAK_TREE_CONFIG;
    public static final TreeFeatureConfig GREAT_THUNDERCLOUD_PLUM_TREE_CONFIG;

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

    protected static TreeFeatureConfig createBlobTreeConfig(BlockStateProvider trunk, BlockStateProvider foliage) {
        return new TreeFeatureConfig.Builder(trunk, new StraightTrunkPlacer(4, 3, 0), foliage, new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build();
    }

    protected static TreeFeatureConfig createFancyTreeConfig(BlockStateProvider trunk, BlockStateProvider foliage) {
        return new TreeFeatureConfig.Builder(trunk, new LargeOakTrunkPlacer(5, 11, 0), foliage, new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build();
    }

    protected static TreeFeatureConfig createGreatTreeConfig(BlockStateProvider trunk, BlockStateProvider foliage) {
        return new TreeFeatureConfig.Builder(trunk, new GreatTrunkPlacer(12, 7, 0), foliage, new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build();
    }

    static {
        ALMOND_TREE_CONFIG = createBlobTreeConfig(ALMOND_TRUNK_PROVIDER, ALMOND_FOLIAGE_PROVIDER);
        ANAMEATA_TREE_CONFIG = createBlobTreeConfig(ANAMEATA_TRUNK_PROVIDER, ANAMEATA_FOLIAGE_PROVIDER);
        AQUEAN_TREE_CONFIG = createBlobTreeConfig(AQUEAN_TRUNK_PROVIDER, AQUEAN_FOLIAGE_PROVIDER);
        BARSHROOKLE_TREE_CONFIG = createBlobTreeConfig(BARSHROOKLE_TRUNK_PROVIDER, BARSHROOKLE_FOLIAGE_PROVIDER);
        BLACK_BIRCH_TREE_CONFIG = createBlobTreeConfig(BLACK_BIRCH_TRUNK_PROVIDER, BLACK_BIRCH_FOLIAGE_PROVIDER);
        CHERRY_TREE_CONFIG = createBlobTreeConfig(CHERRY_TRUNK_PROVIDER, CHERRY_FOLIAGE_PROVIDER);
        COOK_PINE_TREE_CONFIG = createBlobTreeConfig(COOK_PINE_TRUNK_PROVIDER, COOK_PINE_FOLIAGE_PROVIDER);
        CROLOOD_TREE_CONFIG = createBlobTreeConfig(CROLOOD_TRUNK_PROVIDER, CROLOOD_FOLIAGE_PROVIDER);
        DARK_CROLOOD_TREE_CONFIG = createBlobTreeConfig(DARK_CROLOOD_TRUNK_PROVIDER, DARK_CROLOOD_FOLIAGE_PROVIDER);
        EBONY_TREE_CONFIG = createBlobTreeConfig(EBONY_TRUNK_PROVIDER, EBONY_FOLIAGE_PROVIDER);
        FUCHSITRA_TREE_CONFIG = createBlobTreeConfig(FUCHSITRA_TRUNK_PROVIDER, FUCHSITRA_FOLIAGE_PROVIDER);
        FUNERANITE_TREE_CONFIG = createBlobTreeConfig(FUNERANITE_TRUNK_PROVIDER, FUNERANITE_FOLIAGE_PROVIDER);
        GHOSHROOM_TREE_CONFIG = createBlobTreeConfig(GHOSHROOM_TRUNK_PROVIDER, GHOSHROOM_FOLIAGE_PROVIDER);
        PELTOGYNE_TREE_CONFIG = createBlobTreeConfig(PELTOGYNE_TRUNK_PROVIDER, PELTOGYNE_FOLIAGE_PROVIDER);
        PIN_CHERRY_TREE_CONFIG = createBlobTreeConfig(PIN_CHERRY_TRUNK_PROVIDER, PIN_CHERRY_FOLIAGE_PROVIDER);
        PLUM_TREE_CONFIG = createBlobTreeConfig(PLUM_TRUNK_PROVIDER, PLUM_FOLIAGE_PROVIDER);
        PURFUNGA_TREE_CONFIG = createBlobTreeConfig(PURFUNGA_TRUNK_PROVIDER, PURFUNGA_FOLIAGE_PROVIDER);
        SPROOM_TREE_CONFIG = createBlobTreeConfig(SPROOM_TRUNK_PROVIDER, SPROOM_FOLIAGE_PROVIDER);
        STORTREEAN_TREE_CONFIG = createBlobTreeConfig(STORTREEAN_TRUNK_PROVIDER, STORTREEAN_FOLIAGE_PROVIDER);
        STROOMEAN_TREE_CONFIG = createBlobTreeConfig(STROOMEAN_TRUNK_PROVIDER, STROOMEAN_FOLIAGE_PROVIDER);
        SUNRISE_FUNGUS_TREE_CONFIG = createBlobTreeConfig(SUNRISE_FUNGUS_TRUNK_PROVIDER, SUNRISE_FUNGUS_FOLIAGE_PROVIDER);
        TEAK_TREE_CONFIG = createBlobTreeConfig(TEAK_TRUNK_PROVIDER, TEAK_FOLIAGE_PROVIDER);
        THUNDERCLOUD_PLUM_TREE_CONFIG = createBlobTreeConfig(THUNDERCLOUD_PLUM_TRUNK_PROVIDER, THUNDERCLOUD_PLUM_FOLIAGE_PROVIDER);

        FANCY_ALMOND_TREE_CONFIG = createFancyTreeConfig(ALMOND_TRUNK_PROVIDER, ALMOND_FOLIAGE_PROVIDER);
        FANCY_ANAMEATA_TREE_CONFIG = createFancyTreeConfig(ANAMEATA_TRUNK_PROVIDER, ANAMEATA_FOLIAGE_PROVIDER);
        FANCY_AQUEAN_TREE_CONFIG = createFancyTreeConfig(AQUEAN_TRUNK_PROVIDER, AQUEAN_FOLIAGE_PROVIDER);
        FANCY_BLACK_BIRCH_TREE_CONFIG = createFancyTreeConfig(BLACK_BIRCH_TRUNK_PROVIDER, BLACK_BIRCH_FOLIAGE_PROVIDER);
        FANCY_CHERRY_TREE_CONFIG = createFancyTreeConfig(CHERRY_TRUNK_PROVIDER, CHERRY_FOLIAGE_PROVIDER);
        FANCY_FUCHSITRA_TREE_CONFIG = createFancyTreeConfig(FUCHSITRA_TRUNK_PROVIDER, FUCHSITRA_FOLIAGE_PROVIDER);
        FANCY_PIN_CHERRY_TREE_CONFIG = createFancyTreeConfig(PIN_CHERRY_TRUNK_PROVIDER, PIN_CHERRY_FOLIAGE_PROVIDER);
        FANCY_PLUM_TREE_CONFIG = createFancyTreeConfig(PLUM_TRUNK_PROVIDER, PLUM_FOLIAGE_PROVIDER);
        FANCY_TEAK_TREE_CONFIG = createFancyTreeConfig(TEAK_TRUNK_PROVIDER, TEAK_FOLIAGE_PROVIDER);
        FANCY_THUNDERCLOUD_PLUM_TREE_CONFIG = createFancyTreeConfig(THUNDERCLOUD_PLUM_TRUNK_PROVIDER, THUNDERCLOUD_PLUM_FOLIAGE_PROVIDER);

        GREAT_ALMOND_TREE_CONFIG = createGreatTreeConfig(ALMOND_TRUNK_PROVIDER, ALMOND_FOLIAGE_PROVIDER);
        GREAT_ANAMEATA_TREE_CONFIG = createGreatTreeConfig(ANAMEATA_TRUNK_PROVIDER, ANAMEATA_FOLIAGE_PROVIDER);
        GREAT_AQUEAN_TREE_CONFIG = createGreatTreeConfig(AQUEAN_TRUNK_PROVIDER, AQUEAN_FOLIAGE_PROVIDER);
        GREAT_BLACK_BIRCH_TREE_CONFIG = createGreatTreeConfig(BLACK_BIRCH_TRUNK_PROVIDER, BLACK_BIRCH_FOLIAGE_PROVIDER);
        GREAT_CHERRY_TREE_CONFIG = createGreatTreeConfig(CHERRY_TRUNK_PROVIDER, CHERRY_FOLIAGE_PROVIDER);
        GREAT_FUCHSITRA_TREE_CONFIG = createGreatTreeConfig(FUCHSITRA_TRUNK_PROVIDER, FUCHSITRA_FOLIAGE_PROVIDER);
        GREAT_PIN_CHERRY_TREE_CONFIG = createGreatTreeConfig(PIN_CHERRY_TRUNK_PROVIDER, PIN_CHERRY_FOLIAGE_PROVIDER);
        GREAT_PLUM_TREE_CONFIG = createGreatTreeConfig(PLUM_TRUNK_PROVIDER, PLUM_FOLIAGE_PROVIDER);
        GREAT_TEAK_TREE_CONFIG = createGreatTreeConfig(TEAK_TRUNK_PROVIDER, TEAK_FOLIAGE_PROVIDER);
        GREAT_THUNDERCLOUD_PLUM_TREE_CONFIG = createGreatTreeConfig(THUNDERCLOUD_PLUM_TRUNK_PROVIDER, THUNDERCLOUD_PLUM_FOLIAGE_PROVIDER);

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

    }

}