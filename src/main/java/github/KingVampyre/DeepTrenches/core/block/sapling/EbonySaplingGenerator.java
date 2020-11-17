package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class EbonySaplingGenerator implements FeaturesSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> EBONY = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:ebony"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:ebony_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:ebony"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:ebony_90"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = EBONY.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

}
