package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.world.DTConfiguredFeatures.*;

public class AlmondSaplingGenerator extends LargeTreeSaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getLargeTreeFeature(Random random) {
        return GREAT_ALMOND;
    }

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        var fancy = random.nextInt(5) == 0;

        if(bees)
            return fancy ? FANCY_ALMOND_MORE_BEES : ALMOND_MORE_BEES;
        else
            return fancy ? FANCY_ALMOND : ALMOND;
    }

}