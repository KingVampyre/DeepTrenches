package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerFoliagePlacerType;
import github.KingVampyre.DeepTrenches.core.world.gen.foliage.AqueanFoliagePlacer;
import github.KingVampyre.DeepTrenches.core.world.gen.foliage.FancyAqueanFoliagePlacer;
import github.KingVampyre.DeepTrenches.core.world.gen.foliage.GreatAqueanFoliagePlacer;
import github.KingVampyre.DeepTrenches.core.world.gen.foliage.PlumFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class DTFoliagePlacerTypes {

    public static final FoliagePlacerType<AqueanFoliagePlacer> AQUEAN_FOLIAGE_PLACER;
    public static final FoliagePlacerType<FancyAqueanFoliagePlacer> FANCY_AQUEAN_FOLIAGE_PLACER;
    public static final FoliagePlacerType<GreatAqueanFoliagePlacer> GREAT_AQUEAN_FOLIAGE_PLACER;
    public static final FoliagePlacerType<PlumFoliagePlacer> PLUM_FOLIAGE_PLACER;

    static {
        AQUEAN_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(AqueanFoliagePlacer.CODEC);
        FANCY_AQUEAN_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(FancyAqueanFoliagePlacer.CODEC);
        GREAT_AQUEAN_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(GreatAqueanFoliagePlacer.CODEC);
        PLUM_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(PlumFoliagePlacer.CODEC);
    }

}