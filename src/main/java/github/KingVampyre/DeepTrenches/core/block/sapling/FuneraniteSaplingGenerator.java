package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.FUNERANITE_SAPLING;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class FuneraniteSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier FUNERANITE = new Identifier("deep_trenches:funeranite");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(FUNERANITE);
    }

    @Override
    public Block getSaplingBlock() {
        return FUNERANITE_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return null;
    }

}
