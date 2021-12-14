package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.world.DTConfiguredFeatures.SUNRISE_FUNGUS;

public class SunriseFungusSaplingGenerator extends LargeTreeSaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getLargeTreeFeature(Random random) {
        return SUNRISE_FUNGUS;
    }

    @Override
    public ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        return null;
    }

}
