package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.collection.DataPool;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.*;
import static net.minecraft.block.Blocks.FERN;
import static net.minecraft.block.Blocks.GRASS;
import static net.minecraft.state.property.Properties.DOWN;
import static net.minecraft.state.property.Properties.UP;

public class DTBlockStateProviders {

    public static final BlockStateProvider ALMOND_FOLIAGE_PROVIDER;
    public static final BlockStateProvider ANAMEATA_FOLIAGE_PROVIDER;
    public static final BlockStateProvider AQUEAN_FOLIAGE_PROVIDER;
    public static final BlockStateProvider BARSHROOKLE_FOLIAGE_PROVIDER;
    public static final BlockStateProvider BLACK_BIRCH_FOLIAGE_PROVIDER;
    public static final BlockStateProvider CHERRY_FOLIAGE_PROVIDER;
    public static final BlockStateProvider COOK_PINE_FOLIAGE_PROVIDER;
    public static final BlockStateProvider CROLOOD_FOLIAGE_PROVIDER;
    public static final BlockStateProvider DARK_CROLOOD_FOLIAGE_PROVIDER;
    public static final BlockStateProvider EBONY_FOLIAGE_PROVIDER;
    public static final BlockStateProvider FUCHSITRA_FOLIAGE_PROVIDER;
    public static final BlockStateProvider FUNERANITE_FOLIAGE_PROVIDER;
    public static final BlockStateProvider GHOSHROOM_FOLIAGE_PROVIDER;
    public static final BlockStateProvider PELTOGYNE_FOLIAGE_PROVIDER;
    public static final BlockStateProvider PIN_CHERRY_FOLIAGE_PROVIDER;
    public static final BlockStateProvider PLUM_FOLIAGE_PROVIDER;
    public static final BlockStateProvider PURFUNGA_FOLIAGE_PROVIDER;
    public static final BlockStateProvider SPROOM_FOLIAGE_PROVIDER;
    public static final BlockStateProvider STORTREEAN_FOLIAGE_PROVIDER;
    public static final BlockStateProvider STROOMEAN_FOLIAGE_PROVIDER;
    public static final BlockStateProvider SUNRISE_FUNGUS_FOLIAGE_PROVIDER;
    public static final BlockStateProvider TEAK_FOLIAGE_PROVIDER;
    public static final BlockStateProvider THUNDERCLOUD_PLUM_FOLIAGE_PROVIDER;

    public static final BlockStateProvider ALMOND_TRUNK_PROVIDER;
    public static final BlockStateProvider ANAMEATA_TRUNK_PROVIDER;
    public static final BlockStateProvider AQUEAN_TRUNK_PROVIDER;
    public static final BlockStateProvider BARSHROOKLE_TRUNK_PROVIDER;
    public static final BlockStateProvider BLACK_BIRCH_TRUNK_PROVIDER;
    public static final BlockStateProvider CHERRY_TRUNK_PROVIDER;
    public static final BlockStateProvider COOK_PINE_TRUNK_PROVIDER;
    public static final BlockStateProvider CROLOOD_TRUNK_PROVIDER;
    public static final BlockStateProvider DARK_CROLOOD_TRUNK_PROVIDER;
    public static final BlockStateProvider EBONY_TRUNK_PROVIDER;
    public static final BlockStateProvider FUCHSITRA_TRUNK_PROVIDER;
    public static final BlockStateProvider FUNERANITE_TRUNK_PROVIDER;
    public static final BlockStateProvider GHOSHROOM_TRUNK_PROVIDER;
    public static final BlockStateProvider PELTOGYNE_TRUNK_PROVIDER;
    public static final BlockStateProvider PIN_CHERRY_TRUNK_PROVIDER;
    public static final BlockStateProvider PLUM_TRUNK_PROVIDER;
    public static final BlockStateProvider PURFUNGA_TRUNK_PROVIDER;
    public static final BlockStateProvider SPROOM_TRUNK_PROVIDER;
    public static final BlockStateProvider STORTREEAN_TRUNK_PROVIDER;
    public static final BlockStateProvider STROOMEAN_TRUNK_PROVIDER;
    public static final BlockStateProvider SUNRISE_FUNGUS_TRUNK_PROVIDER;
    public static final BlockStateProvider TEAK_TRUNK_PROVIDER;
    public static final BlockStateProvider THUNDERCLOUD_PLUM_TRUNK_PROVIDER;

    public static final BlockStateProvider BLACK_LILY_PROVIDER;
    public static final BlockStateProvider LILAC_PROVIDER;
    public static final BlockStateProvider ORANGE_LILY_PROVIDER;
    public static final BlockStateProvider VELVET_LILY_PROVIDER;

    public static final BlockStateProvider GRAY_SHAG_MUSHROOM_CAP_PROVIDER;
    public static final BlockStateProvider INKY_CAP_MUSHROOM_CAP_PROVIDER;
    public static final BlockStateProvider PUFFBALL_MUSHROOM_CAP_PROVIDER;
    public static final BlockStateProvider SHELF_MUSHROOM_CAP_PROVIDER;
    public static final BlockStateProvider WHITE_MUSHROOM_CAP_PROVIDER;

    public static final BlockStateProvider GRAY_SHAG_MUSHROOM_STEM_PROVIDER;
    public static final BlockStateProvider INKY_CAP_MUSHROOM_STEM_PROVIDER;
    public static final BlockStateProvider PUFFBALL_MUSHROOM_STEM_PROVIDER;
    public static final BlockStateProvider SHELF_MUSHROOM_STEM_PROVIDER;
    public static final BlockStateProvider WHITE_MUSHROOM_STEM_PROVIDER;

    public static final BlockStateProvider PATCH_CLEAR_FOREST_GRASS_PROVIDER;

    public static final BlockStateProvider ALMOND_FOREST_FLOWER_PROVIDER;
    public static final BlockStateProvider ALMOND_PLUS_FOREST_FLOWER_PROVIDER;
    public static final BlockStateProvider BLACK_BIRCH_FOREST_FLOWER_PROVIDER;
    public static final BlockStateProvider CHERRY_CLIFFS_FOREST_FLOWER_PROVIDER;
    public static final BlockStateProvider CHERRY_FOREST_FLOWER_PROVIDER;
    public static final BlockStateProvider PLUM_FOREST_FLOWER_PROVIDER;
    public static final BlockStateProvider THUNDERCLOUD_PLUM_FOREST_FLOWER_PROVIDER;

    protected static WeightedBlockStateProvider weighted(DataPool.Builder<BlockState> builder) {
        return new WeightedBlockStateProvider(builder.build());
    }

    static {
        ALMOND_FOLIAGE_PROVIDER = BlockStateProvider.of(ALMOND_LEAVES);
        ANAMEATA_FOLIAGE_PROVIDER = BlockStateProvider.of(ANAMEATA_CAP);
        AQUEAN_FOLIAGE_PROVIDER = BlockStateProvider.of(AQUEAN_LEAVES);
        BARSHROOKLE_FOLIAGE_PROVIDER = BlockStateProvider.of(BARSHROOKLE_CAP);
        BLACK_BIRCH_FOLIAGE_PROVIDER = BlockStateProvider.of(BLACK_BIRCH_LEAVES);
        CHERRY_FOLIAGE_PROVIDER = BlockStateProvider.of(CHERRY_LEAVES);
        COOK_PINE_FOLIAGE_PROVIDER = BlockStateProvider.of(COOK_PINE_LEAVES);
        CROLOOD_FOLIAGE_PROVIDER = BlockStateProvider.of(CROLOOD_LEAVES);
        DARK_CROLOOD_FOLIAGE_PROVIDER = BlockStateProvider.of(DARK_CROLOOD_LEAVES);
        EBONY_FOLIAGE_PROVIDER = BlockStateProvider.of(EBONY_LEAVES);
        FUCHSITRA_FOLIAGE_PROVIDER = BlockStateProvider.of(FUCHSITRA_LEAVES);
        FUNERANITE_FOLIAGE_PROVIDER = BlockStateProvider.of(FUNERANITE_CAP);
        GHOSHROOM_FOLIAGE_PROVIDER = BlockStateProvider.of(GHOSHROOM_CAP);
        PELTOGYNE_FOLIAGE_PROVIDER = BlockStateProvider.of(PELTOGYNE_LEAVES);
        PIN_CHERRY_FOLIAGE_PROVIDER = BlockStateProvider.of(PIN_CHERRY_LEAVES);
        PLUM_FOLIAGE_PROVIDER = BlockStateProvider.of(PLUM_LEAVES);
        PURFUNGA_FOLIAGE_PROVIDER = BlockStateProvider.of(PURFUNGA_CAP);
        SPROOM_FOLIAGE_PROVIDER = BlockStateProvider.of(SPROOM_LEAVES);
        STORTREEAN_FOLIAGE_PROVIDER = BlockStateProvider.of(STORTREEAN_LEAVES);
        STROOMEAN_FOLIAGE_PROVIDER = BlockStateProvider.of(STROOMEAN_CAP);
        SUNRISE_FUNGUS_FOLIAGE_PROVIDER = BlockStateProvider.of(SUNRISE_FUNGUS_CAP);
        TEAK_FOLIAGE_PROVIDER = BlockStateProvider.of(TEAK_LEAVES);
        THUNDERCLOUD_PLUM_FOLIAGE_PROVIDER = BlockStateProvider.of(THUNDERCLOUD_PLUM_LEAVES);

        ALMOND_TRUNK_PROVIDER = BlockStateProvider.of(ALMOND_LOG);
        ANAMEATA_TRUNK_PROVIDER = BlockStateProvider.of(ANAMEATA_LOG);
        AQUEAN_TRUNK_PROVIDER = BlockStateProvider.of(AQUEAN_LOG);
        BARSHROOKLE_TRUNK_PROVIDER = BlockStateProvider.of(BARSHROOKLE_LOG);
        BLACK_BIRCH_TRUNK_PROVIDER = BlockStateProvider.of(BLACK_BIRCH_LOG);
        CHERRY_TRUNK_PROVIDER = BlockStateProvider.of(CHERRY_LOG);
        COOK_PINE_TRUNK_PROVIDER = BlockStateProvider.of(COOK_PINE_LOG);
        CROLOOD_TRUNK_PROVIDER = BlockStateProvider.of(CROLOOD_LOG);
        DARK_CROLOOD_TRUNK_PROVIDER = BlockStateProvider.of(DARK_CROLOOD_LOG);
        EBONY_TRUNK_PROVIDER = BlockStateProvider.of(EBONY_LOG);
        FUCHSITRA_TRUNK_PROVIDER = BlockStateProvider.of(FUCHSITRA_LOG);
        FUNERANITE_TRUNK_PROVIDER = BlockStateProvider.of(FUNERANITE_LOG);
        GHOSHROOM_TRUNK_PROVIDER = BlockStateProvider.of(GHOSHROOM_LOG);
        PELTOGYNE_TRUNK_PROVIDER = BlockStateProvider.of(PELTOGYNE_LOG);
        PIN_CHERRY_TRUNK_PROVIDER = BlockStateProvider.of(PIN_CHERRY_LOG);
        PLUM_TRUNK_PROVIDER = BlockStateProvider.of(PLUM_LOG);
        PURFUNGA_TRUNK_PROVIDER = BlockStateProvider.of(PURFUNGA_LOG);
        SPROOM_TRUNK_PROVIDER = BlockStateProvider.of(SPROOM_LOG);
        STORTREEAN_TRUNK_PROVIDER = BlockStateProvider.of(STORTREEAN_LOG);
        STROOMEAN_TRUNK_PROVIDER = BlockStateProvider.of(STROOMEAN_LOG);
        SUNRISE_FUNGUS_TRUNK_PROVIDER = BlockStateProvider.of(SUNRISE_FUNGUS_LOG);
        TEAK_TRUNK_PROVIDER = BlockStateProvider.of(TEAK_LOG);
        THUNDERCLOUD_PLUM_TRUNK_PROVIDER = BlockStateProvider.of(THUNDERCLOUD_PLUM_LOG);

        ALMOND_FOREST_FLOWER_PROVIDER = weighted(DataPool.<BlockState>builder()
                .add(BLUE_VIOLET.getDefaultState(), 1)
                .add(CYAN_BLUE_VIOLET.getDefaultState(), 1)
                .add(WILD_PANSY.getDefaultState(), 1)
        );

        ALMOND_PLUS_FOREST_FLOWER_PROVIDER = weighted(DataPool.<BlockState>builder()
                .add(BLUE_VIOLET.getDefaultState(), 1)
                .add(CYAN_BLUE_VIOLET.getDefaultState(), 1)
                .add(WILD_PANSY.getDefaultState(), 1)
                .add(WHITE_VIOLET.getDefaultState(), 1)
                .add(MARSH_VIOLET.getDefaultState(), 1)
                .add(PINK_MARSH_VIOLET.getDefaultState(), 1)
                .add(RUBRA_BLUE_VIOLET.getDefaultState(), 1)
                .add(NATIVE_VIOLET.getDefaultState(), 1)
        );

        BLACK_BIRCH_FOREST_FLOWER_PROVIDER = weighted(DataPool.<BlockState>builder()
                .add(GREEN_PANSY.getDefaultState(), 1)
                .add(BLACK_PANSY.getDefaultState(), 1)
                .add(BLUE_PANSY.getDefaultState(), 1)
                .add(PINK_ROSE.getDefaultState(), 1)
                .add(PINK_ROSE_BUSH.getDefaultState(), 1)
        );

        CHERRY_CLIFFS_FOREST_FLOWER_PROVIDER = weighted(DataPool.<BlockState>builder()
                .add(GREEN_PANSY.getDefaultState(), 1)
        );

        CHERRY_FOREST_FLOWER_PROVIDER = weighted(DataPool.<BlockState>builder()
                .add(GREEN_PANSY.getDefaultState(), 1)
        );

        PLUM_FOREST_FLOWER_PROVIDER = weighted(DataPool.<BlockState>builder()
                .add(YELLOW_VIOLET.getDefaultState(), 1)
                .add(BROWN_PANSY.getDefaultState(), 1)
        );

        THUNDERCLOUD_PLUM_FOREST_FLOWER_PROVIDER = weighted(DataPool.<BlockState>builder()
                .add(GREEN_PANSY.getDefaultState(), 1)
        );

        BLACK_LILY_PROVIDER = BlockStateProvider.of(BLACK_LILY);
        LILAC_PROVIDER = BlockStateProvider.of(Blocks.LILAC);
        ORANGE_LILY_PROVIDER = BlockStateProvider.of(ORANGE_LILY);
        VELVET_LILY_PROVIDER = BlockStateProvider.of(VELVET_LILY);

        GRAY_SHAG_MUSHROOM_CAP_PROVIDER = BlockStateProvider.of(GRAY_SHAG_MUSHROOM_BLOCK.getDefaultState().with(UP, true).with(DOWN, false));
        INKY_CAP_MUSHROOM_CAP_PROVIDER = BlockStateProvider.of(INKY_CAP_MUSHROOM_BLOCK.getDefaultState().with(UP, true).with(DOWN, false));
        PUFFBALL_MUSHROOM_CAP_PROVIDER = BlockStateProvider.of(PUFFBALL_MUSHROOM_BLOCK.getDefaultState().with(UP, true).with(DOWN, false));
        SHELF_MUSHROOM_CAP_PROVIDER = BlockStateProvider.of(SHELF_MUSHROOM_BLOCK.getDefaultState().with(UP, true).with(DOWN, false));
        WHITE_MUSHROOM_CAP_PROVIDER = BlockStateProvider.of(WHITE_MUSHROOM_BLOCK.getDefaultState().with(UP, true).with(DOWN, false));

        GRAY_SHAG_MUSHROOM_STEM_PROVIDER = BlockStateProvider.of(GRAY_SHAG_MUSHROOM_STEM.getDefaultState().with(UP, false).with(DOWN, false));
        INKY_CAP_MUSHROOM_STEM_PROVIDER = BlockStateProvider.of(INKY_CAP_MUSHROOM_STEM.getDefaultState().with(UP, false).with(DOWN, false));
        PUFFBALL_MUSHROOM_STEM_PROVIDER = BlockStateProvider.of(PUFFBALL_MUSHROOM_STEM.getDefaultState().with(UP, false).with(DOWN, false));
        SHELF_MUSHROOM_STEM_PROVIDER = BlockStateProvider.of(SHELF_MUSHROOM_STEM.getDefaultState().with(UP, false).with(DOWN, false));
        WHITE_MUSHROOM_STEM_PROVIDER = BlockStateProvider.of(WHITE_MUSHROOM_STEM.getDefaultState().with(UP, false).with(DOWN, false));

        PATCH_CLEAR_FOREST_GRASS_PROVIDER = weighted(DataPool.<BlockState>builder()
                .add(GRASS.getDefaultState(), 1)
                .add(FERN.getDefaultState(), 4)
        );

    }

}