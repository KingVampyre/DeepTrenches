package github.KingVampyre.DeepTrenches.core.entity.ai.goal;

import github.KingVampyre.DeepTrenches.common.entity.ai.goal.FlyOntoTreeGoal;
import github.KingVampyre.DeepTrenches.core.entity.StaspEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.Box;

import java.util.function.Predicate;

import static github.KingVampyre.DeepTrenches.core.init.ModBlockTags.*;

public class StaspFlyOntoTreeGoal extends FlyOntoTreeGoal {

    public static final Predicate<BlockState> AQUEAN_AND_FUCHSITRA = state -> {
        Block block = state.getBlock();

        return block.isIn(STASP_POLLEN_SOURCE) || block.isIn(AQUEAN_LOGS) || block.isIn(FUCHSITRA_LOGS);
    };

    public StaspFlyOntoTreeGoal(StaspEntity stasp, Box box, double speed, float probability) {
        super(stasp, box, AQUEAN_AND_FUCHSITRA, speed, probability);
    }

}
