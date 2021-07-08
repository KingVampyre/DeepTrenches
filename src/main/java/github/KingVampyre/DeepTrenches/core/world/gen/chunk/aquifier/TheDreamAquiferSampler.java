package github.KingVampyre.DeepTrenches.core.world.gen.chunk.aquifier;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.NoiseColumnSampler;
import net.minecraft.world.gen.chunk.AquiferSampler;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.world.gen.chunk.NoiseChunkGenerator;

public class TheDreamAquiferSampler extends AquiferSampler.Impl {

    public static AquiferSampler aquifer(NoiseChunkGenerator chunkGenerator, ChunkGeneratorSettings settings, BlockState fluidState, ChunkPos pos, int startY, int deltaY) {
        return new TheDreamAquiferSampler(pos, fluidState, chunkGenerator.edgeDensityNoise, chunkGenerator.fluidLevelNoise, chunkGenerator.fluidTypeNoise, settings, chunkGenerator.noiseColumnSampler, startY, deltaY);
    }

    protected final BlockState fluidState;

    protected TheDreamAquiferSampler(ChunkPos pos, BlockState fluidState, DoublePerlinNoiseSampler edgeDensityNoise, DoublePerlinNoiseSampler fluidLevelNoise, DoublePerlinNoiseSampler fluidTypeNoise, ChunkGeneratorSettings settings, NoiseColumnSampler columnSampler, int startY, int deltaY) {
        super(pos, edgeDensityNoise, fluidLevelNoise, fluidTypeNoise, settings, columnSampler, startY, deltaY);

        this.fluidState = fluidState;
    }

    @Override
    public AquiferSampler.Impl.FluidLevel getFluidLevel(int x, int y, int z) {
        var seaLevel = this.settings.getSeaLevel();

        if (y > 30)
            return new AquiferSampler.Impl.FluidLevel(seaLevel, this.fluidState);

        var floorX = Math.floorDiv(x, 64);
        var floorY = Math.floorDiv(y, 40) / 1.4D;
        var floorZ = Math.floorDiv(z, 64);

        var d = this.fluidLevelNoise.sample(floorX, floorY, floorZ) * 30.0D + -10.0D;

        if (Math.abs(d) > 8.0D)
            d *= 4.0D;

        var m = Math.floorDiv(y, 40) * 40 + 20;
        var n = m + MathHelper.floor(d);

        var bl = false;

        if (m == -20) {
            var e = this.fluidTypeNoise.sample(floorX, floorY, floorZ);
            bl = Math.abs(e) > 0.2199999988079071D;
        }

        return new AquiferSampler.Impl.FluidLevel(Math.min(56, n), bl ? Blocks.LAVA.getDefaultState() : this.fluidState);
    }

}