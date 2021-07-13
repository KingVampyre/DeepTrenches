package github.KingVampyre.DeepTrenches.client.event.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.texture.SpriteAtlasTexture;

import static github.KingVampyre.DeepTrenches.client.init.Textures.*;

@Environment(EnvType.CLIENT)
public class DeepTrenchesSpriteRegistry implements ClientSpriteRegistryCallback {

    public static final ClientSpriteRegistryCallback INSTANCE = new DeepTrenchesSpriteRegistry();

    @Override
    public void registerSprites(SpriteAtlasTexture atlasTexture, Registry registry) {
        registry.register(ABYSSOPELAGIC_WATER_FLOW);
        registry.register(ABYSSOPELAGIC_WATER_STILL);
        registry.register(ACID_FLOW);
        registry.register(ACID_STILL);
        registry.register(BATHYPELAGIC_WATER_FLOW);
        registry.register(BATHYPELAGIC_WATER_STILL);
        registry.register(BRINE_FLOW);
        registry.register(BRINE_STILL);
        registry.register(CLEAR_WATER_FLOW);
        registry.register(CLEAR_WATER_STILL);
        registry.register(HADOPELAGIC_WATER_FLOW);
        registry.register(HADOPELAGIC_WATER_STILL);
        registry.register(MESOPELAGIC_WATER_FLOW);
        registry.register(MESOPELAGIC_WATER_STILL);
        registry.register(STORCEAN_ABYSSOPELAGIC_WATER_FLOW);
        registry.register(STORCEAN_ABYSSOPELAGIC_WATER_STILL);
        registry.register(STORCEAN_BATHYPELAGIC_WATER_FLOW);
        registry.register(STORCEAN_BATHYPELAGIC_WATER_STILL);
        registry.register(STORCEAN_ENDERPELAGIC_WATER_FLOW);
        registry.register(STORCEAN_ENDERPELAGIC_WATER_STILL);
        registry.register(STORCEAN_GASOPELAGIC_WATER_FLOW);
        registry.register(STORCEAN_GASOPELAGIC_WATER_STILL);
        registry.register(STORCEAN_HADOPELAGIC_WATER_FLOW);
        registry.register(STORCEAN_HADOPELAGIC_WATER_STILL);
        registry.register(STORCEAN_INFINIPELAGIC_WATER_FLOW);
        registry.register(STORCEAN_INFINIPELAGIC_WATER_STILL);
        registry.register(STORCEAN_MESOPELAGIC_WATER_FLOW);
        registry.register(STORCEAN_MESOPELAGIC_WATER_STILL);
        registry.register(STORCEAN_VIRDIPELAGIC_WATER_FLOW);
        registry.register(STORCEAN_VIRDIPELAGIC_WATER_STILL);
        registry.register(STORCEAN_WATER_FLOW);
        registry.register(STORCEAN_WATER_STILL);
    }

}