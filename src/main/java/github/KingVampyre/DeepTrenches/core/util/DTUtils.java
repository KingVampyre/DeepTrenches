package github.KingVampyre.DeepTrenches.core.util;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DTUtils {

    public static <T> T nextOrCurrent(T[] arr, Predicate<T> predicate) {
        Iterator<T> iterator = Arrays.stream(arr).iterator();

        do {
            if (!iterator.hasNext())
                return iterator.next();

        } while(!predicate.test(iterator.next()));

        if (iterator.hasNext())
            return iterator.next();
        else
            return Arrays.stream(arr).iterator().next();
    }

    public static <T> ImmutableList<Supplier<T>> immutableList(T[] arr) {
        return Stream.of(arr)
                .map(feature -> (Supplier<T>) () -> feature)
                .collect(ImmutableList.toImmutableList());
    }

    public static int count(WorldAccess world, BlockPos pos, Direction direction, Predicate<BlockState> continuePredicate, int range) {
        return DTUtils.findAll(world, pos, direction, continuePredicate, range).size();
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
