package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractWaterFluid;
import github.KingVampyre.DeepTrenches.core.init.ModBlocks;
import github.KingVampyre.DeepTrenches.core.init.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.FLOWING_STORCEAN_ENDERPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.STORCEAN_ENDERPELAGIC_WATER;

public abstract class StorceanEnderpelagicWaterFluid extends AbstractWaterFluid {

    @Override
    public Item getBucketItem() {
        return ModItems.STORCEAN_ENDERPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_STORCEAN_ENDERPELAGIC_WATER;
    }

    @Override
    public Fluid getStill() {
        return STORCEAN_ENDERPELAGIC_WATER;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == STORCEAN_ENDERPELAGIC_WATER || fluid == FLOWING_STORCEAN_ENDERPELAGIC_WATER;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.STORCEAN_ENDERPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    public static class Flowing extends StorceanEnderpelagicWaterFluid {

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

    public static class Still extends StorceanEnderpelagicWaterFluid {

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
