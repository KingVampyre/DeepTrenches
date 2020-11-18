package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class BarshrookleSaplingGenerator implements FeaturesSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> BARSHROOKLE = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:barshrookle"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:barshrookle_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:barshrookle_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:barshrookle_270"))
            .build();
    
    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = BARSHROOKLE.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

}
