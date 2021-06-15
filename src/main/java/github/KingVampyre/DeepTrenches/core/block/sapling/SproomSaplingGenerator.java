package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class SproomSaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier SPROOM = new Identifier("deep_trenches:sproom");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(SPROOM);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return null;
    }

}