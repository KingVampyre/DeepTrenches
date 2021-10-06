package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerFoliagePlacerType;
import github.KingVampyre.DeepTrenches.core.world.gen.foliage.PlumFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class DTFoliagePlacerTypes {

    public static final FoliagePlacerType<PlumFoliagePlacer> PLUM_FOLIAGE_PLACER;

    static {
        PLUM_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(PlumFoliagePlacer.CODEC);
    }

}