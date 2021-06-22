package github.KingVampyre.DeepTrenches.core.block.sapling;

import github.Louwind.worldgen.util.RegistryHelper;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class PinCherrySaplingGenerator extends LargeTreeSaplingGenerator {

    private static final Identifier FANCY_PIN_CHERRY = new Identifier("deep_trenches:fancy_pin_cherry");
    private static final Identifier GREAT_PIN_CHERRY = new Identifier("deep_trenches:great_pin_cherry");
    private static final Identifier PIN_CHERRY = new Identifier("deep_trenches:pin_cherry");

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createLargeTreeFeature(Random random) {
        return RegistryHelper.getTree(GREAT_PIN_CHERRY);
    }

    @Nullable
    @Override
    public ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
        return RegistryHelper.getTree(random.nextInt(5) == 0 ? FANCY_PIN_CHERRY : PIN_CHERRY);
    }

}