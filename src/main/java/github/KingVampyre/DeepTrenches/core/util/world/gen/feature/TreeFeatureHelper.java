package github.KingVampyre.DeepTrenches.core.util.world.gen.feature;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.util.world.gen.feature.PositionPredicate.ALWAYS_TRUE;

public class TreeFeatureHelper {

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, PositionPredicate predicate, BlockPos pos, Random random, int radius, int y, boolean giantTrunk) {
        generateRhombus(world, replacer, config, placer, predicate, pos, random, radius, y, giantTrunk, false);
    }

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, BlockPos pos, Random random, int radius, int y, boolean giantTrunk, boolean round) {
        generateRhombus(world, replacer, config, placer, ALWAYS_TRUE, pos, random, radius, y, giantTrunk, round);
    }

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, BlockPos pos, Random random, int radius, int y, boolean giantTrunk) {
        generateRhombus(world, replacer, config, placer, ALWAYS_TRUE, pos, random, radius, y, giantTrunk, false);
    }

    public static void generateCenterSquare(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, PositionPredicate predicate, BlockPos pos, Random random, int radius, int y, boolean giantTrunk) {
        generateSquare(world, replacer, config, placer, predicate, pos.add(-radius, y, -radius), random, 2 * radius + 1, giantTrunk);
    }

    public static void generateSquare(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, BlockPos pos, Random random, int length, boolean giantTrunk) {
        generateSquare(world, replacer, config, placer, ALWAYS_TRUE, pos, random, length, giantTrunk);
    }

    public static void generateSquare(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, PositionPredicate predicate, BlockPos pos, Random random, int length, boolean giantTrunk) {
        var mutable = new BlockPos.Mutable();
        var i = giantTrunk ? 1 : 0;
        var y = pos.getY();

        for(var x = 0; x < length + i; ++x) {
            for(var z = 0; z < length + i; ++z) {

                if (predicate.isValidPosition(random, x, y, z, length, giantTrunk)) {
                    mutable.set(pos, x, y, z);

                    placer.placeBlock(world, replacer, random, config, mutable);
                }

            }

        }

    }

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, PositionPredicate predicate, BlockPos pos, Random random, int radius, int y, boolean giantTrunk, boolean round) {
        var mutable = new BlockPos.Mutable();
        var roundOffset = round ? 1 : 0;
        var i = giantTrunk ? 1 : 0;

        for(var x = -radius; x <= radius + i; ++x) {
            var length = Math.abs(Math.abs(x) - radius - roundOffset);

            for(var z = -radius; z <= radius + i; ++z) {

                if(x == 0 || z <= length && z >= -length)
                    if (predicate.isValidPosition(random, x, y, z, radius, giantTrunk)) {
                        mutable.set(pos, x, y, z);

                        placer.placeBlock(world, replacer, random, config, mutable);
                    }

            }

        }

    }

}
