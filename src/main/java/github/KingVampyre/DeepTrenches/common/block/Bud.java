package github.KingVampyre.DeepTrenches.common.block;

import github.KingVampyre.DeepTrenches.core.util.math.ArrayHelper;
import net.minecraft.block.Block;
import net.minecraft.util.Util;

import java.util.function.BiFunction;

public interface Bud {

    BiFunction<Bud[], Block, Bud> GROW = Util.memoize((values, block) -> ArrayHelper.nextOrCurrent(values, bud -> bud.asBlock() == block));

    default Bud grow(Bud[] values, Block block) {
        return GROW.apply(values, block);
    }

    Block asBlock();

}
