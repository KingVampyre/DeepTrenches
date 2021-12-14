package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.world.DTConfiguredFeatures.*;

public class BlackBirchSaplingGenerator extends LargeTreeSaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getLargeTreeFeature(Random random) {
        return GREAT_BLACK_BIRCH;
    }

    @Nullable
    @Override
    public ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        return random.nextInt(5) == 0 ? FANCY_BLACK_BIRCH : BLACK_BIRCH;
    }

}