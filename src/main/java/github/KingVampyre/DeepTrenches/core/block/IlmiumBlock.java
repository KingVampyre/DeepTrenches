package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.block.enums.IlmiumType;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockTags.ILMIUM_SPREADABLE;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.ACID;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.ILMIUM_TYPE;
import static net.minecraft.state.property.Properties.VERTICAL_DIRECTION;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;

public class IlmiumBlock extends GrassBlock {

    public IlmiumBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(ILMIUM_TYPE, IlmiumType.STORCERACK).with(VERTICAL_DIRECTION, UP));
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);

        var type = state.get(ILMIUM_TYPE);

        if(!world.isClient && type != null) {
            var block = type.asBlock();

            if (block != null)
                world.setBlockState(pos, block.getDefaultState());

        }

    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);

        builder.add(ILMIUM_TYPE, VERTICAL_DIRECTION);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var pos = ctx.getBlockPos();
        var world = ctx.getWorld();

        var direction = ctx.getVerticalPlayerLookDirection().getOpposite();
        var state = world.getBlockState(pos);
        var block = state.getBlock();
        var type = IlmiumType.from(block);

        if(type != null) {
            var placementState = super.getPlacementState(ctx);

            if(placementState != null) {
                world.getBlockTickScheduler().schedule(pos, this, 20 + world.random.nextInt(40));

                return placementState.with(ILMIUM_TYPE, type).with(VERTICAL_DIRECTION, direction);
            }

        }

        return null;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        var vertical = state.get(VERTICAL_DIRECTION);

        if (!this.canSurvive(world, pos, vertical))
            world.getBlockTickScheduler().schedule(pos, this, 1);
        else {
            for(int i = 0; i < 16; ++i) {
                var x = random.nextInt(10) - 5;
                var y = random.nextInt(4) - 2;
                var z = random.nextInt(10) - 5;

                var spreadPos = pos.add(x, y, z);
                var spreadState =  world.getBlockState(spreadPos);

                if (spreadState.isIn(ILMIUM_SPREADABLE)) {
                    var spreadDirection = random.nextBoolean() ? UP : DOWN;

                    var block = spreadState.getBlock();
                    var ilmium = this.getDefaultState()
                            .with(ILMIUM_TYPE, IlmiumType.from(block))
                            .with(VERTICAL_DIRECTION, spreadDirection);

                    if(this.canSpread(world, spreadPos, spreadDirection))
                        world.setBlockState(spreadPos, ilmium);

                }

            }
        }

    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.getBlockTickScheduler().schedule(pos, this, 1);

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        var vertical = state.get(VERTICAL_DIRECTION);
        var offset = pos.offset(vertical);
        var offsetState = world.getBlockState(offset);

        if (!this.canSurvive(world, pos, vertical) || offsetState.isSolidBlock(world, offset)) {
            var type = state.get(ILMIUM_TYPE);

            world.breakBlock(pos, false);
            world.setBlockState(pos, type.asBlock().getDefaultState());
        }

    }

    private boolean canSurvive(WorldView world, BlockPos pos, Direction direction) {
        var offset = pos.offset(direction);

        if(world.getLightLevel(LightType.SKY, offset) >= 8)
            return false;

        var blockState = world.getBlockState(offset);

        if (blockState.isOf(ACID))
            return false;

        for (Direction side : Direction.Type.HORIZONTAL) {
            var sidePos = pos.offset(side);
            var sideState = world.getBlockState(sidePos);

            if(sideState.isOf(ACID))
                return false;
        }

        return true;
    }

    private boolean canSpread(WorldView world, BlockPos pos, Direction direction) {
        var offset = pos.offset(direction);
        var offsetState = world.getBlockState(offset);

        if(!offsetState.isSolidBlock(world, offset))
            return this.canSurvive(world, pos, direction);

        return false;
    }

}
