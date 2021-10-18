package github.KingVampyre.DeepTrenches.client.init;

import github.KingVampyre.DeepTrenches.client.color.block.FoliageColorProvider;
import github.KingVampyre.DeepTrenches.client.color.block.MosoilColorProvider;
import github.KingVampyre.DeepTrenches.client.color.block.StorceanFoliageColorProvider;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.*;

public class DTBlockColors {

    public static void initialize() {
        ColorProviderRegistry.BLOCK.register(MosoilColorProvider.INSTANCE,
                MOSOIL, REEBLOON
        );
        ColorProviderRegistry.BLOCK.register(StorceanFoliageColorProvider.INSTANCE,
                AQUEAN_LEAVES, FRUCE_LEAVES, SANGUART_LEAVES
        );
        ColorProviderRegistry.BLOCK.register(FoliageColorProvider.INSTANCE,
                ALMOND_LEAVES, ANGELS_TRUMPET_LEAVES, BLACK_BIRCH_LEAVES,
                BLUE_MAHOE_LEAVES, BOTTLEBRUSH_LEAVES, COOK_PINE_LEAVES,
                DARK_RED_ELM_LEAVES, EBONY_LEAVES, GUAIACUM_LEAVES,
                KLINKII_PINE_LEAVES,  MELALEUCA_LEAVES, NORFOLK_PINE_LEAVES,
                PELTOGYNE_LEAVES, PLUM_LEAVES, SEQUOIA_LEAVES, WENGE_LEAVES
        );
    }

}
