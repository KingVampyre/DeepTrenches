package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class ThundercloudPlumSaplingGenerator extends SaplingGenerator {

    private static final Identifier BIG_THUNDERCLOUD_PLUM = new Identifier("deep_trenches:big_thundercloud_plum");
    private static final Identifier MEDIUM_THUNDERCLOUD_PLUM = new Identifier("deep_trenches:medium_thundercloud_plum");
    private static final Identifier SMALL_THUNDERCLOUD_PLUM = new Identifier("deep_trenches:small_thundercloud_plum");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {

        if (random.nextInt(10) == 0)
            return BIG_THUNDERCLOUD_PLUM);

        return random.nextInt(5) == 0 ? MEDIUM_THUNDERCLOUD_PLUM : SMALL_THUNDERCLOUD_PLUM);
    }

}