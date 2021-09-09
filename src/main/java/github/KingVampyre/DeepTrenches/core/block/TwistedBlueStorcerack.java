package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.AbstractPointedDripstone;
import github.KingVampyre.DeepTrenches.core.block.enums.Twisted;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.enums.Thickness;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.BiFunction;

import static github.KingVampyre.DeepTrenches.core.block.enums.Twisted.*;
import static github.KingVampyre.DeepTrenches.core.init.DTBlocks.BLUE_STORCERACK;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.TWISTED;
import static net.minecraft.entity.damage.DamageSource.STALAGMITE;
import static net.minecraft.fluid.Fluids.*;
import static net.minecraft.particle.ParticleTypes.DRIPPING_DRIPSTONE_LAVA;
import static net.minecraft.particle.ParticleTypes.DRIPPING_DRIPSTONE_WATER;
import static net.minecraft.state.property.Properties.VERTICAL_DIRECTION;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;

public class TwistedBlueStorcerack extends AbstractPointedDripstone {

    private static final VoxelShape TIP_MERGE_SHAPE = Block.createCuboidShape(5, 0, 5, 11, 16, 11);
    private static final VoxelShape UP_TIP_SHAPE = Block.createCuboidShape(5, 0, 5, 11, 11, 11);
    private static final VoxelShape DOWN_TIP_SHAPE = Block.createCuboidShape(5, 5, 5, 11, 16, 11);
    private static final VoxelShape BASE_SHAPE = Block.createCuboidShape(4, 0, 4, 12, 16, 12);
    private static final VoxelShape FRUSTUM_SHAPE = Block.createCuboidShape(3, 0, 3, 13, 16, 13);
    private static final VoxelShape MIDDLE_SHAPE = Block.createCuboidShape(2, 0, 2, 14, 16, 14);

    private static final BiFunction<Twisted, Direction, VoxelShape> SHAPE = Util.memoize((twisted, direction) -> switch (twisted) {
        case FRUSTUM -> BASE_SHAPE;
        case MIDDLE -> FRUSTUM_SHAPE;
        case TIP -> direction == DOWN ? DOWN_TIP_SHAPE : UP_TIP_SHAPE ;
        case TIP_MERGE -> TIP_MERGE_SHAPE;
        default -> MIDDLE_SHAPE;
    });

    public TwistedBlueStorcerack(Settings settings) {
        super(settings);

        this.setDefaultState(this.stateManager.getDefaultState().with(VERTICAL_DIRECTION, UP).with(TWISTED, TIP).with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(VERTICAL_DIRECTION, TWISTED, WATERLOGGED);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {

        if (state.get(WATERLOGGED))
            world.getFluidTickScheduler().schedule(pos, WATER, WATER.getTickRate(world));

        if (direction != UP && direction != DOWN)
            return state;

        var verticalDirection = state.get(VERTICAL_DIRECTION);

        if (verticalDirection == DOWN && world.getBlockTickScheduler().isScheduled(pos, this))
            return state;
        else if (direction == verticalDirection.getOpposite() && !this.canPlaceAt(state, world, pos)) {
            if (verticalDirection == DOWN)
                this.scheduleFall(state, world, pos);
            else
                world.getBlockTickScheduler().schedule(pos, this, 1);

            return state;
        }

        var twisted = this.getTwisted(world, pos, verticalDirection, state.get(TWISTED) == TIP_MERGE);

        return state.with(TWISTED, twisted);
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {

        if (state.get(VERTICAL_DIRECTION) == UP && state.get(TWISTED) == TIP)
            entity.handleFallDamage(fallDistance + 2.0F, 2.0F, STALAGMITE);
        else
            super.onLandedUpon(world, state, pos, entity, fallDistance);

    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {

        if (this.canDrip(state)) {
            var chance = random.nextFloat();

            if (chance < 0.12F) {
                var fluid = this.getFlowableFluid(world, pos, state);

                if(fluid != null)
                    this.createParticle(world, pos, state, fluid);
            }

        }

    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var world = ctx.getWorld();
        var pos = ctx.getBlockPos();
        var opposite = ctx.getVerticalPlayerLookDirection().getOpposite();
        var direction = this.getPlaceDirection(world, pos, opposite);

        if (direction == null)
            return null;

        var twisted = this.getTwisted(world, pos, direction, !ctx.shouldCancelInteraction());

        return twisted == null ? null : this.getDefaultState().with(VERTICAL_DIRECTION, direction).with(TWISTED, twisted).with(WATERLOGGED, world.getFluidState(pos).getFluid() == WATER);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        var direction = state.get(VERTICAL_DIRECTION);
        var twisted = state.get(TWISTED);

        var vec3d = state.getModelOffset(world, pos);
        var shape = SHAPE.apply(twisted, direction);

        return shape.offset(vec3d.x, 0, vec3d.z);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var direction = state.get(VERTICAL_DIRECTION);

        return this.canPlaceTowards(world, pos, direction);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        dripTick(state, world, pos, random.nextFloat());

        if (random.nextFloat() < 0.011377778F && this.isHeldBy(state, world, pos)) {
            var blockState = world.getBlockState(pos.up());
            var blockState2 = world.getBlockState(pos.up(2));

            if (blockState.isOf(BLUE_STORCERACK) && blockState2.isOf(Blocks.WATER) && blockState2.getFluidState().isStill()) {
                var tipPos = this.getTipPos(state, world, pos, 7, false);

                if (tipPos != null) {
                    var tipState = world.getBlockState(tipPos);

                    if (this.canDrip(tipState) && this.canGrow(tipState, world, tipPos)) {
                        if (random.nextBoolean())
                            this.tryGrow(world, tipPos, Direction.DOWN);
                        else {
                            var mutable = tipPos.mutableCopy();

                            for(int i = 0; i < 10; ++i) {
                                mutable.move(DOWN);
                                var downState =  world.getBlockState(mutable);

                                if (!downState.getFluidState().isEmpty())
                                    return;

                                if (this.isTipPointing(downState, UP) && this.canGrow(downState, world, mutable))
                                    this.tryGrow(world, mutable, UP);
                                else if (this.canPlaceTowards(world, mutable, UP) && !world.isWater(mutable.down()))
                                    this.tryGrow(world, mutable.down(), UP);
                            }

                        }

                    }

                }

            }

        }

    }

    protected boolean canGrow(BlockState state, ServerWorld world, BlockPos pos) {
        var direction = state.get(VERTICAL_DIRECTION);
        var blockPos = pos.offset(direction);
        var blockState = world.getBlockState(blockPos);

        if (!blockState.getFluidState().isEmpty())
            return false;

        return blockState.isAir() || isTipPointing(blockState, direction.getOpposite());
    }

    protected void tryGrow(ServerWorld world, BlockPos pos, Direction direction) {
        var offset = pos.offset(direction);
        var state = world.getBlockState(offset);
        var opposite = direction.getOpposite();

        if (this.isTipPointing(state, opposite)) {
            var vertical = state.get(VERTICAL_DIRECTION);

            var mergedDown = vertical == UP ? pos.up() : pos;
            var mergedUp = vertical == DOWN ? pos.down() : pos;

            this.place(world, mergedDown, DOWN, TIP_MERGE);
            this.place(world, mergedUp, UP, TIP_MERGE);

        } else if (state.isAir() || state.isOf(Blocks.WATER))
            place(world, offset, direction, TIP);

    }

    protected void place(WorldAccess world, BlockPos pos, Direction direction, Twisted twisted) {
        var blockState = this.getDefaultState().with(VERTICAL_DIRECTION, direction).with(TWISTED, twisted).with(WATERLOGGED, world.getFluidState(pos).getFluid() == WATER);

        world.setBlockState(pos, blockState, Block.NOTIFY_ALL);
    }

    protected void createParticle(World world, BlockPos pos, BlockState state, Fluid fluid) {
        var vec3d = state.getModelOffset(world, pos);
        var e = (double)pos.getX() + 0.5D + vec3d.x;
        var f = pos.getY() - 0.0625D;
        var g = (double)pos.getZ() + 0.5D + vec3d.z;
        var fluid2 = fluid == EMPTY ? world.getDimension().isUltrawarm() ? LAVA : WATER : fluid;
        var particleEffect = fluid2.isIn(FluidTags.LAVA) ? DRIPPING_DRIPSTONE_LAVA : DRIPPING_DRIPSTONE_WATER;

        world.addParticle(particleEffect, e, f, g, 0, 0, 0);
    }

    protected Twisted getTwisted(WorldView world, BlockPos pos, Direction direction, boolean tryMerge) {
        var opposite = direction.getOpposite();
        var offset = pos.offset(direction);
        var state = world.getBlockState(offset);

        if (this.isPointing(state, opposite))
            return !tryMerge && state.get(TWISTED) != TIP_MERGE ? TIP : TIP_MERGE;

        if (!this.isPointing(state, direction))
            return TIP;

        var twisted = state.get(TWISTED);

        if (twisted != TIP && twisted != TIP_MERGE) {
            var blockState = world.getBlockState(pos.offset(opposite));

            return !this.isPointing(blockState, direction) ? BASE : MIDDLE;
        }

        return FRUSTUM;
    }

    protected boolean canDrip(BlockState state) {
        return this.isPointingDown(state) && state.get(TWISTED) == TIP && !state.get(WATERLOGGED);
    }

    @Override
    protected boolean isTip(BlockState state, boolean allowMerged) {
        if (!state.isOf(this))
            return false;

        var thickness = state.get(TWISTED);

        return thickness == TIP || allowMerged && thickness == TIP_MERGE;
    }

}
