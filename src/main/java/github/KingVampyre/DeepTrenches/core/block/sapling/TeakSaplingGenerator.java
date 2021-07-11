package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class TeakSaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier BIG_TEAK = new Identifier("deep_trenches:big_teak");
    private static final Identifier MEDIUM_TEAK = new Identifier("deep_trenches:medium_teak");
    private static final Identifier SMALL_TEAK = new Identifier("deep_trenches:small_teak");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(random.nextInt(10) == 0 ? BIG_TEAK : MEDIUM_TEAK);
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return RegistryHelper.getTree(SMALL_TEAK);
    }

}