package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModProperties.FACING_EXCEPT_DOWN;
import static github.KingVampyre.DeepTrenches.core.init.ModProperties.STAGE_2;
import static net.minecraft.state.property.Properties.AGE_25;
import static net.minecraft.util.math.Direction.NORTH;

public abstract class LeavesFlowerBlock extends FanPlantBlock {

    public LeavesFlowerBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(AGE_25, 0).with(FACING_EXCEPT_DOWN, NORTH).with(STAGE_2, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);

        builder.add(AGE_25, STAGE_2);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);

        if (!this.canPlaceAt(state, world, pos))
            world.removeBlock(pos, true);

        if(state.get(STAGE_2) < 2) {

            if (state.get(AGE_25) < 15)
                world.setBlockState(pos, state.cycle(AGE_25), 3);
            else
                world.setBlockState(pos, state.cycle(STAGE_2).with(AGE_25, 0), 3);
        }

    }

}
