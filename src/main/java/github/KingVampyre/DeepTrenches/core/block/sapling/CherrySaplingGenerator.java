package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class CherrySaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier FANCY_CHERRY = new Identifier("deep_trenches:fancy_cherry");
    private static final Identifier GREAT_CHERRY = new Identifier("deep_trenches:great_cherry");
    private static final Identifier CHERRY = new Identifier("deep_trenches:cherry");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(GREAT_CHERRY);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return RegistryHelper.getTree(random.nextInt(5) == 0 ? FANCY_CHERRY : CHERRY);
    }

}