package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.ANAMEATA_SAPLING;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class AnameataSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier ANAMEATA = new Identifier("deep_trenches:anameata");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(ANAMEATA);
    }

    @Override
    public Block getSaplingBlock() {
        return ANAMEATA_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return null;
    }

}
