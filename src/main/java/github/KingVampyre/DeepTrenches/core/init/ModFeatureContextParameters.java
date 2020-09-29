package github.KingVampyre.DeepTrenches.core.init;

import github.Louwind.Features.context.parameter.FeatureContextParameter;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModFeatureContextParameters {

    public static final FeatureContextParameter<BlockPos> ORIGIN = new FeatureContextParameter(new Identifier("deep_trenches"));

}
