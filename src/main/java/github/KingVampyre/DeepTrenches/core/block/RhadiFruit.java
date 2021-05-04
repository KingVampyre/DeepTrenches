package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.CarvingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.Direction;

import static github.KingVampyre.DeepTrenches.core.init.ModBlocks.CARVED_RHADI_FRUIT;
import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;

public class RhadiFruit extends CarvingBlock {

    public RhadiFruit(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getCarvedState(Direction direction) {
        return CARVED_RHADI_FRUIT.getDefaultState().with(HORIZONTAL_FACING, direction);
    }

}
