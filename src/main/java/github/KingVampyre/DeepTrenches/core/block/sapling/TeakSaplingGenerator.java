package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.TEAK_SAPLING;
import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class TeakSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier BIG_TEAK = new Identifier("deep_trenches:big_teak");

    private static final ImmutableMap<BlockRotation, Identifier> MEDIUM_TEAK = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:medium_teak"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:medium_teak_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:medium_teak"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:medium_teak_90"))
            .build();

    private static final Identifier SMALL_TEAK = new Identifier("deep_trenches:small_teak");

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {

        if(random.nextInt(10) == 0)
            return CONFIGURED_FEATURE.get(BIG_TEAK);

        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = MEDIUM_TEAK.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public Block getSaplingBlock() {
        return TEAK_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(SMALL_TEAK);
    }

}
