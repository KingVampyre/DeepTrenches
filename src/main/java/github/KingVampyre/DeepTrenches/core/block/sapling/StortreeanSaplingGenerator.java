package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.STORTREEAN_SAPLING;
import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class StortreeanSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> STORTREEAN = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:stortreean"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:stortreean_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:stortreean"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:stortreean_90"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = STORTREEAN.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public Block getSaplingBlock() {
        return STORTREEAN_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return null;
    }

}
