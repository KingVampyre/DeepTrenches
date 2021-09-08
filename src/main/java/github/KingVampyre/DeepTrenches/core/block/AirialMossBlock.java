package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.core.block.enums.AirialMossType;
import github.KingVampyre.DeepTrenches.core.mixin.InvokerSpreadableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTBlockTags.AIRIAL_MOSS_SPREADABLE;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.AIRIAL_MOSS_TYPE;
import static net.minecraft.block.Blocks.SNOW;

public class AirialMossBlock extends GrassBlock {

    public AirialMossBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(AIRIAL_MOSS_TYPE, AirialMossType.STONE).with(SNOWY, false));
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);

        var type = state.get(AIRIAL_MOSS_TYPE);

        if(!world.isClient && type != null) {
            var block = type.asBlock();

            if (block != null)
                world.setBlockState(pos, block.getDefaultState());

        }

    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);

        builder.add(AIRIAL_MOSS_TYPE);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var pos = ctx.getBlockPos();
        var world = ctx.getWorld();

        var state = world.getBlockState(pos);
        var block = state.getBlock();
        var type = AirialMossType.from(block);

        if(type != null) {
            var placementState = super.getPlacementState(ctx);

            if(placementState != null)
                return placementState.with(AIRIAL_MOSS_TYPE, type);
        }

        return null;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        var type = state.get(AIRIAL_MOSS_TYPE);

        if (!InvokerSpreadableBlock.canSurvive(state, world, pos))
            world.setBlockState(pos, type.asBlock().getDefaultState());
        else {
            var up = pos.up();

            if (world.getLightLevel(up) >= 9 && random.nextInt(3) == 0) {
                var defaultState = this.getDefaultState();

                for(int i = 0; i < 2; ++i) {
                    var x = random.nextInt(20) - 10;
                    var y = random.nextInt(6) - 3;
                    var z = random.nextInt(20) - 10;

                    var blockPos = pos.add(x, y, z);
                    var blockState =  world.getBlockState(blockPos);

                    if (blockState.isIn(AIRIAL_MOSS_SPREADABLE) && InvokerSpreadableBlock.canSpread(defaultState, world, blockPos)) {
                        var aboveState = world.getBlockState(blockPos.up());
                        var block = blockState.getBlock();

                        var moss = defaultState
                                .with(AIRIAL_MOSS_TYPE, AirialMossType.from(block))
                                .with(SNOWY, aboveState.isOf(SNOW));

                        world.setBlockState(blockPos, moss);
                    }

                }

            }

        }

    }

}
