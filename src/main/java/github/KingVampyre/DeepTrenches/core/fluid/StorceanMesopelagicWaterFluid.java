package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractWaterFluid;
import github.KingVampyre.DeepTrenches.common.fluid.FluidStatusEffect;
import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.FLOWING_STORCEAN_MESOPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.STORCEAN_MESOPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.STORCEAN_MESOPELAGIC_WATER_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.SINKING;

public abstract class StorceanMesopelagicWaterFluid extends AbstractWaterFluid implements FluidStatusEffect {

    @Override
    public void applyStatusEffects(LivingEntity living) {
        living.addStatusEffect(new StatusEffectInstance(SINKING, 100, 1, false, false, true));
    }

    @Override
    public boolean canApplyStatusEffects(LivingEntity living) {
        return true;
    }

    @Override
    public Item getBucketItem() {
        return STORCEAN_MESOPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_STORCEAN_MESOPELAGIC_WATER;
    }

    @Override
    public Fluid getStill() {
        return STORCEAN_MESOPELAGIC_WATER;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == STORCEAN_MESOPELAGIC_WATER || fluid == FLOWING_STORCEAN_MESOPELAGIC_WATER;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.STORCEAN_MESOPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    public static class Flowing extends StorceanMesopelagicWaterFluid {

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

    public static class Still extends StorceanMesopelagicWaterFluid {

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
