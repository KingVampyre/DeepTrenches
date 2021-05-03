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

import static github.KingVampyre.DeepTrenches.core.init.ModFluids.ACID;
import static github.KingVampyre.DeepTrenches.core.init.ModFluids.FLOWING_ACID;

public abstract class AcidFluid extends AbstractWaterFluid {

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
