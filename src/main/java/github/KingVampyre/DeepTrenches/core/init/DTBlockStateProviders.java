package github.KingVampyre.DeepTrenches.core.init;

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

    public static final BlockStateProvider ALMOND_FOREST_FLOWER_PROVIDER;
    public static final BlockStateProvider ALMOND_PLUS_FOREST_FLOWER_PROVIDER;

    public static final BlockStateProvider LILAC_PROVIDER;

    static {
        ALMOND_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(ALMOND_LEAVES.getDefaultState());
        ANAMEATA_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(ANAMEATA_CAP.getDefaultState());
        AQUEAN_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(AQUEAN_LEAVES.getDefaultState());
        BARSHROOKLE_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(BARSHROOKLE_CAP.getDefaultState());
        BLACK_BIRCH_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(BLACK_BIRCH_LEAVES.getDefaultState());
        CHERRY_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(CHERRY_LEAVES.getDefaultState());
        COOK_PINE_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(COOK_PINE_LEAVES.getDefaultState());
        CROLOOD_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(CROLOOD_LEAVES.getDefaultState());
        DARK_CROLOOD_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(DARK_CROLOOD_LEAVES.getDefaultState());
        EBONY_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(EBONY_LEAVES.getDefaultState());
        FUCHSITRA_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(FUCHSITRA_LEAVES.getDefaultState());
        FUNERANITE_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(FUNERANITE_CAP.getDefaultState());
        GHOSHROOM_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(GHOSHROOM_CAP.getDefaultState());
        PELTOGYNE_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(PELTOGYNE_LEAVES.getDefaultState());
        PIN_CHERRY_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(PIN_CHERRY_LEAVES.getDefaultState());
        PLUM_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(PLUM_LEAVES.getDefaultState());
        PURFUNGA_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(PURFUNGA_CAP.getDefaultState());
        SPROOM_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(SPROOM_LEAVES.getDefaultState());
        STORTREEAN_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(STORTREEAN_LEAVES.getDefaultState());
        STROOMEAN_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(STROOMEAN_CAP.getDefaultState());
        SUNRISE_FUNGUS_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(SUNRISE_FUNGUS_CAP.getDefaultState());
        TEAK_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(TEAK_LEAVES.getDefaultState());

        ALMOND_SAPLING_PROVIDER = new SimpleBlockStateProvider(ALMOND_SAPLING.getDefaultState());
        ANAMEATA_SAPLING_PROVIDER = new SimpleBlockStateProvider(ANAMEATA_SAPLING.getDefaultState());
        AQUEAN_SAPLING_PROVIDER = new SimpleBlockStateProvider(AQUEAN_SAPLING.getDefaultState());
        BARSHROOKLE_SAPLING_PROVIDER = new SimpleBlockStateProvider(BARSHROOKLE_SAPLING.getDefaultState());
        BLACK_BIRCH_SAPLING_PROVIDER = new SimpleBlockStateProvider(BLACK_BIRCH_SAPLING.getDefaultState());
        CHERRY_SAPLING_PROVIDER = new SimpleBlockStateProvider(CHERRY_SAPLING.getDefaultState());
        COOK_PINE_SAPLING_PROVIDER = new SimpleBlockStateProvider(COOK_PINE_SAPLING.getDefaultState());
        CROLOOD_SAPLING_PROVIDER = new SimpleBlockStateProvider(CROLOOD_SAPLING.getDefaultState());
        DARK_CROLOOD_SAPLING_PROVIDER = new SimpleBlockStateProvider(DARK_CROLOOD_SAPLING.getDefaultState());
        EBONY_SAPLING_PROVIDER = new SimpleBlockStateProvider(EBONY_SAPLING.getDefaultState());
        FUCHSITRA_SAPLING_PROVIDER = new SimpleBlockStateProvider(FUCHSITRA_SAPLING.getDefaultState());
        FUNERANITE_SAPLING_PROVIDER = new SimpleBlockStateProvider(FUNERANITE_SAPLING.getDefaultState());
        GHOSHROOM_SAPLING_PROVIDER = new SimpleBlockStateProvider(GHOSHROOM_SAPLING.getDefaultState());
        PELTOGYNE_SAPLING_PROVIDER = new SimpleBlockStateProvider(PELTOGYNE_SAPLING.getDefaultState());
        PIN_CHERRY_SAPLING_PROVIDER = new SimpleBlockStateProvider(PIN_CHERRY_SAPLING.getDefaultState());
        PLUM_SAPLING_PROVIDER = new SimpleBlockStateProvider(PLUM_SAPLING.getDefaultState());
        PURFUNGA_SAPLING_PROVIDER = new SimpleBlockStateProvider(PURFUNGA_SAPLING.getDefaultState());
        SPROOM_SAPLING_PROVIDER = new SimpleBlockStateProvider(SPROOM_SAPLING.getDefaultState());
        STORTREEAN_SAPLING_PROVIDER = new SimpleBlockStateProvider(STORTREEAN_SAPLING.getDefaultState());
        STROOMEAN_SAPLING_PROVIDER = new SimpleBlockStateProvider(STROOMEAN_SAPLING.getDefaultState());
        SUNRISE_FUNGUS_SAPLING_PROVIDER = new SimpleBlockStateProvider(SUNRISE_FUNGUS_SAPLING.getDefaultState());
        TEAK_SAPLING_PROVIDER = new SimpleBlockStateProvider(TEAK_SAPLING.getDefaultState());

        ALMOND_TRUNK_PROVIDER = new SimpleBlockStateProvider(ALMOND_LOG.getDefaultState());
        ANAMEATA_TRUNK_PROVIDER = new SimpleBlockStateProvider(ANAMEATA_LOG.getDefaultState());
        AQUEAN_TRUNK_PROVIDER = new SimpleBlockStateProvider(AQUEAN_LOG.getDefaultState());
        BARSHROOKLE_TRUNK_PROVIDER = new SimpleBlockStateProvider(BARSHROOKLE_LOG.getDefaultState());
        BLACK_BIRCH_TRUNK_PROVIDER = new SimpleBlockStateProvider(BLACK_BIRCH_LOG.getDefaultState());
        CHERRY_TRUNK_PROVIDER = new SimpleBlockStateProvider(CHERRY_LOG.getDefaultState());
        COOK_PINE_TRUNK_PROVIDER = new SimpleBlockStateProvider(COOK_PINE_LOG.getDefaultState());
        CROLOOD_TRUNK_PROVIDER = new SimpleBlockStateProvider(CROLOOD_LOG.getDefaultState());
        DARK_CROLOOD_TRUNK_PROVIDER = new SimpleBlockStateProvider(DARK_CROLOOD_LOG.getDefaultState());
        EBONY_TRUNK_PROVIDER = new SimpleBlockStateProvider(EBONY_LOG.getDefaultState());
        FUCHSITRA_TRUNK_PROVIDER = new SimpleBlockStateProvider(FUCHSITRA_LOG.getDefaultState());
        FUNERANITE_TRUNK_PROVIDER = new SimpleBlockStateProvider(FUNERANITE_LOG.getDefaultState());
        GHOSHROOM_TRUNK_PROVIDER = new SimpleBlockStateProvider(GHOSHROOM_LOG.getDefaultState());
        PELTOGYNE_TRUNK_PROVIDER = new SimpleBlockStateProvider(PELTOGYNE_LOG.getDefaultState());
        PIN_CHERRY_TRUNK_PROVIDER = new SimpleBlockStateProvider(PIN_CHERRY_LOG.getDefaultState());
        PLUM_TRUNK_PROVIDER = new SimpleBlockStateProvider(PLUM_LOG.getDefaultState());
        PURFUNGA_TRUNK_PROVIDER = new SimpleBlockStateProvider(PURFUNGA_LOG.getDefaultState());
        SPROOM_TRUNK_PROVIDER = new SimpleBlockStateProvider(SPROOM_LOG.getDefaultState());
        STORTREEAN_TRUNK_PROVIDER = new SimpleBlockStateProvider(STORTREEAN_LOG.getDefaultState());
        STROOMEAN_TRUNK_PROVIDER = new SimpleBlockStateProvider(STROOMEAN_LOG.getDefaultState());
        SUNRISE_FUNGUS_TRUNK_PROVIDER = new SimpleBlockStateProvider(SUNRISE_FUNGUS_LOG.getDefaultState());
        TEAK_TRUNK_PROVIDER = new SimpleBlockStateProvider(TEAK_LOG.getDefaultState());

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

        LILAC_PROVIDER = new SimpleBlockStateProvider(Blocks.LILAC.getDefaultState());
    }

}