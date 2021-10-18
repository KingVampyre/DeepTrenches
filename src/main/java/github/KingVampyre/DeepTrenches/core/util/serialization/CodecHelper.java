package github.KingVampyre.DeepTrenches.core.util.serialization;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import net.minecraft.util.math.Direction;

import java.util.function.Function;

public class CodecHelper {

    public static Codec<Direction.Axis> horizontalAxis() {
        return CodecHelper.flatXmap(Direction.Axis.CODEC, value ->
                value.isHorizontal() ? DataResult.success(value) :  DataResult.error("Axis " + value + " isn't horizontal", value)
        );
    }

    public static <A> Codec<A> flatXmap(Codec<A> codec, Function<A, DataResult<A>> checker) {
        return codec.flatXmap(checker, checker);
    }

}
