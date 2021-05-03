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

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.BRINE;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.FLOWING_BRINE;

public abstract class BrineFluid extends AbstractWaterFluid {

    @Override
    public Item getBucketItem() {
        return ModItems.BRINE_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_BRINE;
    }

    @Override
    public Fluid getStill() {
        return BRINE;
    }

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == BRINE || fluid == FLOWING_BRINE;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.BRINE.getDefaultState().with(FluidBlock.LEVEL, method_15741(state));
    }

    public static class Flowing extends BrineFluid {

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

    public static class Still extends BrineFluid {

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
