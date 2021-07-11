package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class BlackBirchSaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier BIG_BLACK_BIRCH = new Identifier("deep_trenches:big_black_birch");
    private static final Identifier SMALL_BLACK_BIRCH = new Identifier("deep_trenches:small_black_birch");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(BIG_BLACK_BIRCH);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return RegistryHelper.getTree(SMALL_BLACK_BIRCH);
    }

}