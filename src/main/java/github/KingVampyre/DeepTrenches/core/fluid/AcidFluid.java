package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractWaterFluid;
import github.KingVampyre.DeepTrenches.common.fluid.FluidStatusEffect;
import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import github.KingVampyre.DeepTrenches.core.util.StatusEffectHelper;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.ACID;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.FLOWING_ACID;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.ACID_CORROSION;

public abstract class AcidFluid extends AbstractWaterFluid implements FluidStatusEffect {

    @Override
    public void applyStatusEffects(LivingEntity living) {
        StatusEffectHelper.addCorrosionEffect(living, ACID_CORROSION, 2, 900);
    }

    @Override
    public boolean canApplyStatusEffects(LivingEntity living) {
        return !living.hasStatusEffect(ACID_CORROSION);
    }

    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        return fluid != this && direction == Direction.DOWN;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.ACID_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_ACID;
    }

    @Override
    public Fluid getStill() {
        return ACID;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == ACID || fluid == FLOWING_ACID;
    }

    @Override
    public void randomDisplayTick(World world, BlockPos pos, FluidState state, Random random) {

        if (random.nextInt(10) == 0) {
            for(int i = 0; i < 4; ++i) {
                double x = (double)pos.getX() + random.nextDouble();
                double y = (double)pos.getY() + 1.5D;
                double z = (double)pos.getZ() + random.nextDouble();

                world.addParticle(ParticleTypes.SMOKE, x, y, z, 0.0D, 5.0E-4D, 0.0D);
            }
        }

    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.ACID.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    public static class Flowing extends AcidFluid {

        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);

            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }

    }

    public static class Still extends AcidFluid {

        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }

    }

}
