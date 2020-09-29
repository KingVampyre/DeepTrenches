package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.world.feature.context.provider.ThickTreeContextProvider;
import github.Louwind.Features.context.provider.FeatureContextProviderType;

public class ModFeatureContextProviders {

    public static final FeatureContextProviderType THICK_TREE = new FeatureContextProviderType(new ThickTreeContextProvider.Serializer());

}
