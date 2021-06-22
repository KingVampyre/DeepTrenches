package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class AlmondSaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier FANCY_ALMOND = new Identifier("deep_trenches:fancy_almond");
    private static final Identifier GREAT_ALMOND = new Identifier("deep_trenches:great_almond");
    private static final Identifier ALMOND = new Identifier("deep_trenches:almond");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(GREAT_ALMOND);
    }

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return RegistryHelper.getTree(random.nextInt(5) == 0 ? FANCY_ALMOND : ALMOND);
    }

}