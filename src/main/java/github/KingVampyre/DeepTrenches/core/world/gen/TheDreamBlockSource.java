package github.KingVampyre.DeepTrenches.core.world.gen;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.gen.BlockSource;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;

import java.util.function.Supplier;

import static net.minecraft.block.Blocks.DEEPSLATE;

public class TheDreamBlockSource implements BlockSource {

    protected final ChunkRandom random;
    protected final long seed;
    protected final Supplier<BlockState> blockState;
    protected final ChunkGeneratorSettings settings;

    public TheDreamBlockSource(Supplier<BlockState> blockState, long seed, ChunkGeneratorSettings settings) {
        this.random = new ChunkRandom(seed);
        this.blockState = blockState;
        this.settings = settings;
        this.seed = seed;
    }

    @Override
    public BlockState sample(int x, int y, int z) {
        var deepslateState = DEEPSLATE.getDefaultState();
        var defaultBlock = this.blockState.get();

        if (!this.settings.hasDeepslate())
            return defaultBlock;
        else if (y < -8)
            return deepslateState;
        else if (y > 0)
            return defaultBlock;

        this.random.setGrimstoneSeed(this.seed, x, y, z);

        return (double) this.random.nextFloat() < MathHelper.lerpFromProgress(y, -8, 0, 1, 0) ? deepslateState : defaultBlock;
    }

}