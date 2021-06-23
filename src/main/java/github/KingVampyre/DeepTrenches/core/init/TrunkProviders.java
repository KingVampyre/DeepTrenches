package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.*;

public class TrunkProviders {

    public static final BlockStateProvider ALMOND_FOLIAGE_PROVIDER;
    public static final BlockStateProvider ALMOND_SAPLING_PROVIDER;
    public static final BlockStateProvider ALMOND_TRUNK_PROVIDER;

    public static final BlockStateProvider CHERRY_FOLIAGE_PROVIDER;
    public static final BlockStateProvider CHERRY_SAPLING_PROVIDER;
    public static final BlockStateProvider CHERRY_TRUNK_PROVIDER;

    public static final BlockStateProvider PIN_CHERRY_FOLIAGE_PROVIDER;
    public static final BlockStateProvider PIN_CHERRY_SAPLING_PROVIDER;
    public static final BlockStateProvider PIN_CHERRY_TRUNK_PROVIDER;
    
    static {
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