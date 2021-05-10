package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractWaterFluid;
import github.KingVampyre.DeepTrenches.common.fluid.FluidStatusEffect;
import github.KingVampyre.DeepTrenches.common.fluid.OxygenatedFluid;
import github.KingVampyre.DeepTrenches.core.init.DamageSources;
import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.STORCEAN_BATHYPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.FLOWING_STORCEAN_BATHYPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.ModItems.STORCEAN_BATHYPELAGIC_WATER_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.PRESSURE;

public abstract class StorceanBathypelagicWaterFluid extends AbstractWaterFluid implements FluidStatusEffect, OxygenatedFluid {

    @Override
    public void applyStatusEffects(LivingEntity living) {
        living.addStatusEffect(new StatusEffectInstance(PRESSURE, 70, 0, false, false, true));
    }

    @Override
    public boolean canApplyStatusEffects(LivingEntity living) {
        return !living.isInvulnerableTo(DamageSources.PRESSURE);
    }

    @Override
    public int getNextAirUnderwater(LivingEntity living, Random random, int air) {
        int respiration = EnchantmentHelper.getRespiration(living);

        if(respiration > 0 && random.nextInt(respiration + 1) > 0)
            return air;

        return air - 1;
    }

    @Override
    public Item getBucketItem() {
        return STORCEAN_BATHYPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_STORCEAN_BATHYPELAGIC_WATER;
    }

    @Override
    public Fluid getStill() {
        return STORCEAN_BATHYPELAGIC_WATER;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == STORCEAN_BATHYPELAGIC_WATER || fluid == FLOWING_STORCEAN_BATHYPELAGIC_WATER;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.STORCEAN_BATHYPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    public static class Flowing extends StorceanBathypelagicWaterFluid {

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

    public static class Still extends StorceanBathypelagicWaterFluid {

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
