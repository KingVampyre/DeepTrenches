package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.util.math.intprovider.NegativeConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProviderType;

public class DTIntProviderType {

    public static final IntProviderType<NegativeConstantIntProvider> NEGATIVE_CONSTANT;

    static {
        NEGATIVE_CONSTANT = IntProviderType.register("deep_trenches:negative_constant", NegativeConstantIntProvider.CODEC);
    }

}
