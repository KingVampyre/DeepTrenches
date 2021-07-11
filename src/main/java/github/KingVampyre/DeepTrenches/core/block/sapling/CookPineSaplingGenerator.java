package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class CookPineSaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier COOK_PINE = new Identifier("deep_trenches:cook_pine");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(COOK_PINE);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return null;
    }

}
