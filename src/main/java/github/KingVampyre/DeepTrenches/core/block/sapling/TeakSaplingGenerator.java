package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.TEAK_SAPLING;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class TeakSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier BIG_TEAK = new Identifier("deep_trenches:big_teak");
    private static final Identifier MEDIUM_TEAK = new Identifier("deep_trenches:medium_teak");
    private static final Identifier SMALL_TEAK = new Identifier("deep_trenches:small_teak");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return random.nextInt(10) == 0 ? CONFIGURED_FEATURE.get(BIG_TEAK) : CONFIGURED_FEATURE.get(MEDIUM_TEAK);
    }

    @Override
    public Block getSaplingBlock() {
        return TEAK_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(SMALL_TEAK);
    }

}
