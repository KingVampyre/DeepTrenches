package github.KingVampyre.DeepTrenches.client.event.client.callback;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.client.world.BiomeColorCache;
import net.minecraft.world.level.ColorResolver;

@Environment(EnvType.CLIENT)
@FunctionalInterface
public interface ColorCacheLoad {

    Event<ColorCacheLoad> EVENT = EventFactory.createArrayBacked(ColorCacheLoad.class, callbacks -> colorCache -> {

        for (ColorCacheLoad callback : callbacks) {
            callback.onLoad(colorCache);
        }

    });

    void onLoad(Object2ObjectArrayMap<ColorResolver, BiomeColorCache> colorCache);

}
