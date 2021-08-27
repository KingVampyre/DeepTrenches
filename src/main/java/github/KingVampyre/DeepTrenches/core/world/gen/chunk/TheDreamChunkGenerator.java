package github.KingVampyre.DeepTrenches.core.world.gen.chunk;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import github.KingVampyre.DeepTrenches.core.world.gen.TheDreamBlockSource;
import github.KingVampyre.DeepTrenches.core.world.gen.chunk.aquifier.TheDreamAquiferSampler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.RegistryLookupCodec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.ChunkRegion;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.ProtoChunk;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.chunk.AquiferSampler;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.world.gen.chunk.NoiseChunkGenerator;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Supplier;

import static net.minecraft.util.registry.Registry.BIOME_KEY;
import static net.minecraft.world.Heightmap.Type.OCEAN_FLOOR_WG;
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

    protected BlockSource getBlockSource(Biome biome) {
        var settings = this.settings.get();

        return new TheDreamBlockSource(() -> this.getTerrainBlockState(biome), this.seed, settings);
    }

    protected BlockState getFluidBlockState(Biome biome) {
        return this.biomeRegistry.getKey(biome).map(this.fluids::get).orElse(this.defaultFluid);
    }

    protected BlockState getTerrainBlockState(Biome biome) {
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

        var mutable = new BlockPos.Mutable();

        chunkRandom.setTerrainSeed(chunkPosX, chunkPosZ);

        for(var sectionX = 0; sectionX < 16; ++sectionX) {
            for(var sectionZ = 0; sectionZ < 16; ++sectionZ) {
                var x = startX + sectionX;
                var z = startZ + sectionZ;

                var noise = this.surfaceDepthNoise.sample(x * yScale, z * yScale, yScale, sectionX * yScale) * 15.0D;
                var height = chunk.sampleHeightmap(WORLD_SURFACE_WG, sectionX, sectionZ) + 1;
                var minSurfaceLevel = this.settings.get().getMinSurfaceLevel();

                var biome = region.getBiome(mutable.set(x, height, z));

                var defaultBlock = this.getTerrainBlockState(biome);
                var defaultFluid = this.getFluidBlockState(biome);

                biome.buildSurface(chunkRandom, chunk, x, z, height, noise, defaultBlock, defaultFluid, this.getSeaLevel(), minSurfaceLevel, region.getSeed());
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
    public Chunk populateNoise(StructureAccessor accessor, Chunk chunk, int startY, int noiseSizeY) {
        var oceanFloor = chunk.getHeightmap(OCEAN_FLOOR_WG);
        var worldSurface = chunk.getHeightmap(WORLD_SURFACE_WG);

        var chunkPos = chunk.getPos();
        var startX = chunkPos.getStartX();
        var startZ = chunkPos.getStartZ();

        var structureWeightSampler = new StructureWeightSampler(accessor, chunk);
        var noiseInterpolator = new NoiseInterpolator(this.noiseSizeX, noiseSizeY, this.noiseSizeZ, chunkPos, startY, this::sampleNoiseColumn);

        var interpolators = Lists.newArrayList(noiseInterpolator);
        var aquiferSampler = this.createBlockSampler(startY, noiseSizeY, chunkPos);
        var weightSamplerFactory = this.createWeightSamplerFactory(startY, chunkPos, interpolators::add);

        interpolators.forEach(NoiseInterpolator::sampleStartNoise);

        var mutable = new BlockPos.Mutable();

        for(var noiseX = 0; noiseX < this.noiseSizeX; ++noiseX) {

            for(var interpolator : interpolators)
                interpolator.sampleEndNoise(noiseX);

            for(var noiseZ = 0; noiseZ < this.noiseSizeZ; ++noiseZ) {
                ChunkSection chunkSection = chunk.getSection(chunk.countVerticalSections() - 1);

                for(var noiseY = noiseSizeY - 1; noiseY >= 0; --noiseY) {

                    for(var interpolator : interpolators)
                        interpolator.sampleNoiseCorners(noiseY, noiseZ);

                    for(var sectionY = this.verticalNoiseResolution - 1; sectionY >= 0; --sectionY) {
                        var posY = (startY + noiseY) * this.verticalNoiseResolution + sectionY;
                        var y = posY & 15;

                        var sectionIndex = chunk.getSectionIndex(posY);

                        if (chunk.getSectionIndex(chunkSection.getYOffset()) != sectionIndex)
                            chunkSection = chunk.getSection(sectionIndex);

                        var deltaY = (double) sectionY / (double) this.verticalNoiseResolution;

                        for(var interpolator : interpolators)
                            interpolator.sampleNoiseY(deltaY);

                        for(var sectionX = 0; sectionX < this.horizontalNoiseResolution; ++sectionX) {
                            var posX = startX + noiseX * this.horizontalNoiseResolution + sectionX;
                            var x = posX & 15;
                            var deltaX = (double) sectionX / (double) this.horizontalNoiseResolution;

                            for(var interpolator : interpolators)
                                interpolator.sampleNoiseX(deltaX);

                            for(var sectionZ = 0; sectionZ < this.horizontalNoiseResolution; ++sectionZ) {
                                var posZ = startZ + noiseZ * this.horizontalNoiseResolution + sectionZ;
                                var z = posZ & 15;
                                var deltaZ = (double) sectionZ / (double) this.horizontalNoiseResolution;
                                var weight = noiseInterpolator.sampleNoise(deltaZ);

                                var biome = accessor.world.getBiome(mutable.set(posX, posY, posZ));
                                var blockFactory = this.createTerrainFactory(startY, biome, chunkPos, interpolators::add);
                                var state = this.getBlockState(structureWeightSampler, aquiferSampler, blockFactory.apply(deltaZ), weightSamplerFactory.apply(deltaZ), posX, posY, posZ, weight);

                                if (state != Blocks.AIR.getDefaultState()) {

                                    if (state.getLuminance() != 0 && chunk instanceof ProtoChunk proto)
                                        proto.addLightSource(mutable);

                                    chunkSection.setBlockState(x, y, z, state, false);
                                    oceanFloor.trackUpdate(x, posY, z, state);
                                    worldSurface.trackUpdate(x, posY, z, state);

                                    if (aquiferSampler.needsFluidTick() && !state.getFluidState().isEmpty()) {
                                        mutable.set(posX, posY, posZ);
                                        chunk.getFluidTickScheduler().schedule(mutable, state.getFluidState().getFluid(), 0);
                                    }

                                }

                            }

                        }

                    }

                }

            }

            interpolators.forEach(NoiseInterpolator::swapBuffers);
        }

        return chunk;
    }

    protected DoubleFunction<BlockSource> createTerrainFactory(int minY, Biome biome, ChunkPos pos, Consumer<NoiseInterpolator> consumer) {
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