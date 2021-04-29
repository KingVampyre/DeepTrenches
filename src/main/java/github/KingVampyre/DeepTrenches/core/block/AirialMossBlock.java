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

import static github.KingVampyre.DeepTrenches.core.init.ModBlockTags.AIRIAL_MOSS_SPREADABLE;
import static github.KingVampyre.DeepTrenches.core.init.ModProperties.AIRIAL_MOSS_TYPE;
import static net.minecraft.block.Blocks.SNOW;

public class AirialMossBlock extends GrassBlock {

    public AirialMossBlock(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(AIRIAL_MOSS_TYPE, AirialMossType.STONE).with(SNOWY, false));
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);

        AirialMossType type = state.get(AIRIAL_MOSS_TYPE);

        if(!world.isClient && type != null) {
            Block block = type.asBlock();

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
        BlockPos pos = ctx.getBlockPos();
        World world = ctx.getWorld();

        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        AirialMossType type = AirialMossType.from(block);

        if(type != null) {
            BlockState placementState = super.getPlacementState(ctx);

            if(placementState != null)
                return placementState.with(AIRIAL_MOSS_TYPE, type);
        }

        return null;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        AirialMossType type = state.get(AIRIAL_MOSS_TYPE);

        if (!InvokerSpreadableBlock.canSurvive(state, world, pos))
            world.setBlockState(pos, type.asBlock().getDefaultState());
        else {
            BlockPos up = pos.up();

            if (world.getLightLevel(up) >= 9 & random.nextInt(3) == 0) {
                BlockState defaultState = this.getDefaultState();

                for(int i = 0; i < 2; ++i) {
                    int x = random.nextInt(20) - 10;
                    int y = random.nextInt(6) - 3;
                    int z = random.nextInt(20) - 10;

                    BlockPos blockPos = pos.add(x, y, z);
                    BlockState blockState =  world.getBlockState(blockPos);

                    if (blockState.isIn(AIRIAL_MOSS_SPREADABLE) && InvokerSpreadableBlock.canSpread(defaultState, world, blockPos)) {
                        BlockState aboveState = world.getBlockState(blockPos.up());
                        Block block = blockState.getBlock();

                        BlockState moss = defaultState
                                .with(AIRIAL_MOSS_TYPE, AirialMossType.from(block))
                                .with(SNOWY, aboveState.isOf(SNOW));

                        world.setBlockState(blockPos, moss);
                    }

                }

            }

        }

    }

}
