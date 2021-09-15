package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.collection.DataPool;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.*;

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

    public static final BlockStateProvider ALMOND_SAPLING_PROVIDER;
    public static final BlockStateProvider ANAMEATA_SAPLING_PROVIDER;
    public static final BlockStateProvider AQUEAN_SAPLING_PROVIDER;
    public static final BlockStateProvider BARSHROOKLE_SAPLING_PROVIDER;
    public static final BlockStateProvider BLACK_BIRCH_SAPLING_PROVIDER;
    public static final BlockStateProvider CHERRY_SAPLING_PROVIDER;
    public static final BlockStateProvider COOK_PINE_SAPLING_PROVIDER;
    public static final BlockStateProvider CROLOOD_SAPLING_PROVIDER;
    public static final BlockStateProvider DARK_CROLOOD_SAPLING_PROVIDER;
    public static final BlockStateProvider EBONY_SAPLING_PROVIDER;
    public static final BlockStateProvider FUCHSITRA_SAPLING_PROVIDER;
    public static final BlockStateProvider FUNERANITE_SAPLING_PROVIDER;
    public static final BlockStateProvider GHOSHROOM_SAPLING_PROVIDER;
    public static final BlockStateProvider PELTOGYNE_SAPLING_PROVIDER;
    public static final BlockStateProvider PIN_CHERRY_SAPLING_PROVIDER;
    public static final BlockStateProvider PLUM_SAPLING_PROVIDER;
    public static final BlockStateProvider PURFUNGA_SAPLING_PROVIDER;
    public static final BlockStateProvider SPROOM_SAPLING_PROVIDER;
    public static final BlockStateProvider STORTREEAN_SAPLING_PROVIDER;
    public static final BlockStateProvider STROOMEAN_SAPLING_PROVIDER;
    public static final BlockStateProvider SUNRISE_FUNGUS_SAPLING_PROVIDER;
    public static final BlockStateProvider TEAK_SAPLING_PROVIDER;
    public static final BlockStateProvider THUNDERCLOUD_PLUM_SAPLING_PROVIDER;

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

    public static final BlockStateProvider ALMOND_FOREST_FLOWER_PROVIDER;
    public static final BlockStateProvider ALMOND_PLUS_FOREST_FLOWER_PROVIDER;

    public static final BlockStateProvider LILAC_PROVIDER;

    protected static BlockStateProvider simple(Block block) {
        return new SimpleBlockStateProvider(block.getDefaultState());
    }

    static {
        ALMOND_FOLIAGE_PROVIDER = simple(ALMOND_LEAVES);
        ANAMEATA_FOLIAGE_PROVIDER = simple(ANAMEATA_CAP);
        AQUEAN_FOLIAGE_PROVIDER = simple(AQUEAN_LEAVES);
        BARSHROOKLE_FOLIAGE_PROVIDER = simple(BARSHROOKLE_CAP);
        BLACK_BIRCH_FOLIAGE_PROVIDER = simple(BLACK_BIRCH_LEAVES);
        CHERRY_FOLIAGE_PROVIDER = simple(CHERRY_LEAVES);
        COOK_PINE_FOLIAGE_PROVIDER = simple(COOK_PINE_LEAVES);
        CROLOOD_FOLIAGE_PROVIDER = simple(CROLOOD_LEAVES);
        DARK_CROLOOD_FOLIAGE_PROVIDER = simple(DARK_CROLOOD_LEAVES);
        EBONY_FOLIAGE_PROVIDER = simple(EBONY_LEAVES);
        FUCHSITRA_FOLIAGE_PROVIDER = simple(FUCHSITRA_LEAVES);
        FUNERANITE_FOLIAGE_PROVIDER = simple(FUNERANITE_CAP);
        GHOSHROOM_FOLIAGE_PROVIDER = simple(GHOSHROOM_CAP);
        PELTOGYNE_FOLIAGE_PROVIDER = simple(PELTOGYNE_LEAVES);
        PIN_CHERRY_FOLIAGE_PROVIDER = simple(PIN_CHERRY_LEAVES);
        PLUM_FOLIAGE_PROVIDER = simple(PLUM_LEAVES);
        PURFUNGA_FOLIAGE_PROVIDER = simple(PURFUNGA_CAP);
        SPROOM_FOLIAGE_PROVIDER = simple(SPROOM_LEAVES);
        STORTREEAN_FOLIAGE_PROVIDER = simple(STORTREEAN_LEAVES);
        STROOMEAN_FOLIAGE_PROVIDER = simple(STROOMEAN_CAP);
        SUNRISE_FUNGUS_FOLIAGE_PROVIDER = simple(SUNRISE_FUNGUS_CAP);
        TEAK_FOLIAGE_PROVIDER = simple(TEAK_LEAVES);
        THUNDERCLOUD_PLUM_FOLIAGE_PROVIDER = simple(THUNDERCLOUD_PLUM_LEAVES);

        ALMOND_SAPLING_PROVIDER = simple(ALMOND_SAPLING);
        ANAMEATA_SAPLING_PROVIDER = simple(ANAMEATA_SAPLING);
        AQUEAN_SAPLING_PROVIDER = simple(AQUEAN_SAPLING);
        BARSHROOKLE_SAPLING_PROVIDER = simple(BARSHROOKLE_SAPLING);
        BLACK_BIRCH_SAPLING_PROVIDER = simple(BLACK_BIRCH_SAPLING);
        CHERRY_SAPLING_PROVIDER = simple(CHERRY_SAPLING);
        COOK_PINE_SAPLING_PROVIDER = simple(COOK_PINE_SAPLING);
        CROLOOD_SAPLING_PROVIDER = simple(CROLOOD_SAPLING);
        DARK_CROLOOD_SAPLING_PROVIDER = simple(DARK_CROLOOD_SAPLING);
        EBONY_SAPLING_PROVIDER = simple(EBONY_SAPLING);
        FUCHSITRA_SAPLING_PROVIDER = simple(FUCHSITRA_SAPLING);
        FUNERANITE_SAPLING_PROVIDER = simple(FUNERANITE_SAPLING);
        GHOSHROOM_SAPLING_PROVIDER = simple(GHOSHROOM_SAPLING);
        PELTOGYNE_SAPLING_PROVIDER = simple(PELTOGYNE_SAPLING);
        PIN_CHERRY_SAPLING_PROVIDER = simple(PIN_CHERRY_SAPLING);
        PLUM_SAPLING_PROVIDER = simple(PLUM_SAPLING);
        PURFUNGA_SAPLING_PROVIDER = simple(PURFUNGA_SAPLING);
        SPROOM_SAPLING_PROVIDER = simple(SPROOM_SAPLING);
        STORTREEAN_SAPLING_PROVIDER = simple(STORTREEAN_SAPLING);
        STROOMEAN_SAPLING_PROVIDER = simple(STROOMEAN_SAPLING);
        SUNRISE_FUNGUS_SAPLING_PROVIDER = simple(SUNRISE_FUNGUS_SAPLING);
        TEAK_SAPLING_PROVIDER = simple(TEAK_SAPLING);
        THUNDERCLOUD_PLUM_SAPLING_PROVIDER = simple(THUNDERCLOUD_PLUM_SAPLING);

        ALMOND_TRUNK_PROVIDER = simple(ALMOND_LOG);
        ANAMEATA_TRUNK_PROVIDER = simple(ANAMEATA_LOG);
        AQUEAN_TRUNK_PROVIDER = simple(AQUEAN_LOG);
        BARSHROOKLE_TRUNK_PROVIDER = simple(BARSHROOKLE_LOG);
        BLACK_BIRCH_TRUNK_PROVIDER = simple(BLACK_BIRCH_LOG);
        CHERRY_TRUNK_PROVIDER = simple(CHERRY_LOG);
        COOK_PINE_TRUNK_PROVIDER = simple(COOK_PINE_LOG);
        CROLOOD_TRUNK_PROVIDER = simple(CROLOOD_LOG);
        DARK_CROLOOD_TRUNK_PROVIDER = simple(DARK_CROLOOD_LOG);
        EBONY_TRUNK_PROVIDER = simple(EBONY_LOG);
        FUCHSITRA_TRUNK_PROVIDER = simple(FUCHSITRA_LOG);
        FUNERANITE_TRUNK_PROVIDER = simple(FUNERANITE_LOG);
        GHOSHROOM_TRUNK_PROVIDER = simple(GHOSHROOM_LOG);
        PELTOGYNE_TRUNK_PROVIDER = simple(PELTOGYNE_LOG);
        PIN_CHERRY_TRUNK_PROVIDER = simple(PIN_CHERRY_LOG);
        PLUM_TRUNK_PROVIDER = simple(PLUM_LOG);
        PURFUNGA_TRUNK_PROVIDER = simple(PURFUNGA_LOG);
        SPROOM_TRUNK_PROVIDER = simple(SPROOM_LOG);
        STORTREEAN_TRUNK_PROVIDER = simple(STORTREEAN_LOG);
        STROOMEAN_TRUNK_PROVIDER = simple(STROOMEAN_LOG);
        SUNRISE_FUNGUS_TRUNK_PROVIDER = simple(SUNRISE_FUNGUS_LOG);
        TEAK_TRUNK_PROVIDER = simple(TEAK_LOG);
        THUNDERCLOUD_PLUM_TRUNK_PROVIDER = simple(THUNDERCLOUD_PLUM_LOG);

        ALMOND_FOREST_FLOWER_PROVIDER = new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                .add(BLUE_VIOLET.getDefaultState(), 1)
                .add(CYAN_BLUE_VIOLET.getDefaultState(), 1)
                .add(WILD_PANSY.getDefaultState(), 1)
        );

        ALMOND_PLUS_FOREST_FLOWER_PROVIDER = new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                .add(BLUE_VIOLET.getDefaultState(), 1)
                .add(CYAN_BLUE_VIOLET.getDefaultState(), 1)
                .add(WILD_PANSY.getDefaultState(), 1)
                .add(WHITE_VIOLET.getDefaultState(), 1)
                .add(MARSH_VIOLET.getDefaultState(), 1)
                .add(PINK_MARSH_VIOLET.getDefaultState(), 1)
                .add(RUBRA_BLUE_VIOLET.getDefaultState(), 1)
                .add(NATIVE_VIOLET.getDefaultState(), 1)
        );

        LILAC_PROVIDER = simple(Blocks.LILAC);
    }

}