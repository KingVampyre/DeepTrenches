package github.KingVampyre.DeepTrenches.core.init;

import github.Louwind.Features.impl.feature.GenericFeature;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;

public class ModFeatures {

    public static final GenericFeature<DefaultFeatureConfig> BIG_ALMOND = new GenericFeature<>(new Identifier("deep_trenches:big_almond"), DefaultFeatureConfig.CODEC);

    public static final GenericFeature<DefaultFeatureConfig> BIG_CHERRY = new GenericFeature<>(new Identifier("deep_trenches:big_chery"), DefaultFeatureConfig.CODEC);

    public static final GenericFeature<DefaultFeatureConfig> BIG_PIN_CHERRY = new GenericFeature<>(new Identifier("deep_trenches:big_pin_cherry"), DefaultFeatureConfig.CODEC);

    public static final GenericFeature<DefaultFeatureConfig> MEDIUM_ALMOND = new GenericFeature<>(new Identifier("deep_trenches:medium_almond"), DefaultFeatureConfig.CODEC);

    public static final GenericFeature<DefaultFeatureConfig> MEDIUM_CHERRY = new GenericFeature<>(new Identifier("deep_trenches:medium_cherry"), DefaultFeatureConfig.CODEC);

    public static final GenericFeature<DefaultFeatureConfig> MEDIUM_PIN_CHERRY = new GenericFeature<>(new Identifier("deep_trenches:medium_pin_cherry"), DefaultFeatureConfig.CODEC);

    public static final GenericFeature<DefaultFeatureConfig> SMALL_ALMOND = new GenericFeature<>(new Identifier("deep_trenches:small_almond"), DefaultFeatureConfig.CODEC);

    public static final GenericFeature<DefaultFeatureConfig> SMALL_CHERRY = new GenericFeature<>(new Identifier("deep_trenches:small_cherry"), DefaultFeatureConfig.CODEC);

    public static final GenericFeature<DefaultFeatureConfig> SMALL_PIN_CHERRY = new GenericFeature<>(new Identifier("deep_trenches:small_pin_cherry"), DefaultFeatureConfig.CODEC);

}
