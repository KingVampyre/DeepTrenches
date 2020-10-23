package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.BLACK_BIRCH_SAPLING;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class BlackBirchSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier BIG_BLACK_BIRCH = new Identifier("deep_trenches:big_black_birch");
    private static final Identifier SMALL_BLACK_BIRCH = new Identifier("deep_trenches:small_black_birch");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(BIG_BLACK_BIRCH);
    }

    @Override
    public Block getSaplingBlock() {
        return BLACK_BIRCH_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(SMALL_BLACK_BIRCH);
    }

}
