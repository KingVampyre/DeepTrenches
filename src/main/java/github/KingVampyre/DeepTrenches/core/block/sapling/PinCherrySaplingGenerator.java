package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.*;

public class PinCherrySaplingGenerator extends LargeTreeSaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getLargeTreeFeature(Random random) {
        return GREAT_PIN_CHERRY;
    }

    @Nullable
    @Override
    public ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        var fancy = random.nextInt(5) == 0;

        if(bees)
            return fancy ? FANCY_PIN_CHERRY_MORE_BEEHIVES : PIN_CHERRY_MORE_BEEHIVES;
        else
            return fancy ? FANCY_PIN_CHERRY : PIN_CHERRY;
    }

}