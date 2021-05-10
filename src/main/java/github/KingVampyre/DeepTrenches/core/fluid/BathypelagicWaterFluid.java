package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractWaterFluid;
import github.KingVampyre.DeepTrenches.common.fluid.OxygenatedFluid;
import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.BATHYPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.FLOWING_BATHYPELAGIC_WATER;

public abstract class BathypelagicWaterFluid extends AbstractWaterFluid implements OxygenatedFluid {

    @Override
    public int getNextAirUnderwater(LivingEntity living, Random random, int air) {
        int respiration = EnchantmentHelper.getRespiration(living);
        int nextAir = air - random.nextInt(2) - 2;

        return respiration > 0 && random.nextInt(respiration + 1) > 0 ? air : nextAir;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.BATHYPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_BATHYPELAGIC_WATER;
    }

    @Override
    public Fluid getStill() {
        return BATHYPELAGIC_WATER;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == BATHYPELAGIC_WATER || fluid == FLOWING_BATHYPELAGIC_WATER;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.BATHYPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    public static class Flowing extends BathypelagicWaterFluid {

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

    public static class Still extends BathypelagicWaterFluid {

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
