package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class AqueanSaplingGenerator extends SaplingGenerator {

    private static final Identifier BIG_AQUEAN = new Identifier("deep_trenches:big_aquean");
    private static final Identifier MEDIUM_AQUEAN = new Identifier("deep_trenches:medium_aquean");
    private static final Identifier SMALL_AQUEAN = new Identifier("deep_trenches:small_aquean");

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {

        if (random.nextInt(7) == 0)
            return RegistryHelper.getTree(BIG_AQUEAN);

        return RegistryHelper.getTree(random.nextInt(3) == 0 ? MEDIUM_AQUEAN : SMALL_AQUEAN);
    }

}