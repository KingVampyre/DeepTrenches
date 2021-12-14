package github.KingVampyre.DeepTrenches.core.init.world;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerTrunkPlacerType;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.FuchsitraTrunkPlacer;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.GreatTrunkPlacer;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import static net.minecraft.util.registry.Registry.TRUNK_PLACER_TYPE;

public class DTTrunkPlacerTypes {

    public static final TrunkPlacerType<FuchsitraTrunkPlacer> FUCHSITRA_TRUNK_PLACER;
    public static final TrunkPlacerType<GreatTrunkPlacer> GREAT_TRUNK_PLACER;

    static {
        FUCHSITRA_TRUNK_PLACER = InvokerTrunkPlacerType.create(FuchsitraTrunkPlacer.CODEC);
        GREAT_TRUNK_PLACER = InvokerTrunkPlacerType.create(GreatTrunkPlacer.CODEC);
    }

    public static void initialize() {
        Registry.register(TRUNK_PLACER_TYPE, "deep_trenches:fuchsitra_trunk_placer", FUCHSITRA_TRUNK_PLACER);
        Registry.register(TRUNK_PLACER_TYPE, "deep_trenches:great_trunk_placer", GREAT_TRUNK_PLACER);
    }

}