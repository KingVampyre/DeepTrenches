package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerTrunkPlacerType;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.FuchsitraTrunkPlacer;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.GreatTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class DTTrunkPlacerTypes {

    public static final TrunkPlacerType<FuchsitraTrunkPlacer> FUCHSITRA_TRUNK_PLACER;
    public static final TrunkPlacerType<GreatTrunkPlacer> GREAT_TRUNK_PLACER;

    static {
        FUCHSITRA_TRUNK_PLACER = InvokerTrunkPlacerType.create(FuchsitraTrunkPlacer.CODEC);
        GREAT_TRUNK_PLACER = InvokerTrunkPlacerType.create(GreatTrunkPlacer.CODEC);
    }

}