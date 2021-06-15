package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class DarkCroloodSaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier DARK_CROLOOD = new Identifier("deep_trenches:dark_crolood_from_sapling");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(DARK_CROLOOD);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return null;
    }

}