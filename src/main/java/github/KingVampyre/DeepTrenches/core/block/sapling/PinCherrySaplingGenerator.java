package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class PinCherrySaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier BIG_PIN_CHERRY = new Identifier("deep_trenches:big_pin_cherry");
    private static final Identifier MEDIUM_PIN_CHERRY = new Identifier("deep_trenches:medium_pin_cherry");
    private static final Identifier SMALL_PIN_CHERRY = new Identifier("deep_trenches:small_pin_cherry");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(BIG_PIN_CHERRY);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return RegistryHelper.getTree(random.nextInt(5) == 0 ? MEDIUM_PIN_CHERRY : SMALL_PIN_CHERRY);
    }

}