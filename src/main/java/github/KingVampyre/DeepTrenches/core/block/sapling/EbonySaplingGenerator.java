package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.world.DTConfiguredFeatures.EBONY;

public class EbonySaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    public ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        return EBONY;
    }

}
