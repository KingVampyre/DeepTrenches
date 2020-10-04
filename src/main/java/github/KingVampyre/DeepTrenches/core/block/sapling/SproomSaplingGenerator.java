package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.SPROOM_SAPLING;
import static github.KingVampyre.DeepTrenches.core.init.ModConfiguredFeatures.*;

public class SproomSaplingGenerator implements FeaturesThickSaplingGenerator {

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return SPROOM;
    }

    @Override
    public Block getSaplingBlock() {
        return SPROOM_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return null;
    }

}
