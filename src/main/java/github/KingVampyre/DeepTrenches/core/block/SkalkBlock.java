package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.DoubleStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;

import static net.minecraft.block.enums.DoubleBlockHalf.LOWER;
import static net.minecraft.state.property.Properties.AGE_25;
import static net.minecraft.state.property.Properties.DOUBLE_BLOCK_HALF;

public class SkalkBlock extends DoubleStemBlock {

    public SkalkBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(AGE_25, 0).with(DOUBLE_BLOCK_HALF, LOWER));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE_25, DOUBLE_BLOCK_HALF);
    }

    @Override
    protected int getMaxAge() {
        return 12;
    }

    @Override
    protected int getMaxHeight() {
        return 15;
    }

}
