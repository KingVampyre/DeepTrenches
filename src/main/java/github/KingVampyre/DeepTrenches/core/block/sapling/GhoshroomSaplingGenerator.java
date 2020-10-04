package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.GHOSHROOM_SAPLING;
import static github.KingVampyre.DeepTrenches.core.init.ModConfiguredFeatures.*;

public class GhoshroomSaplingGenerator implements FeaturesThickSaplingGenerator {

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return sapling ? GHOSHROOM : DAMP_GHOSHROOM;
    }

    @Override
    public Block getSaplingBlock() {
        return GHOSHROOM_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return null;
    }

}
