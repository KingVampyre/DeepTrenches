package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModProperties.BLOCK_THIRD;
import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.state.property.Properties.AGE_25;

public abstract class GrowingTallPlantBlock extends PlantBlock implements Fertilizable {

    public GrowingTallPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, AIR.getDefaultState(), blockEntity, stack);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);

        builder.add(AGE_25, BLOCK_THIRD);
    }

    protected abstract int getHeight(WorldView world, BlockPos pos);

    protected abstract int getMaxAge();

    protected abstract void onBreakInCreative(World world, BlockPos pos, BlockState state, PlayerEntity player);

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {

        if (!world.isClient) {
            if (player.isCreative())
                this.onBreakInCreative(world, pos, state, player);
            else
                dropStacks(state, world, pos, null, player, player.getMainHandStack());
        }

        super.onBreak(world, pos, state, player);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);

        if (!this.canPlaceAt(state, world, pos))
            world.removeBlock(pos, true);

        if (state.get(AGE_25) < this.getMaxAge())
            world.setBlockState(pos, state.cycle(AGE_25), 3);

        if(state.get(AGE_25) >= this.getMaxAge() && this.canGrow(world, random, pos, state))
            this.grow(world, random, pos, state);

    }

}
