package github.KingVampyre.DeepTrenches.core.util.world.gen.feature;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerFoliagePlacer;
import github.KingVampyre.DeepTrenches.core.mixin.InvokerTrunkPlacer;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;
import java.util.function.BiConsumer;

@FunctionalInterface
public interface BlockStatePlacer {

    BlockStatePlacer FOLIAGE = InvokerFoliagePlacer::placeFoliageBlock;

    BlockStatePlacer TRUNK = (world, replacer, random, config, pos) -> InvokerTrunkPlacer.trySetState(world, replacer, random, pos, config);

    BlockStatePlacer DIRT = (world, replacer, random, config, pos) -> InvokerTrunkPlacer.setToDirt(world, replacer, random, pos, config);

    void placeBlock(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos.Mutable pos);

}
