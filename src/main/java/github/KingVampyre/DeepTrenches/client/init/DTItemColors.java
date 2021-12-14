package github.KingVampyre.DeepTrenches.client.init;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

import static github.KingVampyre.DeepTrenches.client.init.DTColorMaps.STORCEAN_FOLIAGE;
import static github.KingVampyre.DeepTrenches.client.init.DTColorMaps.STORCEAN_MOSOIL;
import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.*;

public class DTItemColors {

    public static void initialize() {
        ColorProviderRegistry.ITEM.register(STORCEAN_MOSOIL,
                REEBLOON, MOSOIL
        );
        ColorProviderRegistry.ITEM.register(STORCEAN_FOLIAGE,
                AQUEAN_LEAVES, FRUCE_LEAVES, SANGUART_LEAVES
        );
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 5614908,
                ALMOND_LEAVES, ANGELS_TRUMPET_LEAVES, BLACK_BIRCH_LEAVES,
                BLUE_MAHOE_LEAVES, BOTTLEBRUSH_LEAVES, COOK_PINE_LEAVES,
                DARK_RED_ELM_LEAVES, EBONY_LEAVES, GUAIACUM_LEAVES,
                KLINKII_PINE_LEAVES,  MELALEUCA_LEAVES, NORFOLK_PINE_LEAVES,
                PELTOGYNE_LEAVES, PLUM_LEAVES, SEQUOIA_LEAVES, WENGE_LEAVES
        );
    }

}
