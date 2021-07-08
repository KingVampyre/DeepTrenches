package github.KingVampyre.DeepTrenches.core.world.gen.chunk;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.world.gen.TheDreamBlockSource;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import net.minecraft.block.BlockState;
import net.minecraft.util.dynamic.RegistryLookupCodec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.ChunkRegion;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.BlockSource;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.NoiseInterpolator;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.world.gen.chunk.NoiseChunkGenerator;

import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Supplier;

import static github.KingVampyre.DeepTrenches.core.init.Biomes.*;
import static net.minecraft.block.Blocks.COBBLESTONE;
import static net.minecraft.block.Blocks.DIORITE;
import static net.minecraft.world.Heightmap.Type.WORLD_SURFACE_WG;
import static net.minecraft.world.biome.source.VoronoiBiomeAccessType.INSTANCE;
import static net.minecraft.world.gen.chunk.ChunkGeneratorSettings.REGISTRY_CODEC;

public class TheDreamChunkGenerator extends NoiseChunkGenerator {

    public static final Codec<TheDreamChunkGenerator> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    RegistryLookupCodec.of(Registry.BIOME_KEY).forGetter(generator -> generator.biomeRegistry),
                    BiomeSource.CODEC.fieldOf("biome_source").forGetter(generator -> generator.populationSource),
                    Codec.LONG.fieldOf("seed").stable().forGetter(generator -> generator.seed),
                    REGISTRY_CODEC.fieldOf("settings").forGetter(generator -> generator.settings)
            ).apply(instance, instance.stable(TheDreamChunkGenerator::new)));

    protected final Long2ReferenceOpenHashMap<Biome> cachedBiomes = new Long2ReferenceOpenHashMap<>();
    protected final Registry<Biome> biomeRegistry;

    public TheDreamChunkGenerator(Registry<Biome> biomeRegistry, BiomeSource biomeSource, long seed, Supplier<ChunkGeneratorSettings> settings) {
        super(biomeSource, seed, settings);

        this.biomeRegistry = biomeRegistry;
    }

    public BlockSource getBlockSource(Biome biome) {
        var settings = this.settings.get();

        return new TheDreamBlockSource(() -> this.getTerrainBlockState(biome), this.seed, settings);
    }

    public Biome getCachedBiome(int x, int y, int z) {
        var pos = new BlockPos(x, y ,z);

        if(cachedBiomes.size() > 200)
            cachedBiomes.clear();

        var ref = pos.asLong();
        var biome = cachedBiomes.get(ref);

        if(biome == null) {
            biome = INSTANCE.getBiome(this.seed, x, y, z, this.populationSource);

            cachedBiomes.put(ref, biome);
        }

        return biome;
    }

    public BlockState getTerrainBlockState(Biome biome) {
        return this.biomeRegistry.getKey(biome).map(key -> {

            if(key == ALMOND_FOREST_KEY || key == ALMOND_PLUS_FOREST_KEY)
                return DIORITE.getDefaultState();
            else if(key == BLACK_BIRCH_FOREST_KEY)
                return COBBLESTONE.getDefaultState();

            return null;
        }).orElse(this.defaultBlock);
    }

    @Override
    public void buildSurface(ChunkRegion region, Chunk chunk) {
        var chunkPos = chunk.getPos();
        var startX = chunkPos.getStartX();
        var startZ = chunkPos.getStartZ();
        var chunkPosX = chunkPos.x;
        var chunkPosZ = chunkPos.z;

        var chunkRandom = new ChunkRandom();
        var mutable = new BlockPos.Mutable();

        chunkRandom.setTerrainSeed(chunkPosX, chunkPosZ);

        var yScale = 0.0625D;

        for(var sectionX = 0; sectionX < 16; ++sectionX) {
            for(var sectionZ = 0; sectionZ < 16; ++sectionZ) {
                var x = startX + sectionX;
                var z = startZ + sectionZ;

                var noise = this.surfaceDepthNoise.sample(x * yScale, z * yScale, yScale, sectionX * yScale) * 15.0D;
                var height = chunk.sampleHeightmap(WORLD_SURFACE_WG, sectionX, sectionZ) + 1;
                var minSurfaceLevel = this.settings.get().getMinSurfaceLevel();

                var biome = region.getBiome(mutable.set(startX + sectionX, height, startZ + sectionZ));
                var state = this.getTerrainBlockState(biome);

                biome.buildSurface(chunkRandom, chunk, x, z, height, noise, state, this.defaultFluid, this.getSeaLevel(), minSurfaceLevel, region.getSeed());
            }
        }

        this.buildBedrock(chunk, chunkRandom);
    }

    @Override
    public DoubleFunction<BlockSource> createBlockSourceFactory(int minY, ChunkPos pos, Consumer<NoiseInterpolator> consumer) {

        if (!this.settings.get().hasOreVeins())
            return d -> (x, y, z) -> {
                var biome = this.getCachedBiome(x, 0, z);
                var terrain = this.getBlockSource(biome);

                return terrain.sample(x, y, z);
            };

        var oreVeinSource = new NoiseChunkGenerator.OreVeinSource(pos, minY, this.seed + 1L);

        oreVeinSource.feed(consumer);

        return (deltaZ) -> {
            oreVeinSource.setDeltaZ(deltaZ);

            return (x, y, z) -> {
                var biome = this.getCachedBiome(x, 0,z);
                var oreVein = oreVeinSource.sample(x, y, z);
                var terrain = this.getBlockSource(biome);

                return oreVein != this.defaultBlock ? oreVein : terrain.sample(x, y, z);
            };
        };
    }

    @Override
    public ChunkGenerator withSeed(long seed) {
        return new TheDreamChunkGenerator(this.biomeRegistry, this.populationSource.withSeed(seed), seed, this.settings);
    }

    @Override
    protected Codec<? extends ChunkGenerator> getCodec() {
        return CODEC;
    }

}