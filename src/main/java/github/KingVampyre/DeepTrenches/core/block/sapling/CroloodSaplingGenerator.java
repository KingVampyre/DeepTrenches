package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class CroloodSaplingGenerator implements FeaturesSaplingGenerator {

    private static final Identifier CROLOOD = new Identifier("deep_trenches:crolood_from_sapling");

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(CROLOOD);
    }

}
