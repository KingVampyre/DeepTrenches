package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.CHERRY_SAPLING;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class CherrySaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier BIG_CHERRY = new Identifier("deep_trenches:big_cherry");
    private static final Identifier MEDIUM_CHERRY = new Identifier("deep_trenches:medium_cherry");
    private static final Identifier SMALL_CHERRY = new Identifier("deep_trenches:small_cherry");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(BIG_CHERRY);
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return random.nextInt(5) == 0 ? CONFIGURED_FEATURE.get(MEDIUM_CHERRY) : CONFIGURED_FEATURE.get(SMALL_CHERRY);
    }

    @Override
    public Block getSaplingBlock() {
        return CHERRY_SAPLING;
    }

}