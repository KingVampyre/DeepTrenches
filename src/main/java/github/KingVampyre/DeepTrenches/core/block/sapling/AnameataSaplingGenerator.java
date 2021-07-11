package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class AnameataSaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier BIG_ANAMEATA = new Identifier("deep_trenches:big_anameata");
    private static final Identifier MEDIUM_ANAMEATA = new Identifier("deep_trenches:medium_anameata");
    private static final Identifier SMALL_ANAMEATA = new Identifier("deep_trenches:small_anameata");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(random.nextInt(5) == 0 ? BIG_ANAMEATA : MEDIUM_ANAMEATA);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return RegistryHelper.getTree(SMALL_ANAMEATA);
    }

}