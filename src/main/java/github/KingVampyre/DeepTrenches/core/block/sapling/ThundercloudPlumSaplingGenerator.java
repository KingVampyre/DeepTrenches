package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class ThundercloudPlumSaplingGenerator implements FeaturesSaplingGenerator {

    private static final Identifier BIG_THUNDERCLOUD_PLUM = new Identifier("deep_trenches:big_thundercloud_plum");
    private static final Identifier MEDIUM_THUNDERCLOUD_PLUM = new Identifier("deep_trenches:medium_thundercloud_plum");
    private static final Identifier SMALL_THUNDERCLOUD_PLUM = new Identifier("deep_trenches:small_thundercloud_plum");

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {

        if (random.nextInt(10) == 0)
            return CONFIGURED_FEATURE.get(BIG_THUNDERCLOUD_PLUM);
        else if (random.nextInt(5) == 0)
            return CONFIGURED_FEATURE.get(MEDIUM_THUNDERCLOUD_PLUM);

        return CONFIGURED_FEATURE.get(SMALL_THUNDERCLOUD_PLUM);
    }

}
