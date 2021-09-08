package github.KingVampyre.DeepTrenches.core.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

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

}
