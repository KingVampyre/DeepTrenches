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

    public static BlockPos.Mutable nextMutable(Random random, int boundXZ, int boundY, int offsetXZ, int offsetY) {
        return BlockPosHelper.nextPos(random, boundXZ, boundY, offsetXZ, offsetY).mutableCopy();
    }

    public static BlockPos.Mutable nextMutable(Random random, BlockPos prevPos, int boundXZ, int boundY, int offsetXZ, int offsetY) {
        return BlockPosHelper.nextPos(random, prevPos, boundXZ, boundY, offsetXZ, offsetY).mutableCopy();
    }

    public static BlockPos nextPos(Random random, int boundXZ, int boundY, int offsetXZ, int offsetY) {
        return BlockPosHelper.nextPos(random, boundXZ, boundY, boundXZ, offsetXZ, offsetY, offsetXZ, -1, -1);
    }

    public static BlockPos nextPos(Random random, BlockPos prevPos, int boundXZ, int boundY, int offsetXZ, int offsetY) {
        return BlockPosHelper.nextPos(random, boundXZ, boundY, boundXZ, offsetXZ, offsetY, offsetXZ, prevPos.getX(), prevPos.getZ());
    }

    public static BlockPos nextPos(Random random, int boundDx, int boundDy, int boundDz, int offsetDx, int offsetDy, int offsetDz, int prevDx, int prevDz) {
        int randomDx;
        int randomDy;
        int randomDz;

        do {
            randomDx = random.nextInt(boundDx) + offsetDx;
            randomDy = random.nextInt(boundDy) + offsetDy;
            randomDz = random.nextInt(boundDz) + offsetDz;
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
