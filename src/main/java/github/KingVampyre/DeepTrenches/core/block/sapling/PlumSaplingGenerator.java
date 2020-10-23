package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class PlumSaplingGenerator implements FeaturesSaplingGenerator {

    private static final Identifier BIG_PLUM = new Identifier("deep_trenches:big_plum");
    private static final Identifier MEDIUM_PLUM = new Identifier("deep_trenches:medium_plum");
    private static final Identifier SMALL_PLUM = new Identifier("deep_trenches:small_plum");

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {

        if (random.nextInt(7) == 0)
            return CONFIGURED_FEATURE.get(BIG_PLUM);
        else if (random.nextInt(3) == 0)
            return CONFIGURED_FEATURE.get(MEDIUM_PLUM);

        return CONFIGURED_FEATURE.get(SMALL_PLUM);
    }

}
