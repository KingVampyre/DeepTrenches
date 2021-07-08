package github.KingVampyre.DeepTrenches.client.init;

import github.KingVampyre.DeepTrenches.core.init.ChunkGeneratorSettingsKeys;
import github.KingVampyre.DeepTrenches.core.world.gen.chunk.TheDreamChunkGenerator;
import net.minecraft.client.world.GeneratorType;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.VanillaLayeredBiomeSource;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;

public class GeneratorTypes {

    public static final GeneratorType THE_DREAM = new GeneratorType("deep_trenches.the_dream") {

        @Override
        protected ChunkGenerator getChunkGenerator(Registry<Biome> biomeRegistry, Registry<ChunkGeneratorSettings> registry, long seed) {
            var biomeSource = new VanillaLayeredBiomeSource(seed, false, false, biomeRegistry);

            return new TheDreamChunkGenerator(biomeRegistry, biomeSource, seed, () -> registry.getOrThrow(ChunkGeneratorSettingsKeys.THE_DREAM_KEY));
        }

    };

}