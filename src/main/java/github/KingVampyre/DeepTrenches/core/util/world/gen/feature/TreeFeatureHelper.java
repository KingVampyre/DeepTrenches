package github.KingVampyre.DeepTrenches.core.util.world.gen.feature;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerFoliagePlacer;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.util.world.gen.feature.FoliagePositionPredicate.ALWAYS_TRUE;

public class TreeFeatureHelper {

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos centerPos, FoliagePositionPredicate predicate, int radius, int y, boolean giantTrunk) {
        generateRhombus(world, replacer, random, config, centerPos, predicate, radius, y, giantTrunk,false);
    }

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk, boolean round) {
        generateRhombus(world, replacer, random, config, centerPos, ALWAYS_TRUE, radius, y, giantTrunk, round);
    }

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos centerPos, int radius, int y, boolean giantTrunk) {
        generateRhombus(world, replacer, random, config, centerPos, ALWAYS_TRUE, radius, y, giantTrunk, false);
    }

    public static void generateSquare(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos centerPos, FoliagePositionPredicate predicate, int radius, int y, boolean giantTrunk) {
        var mutable = new BlockPos.Mutable();
        var i = giantTrunk ? 1 : 0;

        for(var x = -radius; x <= radius + i; ++x) {
            for(var z = -radius; z <= radius + i; ++z) {

                if (predicate.isValidForLeaves(random, x, y, z, radius, giantTrunk)) {
                    mutable.set(centerPos, x, y, z);

                    InvokerFoliagePlacer.placeFoliageBlock(world, replacer, random, config, mutable);
                }

            }

        }

    }

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, BlockPos centerPos, FoliagePositionPredicate predicate, int radius, int y, boolean giantTrunk, boolean round) {
        var mutable = new BlockPos.Mutable();
        var roundOffset = round ? 1 : 0;
        var i = giantTrunk ? 1 : 0;

        for(var x = -radius; x <= radius + i; ++x) {
            var length = Math.abs(Math.abs(x) - radius - roundOffset);

            for(var z = -radius; z <= radius + i; ++z) {

                if(x == 0 || z <= length && z >= -length)
                    if (predicate.isValidForLeaves(random, x, y, z, radius, giantTrunk)) {
                        mutable.set(centerPos, x, y, z);

                        InvokerFoliagePlacer.placeFoliageBlock(world, replacer, random, config, mutable);
                    }

            }

        }

    }

}
