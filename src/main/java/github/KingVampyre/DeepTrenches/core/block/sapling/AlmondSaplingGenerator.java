package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.ALMOND_SAPLING;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class AlmondSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier BIG_ALMOND = new Identifier("deep_trenches:big_almond");
    private static final Identifier MEDIUM_ALMOND = new Identifier("deep_trenches:medium_almond");
    private static final Identifier SMALL_ALMOND = new Identifier("deep_trenches:small_almond");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(BIG_ALMOND);
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return random.nextInt(5) == 0 ? CONFIGURED_FEATURE.get(MEDIUM_ALMOND) : CONFIGURED_FEATURE.get(SMALL_ALMOND);
    }

    @Override
    public Block getSaplingBlock() {
        return ALMOND_SAPLING;
    }

}
