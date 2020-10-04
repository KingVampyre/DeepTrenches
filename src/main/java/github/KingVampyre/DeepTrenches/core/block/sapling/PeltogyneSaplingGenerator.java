package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PELTOGYNE_SAPLING;
import static github.KingVampyre.DeepTrenches.core.init.ModConfiguredFeatures.*;

public class PeltogyneSaplingGenerator implements FeaturesThickSaplingGenerator {

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return PELTOGYNE;
    }

    @Override
    public Block getSaplingBlock() {
        return PELTOGYNE_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return null;
    }

}
