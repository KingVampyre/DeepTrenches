package github.KingVampyre.DeepTrenches.client.event.client;

import github.KingVampyre.DeepTrenches.client.event.client.callback.ColorCacheLoad;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.client.world.BiomeColorCache;
import net.minecraft.world.level.ColorResolver;

import static github.KingVampyre.DeepTrenches.client.init.ColorMaps.*;

public class DeepTrenchesColorCacheLoad implements ColorCacheLoad {

    public static final ColorCacheLoad INSTANCE = new DeepTrenchesColorCacheLoad();

    @Override
    public void onLoad(Object2ObjectArrayMap<ColorResolver, BiomeColorCache> colorCache) {
        colorCache.put(CLEAR_WATER, new BiomeColorCache());
        colorCache.put(STORCEAN_ABYSSOPELAGIC_WATER, new BiomeColorCache());
        colorCache.put(STORCEAN_ENDERPELAGIC_WATER, new BiomeColorCache());
        colorCache.put(STORCEAN_GASOPELAGIC_WATER, new BiomeColorCache());
        colorCache.put(STORCEAN_HADOPELAGIC_WATER, new BiomeColorCache());
        colorCache.put(STORCEAN_INFINIPELAGIC_WATER, new BiomeColorCache());
        colorCache.put(STORCEAN_VIRDIPELAGIC_WATER, new BiomeColorCache());
        colorCache.put(STORCEAN_WATER, new BiomeColorCache());
        colorCache.put(STORCEAN_FOLIAGE, new BiomeColorCache());
        colorCache.put(STORCEAN_MOSOIL, new BiomeColorCache());
    }

}