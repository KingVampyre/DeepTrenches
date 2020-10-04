package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModConfiguredFeatures.*;

public class BarshrookleSaplingGenerator implements FeaturesSaplingGenerator {

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return sapling ? BARSHROOKLE : DAMP_BARSHROOKLE;
    }

}
