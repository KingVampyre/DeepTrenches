package github.KingVampyre.DeepTrenches.core.event.registry;

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

import static github.KingVampyre.DeepTrenches.core.DeepTrenches.MOD_ID;

public record RegistryJsonAddedCallback<T>(
        Registry<T> registry) implements RegistryEntryAddedCallback<T> {

    public static final RegistryJsonAddedCallback<Biome> BIOME = new RegistryJsonAddedCallback<>(BuiltinRegistries.BIOME);

    @Override
    public void onEntryAdded(int rawId, Identifier id, T object) {

        if (id.getNamespace().equals(MOD_ID)) {
            if (this.registry.containsId(id))
                BuiltinRegistries.set(this.registry, rawId, RegistryKey.of(this.registry.getKey(), id), object);
            else
                BuiltinRegistries.add(this.registry, id, object);
        }

    }

}
