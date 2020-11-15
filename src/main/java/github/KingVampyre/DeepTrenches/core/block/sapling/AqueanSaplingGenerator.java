package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class AqueanSaplingGenerator implements FeaturesSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> BIG_AQUEAN = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:big_aquean"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:big_aquean_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:big_aquean_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:big_aquean_270"))
            .build();

    private static final ImmutableMap<BlockRotation, Identifier> MEDIUM_AQUEAN = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:medium_aquean"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:medium_aquean_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:medium_aquean_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:medium_aquean_270"))
            .build();

    private static final ImmutableMap<BlockRotation, Identifier> SMALL_AQUEAN = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:small_aquean"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:small_aquean_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:small_aquean_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:small_aquean_270"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);

        if (random.nextInt(7) == 0) {
            Identifier id = BIG_AQUEAN.get(rotation);

            return CONFIGURED_FEATURE.get(id);
        }

        if (random.nextInt(3) == 0) {
            Identifier id = MEDIUM_AQUEAN.get(rotation);

            return CONFIGURED_FEATURE.get(id);
        }

        Identifier id = SMALL_AQUEAN.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

}
