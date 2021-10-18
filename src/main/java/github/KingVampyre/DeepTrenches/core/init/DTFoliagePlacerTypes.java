package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerFoliagePlacerType;
import github.KingVampyre.DeepTrenches.core.world.gen.foliage.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import static net.minecraft.util.registry.Registry.FOLIAGE_PLACER_TYPE;

public class DTFoliagePlacerTypes {

    public static final FoliagePlacerType<AqueanFoliagePlacer> AQUEAN_FOLIAGE_PLACER;
    public static final FoliagePlacerType<FancyAqueanFoliagePlacer> FANCY_AQUEAN_FOLIAGE_PLACER;
    public static final FoliagePlacerType<GreatAqueanFoliagePlacer> GREAT_AQUEAN_FOLIAGE_PLACER;

    public static final FoliagePlacerType<FuchsitraFoliagePlacer> FUCHSITRA_FOLIAGE_PLACER;
    public static final FoliagePlacerType<PlumFoliagePlacer> PLUM_FOLIAGE_PLACER;

    static {
        AQUEAN_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(AqueanFoliagePlacer.CODEC);
        FANCY_AQUEAN_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(FancyAqueanFoliagePlacer.CODEC);
        GREAT_AQUEAN_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(GreatAqueanFoliagePlacer.CODEC);

        FUCHSITRA_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(FuchsitraFoliagePlacer.CODEC);
        PLUM_FOLIAGE_PLACER = InvokerFoliagePlacerType.create(PlumFoliagePlacer.CODEC);
    }

    public static void initialize() {
        Registry.register(FOLIAGE_PLACER_TYPE, "deep_trenches:aquean_foliage_placer", AQUEAN_FOLIAGE_PLACER);
        Registry.register(FOLIAGE_PLACER_TYPE, "deep_trenches:fancy_aquean_foliage_placer", FANCY_AQUEAN_FOLIAGE_PLACER);
        Registry.register(FOLIAGE_PLACER_TYPE, "deep_trenches:great_aquean_foliage_placer", GREAT_AQUEAN_FOLIAGE_PLACER);

        Registry.register(FOLIAGE_PLACER_TYPE, "deep_trenches:fuchsitra_foliage_placer", FUCHSITRA_FOLIAGE_PLACER);
        Registry.register(FOLIAGE_PLACER_TYPE, "deep_trenches:plum_foliage_placer", PLUM_FOLIAGE_PLACER);
    }

}