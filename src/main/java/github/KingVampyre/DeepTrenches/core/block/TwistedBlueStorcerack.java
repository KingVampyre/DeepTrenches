package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.AbstractPointedDripstone;
import github.KingVampyre.DeepTrenches.core.block.enums.Twisted;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.*;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import static github.KingVampyre.DeepTrenches.core.block.enums.Twisted.*;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.TWISTED;
import static net.minecraft.entity.damage.DamageSource.STALAGMITE;
import static net.minecraft.fluid.Fluids.*;
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
            var f = random.nextFloat();

            if (!(f > 0.12F))
                getFluid(world, pos, state).filter(fluid -> f < 0.02F || isFluidLiquid(fluid)).ifPresent((fluid) -> {
                    createParticle(world, pos, state, fluid);
                });
        }

    }

    @Override
    protected void dripTick(BlockState state, ServerWorld world, BlockPos pos, float dripChance) {

        if (!(dripChance > 0.17578125F) || !(dripChance > 0.05859375F)) {
            if (isHeldByPointedDripstone(state, world, pos)) {
                Fluid fluid = getDripFluid(world, pos);
                float h;
                if (fluid == WATER) {
                    h = 0.17578125F;
                } else {
                    if (fluid != LAVA) {
                        return;
                    }

                    h = 0.05859375F;
                }

                if (!(dripChance >= h)) {
                    BlockPos blockPos = getTipPos(state, world, pos, 11, false);
                    if (blockPos != null) {
                        BlockPos blockPos2 = getCauldronPos(world, blockPos, fluid);
                        if (blockPos2 != null) {
                            world.syncWorldEvent(WorldEvents.POINTED_DRIPSTONE_DRIPS, blockPos, 0);
                            int i = blockPos.getY() - blockPos2.getY();
                            int j = 50 + i;
                            BlockState blockState = world.getBlockState(blockPos2);
                            world.getBlockTickScheduler().schedule(blockPos2, blockState.getBlock(), j);
                        }
                    }
                }
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

    private void scheduleFall(BlockState state, WorldAccess world, BlockPos pos) {
        var blockPos = getTipPos(state, world, pos, Integer.MAX_VALUE, true);

        if (blockPos != null) {
            var mutable = blockPos.mutableCopy();

            while(isPointingDown(world.getBlockState(mutable))) {
                world.getBlockTickScheduler().schedule(mutable, this, 2);
                mutable.move(UP);
            }

        }

    }

    private int getStalactiteSize(ServerWorld world, BlockPos pos, int range) {
        var i = 1;
        var mutable = pos.mutableCopy().move(UP);

        while(i < range && isPointingDown(world.getBlockState(mutable))) {
            ++i;
            mutable.move(UP);
        }

        return i;
    }

    public void tryGrow(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        var blockState = world.getBlockState(pos.up(1));
        var blockState2 = world.getBlockState(pos.up(2));

        if (canGrow(blockState, blockState2)) {
            var blockPos = getTipPos(state, world, pos, 7, false);

            if (blockPos != null) {
                var blockState3 = world.getBlockState(blockPos);

                if (canDrip(blockState3) && canGrow(blockState3, world, blockPos)) {
                    if (random.nextBoolean())
                        tryGrow(world, blockPos, Direction.DOWN);
                    else
                        tryGrowStalagmite(world, blockPos);

                }

            }

        }

    }

    private boolean canGrow(BlockState state, ServerWorld world, BlockPos pos) {
        Direction direction = state.get(VERTICAL_DIRECTION);
        BlockPos blockPos = pos.offset(direction);
        BlockState blockState = world.getBlockState(blockPos);
        if (!blockState.getFluidState().isEmpty()) {
            return false;
        } else {
            return blockState.isAir() || isTip(blockState, direction.getOpposite());
        }
    }

    private void tryGrowStalagmite(ServerWorld world, BlockPos pos) {
        BlockPos.Mutable mutable = pos.mutableCopy();

        for(int i = 0; i < 10; ++i) {
            mutable.move(Direction.DOWN);
            BlockState blockState = world.getBlockState(mutable);
            if (!blockState.getFluidState().isEmpty()) {
                return;
            }

            if (isTip(blockState, Direction.UP) && canGrow(blockState, world, mutable)) {
                tryGrow(world, mutable, Direction.UP);
                return;
            }

            if (canPlaceTowards(world, mutable, Direction.UP) && !world.isWater(mutable.down())) {
                tryGrow(world, mutable.down(), Direction.UP);
                return;
            }
        }

    }

    private boolean canGrow(BlockState dripstoneBlockState, BlockState waterState) {
        return dripstoneBlockState.isOf(DTBlocks.BLUE_STORCERACK) && waterState.isOf(Blocks.WATER) && waterState.getFluidState().isStill();
    }

    @Override
    protected void spawnFallingBlock(BlockState state, ServerWorld world, BlockPos pos) {
        var vec3d = Vec3d.ofBottomCenter(pos);
        var fallingBlockEntity = new FallingBlockEntity(world, vec3d.x, vec3d.y, vec3d.z, state);

        if (isTip(state, true)) {
            var i = getStalactiteSize(world, pos, 6);

            fallingBlockEntity.setHurtEntities(i, 40);
        }

        world.spawnEntity(fallingBlockEntity);
    }

    private void tryGrow(ServerWorld world, BlockPos pos, Direction direction) {
        var blockPos = pos.offset(direction);
        var blockState = world.getBlockState(blockPos);

        if (isTip(blockState, direction.getOpposite())) {
            BlockPos blockPos3;
            BlockPos blockPos4;

            if (blockState.get(VERTICAL_DIRECTION) == UP) {
                blockPos4 = blockPos;
                blockPos3 = blockPos.up();
            } else {
                blockPos3 = blockPos;
                blockPos4 = blockPos.down();
            }

            this.place(world, blockPos3, DOWN, TIP_MERGE);
            this.place(world, blockPos4, UP, TIP_MERGE);
        } else if (blockState.isAir() || blockState.isOf(Blocks.WATER))
            this.place(world, blockPos, direction, TIP);

    }

    private void place(WorldAccess world, BlockPos pos, Direction direction, Twisted thickness) {
        var blockState = this.getDefaultState().with(VERTICAL_DIRECTION, direction).with(TWISTED, thickness).with(WATERLOGGED, world.getFluidState(pos).getFluid() == WATER);

        world.setBlockState(pos, blockState, Block.NOTIFY_ALL);
    }

    private void createParticle(World world, BlockPos pos, BlockState state, Fluid fluid) {
        Vec3d vec3d = state.getModelOffset(world, pos);
        double d = 0.0625D;
        double e = (double)pos.getX() + 0.5D + vec3d.x;
        double f = (double)((float)(pos.getY() + 1) - d) - d;
        double g = (double)pos.getZ() + 0.5D + vec3d.z;
        Fluid fluid2 = getDripFluid(world, fluid);
        ParticleEffect particleEffect = fluid2.isIn(FluidTags.LAVA) ? ParticleTypes.DRIPPING_DRIPSTONE_LAVA : ParticleTypes.DRIPPING_DRIPSTONE_WATER;
        world.addParticle(particleEffect, e, f, g, 0, 0, 0);
    }

    @Override
    @Nullable
    protected BlockPos getTipPos(BlockState state, WorldAccess world, BlockPos pos, int range, boolean allowMerged) {

        if (this.isTip(state, allowMerged))
            return pos;

        var direction = state.get(VERTICAL_DIRECTION);
        Predicate<BlockState> predicate = (statex) -> statex.isOf(DTBlocks.TWISTED_BLUE_STORCERACK) && statex.get(VERTICAL_DIRECTION) == direction;

        return searchInDirection(world, pos, direction.getDirection(), predicate, (statex) -> isTip(statex, allowMerged), range).orElse(null);
    }

    private Twisted getTwisted(WorldView world, BlockPos pos, Direction direction, boolean tryMerge) {
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

    public boolean canDrip(BlockState state) {
        return this.isPointingDown(state) && state.get(TWISTED) == TIP && !state.get(WATERLOGGED);
    }

    private Optional<BlockPos> getSupportingPos(World world, BlockPos pos, BlockState state, int range) {
        Direction direction = state.get(VERTICAL_DIRECTION);
        Predicate<BlockState> predicate = (statex) -> statex.isOf(this) && statex.get(VERTICAL_DIRECTION) == direction;

        return searchInDirection(world, pos, direction.getOpposite().getDirection(), predicate, (statex) -> !statex.isOf(this), range);
    }

    @Override
    protected boolean isTip(BlockState state, boolean allowMerged) {
        if (!state.isOf(this))
            return false;

        var thickness = state.get(TWISTED);

        return thickness == TIP || allowMerged && thickness == TIP_MERGE;
    }

    @Override
    protected boolean isHeldByPointedDripstone(BlockState state, WorldView world, BlockPos pos) {
        return isPointingDown(state) && !world.getBlockState(pos.up()).isOf(DTBlocks.TWISTED_BLUE_STORCERACK);
    }

    @Nullable
    private BlockPos getCauldronPos(World world, BlockPos pos, Fluid fluid) {
        Predicate<BlockState> predicate = (state) ->
                state.getBlock() instanceof AbstractCauldronBlock &&
                        ((AbstractCauldronBlock)state.getBlock()).canBeFilledByDripstone(fluid);

        return searchInDirection(world, pos, DOWN.getDirection(), AbstractBlockState::isAir, predicate, 11).orElse(null);
    }

    public Fluid getDripFluid(World world, BlockPos pos) {
        return getFluid(world, pos, world.getBlockState(pos)).filter(this::isFluidLiquid).orElse(EMPTY);
    }

    private Optional<Fluid> getFluid(World world, BlockPos pos, BlockState state) {
        return !isPointingDown(state) ? Optional.empty() : getSupportingPos(world, pos, state, 11).map((posx) -> world.getFluidState(posx.up()).getFluid());
    }

    private boolean isFluidLiquid(Fluid fluid) {
        return fluid == LAVA || fluid == WATER;
    }

    private Fluid getDripFluid(World world, Fluid fluid) {

        if (fluid.matchesType(EMPTY))
            return world.getDimension().isUltrawarm() ? LAVA : WATER;

        return fluid;
    }

}
