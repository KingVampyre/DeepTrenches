package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.world.DTConfiguredFeatures.*;

public class AqueanSaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    public ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {

        if (random.nextInt(7) == 0)
            return GREAT_AQUEAN;

        return random.nextInt(3) == 0 ? FANCY_AQUEAN : AQUEAN;
    }

}