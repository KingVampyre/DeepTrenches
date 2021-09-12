package github.KingVampyre.DeepTrenches.common.block;

import github.KingVampyre.DeepTrenches.core.util.DTUtils;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.Predicate;

import static java.lang.Integer.MAX_VALUE;
import static net.minecraft.block.AbstractBlock.OffsetType.XZ;
import static net.minecraft.block.piston.PistonBehavior.DESTROY;
import static net.minecraft.entity.damage.DamageSource.FALLING_STALACTITE;
import static net.minecraft.entity.damage.DamageSource.STALAGMITE;
import static net.minecraft.fluid.Fluids.EMPTY;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.predicate.entity.EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR;
import static net.minecraft.predicate.entity.EntityPredicates.VALID_LIVING_ENTITY;
import static net.minecraft.state.property.Properties.VERTICAL_DIRECTION;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;
import static net.minecraft.world.WorldEvents.POINTED_DRIPSTONE_DRIPS;
import static net.minecraft.world.WorldEvents.POINTED_DRIPSTONE_LANDS;

@SuppressWarnings("deprecation")
public abstract class AbstractPointedStone extends Block implements LandingBlock, Waterloggable {

    public AbstractPointedStone(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var direction = state.get(VERTICAL_DIRECTION);

        return this.canPlaceTowards(world, pos, direction);
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    public DamageSource getDamageSource() {
        return FALLING_STALACTITE;
    }

    @Override
    public Predicate<Entity> getEntityPredicate() {
        return EXCEPT_CREATIVE_OR_SPECTATOR.and(VALID_LIVING_ENTITY);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public float getMaxModelOffset() {
        return 0.125F;
    }

    @Override
    public AbstractBlock.OffsetType getOffsetType() {
        return XZ;
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return DESTROY;
    }

    @Nullable
    protected BlockPos getTipPos(BlockState state, WorldAccess world, BlockPos pos, int range, boolean allowMerged) {

        if (this.isTip(state, allowMerged))
            return pos;

        var direction = state.get(VERTICAL_DIRECTION);

        return DTUtils.search(world, pos, direction,
                blockState -> this.isPointing(blockState, direction),
                blockState -> this.isTip(blockState, allowMerged), range)
                .orElse(null);
    }

    @Override
    public boolean isShapeFullCube(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    @Override
    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {

        if (!fallingBlockEntity.isSilent())
            world.syncWorldEvent(POINTED_DRIPSTONE_LANDS, pos, 0);

    }

    @Override
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        var blockPos = hit.getBlockPos();

        if (!world.isClient && projectile.canModifyAt(world, blockPos) && projectile instanceof TridentEntity && projectile.getVelocity().length() > 0.6D)
            world.breakBlock(blockPos, true);

    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {

        if (this.isTipPointing(state, UP))
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

                if(fluid != EMPTY)
                    this.createParticle(state, world, pos, fluid);

            }

        }

    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        if (this.isPointingUp(state) && !this.canPlaceAt(state, world, pos))
            world.breakBlock(pos, true);
        else {
            var vec3d = Vec3d.ofBottomCenter(pos);
            var entity = new FallingBlockEntity(world, vec3d.x, vec3d.y, vec3d.z, state);

            if (this.isTip(state, true)) {
                var amount = DTUtils.count(world, pos.up(),  UP, this::isPointingDown, 6);

                entity.setHurtEntities(amount, 40);
            }

            world.spawnEntity(entity);
        }

    }

    protected abstract void createParticle(@NotNull BlockState state, World world, BlockPos pos, @NotNull Fluid fluid);

    protected abstract boolean isTip(BlockState state, boolean allowMerged);

    protected boolean canDrip(BlockState state) {
        return this.canDrip(state, false);
    }

    protected boolean canDrip(BlockState state, boolean allowMerge) {
        return this.isTipPointing(state, DOWN, allowMerge) && !state.get(WATERLOGGED);
    }

    protected boolean canPlaceTowards(WorldView world, BlockPos pos, Direction direction) {
        var opposite = direction.getOpposite();
        var blockPos = pos.offset(opposite);
        var blockState = world.getBlockState(blockPos);

        return blockState.isSideSolidFullSquare(world, blockPos, direction) || this.isPointing(blockState, direction);
    }

    protected void dripTick(BlockState state, ServerWorld world, BlockPos pos, float dripChance) {

        if (dripChance < 0.17578125F) {
            if (this.isHeldBy(state, world, pos)) {
                var fluid = this.getFlowableFluid(world, pos, state);

                if(fluid != EMPTY) {
                    var fluidChance = fluid == WATER ? 0.17578125F : 0.05859375F;

                    if (dripChance < fluidChance) {
                        var tipPos = this.getTipPos(state, world, pos, 11, false);

                        if (tipPos != null) {
                            var cauldronPos = this.getCauldronPos(world, tipPos, fluid);

                            if (cauldronPos != null) {
                                world.syncWorldEvent(POINTED_DRIPSTONE_DRIPS, tipPos, 0);

                                var cauldronState = world.getBlockState(cauldronPos);
                                var delay = 50 + tipPos.getY() - cauldronPos.getY();

                                world.getBlockTickScheduler().schedule(cauldronPos, cauldronState.getBlock(), delay);
                            }

                        }

                    }

                }

            }

        }

    }

    @Nullable
    protected BlockPos getCauldronPos(World world, BlockPos pos, Fluid fluid) {
        return DTUtils.search(world, pos, DOWN, AbstractBlockState::isAir, state -> state.getBlock() instanceof AbstractCauldronBlock cauldron && cauldron.canBeFilledByDripstone(fluid), 11).orElse(null);
    }

    public Fluid getFlowableFluid(World world, BlockPos pos, BlockState state) {
        var direction = state.get(VERTICAL_DIRECTION);

        return DTUtils.search(world, pos, direction.getOpposite(),
                        upState -> this.isPointing(upState, direction),
                        upState -> !upState.isOf(this), 11)
                .map(BlockPos::up)
                .map(world::getFluidState)
                .filter(FluidState::isStill)
                .map(FluidState::getFluid)
                .filter(FlowableFluid.class::isInstance)
                .orElse(EMPTY);
    }

    protected boolean isHeldBy(BlockState state, WorldView world, BlockPos pos) {
        return this.isPointingDown(state) && !world.getBlockState(pos.up()).isOf(this);
    }

    protected boolean isPointing(BlockState state, Direction direction) {
        return state.isOf(this) && state.get(VERTICAL_DIRECTION) == direction;
    }

    protected boolean isPointingDown(BlockState state) {
        return this.isPointing(state, DOWN);
    }

    protected boolean isPointingUp(BlockState state) {
        return this.isPointing(state, UP);
    }

    protected boolean isTipPointing(BlockState state, Direction direction) {
        return this.isTipPointing(state, direction, false);
    }

    protected boolean isTipPointing(BlockState state, Direction direction, boolean allowMerged) {
        return this.isTip(state, allowMerged) && state.get(VERTICAL_DIRECTION) == direction;
    }

    protected void scheduleFall(BlockState state, WorldAccess world, BlockPos pos) {
        var tipPos = this.getTipPos(state, world, pos, Integer.MAX_VALUE, true);
        var scheduler = world.getBlockTickScheduler();

        if (tipPos != null)
            DTUtils.findAll(world, tipPos.down(), UP, this::isPointingDown, MAX_VALUE).forEach(p -> scheduler.schedule(p, this, 2));

    }

    @Nullable
    public static BlockPos getDripPos(World world, BlockPos pos) {
        return DTUtils.search(world, pos, UP, BlockState::isAir, state -> state.getBlock() instanceof AbstractPointedStone block && block.canDrip(state), 11).orElse(null);
    }

}
