package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class BarshrookleSaplingGenerator implements FeaturesSaplingGenerator {

    private static final Identifier BARSHROOKLE = new Identifier("deep_trenches:barshrookle");
    private static final Identifier DAMP_BARSHROOKLE = new Identifier("deep_trenches:damp_barshrookle");

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return sapling ? CONFIGURED_FEATURE.get(BARSHROOKLE) : CONFIGURED_FEATURE.get(DAMP_BARSHROOKLE);
    }

}
