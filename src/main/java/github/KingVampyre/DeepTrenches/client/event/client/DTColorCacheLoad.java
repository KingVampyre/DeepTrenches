package github.KingVampyre.DeepTrenches.client.event.client;

import github.Louwind.Reload.client.event.client.callback.ColorCacheLoad;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.client.world.BiomeColorCache;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.world.level.ColorResolver;

import static github.KingVampyre.DeepTrenches.client.init.DTColorMaps.*;

public class DTColorCacheLoad implements ColorCacheLoad {

    public static final ColorCacheLoad INSTANCE = new DTColorCacheLoad();

    @Override
    public void onLoad(ClientWorld world, Object2ObjectArrayMap<ColorResolver, BiomeColorCache> colorCache) {
        colorCache.put(CLEAR_WATER, new BiomeColorCache(pos -> world.calculateColor(pos, CLEAR_WATER)));
        colorCache.put(STORCEAN_ABYSSOPELAGIC_WATER, new BiomeColorCache(pos -> world.calculateColor(pos, STORCEAN_ABYSSOPELAGIC_WATER)));
        colorCache.put(STORCEAN_ENDERPELAGIC_WATER, new BiomeColorCache(pos -> world.calculateColor(pos, STORCEAN_ENDERPELAGIC_WATER)));
        colorCache.put(STORCEAN_GASOPELAGIC_WATER, new BiomeColorCache(pos -> world.calculateColor(pos, STORCEAN_GASOPELAGIC_WATER)));
        colorCache.put(STORCEAN_HADOPELAGIC_WATER, new BiomeColorCache(pos -> world.calculateColor(pos, STORCEAN_HADOPELAGIC_WATER)));
        colorCache.put(STORCEAN_INFINIPELAGIC_WATER, new BiomeColorCache(pos -> world.calculateColor(pos, STORCEAN_INFINIPELAGIC_WATER)));
        colorCache.put(STORCEAN_VIRDIPELAGIC_WATER, new BiomeColorCache(pos -> world.calculateColor(pos, STORCEAN_VIRDIPELAGIC_WATER)));
        colorCache.put(STORCEAN_WATER, new BiomeColorCache(pos -> world.calculateColor(pos, STORCEAN_WATER)));
        colorCache.put(STORCEAN_FOLIAGE, new BiomeColorCache(pos -> world.calculateColor(pos, STORCEAN_FOLIAGE)));
        colorCache.put(STORCEAN_MOSOIL, new BiomeColorCache(pos -> world.calculateColor(pos, STORCEAN_MOSOIL)));
    }

}