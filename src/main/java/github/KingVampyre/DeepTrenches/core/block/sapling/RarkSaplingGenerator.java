package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class RarkSaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return null;
    }

}