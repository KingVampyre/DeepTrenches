package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerFoliagePlacerType;
import github.KingVampyre.DeepTrenches.core.world.gen.foliage.SphereFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class DTFoliagePlacerTypes {

    public static final FoliagePlacerType<SphereFoliagePlacer> SPHERE_FOLIAGE_PLACER;

    static {
        SPHERE_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(SphereFoliagePlacer.CODEC);
    }

}