package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesThickSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.PIN_CHERRY_SAPLING;
import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.BlockRotation.COUNTERCLOCKWISE_90;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class PinCherrySaplingGenerator implements FeaturesThickSaplingGenerator {

    private static final Identifier BIG_PIN_CHERRY = new Identifier("deep_trenches:big_pin_cherry");
    private static final Identifier MEDIUM_PIN_CHERRY = new Identifier("deep_trenches:medium_pin_cherry");

    private static final ImmutableMap<BlockRotation, Identifier> SMALL_PIN_CHERRY = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:small_pin_cherry"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:small_pin_cherry_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:small_pin_cherry_180"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:small_pin_cherry_270"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling) {
        return CONFIGURED_FEATURE.get(BIG_PIN_CHERRY);
    }

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);

        if(random.nextInt(5) == 0)
            return CONFIGURED_FEATURE.get(MEDIUM_PIN_CHERRY);

        Identifier id = SMALL_PIN_CHERRY.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

    @Override
    public Block getSaplingBlock() {
        return PIN_CHERRY_SAPLING;
    }

}
