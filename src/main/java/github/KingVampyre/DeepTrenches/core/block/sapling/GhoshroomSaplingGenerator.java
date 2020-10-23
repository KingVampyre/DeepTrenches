package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.GHOSHROOM_SAPLING;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class GhoshroomSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier GHOSHROOM = new Identifier("deep_trenches:ghoshroom");
    private static final Identifier DAMP_GHOSHROOM = new Identifier("deep_trenches:damp_ghoshroom");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return sapling ? CONFIGURED_FEATURE.get(GHOSHROOM) : CONFIGURED_FEATURE.get(DAMP_GHOSHROOM);
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
