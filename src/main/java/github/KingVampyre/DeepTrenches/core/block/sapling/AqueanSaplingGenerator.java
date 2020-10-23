package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class AqueanSaplingGenerator implements FeaturesSaplingGenerator {

    private static final Identifier BIG_AQUEAN = new Identifier("deep_trenches:big_aquean");
    private static final Identifier MEDIUM_AQUEAN = new Identifier("deep_trenches:medium_aquean");
    private static final Identifier SMALL_AQUEAN = new Identifier("deep_trenches:small_aquean");

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {

        if (random.nextInt(7) == 0)
            return CONFIGURED_FEATURE.get(BIG_AQUEAN);

        if (random.nextInt(3) == 0)
            return CONFIGURED_FEATURE.get(MEDIUM_AQUEAN);

        return CONFIGURED_FEATURE.get(SMALL_AQUEAN);
    }

}
