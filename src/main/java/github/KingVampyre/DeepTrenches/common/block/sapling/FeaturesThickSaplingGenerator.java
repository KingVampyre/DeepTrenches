package github.KingVampyre.DeepTrenches.common.block.sapling;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;
import java.util.Set;

public interface FeaturesThickSaplingGenerator extends FeaturesSaplingGenerator {

    ConfiguredFeature<?, ?> createThickTreeFeature(Random random, boolean sapling);

    @Override
    default boolean generate(ServerWorld server, ChunkGenerator chunkGenerator, BlockPos blockPos, BlockState blockState, Random random, boolean sapling) {
        Block block = this.getSaplingBlock();

        Set<BlockPos> root = FeaturesThickSaplingGenerator.getSaplings(server, block, blockPos);
        ConfiguredFeature<?, ?> thickTree = this.createThickTreeFeature(random, sapling);
        ConfiguredFeature<?, ?> tree = this.createTreeFeature(random, sapling);

        if (thickTree != null && this.canPlaceThickTree(server, root))
            return thickTree.generate(server, chunkGenerator, random, blockPos);

        else if (tree != null && server.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 4))
            return tree.generate(server, chunkGenerator, random, blockPos);

        return false;
    }

    default boolean canPlaceThickTree(ServerWorld worldIn, Set<BlockPos> root) {
        Block sapling = this.getSaplingBlock();

        if (root.size() > 1)
            return root.stream().map(worldIn::getBlockState).map(BlockState::getBlock).allMatch(sapling::equals);

        return false;
    }

    Block getSaplingBlock();

    static Set<BlockPos> getSaplings(StructureWorldAccess world, Block sapling, BlockPos pos) {

        for (Direction direction : Direction.values()) {
            Direction.Axis axis = direction.getAxis();

            if(axis.isHorizontal()) {
                BlockPos offset = pos.offset(direction);
                BlockState offState = world.getBlockState(offset);

                if (offState.getBlock() == sapling) {
                    Direction yccw = direction.rotateYCounterclockwise();
                    Direction ycw = direction.rotateYClockwise();

                    for (Direction rotation : Lists.newArrayList(ycw, yccw)) {
                        BlockPos side = offset.offset(rotation);
                        BlockPos aside = pos.offset(rotation);

                        BlockState sideState = world.getBlockState(side);
                        BlockState asideState = world.getBlockState(aside);

                        if (sideState.getBlock() == sapling && asideState.getBlock() == sapling)
                            return Sets.newHashSet(pos, offset, side, aside);
                    }
                }
            }
        }

        return Sets.newHashSet(pos);
    }

}
