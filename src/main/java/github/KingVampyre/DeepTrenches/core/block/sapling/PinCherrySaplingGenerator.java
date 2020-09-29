package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.KingVampyre.DeepTrenches.common.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PIN_CHERRY_SAPLING;
import static github.KingVampyre.DeepTrenches.core.init.ModFeatures.*;
import static net.minecraft.world.gen.feature.DefaultFeatureConfig.INSTANCE;

public class PinCherrySaplingGenerator implements FeaturesThickSaplingGenerator {

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return BIG_PIN_CHERRY.configure(INSTANCE);
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return random.nextInt(5) == 0 ? MEDIUM_PIN_CHERRY.configure(INSTANCE) : SMALL_PIN_CHERRY.configure(INSTANCE);
    }

    @Override
    public Block getSaplingBlock() {
        return PIN_CHERRY_SAPLING;
    }

}
