package github.KingVampyre.DeepTrenches.core.event.registry;

import net.fabricmc.fabric.api.event.registry.DynamicRegistrySetupCallback;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.registry.DynamicRegistryManager;

import static github.KingVampyre.DeepTrenches.core.event.registry.RegistryJsonAddedCallback.BIOME;
import static net.minecraft.util.registry.Registry.BIOME_KEY;

public class DynamicJsonRegistryCallback implements DynamicRegistrySetupCallback {

    public static final DynamicJsonRegistryCallback INSTANCE = new DynamicJsonRegistryCallback();

    @Override
    public void onRegistrySetup(DynamicRegistryManager registryManager) {
        var biomes = registryManager.get(BIOME_KEY);

        RegistryEntryAddedCallback.event(biomes).register(BIOME);
    }

}
