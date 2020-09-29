package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.world.feature.function.PivotFunction;
import github.Louwind.Features.function.FeatureFunctionType;

public class ModFeatureFunctions {

    public static final FeatureFunctionType PIVOT = new FeatureFunctionType(new PivotFunction.Serializer());

}
