package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class SunriseFungusSaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier SUNRISE_FUNGUS = new Identifier("deep_trenches:sunrise_fungus");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(SUNRISE_FUNGUS);
    }

    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return null;
    }

}
