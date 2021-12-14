package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.world.DTConfiguredFeatures.*;

public class AnameataSaplingGenerator extends LargeTreeSaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getLargeTreeFeature(Random random) {
        return random.nextInt(5) == 0 ? GREAT_ANAMEATA : FANCY_ANAMEATA;
    }

    @Nullable
    @Override
    public ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        return ANAMEATA;
    }

}