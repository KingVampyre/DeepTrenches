package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.*;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

import static github.KingVampyre.DeepTrenches.core.block.enums.Twisted.TIP;
import static github.KingVampyre.DeepTrenches.core.block.enums.Twisted.TIP_MERGE;
import static java.lang.Integer.MAX_VALUE;
import static net.minecraft.block.AbstractBlock.OffsetType.XZ;
import static net.minecraft.block.piston.PistonBehavior.DESTROY;
import static net.minecraft.entity.damage.DamageSource.FALLING_STALACTITE;
import static net.minecraft.fluid.Fluids.*;
import static net.minecraft.predicate.entity.EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR;
import static net.minecraft.predicate.entity.EntityPredicates.VALID_LIVING_ENTITY;
import static net.minecraft.state.property.Properties.VERTICAL_DIRECTION;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.math.Direction.Axis.Y;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;
import static net.minecraft.world.WorldEvents.POINTED_DRIPSTONE_LANDS;

public abstract class AbstractPointedDripstone extends Block implements LandingBlock, Waterloggable {

    public AbstractPointedDripstone(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
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
    protected Direction getPlaceDirection(WorldView world, BlockPos pos, Direction direction) {
        var opposite = direction.getOpposite();

        if (this.canPlaceTowards(world, pos, direction))
            return direction;
        else if (!this.canPlaceTowards(world, pos, opposite))
            return null;

        return opposite;
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
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        if (this.isPointingUp(state) && !this.canPlaceAt(state, world, pos))
            world.breakBlock(pos, true);
        else {
            var vec3d = Vec3d.ofBottomCenter(pos);
            var entity = new FallingBlockEntity(world, vec3d.x, vec3d.y, vec3d.z, state);

            if (this.isTip(state, true)) {
                var mutable = pos.mutableCopy().move(UP);
                var i = 1;

                while(i < 6 && this.isPointingDown(world.getBlockState(mutable))) {
                    ++i;
                    mutable.move(UP);
                }

                entity.setHurtEntities(i, 40);
            }

            world.spawnEntity(entity);
        }

    }

    @Nullable
    protected BlockPos getTipPos(BlockState state, WorldAccess world, BlockPos pos, int range, boolean allowMerged) {

        if (this.isTip(state, allowMerged))
            return pos;

        var direction = state.get(VERTICAL_DIRECTION);

        return this.search(world, pos, direction.getDirection(), (statex) -> statex.isOf(this) && statex.get(VERTICAL_DIRECTION) == direction, (statex) -> isTip(statex, allowMerged), range).orElse(null);
    }

    protected boolean isHeldByPointedDripstone(BlockState state, WorldView world, BlockPos pos) {
        return this.isPointingDown(state) && !world.getBlockState(pos.up()).isOf(this);
    }

    protected abstract boolean isTip(BlockState state, boolean allowMerged);

    protected boolean canPlaceTowards(WorldView world, BlockPos pos, Direction direction) {
        var opposite = direction.getOpposite();
        var blockPos = pos.offset(opposite);
        var blockState = world.getBlockState(blockPos);

        return blockState.isSideSolidFullSquare(world, blockPos, direction) || this.isPointing(blockState, direction);
    }

    protected void dripTick(BlockState state, ServerWorld world, BlockPos pos, float dripChance) {

        if (dripChance < 0.17578125F) {
            if (this.isHeldByPointedDripstone(state, world, pos)) {
                var fluid = this.getDripFluid(world, pos);

                if(this.isFluidLiquid(fluid)) {
                    float fluidChance = fluid == WATER ? 0.17578125F : 0.05859375F;

                    if (dripChance < fluidChance) {
                        var tipPos = this.getTipPos(state, world, pos, 11, false);

                        if (tipPos != null) {
                            var cauldronPos = this.getCauldronPos(world, tipPos, fluid);

                            if (cauldronPos != null) {
                                world.syncWorldEvent(WorldEvents.POINTED_DRIPSTONE_DRIPS, tipPos, 0);

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
        Predicate<BlockState> predicate = (state) ->
                state.getBlock() instanceof AbstractCauldronBlock &&
                        ((AbstractCauldronBlock)state.getBlock()).canBeFilledByDripstone(fluid);

        return search(world, pos, DOWN.getDirection(), AbstractBlockState::isAir, predicate, 11).orElse(null);
    }

    protected Fluid getDripFluid(World world, BlockPos pos) {
        return this.getFluid(world, pos, world.getBlockState(pos)).filter(this::isFluidLiquid).orElse(EMPTY);
    }

    protected Optional<Fluid> getFluid(World world, BlockPos pos, BlockState state) {
        return !this.isPointingDown(state) ? Optional.empty() : this.getSupportingPos(world, pos, state, 11).map((posx) -> world.getFluidState(posx.up()).getFluid());
    }

    protected Optional<BlockPos> getSupportingPos(World world, BlockPos pos, BlockState state, int range) {
        var direction = state.get(VERTICAL_DIRECTION);
        Predicate<BlockState> predicate = (statex) -> statex.isOf(this) && statex.get(VERTICAL_DIRECTION) == direction;

        return search(world, pos, direction.getOpposite().getDirection(), predicate, (statex) -> !statex.isOf(this), range);
    }


    protected boolean isFluidLiquid(Fluid fluid) {
        return fluid == LAVA || fluid == WATER;
    }

    protected boolean isPointingDown(BlockState state) {
        return this.isPointing(state, DOWN);
    }

    protected boolean isPointingUp(BlockState state) {
        return this.isPointing(state, UP);
    }

    protected boolean isPointing(BlockState state, Direction direction) {
        return state.isOf(this) && state.get(VERTICAL_DIRECTION) == direction;
    }

    protected boolean isTip(BlockState state, Direction direction) {
        return isTip(state, false) && state.get(VERTICAL_DIRECTION) == direction;
    }

    protected void scheduleFall(BlockState state, WorldAccess world, BlockPos pos) {
        var blockPos = this.getTipPos(state, world, pos, MAX_VALUE, true);

        if (blockPos != null) {
            var mutable = blockPos.mutableCopy();

            while(this.isPointingDown(world.getBlockState(mutable))) {
                world.getBlockTickScheduler().schedule(mutable, this, 2);
                mutable.move(UP);
            }

        }

    }

    protected Optional<BlockPos> search(WorldAccess world, BlockPos pos, Direction.AxisDirection axisDirection, Predicate<BlockState> continuePredicate, Predicate<BlockState> stopPredicate, int range) {
        var direction = Direction.get(axisDirection, Y);
        var mutable = pos.mutableCopy();

        for(int i = 1; i < range; ++i) {
            mutable.move(direction);
            BlockState state = world.getBlockState(mutable);

            if (stopPredicate.test(state))
                return Optional.of(mutable.toImmutable());

            if (world.isOutOfHeightLimit(mutable.getY()) || !continuePredicate.test(state))
                return Optional.empty();

        }

        return Optional.empty();
    }

}
