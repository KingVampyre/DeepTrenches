package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModConfiguredFeatures.*;

public class ThundercloudPlumSaplingGenerator implements FeaturesSaplingGenerator {

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {

        if (random.nextInt(10) == 0)
            return BIG_THUNDERCLOUD_PLUM;
        else if (random.nextInt(5) == 0)
            return MEDIUM_THUNDERCLOUD_PLUM;

        return SMALL_THUNDERCLOUD_PLUM;
    }

}
