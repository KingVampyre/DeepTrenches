package github.KingVampyre.DeepTrenches.core.world.gen.chunk;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.world.gen.TheDreamBlockSource;
import github.KingVampyre.DeepTrenches.core.world.gen.chunk.aquifier.TheDreamAquiferSampler;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.RegistryLookupCodec;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.ChunkRegion;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.BlockSource;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.NoiseInterpolator;
import net.minecraft.world.gen.chunk.AquiferSampler;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.world.gen.chunk.NoiseChunkGenerator;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Supplier;

import static net.minecraft.util.registry.Registry.BIOME_KEY;
import static net.minecraft.world.Heightmap.Type.WORLD_SURFACE_WG;
import static net.minecraft.world.gen.chunk.ChunkGeneratorSettings.REGISTRY_CODEC;

public class TheDreamChunkGenerator extends NoiseChunkGenerator {

    public static final Codec<TheDreamChunkGenerator> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    RegistryLookupCodec.of(BIOME_KEY).forGetter(generator -> generator.biomeRegistry),
                    Codec.unboundedMap(
                            Identifier.CODEC.xmap(RegistryKey.createKeyFactory(BIOME_KEY), RegistryKey::getValue),
                            BlockState.CODEC)
                            .fieldOf("terrain")
                            .forGetter(generator -> generator.terrain),
                    Codec.unboundedMap(
                            Identifier.CODEC.xmap(RegistryKey.createKeyFactory(BIOME_KEY), RegistryKey::getValue),
                            BlockState.CODEC)
                            .fieldOf("fluids")
                            .forGetter(generator -> generator.fluids),
                    BiomeSource.CODEC.fieldOf("biome_source").forGetter(generator -> generator.populationSource),
                    Codec.LONG.fieldOf("seed").stable().forGetter(generator -> generator.seed),
                    REGISTRY_CODEC.fieldOf("settings").forGetter(generator -> generator.settings)
            ).apply(instance, instance.stable(TheDreamChunkGenerator::new)));

    protected final Registry<Biome> biomeRegistry;
    protected final Map<RegistryKey<Biome>, BlockState> fluids;
    protected final Map<RegistryKey<Biome>, BlockState> terrain;

    public TheDreamChunkGenerator(Registry<Biome> biomeRegistry, Map<RegistryKey<Biome>, BlockState> terrain, Map<RegistryKey<Biome>, BlockState> fluids, BiomeSource biomeSource, long seed, Supplier<ChunkGeneratorSettings> settings) {
        super(biomeSource, seed, settings);

        this.biomeRegistry = biomeRegistry;
        this.fluids = fluids;
        this.terrain = terrain;
    }

    public BlockSource getBlockSource(Biome biome) {
        var settings = this.settings.get();

        return new TheDreamBlockSource(() -> this.getTerrainBlockState(biome), this.seed, settings);
    }

    public BlockState getFluidBlockState(Biome biome) {
        return this.biomeRegistry.getKey(biome).map(this.fluids::get).orElse(this.defaultFluid);
    }

    public BlockState getTerrainBlockState(Biome biome) {
        return this.biomeRegistry.getKey(biome).map(this.terrain::get).orElse(this.defaultBlock);
    }

    @Override
    public void buildSurface(ChunkRegion region, Chunk chunk) {
        var chunkRandom = new ChunkRandom();
        var chunkPos = chunk.getPos();
        var startX = chunkPos.getStartX();
        var startZ = chunkPos.getStartZ();
        var chunkPosX = chunkPos.x;
        var chunkPosZ = chunkPos.z;
        var yScale = 0.0625D;

        chunkRandom.setTerrainSeed(chunkPosX, chunkPosZ);

        for(var sectionX = 0; sectionX < 16; ++sectionX) {
            for(var sectionZ = 0; sectionZ < 16; ++sectionZ) {
                var x = startX + sectionX;
                var z = startZ + sectionZ;

                var noise = this.surfaceDepthNoise.sample(x * yScale, z * yScale, yScale, sectionX * yScale) * 15.0D;
                var height = chunk.sampleHeightmap(WORLD_SURFACE_WG, sectionX, sectionZ) + 1;
                var minSurfaceLevel = this.settings.get().getMinSurfaceLevel();
                var biome = this.populationSource.getBiomeForNoiseGen(chunkPos);
                var defaultState = this.getTerrainBlockState(biome);
                var defaultFluid = this.getFluidBlockState(biome);

                biome.buildSurface(chunkRandom, chunk, x, z, height, noise, defaultState, defaultFluid, this.getSeaLevel(), minSurfaceLevel, region.getSeed());
            }

        }

        this.buildBedrock(chunk, chunkRandom);
    }

    @Override
    public AquiferSampler createBlockSampler(int startY, int deltaY, ChunkPos pos) {
        var biome = this.populationSource.getBiomeForNoiseGen(pos);
        var fluid = this.getFluidBlockState(biome);

        if(!this.hasAquifers())
            return AquiferSampler.seaLevel(this.getSeaLevel(), fluid);

        return TheDreamAquiferSampler.aquifer(this, this.settings.get(), fluid, pos, startY * this.verticalNoiseResolution, deltaY * this.verticalNoiseResolution);
    }

    @Override
    public DoubleFunction<BlockSource> createBlockSourceFactory(int minY, ChunkPos pos, Consumer<NoiseInterpolator> consumer) {
        var biome = this.populationSource.getBiomeForNoiseGen(pos);
        var source = this.getBlockSource(biome);

        if (!this.settings.get().hasOreVeins())
            return deltaZ -> source;

        var oreVeinSource = new NoiseChunkGenerator.OreVeinSource(pos, minY, this.seed + 1L);

        oreVeinSource.feed(consumer);

        return deltaZ -> {
            oreVeinSource.setDeltaZ(deltaZ);

            return (x, y, z) -> {
                var oreVein = oreVeinSource.sample(x, y, z);
                var state = source.sample(x, y, z);

                return oreVein != state ? oreVein : source.sample(x, y, z);
            };
        };
    }

    @Override
    public ChunkGenerator withSeed(long seed) {
        return new TheDreamChunkGenerator(this.biomeRegistry, this.terrain, this.fluids, this.populationSource.withSeed(seed), seed, this.settings);
    }

    @Override
    protected Codec<? extends ChunkGenerator> getCodec() {
        return CODEC;
    }

}