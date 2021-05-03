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

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.FLOWING_STORCEAN_INFINIPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.STORCEAN_INFINIPELAGIC_WATER;

public abstract class StorceanInfinipelagicWaterFluid extends AbstractWaterFluid {

    @Override
    public Item getBucketItem() {
        return ModItems.STORCEAN_INFINIPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_STORCEAN_INFINIPELAGIC_WATER;
    }

    @Override
    public Fluid getStill() {
        return STORCEAN_INFINIPELAGIC_WATER;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == STORCEAN_INFINIPELAGIC_WATER || fluid == FLOWING_STORCEAN_INFINIPELAGIC_WATER;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.STORCEAN_INFINIPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    public static class Flowing extends StorceanInfinipelagicWaterFluid {

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

    public static class Still extends StorceanInfinipelagicWaterFluid {

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
