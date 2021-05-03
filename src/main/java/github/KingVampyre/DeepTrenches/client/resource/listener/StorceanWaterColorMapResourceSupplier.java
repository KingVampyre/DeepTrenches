package github.KingVampyre.DeepTrenches.client.resource.listener;

import github.KingVampyre.DeepTrenches.client.init.ColorMaps;
import net.fabricmc.fabric.api.resource.SimpleResourceReloadListener;
import net.minecraft.client.util.RawTextureDataLoader;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class StorceanWaterColorMapResourceSupplier implements SimpleResourceReloadListener<int[]> {
    private static final Identifier STORCEAN_WATER_COLORMAP = new Identifier("deep_trenches:textures/colormap/storcean_water.png");

    @Override
    public CompletableFuture<int[]> load(ResourceManager resourceManager, Profiler profiler, Executor executor) {

        try {
            return CompletableFuture.completedFuture(RawTextureDataLoader.loadRawTextureData(resourceManager, STORCEAN_WATER_COLORMAP));
        } catch (IOException e) {
            throw new IllegalStateException("Failed to load Storcean water color texture", e);
        }

    }

    @Override
    public CompletableFuture<Void> apply(int[] ints, ResourceManager resourceManager, Profiler profiler, Executor executor) {
        return CompletableFuture.runAsync(() -> ColorMaps.STORCEAN_WATER.setColorMap(ints));
    }

    @Override
    public Identifier getFabricId() {
        return new Identifier("deep_trenches:storcean_water_colormap");
    }
}
