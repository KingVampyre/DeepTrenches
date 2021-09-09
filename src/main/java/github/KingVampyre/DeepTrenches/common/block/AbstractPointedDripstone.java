package github.KingVampyre.DeepTrenches.common.block;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

import static net.minecraft.block.piston.PistonBehavior.DESTROY;
import static net.minecraft.entity.damage.DamageSource.FALLING_STALACTITE;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.predicate.entity.EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR;
import static net.minecraft.predicate.entity.EntityPredicates.VALID_LIVING_ENTITY;
import static net.minecraft.state.property.Properties.VERTICAL_DIRECTION;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;
import static net.minecraft.world.WorldEvents.POINTED_DRIPSTONE_LANDS;

public abstract class AbstractPointedDripstone extends Block implements LandingBlock, Waterloggable {

    public AbstractPointedDripstone(Settings settings) {
        super(settings);
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return DESTROY;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    public boolean isShapeFullCube(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    @Override
    public AbstractBlock.OffsetType getOffsetType() {
        return AbstractBlock.OffsetType.XZ;
    }

    @Override
    public float getMaxModelOffset() {
        return 0.125F;
    }

    @Override
    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {

        if (!fallingBlockEntity.isSilent())
            world.syncWorldEvent(POINTED_DRIPSTONE_LANDS, pos, 0);

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
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        var blockPos = hit.getBlockPos();

        if (!world.isClient && projectile.canModifyAt(world, blockPos) && projectile instanceof TridentEntity && projectile.getVelocity().length() > 0.6D)
            world.breakBlock(blockPos, true);

    }

    @Nullable
    protected abstract BlockPos getTipPos(BlockState state, WorldAccess world, BlockPos pos, int range, boolean allowMerged);

    protected abstract boolean isTip(BlockState state, boolean allowMerged);

    protected abstract void dripTick(BlockState state, ServerWorld world, BlockPos pos, float dripChance);

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    protected boolean canPlaceTowards(WorldView world, BlockPos pos, Direction direction) {
        var opposite = direction.getOpposite();
        var blockPos = pos.offset(opposite);
        var blockState = world.getBlockState(blockPos);

        return blockState.isSideSolidFullSquare(world, blockPos, direction) || this.isPointing(blockState, direction);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        var direction = state.get(VERTICAL_DIRECTION);

        return this.canPlaceTowards(world, pos, direction);
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

    protected boolean isPointingDown(BlockState state) {
        return this.isPointing(state, DOWN);
    }

    protected boolean isPointingUp(BlockState state) {
        return this.isPointing(state, UP);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        if (this.isPointingUp(state) && !this.canPlaceAt(state, world, pos))
            world.breakBlock(pos, true);
        else
            this.spawnFallingBlock(state, world, pos);

    }

    protected abstract void spawnFallingBlock(BlockState state, ServerWorld world, BlockPos pos);

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        dripTick(state, world, pos, random.nextFloat());

        if (random.nextFloat() < 0.011377778F && this.isHeldByPointedDripstone(state, world, pos))
            tryGrow(state, world, pos, random);

    }

    protected abstract boolean isHeldByPointedDripstone(BlockState state, WorldView world, BlockPos pos);

    protected abstract void tryGrow(BlockState state, ServerWorld world, BlockPos pos, Random random);

    protected boolean isPointing(BlockState state, Direction direction) {
        return state.isOf(this) && state.get(VERTICAL_DIRECTION) == direction;
    }

    protected boolean isTip(BlockState state, Direction direction) {
        return isTip(state, false) && state.get(VERTICAL_DIRECTION) == direction;
    }

    protected Optional<BlockPos> searchInDirection(WorldAccess world, BlockPos pos, Direction.AxisDirection axisDirection, Predicate<BlockState> continuePredicate, Predicate<BlockState> stopPredicate, int range) {
        var direction = Direction.get(axisDirection, Direction.Axis.Y);
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
