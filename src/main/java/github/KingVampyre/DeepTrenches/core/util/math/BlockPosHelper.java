package github.KingVampyre.DeepTrenches.core.util.math;

import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

public class BlockPosHelper {

    public static int count(WorldAccess world, BlockPos pos, Direction direction, Predicate<BlockState> continuePredicate, int range) {
        return BlockPosHelper.findAll(world, pos, direction, continuePredicate, range).size();
    }

    public static List<BlockPos> findAll(WorldAccess world, BlockPos pos, Direction direction, Predicate<BlockState> continuePredicate, int range) {
        var mutable = pos.mutableCopy();
        var list = Lists.<BlockPos>newArrayList();

        for(int i = 1; i < range; ++i) {
            mutable.move(direction);
            var state = world.getBlockState(mutable);

            if (world.isOutOfHeightLimit(mutable.getY()))
                return list;

            list.add(mutable.toImmutable());

            if (!continuePredicate.test(state))
                return list;

        }

        return list;
    }

    public static BlockPos nextPos(Random random, int bound) {
        return BlockPosHelper.nextPos(random, bound, bound, bound, -1, -1);
    }

    public static BlockPos nextPos(Random random, BlockPos prevPos, int bound) {
        return BlockPosHelper.nextPos(random, bound, bound, bound, prevPos.getX(), prevPos.getZ());
    }

    public static BlockPos nextPos(Random random, int boundDx, int boundDy, int boundDz, int prevDx, int prevDz) {
        var randomDx = random.nextInt(boundDx);
        var randomDy = random.nextInt(boundDy);
        var randomDz = random.nextInt(boundDz);

        do {
            randomDx = random.nextInt(boundDx);
            randomDy = random.nextInt(boundDy);
            randomDz = random.nextInt(boundDz);
        } while (randomDx == prevDx && randomDz == prevDz);

        return new BlockPos(randomDx, randomDy, randomDz);
    }

    public static Optional<BlockPos> search(WorldAccess world, BlockPos pos, Direction direction, Predicate<BlockState> continuePredicate, Predicate<BlockState> stopPredicate, int range) {
        var mutable = pos.mutableCopy();

        for(int i = 1; i < range; ++i) {
            mutable.move(direction);
            BlockState state = world.getBlockState(mutable);

            if (stopPredicate.test(state))
                return Optional.of(mutable.toImmutable());

            if (world.isOutOfHeightLimit(mutable.getY()) || !continuePredicate.test(state))
                return Optional.empty();

        }

        return Optional.empty();
    }

}
