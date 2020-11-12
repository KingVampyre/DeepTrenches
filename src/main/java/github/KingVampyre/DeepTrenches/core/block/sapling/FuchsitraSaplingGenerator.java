package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.FUCHSITRA_SAPLING;
import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.BlockRotation.COUNTERCLOCKWISE_90;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class FuchsitraSaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> BIG_FUCHSITRAS = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:big_fuchsitra"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:big_fuchsitra_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:big_fuchsitra"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:big_fuchsitra_90"))
            .build();

    private static final ImmutableMap<BlockRotation, Identifier> MEDIUM_FUCHSITRAS = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:medium_fuchsitra"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:medium_fuchsitra_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:medium_fuchsitra"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:medium_fuchsitra_90"))
            .build();

    private static final ImmutableMap<BlockRotation, Identifier> SMALL_FUCHSITRAS = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:small_fuchsitra"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:small_fuchsitra_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:small_fuchsitra"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:small_fuchsitra_90"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);

        if(random.nextInt(5) == 0) {
            Identifier id = BIG_FUCHSITRAS.get(rotation);

            return CONFIGURED_FEATURE.get(id);
        }

        Identifier id = MEDIUM_FUCHSITRAS.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public Block getSaplingBlock() {
        return FUCHSITRA_SAPLING;
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);
        Identifier id = SMALL_FUCHSITRAS.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

}
