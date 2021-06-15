package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class CherrySaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier BIG_CHERRY = new Identifier("deep_trenches:big_cherry");
    private static final Identifier MEDIUM_CHERRY = new Identifier("deep_trenches:medium_cherry");
    private static final Identifier SMALL_CHERRY = new Identifier("deep_trenches:small_cherry");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(BIG_CHERRY);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return RegistryHelper.getTree(random.nextInt(5) == 0 ? MEDIUM_CHERRY : SMALL_CHERRY);
    }

}