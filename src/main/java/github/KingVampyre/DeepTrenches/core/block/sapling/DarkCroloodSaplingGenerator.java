package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.DARK_CROLOOD_SAPLING;
import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class DarkCroloodSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> DARK_CROLOOD = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:dark_crolood_from_sapling"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:dark_crolood_from_sapling_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:dark_crolood_from_sapling"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:dark_crolood_from_sapling_90"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = DARK_CROLOOD.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public Block getSaplingBlock() {
        return DARK_CROLOOD_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return null;
    }

}
