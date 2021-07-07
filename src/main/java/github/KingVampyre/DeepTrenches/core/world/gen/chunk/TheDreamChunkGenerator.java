package github.KingVampyre.DeepTrenches.core.world.gen.chunk;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.world.gen.chunk.NoiseChunkGenerator;

import java.util.function.Supplier;

import static net.minecraft.world.gen.chunk.ChunkGeneratorSettings.REGISTRY_CODEC;

public class TheDreamChunkGenerator extends NoiseChunkGenerator {

    public static final Codec<TheDreamChunkGenerator> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    BiomeSource.CODEC.fieldOf("biome_source").forGetter(generator -> generator.populationSource),
                    Codec.LONG.fieldOf("seed").stable().forGetter(generator -> generator.seed),
                    REGISTRY_CODEC.fieldOf("settings").forGetter(generator -> generator.settings)
            ).apply(instance, instance.stable(TheDreamChunkGenerator::new)));

    public TheDreamChunkGenerator(BiomeSource biomeSource, long seed, Supplier<ChunkGeneratorSettings> settings) {
        super(biomeSource, seed, settings);
    }

    @Override
    public ChunkGenerator withSeed(long seed) {
        return new TheDreamChunkGenerator(this.populationSource.withSeed(seed), seed, this.settings);
    }

    @Override
    protected Codec<? extends ChunkGenerator> getCodec() {
        return CODEC;
    }

}