package github.KingVampyre.DeepTrenches.core.util;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Predicate;

import static net.minecraft.util.math.Direction.Axis.Y;

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
