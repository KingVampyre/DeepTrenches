package github.KingVampyre.DeepTrenches.core.init.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.*;
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

    protected static NoiseBlockStateProvider noise(Block ...blocks) {
        var list = Stream.of(blocks).map(Block::getDefaultState).collect(Collectors.toList());

        return new NoiseBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0D), 0.020833334F, list);
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

        ALMOND_FOREST_FLOWER_PROVIDER = noise(BLUE_VIOLET, CYAN_BLUE_VIOLET, WILD_PANSY);

        ALMOND_PLUS_FOREST_FLOWER_PROVIDER = noise(
                BLUE_VIOLET,
                CYAN_BLUE_VIOLET,
                WILD_PANSY,
                WHITE_VIOLET,
                MARSH_VIOLET,
                PINK_MARSH_VIOLET,
                RUBRA_BLUE_VIOLET,
                NATIVE_VIOLET);

        BLACK_BIRCH_FOREST_FLOWER_PROVIDER = noise(
                GREEN_PANSY,
                BLACK_PANSY,
                BLUE_PANSY,
                PINK_ROSE,
                PINK_ROSE_BUSH
        );

        CHERRY_CLIFFS_FOREST_FLOWER_PROVIDER = noise(GREEN_PANSY);
        CHERRY_FOREST_FLOWER_PROVIDER = noise(GREEN_PANSY);
        PLUM_FOREST_FLOWER_PROVIDER = noise(YELLOW_VIOLET, BROWN_PANSY);
        THUNDERCLOUD_PLUM_FOREST_FLOWER_PROVIDER = noise(GREEN_PANSY);

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

        PATCH_CLEAR_FOREST_GRASS_PROVIDER = noise(GRASS, FERN);
    }

}