package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerTrunkPlacerType;
import github.KingVampyre.DeepTrenches.core.world.gen.trunk.GreatTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class TrunkPlacerTypes {

    public static final TrunkPlacerType<GreatTrunkPlacer> GREAT_TRUNK_PLACER;

    static {
        GREAT_TRUNK_PLACER = InvokerTrunkPlacerType.create(GreatTrunkPlacer.CODEC);
    }

}