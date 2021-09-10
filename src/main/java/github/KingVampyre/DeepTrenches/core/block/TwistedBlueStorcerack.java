package github.KingVampyre.DeepTrenches.core.block;

import github.KingVampyre.DeepTrenches.common.block.AbstractPointedStone;
import github.KingVampyre.DeepTrenches.core.block.enums.Twisted;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.BiFunction;

import static github.KingVampyre.DeepTrenches.core.block.enums.Twisted.*;
import static github.KingVampyre.DeepTrenches.core.init.DTProperties.TWISTED;
import static net.minecraft.enchantment.Enchantments.SILK_TOUCH;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.particle.ParticleTypes.DRIPPING_DRIPSTONE_LAVA;
import static net.minecraft.particle.ParticleTypes.DRIPPING_DRIPSTONE_WATER;
import static net.minecraft.state.property.Properties.VERTICAL_DIRECTION;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.math.Direction.Axis.Y;
import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;

@SuppressWarnings("deprecation")
public class TwistedBlueStorcerack extends AbstractPointedStone {

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

    private final UniformIntProvider experienceDropped;

    public TwistedBlueStorcerack(Settings settings, UniformIntProvider experienceDropped) {
        super(settings);

        this.experienceDropped = experienceDropped;

        this.setDefaultState(this.stateManager.getDefaultState().with(VERTICAL_DIRECTION, UP).with(TWISTED, TIP).with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(VERTICAL_DIRECTION, TWISTED, WATERLOGGED);
    }

    @Override
    protected void createParticle(@NotNull BlockState state, World world, BlockPos pos, @NotNull Fluid fluid) {
        var particleEffect = fluid.isIn(FluidTags.LAVA) ? DRIPPING_DRIPSTONE_LAVA : DRIPPING_DRIPSTONE_WATER;
        var vec3d = state.getModelOffset(world, pos);
        var x = (double) pos.getX() + 0.5D + vec3d.x;
        var y = pos.getY() - 0.125D;
        var z = (double) pos.getZ() + 0.5D + vec3d.z;

        world.addParticle(particleEffect, x, y, z, 0, 0, 0);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        var direction = state.get(VERTICAL_DIRECTION);
        var twisted = state.get(TWISTED);

        var vec3d = state.getModelOffset(world, pos);
        var shape = SHAPE.apply(twisted, direction);

        return shape.offset(vec3d.x, 0, vec3d.z);
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var world = ctx.getWorld();
        var pos = ctx.getBlockPos();
        var lookDirection = ctx.getVerticalPlayerLookDirection();

        if(lookDirection.getAxis() != Y)
            return null;

        var direction = lookDirection.getOpposite();
        var offset = pos.offset(lookDirection);
        var state = world.getBlockState(offset);

        if(state.isSideSolidFullSquare(world, offset, direction) || this.isPointing(state, direction))
            return this.getDefaultState()
                    .with(VERTICAL_DIRECTION, direction)
                    .with(WATERLOGGED, world.getFluidState(pos).getFluid() == WATER);

        return null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {

        if (state.get(WATERLOGGED))
            world.getFluidTickScheduler().schedule(pos, WATER, WATER.getTickRate(world));

        if (direction.getAxis() != Y)
            return state;

        var scheduler = world.getBlockTickScheduler();
        var verticalDirection = state.get(VERTICAL_DIRECTION);

        if (scheduler.isScheduled(pos, this) && verticalDirection == DOWN)
            return state;

        var canPlaceAt = this.canPlaceAt(state, world, pos);

        if(!canPlaceAt && verticalDirection == UP) {
            scheduler.schedule(pos, this, 1);
            return state;
        }

        if(!canPlaceAt && verticalDirection == DOWN) {
            this.scheduleFall(state, world, pos);
            return state;
        }

        var aheadPos = pos.offset(verticalDirection);
        var aheadState = world.getBlockState(aheadPos);

        if(!aheadState.isOf(this))
            return state.with(TWISTED, TIP);

        if(this.isTipPointing(aheadState, verticalDirection))
            return state.with(TWISTED, FRUSTUM);

        if(this.isPointing(aheadState, verticalDirection) && aheadState.get(TWISTED) == FRUSTUM)
            return state.with(TWISTED, MIDDLE);

        var opposite = verticalDirection.getOpposite();
        var offset = pos.offset(opposite);
        var offsetState = world.getBlockState(offset);

        if(offsetState.isSideSolidFullSquare(world, offset, opposite))
            return state.with(TWISTED, BASE);

        return state;
    }

    @Override
    protected boolean isTip(BlockState state, boolean allowMerged) {
        if (!state.isOf(this))
            return false;

        var twisted = state.get(TWISTED);

        if(twisted == TIP)
            return true;
        else if(allowMerged)
            return twisted == TIP_MERGE || twisted == OPAL_ORE_MERGE;

        return false;
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);

        if (state.get(TWISTED) == OPAL_ORE_MERGE && EnchantmentHelper.getLevel(SILK_TOUCH, stack) == 0) {
            var i = this.experienceDropped.get(world.random);

            if (i > 0)
                this.dropExperience(world, pos, i);

        }

    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        dripTick(state, world, pos, random.nextFloat());

        if(random.nextFloat() < 0.011377778F) {
            var tipPos = this.getTipPos(state, world, pos, 7, true);

            if (tipPos != null) {
                var tipState = world.getBlockState(tipPos);

                if(this.canGrow(tipState, world, tipPos)) {

                    if (this.canDrip(tipState)) {
                        if (random.nextBoolean())
                            this.tryGrow(world, tipPos, DOWN);
                        else
                            this.tryGrowStalagmite(world, tipPos);
                    } else
                        this.tryGrow(world, tipPos, DOWN);

                }

            }

        }

    }

    protected void tryGrowStalagmite(ServerWorld world, BlockPos pos) {
        var mutable = pos.mutableCopy();

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

    protected boolean canGrow(BlockState state, ServerWorld world, BlockPos pos) {
        var direction = state.get(VERTICAL_DIRECTION);
        var offset = pos.offset(direction);
        var offsetState = world.getBlockState(offset);

        if (!offsetState.getFluidState().isEmpty())
            return false;

        var opposite = direction.getOpposite();

        if(this.isTipPointing(offsetState, opposite))
            return true;

        if(this.isPointing(offsetState, opposite) && offsetState.get(TWISTED) == TIP_MERGE)
            return true;

        return offsetState.isAir();
    }

    protected void tryGrow(ServerWorld world, BlockPos pos, Direction direction) {
        var offset = pos.offset(direction);
        var state = world.getBlockState(offset);
        var opposite = direction.getOpposite();

        if (this.isPointing(state, opposite)) {
            var twisted = state.get(TWISTED);
            var vertical = state.get(VERTICAL_DIRECTION);

            var mergedDown = vertical == UP ? offset.up() : offset;
            var mergedUp = vertical == DOWN ? offset.down() : offset;

            if(twisted == TIP_MERGE) {
                this.place(world, mergedDown, DOWN, OPAL_ORE_MERGE);
                this.place(world, mergedUp, UP, OPAL_ORE_MERGE);
            } else if(twisted == TIP) {
                this.place(world, mergedDown, DOWN, TIP_MERGE);
                this.place(world, mergedUp, UP, TIP_MERGE);
            }

        } else if (state.isAir() || state.isOf(Blocks.WATER))
            place(world, offset, direction, TIP);

    }

    protected void place(WorldAccess world, BlockPos pos, Direction direction, Twisted twisted) {
        var state = this.getDefaultState().with(VERTICAL_DIRECTION, direction).with(TWISTED, twisted).with(WATERLOGGED, world.getFluidState(pos).getFluid() == WATER);

        world.setBlockState(pos, state, Block.NOTIFY_ALL);
    }

}
