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

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.FLOWING_STORCEAN_VIRDIPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.STORCEAN_VIRDIPELAGIC_WATER;

public abstract class StorceanVirdipelagicWaterFluid extends AbstractWaterFluid implements OxygenatedFluid {

    @Override
    public int getNextAirUnderwater(LivingEntity living, Random random, int air) {
        int respiration = EnchantmentHelper.getRespiration(living);

        if(respiration > 0 && random.nextInt(respiration + 1) > 0)
            return air;

        return air - 1;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.STORCEAN_VIRDIPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_STORCEAN_VIRDIPELAGIC_WATER;
    }

    @Override
    public Fluid getStill() {
        return STORCEAN_VIRDIPELAGIC_WATER;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == STORCEAN_VIRDIPELAGIC_WATER || fluid == FLOWING_STORCEAN_VIRDIPELAGIC_WATER;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.STORCEAN_VIRDIPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    public static class Flowing extends StorceanVirdipelagicWaterFluid {

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

    public static class Still extends StorceanVirdipelagicWaterFluid {

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
