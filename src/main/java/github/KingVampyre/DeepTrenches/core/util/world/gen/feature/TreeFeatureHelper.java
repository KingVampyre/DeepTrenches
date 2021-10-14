package github.KingVampyre.DeepTrenches.core.util.world.gen.feature;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;
import java.util.function.BiConsumer;

import static github.KingVampyre.DeepTrenches.core.util.world.gen.feature.PositionPredicate.ALWAYS_TRUE;

public class TreeFeatureHelper {

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, BlockPos pos, Random random, int radius, boolean round) {
        generateRhombus(world, replacer, config, placer, ALWAYS_TRUE, pos, random, radius, round);
    }

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, BlockPos pos, Random random, int radius) {
        generateRhombus(world, replacer, config, placer, ALWAYS_TRUE, pos, random, radius, false);
    }

    public static void generateCenterSquare(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, PositionPredicate predicate, BlockPos pos, Random random, int radius) {
        generateSquare(world, replacer, config, placer, predicate, pos.add(-radius, 0, -radius), random, 2 * radius + 1);
    }

    public static void generateSquare(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, BlockPos pos, Random random, int length) {
        generateSquare(world, replacer, config, placer, ALWAYS_TRUE, pos, random, length);
    }

    public static void generateSquare(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, PositionPredicate predicate, BlockPos startPos, Random random, int length) {
        var endPos = startPos.add(length, 0, length);
        var mutable = startPos.mutableCopy();

        for(var dx = 0; dx < length; ++dx) {
            for(var dz = 0; dz < length; ++dz) {
                mutable.set(startPos, dx, 0, dz);

                if (predicate.isValidPosition(world, random, startPos, endPos, mutable, dx, dz))
                    placer.placeBlock(world, replacer, random, config, mutable);

            }

        }

    }

    public static void generateRhombus(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config, BlockStatePlacer placer, PositionPredicate predicate, BlockPos startPos, Random random, int radius, boolean round) {
        var endPos = startPos.add(radius, 0, radius);
        var mutable = startPos.mutableCopy();
        var offset = round ? 1 : 0;

        for(var dx = -radius; dx <= radius; ++dx) {
            var length = Math.abs(Math.abs(dx) - radius - offset);

            for(var dz = -radius; dz <= radius; ++dz) {

                if(dx == 0 || dz <= length && dz >= -length) {
                    mutable.set(startPos, dx, 0, dz);

                    if (predicate.isValidPosition(world, random, startPos, endPos, mutable, dx, dz))
                        placer.placeBlock(world, replacer, random, config, mutable);
                }

            }

        }

    }

}
