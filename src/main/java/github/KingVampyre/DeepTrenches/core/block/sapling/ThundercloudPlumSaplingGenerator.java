package github.KingVampyre.DeepTrenches.core.block.sapling;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTConfiguredFeatures.*;

public class ThundercloudPlumSaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        if (random.nextInt(7) == 0)
            return GREAT_THUNDERCLOUD_PLUM;

        return random.nextInt(3) == 0 ? FANCY_THUNDERCLOUD_PLUM: THUNDERCLOUD_PLUM;
    }

}