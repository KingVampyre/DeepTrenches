package github.KingVampyre.DeepTrenches.common.block.sapling;

import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;

public interface FeaturesSaplingGenerator {

    ConfiguredFeature<?, ?> createTreeFeature(Random random, boolean sapling);

    default boolean generate(ServerWorld server, ChunkGenerator chunkGenerator, BlockPos blockPos, BlockState blockState, Random random, boolean sapling) {
        ConfiguredFeature<?, ?> configuredFeature = this.createTreeFeature(random, sapling);

        if (configuredFeature == null)
            return false;

        if (configuredFeature.generate(server, chunkGenerator, random, blockPos))
            return true;

        return !server.setBlockState(blockPos, blockState, 4);
    }

}
