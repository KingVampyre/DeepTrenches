package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.CarvingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.Direction;

import static github.KingVampyre.DeepTrenches.core.init.block.DTBlocks.CARVED_VYNHERT_FRUIT;
import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;

public class VynhertFruit extends CarvingBlock {

    public VynhertFruit(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getCarvedState(Direction direction) {
        return CARVED_VYNHERT_FRUIT.getDefaultState().with(HORIZONTAL_FACING, direction);
    }

}
