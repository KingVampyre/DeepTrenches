package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModConfiguredFeatures.*;

public class AqueanSaplingGenerator implements FeaturesSaplingGenerator {

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {

        if (random.nextInt(7) == 0)
            return BIG_AQUEAN;

        if (random.nextInt(3) == 0)
            return MEDIUM_AQUEAN;

        return SMALL_AQUEAN;
    }

}
