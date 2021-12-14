package github.KingVampyre.DeepTrenches.core.init;

import static github.KingVampyre.DeepTrenches.core.init.tag.DTItemTags.*;
import static net.fabricmc.fabric.api.registry.FuelRegistry.INSTANCE;

public class DTFuelRegistry {

    public static void initialize() {
        INSTANCE.add(WOODEN_AXES, 200);
        INSTANCE.add(WOODEN_HOES, 200);
        INSTANCE.add(WOODEN_PICKAXES, 200);
        INSTANCE.add(WOODEN_SHOVELS, 200);
        INSTANCE.add(WOODEN_STICKS, 100);
        INSTANCE.add(WOODEN_SWORDS, 200);
    }

}
