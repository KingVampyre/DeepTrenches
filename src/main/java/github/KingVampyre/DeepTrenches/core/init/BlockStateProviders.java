package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.collection.DataPool;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.*;

public class BlockStateProviders {

    public static final BlockStateProvider ALMOND_FOLIAGE_PROVIDER;
    public static final BlockStateProvider ALMOND_SAPLING_PROVIDER;
    public static final BlockStateProvider ALMOND_TRUNK_PROVIDER;

    public static final BlockStateProvider CHERRY_FOLIAGE_PROVIDER;
    public static final BlockStateProvider CHERRY_SAPLING_PROVIDER;
    public static final BlockStateProvider CHERRY_TRUNK_PROVIDER;

    public static final BlockStateProvider PIN_CHERRY_FOLIAGE_PROVIDER;
    public static final BlockStateProvider PIN_CHERRY_SAPLING_PROVIDER;
    public static final BlockStateProvider PIN_CHERRY_TRUNK_PROVIDER;

    public static final BlockStateProvider ALMOND_FOREST_FLOWER_PROVIDER;
    public static final BlockStateProvider ALMOND_PLUS_FOREST_FLOWER_PROVIDER;

    public static final BlockStateProvider LILAC_PROVIDER;

    static {
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

        ALMOND_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(ALMOND_LEAVES.getDefaultState());
        ALMOND_SAPLING_PROVIDER = new SimpleBlockStateProvider(ALMOND_SAPLING.getDefaultState());
        ALMOND_TRUNK_PROVIDER = new SimpleBlockStateProvider(ALMOND_LOG.getDefaultState());

        CHERRY_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(CHERRY_LEAVES.getDefaultState());
        CHERRY_SAPLING_PROVIDER = new SimpleBlockStateProvider(CHERRY_SAPLING.getDefaultState());
        CHERRY_TRUNK_PROVIDER = new SimpleBlockStateProvider(CHERRY_LOG.getDefaultState());

        PIN_CHERRY_FOLIAGE_PROVIDER = new SimpleBlockStateProvider(PIN_CHERRY_LEAVES.getDefaultState());
        PIN_CHERRY_SAPLING_PROVIDER = new SimpleBlockStateProvider(PIN_CHERRY_SAPLING.getDefaultState());
        PIN_CHERRY_TRUNK_PROVIDER = new SimpleBlockStateProvider(PIN_CHERRY_LOG.getDefaultState());
    }

}