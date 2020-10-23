package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.STROOMEAN_SAPLING;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class StroomeanSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier STROOMEAN = new Identifier("deep_trenches:stroomean");
    private static final Identifier DAMP_STROOMEAN = new Identifier("deep_trenches:damp_stroomean");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return sapling ? CONFIGURED_FEATURE.get(STROOMEAN) : CONFIGURED_FEATURE.get(DAMP_STROOMEAN);
    }

    @Override
    public Block getSaplingBlock() {
        return STROOMEAN_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return null;
    }

}
