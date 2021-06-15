package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class FuchsitraSaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier BIG_FUCHSITRA = new Identifier("deep_trenches:big_fuchsitra");
    private static final Identifier MEDIUM_FUCHSITRA = new Identifier("deep_trenches:medium_fuchsitra");
    private static final Identifier SMALL_FUCHSITRA = new Identifier("deep_trenches:small_fuchsitra");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(random.nextInt(5) == 0 ? BIG_FUCHSITRA : MEDIUM_FUCHSITRA);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return RegistryHelper.getTree(SMALL_FUCHSITRA);
    }

}