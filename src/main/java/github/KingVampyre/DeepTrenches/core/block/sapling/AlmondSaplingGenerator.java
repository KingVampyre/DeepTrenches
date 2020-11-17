package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.ALMOND_SAPLING;
import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class AlmondSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> BIG_ALMOND = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:big_almond"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:big_almond_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:big_almond_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:big_almond_270"))
            .build();

    private static final ImmutableMap<BlockRotation, Identifier> MEDIUM_ALMOND = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:medium_almond"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:medium_almond_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:medium_almond_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:medium_almond_270"))
            .build();

    private static final ImmutableMap<BlockRotation, Identifier> SMALL_ALMOND = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:small_almond"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:small_almond_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:small_almond_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:small_almond_270"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = BIG_ALMOND.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);

        if(random.nextInt(5) == 0) {
            Identifier id = MEDIUM_ALMOND.get(rotation);

            return CONFIGURED_FEATURE.get(id);
        }

        Identifier id = SMALL_ALMOND.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public Block getSaplingBlock() {
        return ALMOND_SAPLING;
    }

}
