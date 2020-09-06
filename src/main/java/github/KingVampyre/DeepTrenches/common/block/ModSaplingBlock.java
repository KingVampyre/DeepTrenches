package github.KingVampyre.DeepTrenches.common.block;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.chunk.ChunkGenerator;

public class ModSaplingBlock extends SaplingBlock {

	protected final SaplingGenerator generator;

	public ModSaplingBlock(SaplingGenerator generator, Settings settings) {
		super(null, settings);

		this.generator = generator;
	}

	@Override
	public void generate(ServerWorld world, BlockPos pos, BlockState state, Random random) {

		if (state.get(STAGE) == 0)
			world.setBlockState(pos, state.cycle(STAGE), 4);
		else {
			ChunkGenerator chunkGenerator = world.getChunkManager().getChunkGenerator(); 
			
			this.generator.generate(world, chunkGenerator, pos, state, random);
		}
	}

	public SaplingGenerator getGenerator() {
		return this.generator;
	}

}
