package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.BLACK_BIRCH_SAPLING;
import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class BlackBirchSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> BIG_BLACK_BIRCH = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:big_black_birch"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:big_black_birch_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:big_black_birch_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:big_black_birch_270"))
            .build();

    private static final ImmutableMap<BlockRotation, Identifier> SMALL_BLACK_BIRCH = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:small_black_birch"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:small_black_birch_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:small_black_birch_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:small_black_birch_270"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = BIG_BLACK_BIRCH.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public Block getSaplingBlock() {
        return BLACK_BIRCH_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = SMALL_BLACK_BIRCH.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

}
