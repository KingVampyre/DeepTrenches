package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.CHERRY;
import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.FANCY_CHERRY;
import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.GREAT_CHERRY;

public class CherrySaplingGenerator extends LargeTreeSaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getLargeTreeFeature(Random random) {
        return GREAT_CHERRY;
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return random.nextInt(5) == 0 ? FANCY_CHERRY : CHERRY;
    }

}