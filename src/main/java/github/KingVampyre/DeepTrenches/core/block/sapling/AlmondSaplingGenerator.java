package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.ALMOND;
import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.FANCY_ALMOND;
import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.GREAT_ALMOND;

public class AlmondSaplingGenerator extends LargeTreeSaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getLargeTreeFeature(Random random) {
        return GREAT_ALMOND;
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return random.nextInt(5) == 0 ? FANCY_ALMOND : ALMOND;
    }

}