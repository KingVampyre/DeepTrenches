package github.KingVampyre.DeepTrenches.client.init;

import com.google.common.collect.ImmutableMap;
import github.KingVampyre.DeepTrenches.core.init.ChunkGeneratorSettingsKeys;
import github.KingVampyre.DeepTrenches.core.world.gen.chunk.TheDreamChunkGenerator;
import net.minecraft.client.world.GeneratorType;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.VanillaLayeredBiomeSource;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;

import static github.KingVampyre.DeepTrenches.core.init.Biomes.*;
import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.CLEAR_WATER;
import static net.minecraft.block.Blocks.COBBLESTONE;
import static net.minecraft.block.Blocks.DIORITE;

public class GeneratorTypes {

    public static final GeneratorType THE_DREAM = new GeneratorType("deep_trenches.the_dream") {

        @Override
        protected ChunkGenerator getChunkGenerator(Registry<Biome> biomeRegistry, Registry<ChunkGeneratorSettings> registry, long seed) {
            var biomeSource = new VanillaLayeredBiomeSource(seed, false, false, biomeRegistry);
            var terrainSources = ImmutableMap.of(
                    ALMOND_FOREST_KEY, DIORITE.getDefaultState(),
                    ALMOND_PLUS_FOREST_KEY, DIORITE.getDefaultState(),
                    BLACK_BIRCH_FOREST_KEY, COBBLESTONE.getDefaultState()
            );

            var fluids = ImmutableMap.of(
                    ALMOND_FOREST_KEY, CLEAR_WATER.getDefaultState(),
                    ALMOND_PLUS_FOREST_KEY, CLEAR_WATER.getDefaultState()
            );

            return new TheDreamChunkGenerator(biomeRegistry, terrainSources, fluids, biomeSource, seed, () -> registry.getOrThrow(ChunkGeneratorSettingsKeys.THE_DREAM_KEY));
        }

    };

}