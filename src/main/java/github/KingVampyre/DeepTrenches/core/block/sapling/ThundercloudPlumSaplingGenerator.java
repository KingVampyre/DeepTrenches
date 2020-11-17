package github.KingVampyre.DeepTrenches.core.block.sapling;

import com.google.common.collect.ImmutableMap;
import github.Louwind.Features.impl.block.sapling.FeaturesSaplingGenerator;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

import static net.minecraft.util.BlockRotation.*;
import static net.minecraft.util.registry.BuiltinRegistries.CONFIGURED_FEATURE;

public class ThundercloudPlumSaplingGenerator implements FeaturesSaplingGenerator {

    private static final ImmutableMap<BlockRotation, Identifier> BIG_THUNDERCLOUD_PLUM = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:big_thundercloud_plum"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:big_thundercloud_plum_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:big_thundercloud_plum"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:big_thundercloud_plum_90"))
            .build();

    private static final ImmutableMap<BlockRotation, Identifier> MEDIUM_THUNDERCLOUD_PLUM = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:medium_thundercloud_plum"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:medium_thundercloud_plum_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:medium_thundercloud_plum"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:medium_thundercloud_plum_90"))
            .build();

    private static final ImmutableMap<BlockRotation, Identifier> SMALL_THUNDERCLOUD_PLUM = ImmutableMap.<BlockRotation, Identifier>builder()
            .put(NONE, new Identifier("deep_trenches:small_thundercloud_plum"))
            .put(CLOCKWISE_90, new Identifier("deep_trenches:small_thundercloud_plum_90"))
            .put(CLOCKWISE_180, new Identifier("deep_trenches:small_thundercloud_plum"))
            .put(COUNTERCLOCKWISE_90, new Identifier("deep_trenches:small_thundercloud_plum_90"))
            .build();

    @Override
    public ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling) {
        BlockRotation rotation = BlockRotation.random(random);

        if (random.nextInt(10) == 0) {
            Identifier id = BIG_THUNDERCLOUD_PLUM.get(rotation);

            return CONFIGURED_FEATURE.get(id);
        }

        if (random.nextInt(5) == 0) {
            Identifier id = MEDIUM_THUNDERCLOUD_PLUM.get(rotation);

            return CONFIGURED_FEATURE.get(id);
        }

        Identifier id = SMALL_THUNDERCLOUD_PLUM.get(rotation);

        return CONFIGURED_FEATURE.get(id);
    }

}
