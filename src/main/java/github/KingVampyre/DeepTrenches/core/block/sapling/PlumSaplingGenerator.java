package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class PlumSaplingGenerator extends SaplingGenerator {

    private static final Identifier BIG_PLUM = new Identifier("deep_trenches:big_plum");
    private static final Identifier MEDIUM_PLUM = new Identifier("deep_trenches:medium_plum");
    private static final Identifier SMALL_PLUM = new Identifier("deep_trenches:small_plum");

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {

        if (random.nextInt(7) == 0)
            return RegistryHelper.getTree(BIG_PLUM);

        return RegistryHelper.getTree(random.nextInt(3) == 0 ? MEDIUM_PLUM : SMALL_PLUM);
    }

}