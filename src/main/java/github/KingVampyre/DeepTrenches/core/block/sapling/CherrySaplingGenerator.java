package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.*;

public class CherrySaplingGenerator extends LargeTreeSaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getLargeTreeFeature(Random random) {
        return GREAT_CHERRY;
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        var fancy = random.nextInt(5) == 0;

        if(bees)
            return fancy ? FANCY_CHERRY_MORE_BEEHIVES : CHERRY_MORE_BEEHIVES;
        else
            return fancy ? FANCY_CHERRY : CHERRY;
    }

}