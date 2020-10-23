package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.FUCHSITRA_SAPLING;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class FuchsitraSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier BIG_FUCHSITRA = new Identifier("deep_trenches:big_fuchsitra");
    private static final Identifier MEDIUM_FUCHSITRA = new Identifier("deep_trenches:medium_fuchsitra");
    private static final Identifier SMALL_FUCHSITRA = new Identifier("deep_trenches:small_fuchsitra");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return random.nextInt(5) == 0 ? CONFIGURED_FEATURE.get(BIG_FUCHSITRA) : CONFIGURED_FEATURE.get(MEDIUM_FUCHSITRA);
    }

    @Override
    public Block getSaplingBlock() {
        return FUCHSITRA_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(SMALL_FUCHSITRA);
    }

}
