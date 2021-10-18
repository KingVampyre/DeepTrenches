package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractOxygenatedWaterFluid;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import github.KingVampyre.DeepTrenches.core.init.DTItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.state.StateManager;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTFluids.CLEAR_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTFluids.FLOWING_CLEAR_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.DRIPPING_CLEAR_WATER;
import static net.minecraft.particle.ParticleTypes.BUBBLE;

public abstract class ClearWaterFluid extends AbstractOxygenatedWaterFluid {

    @Override
    public Item getBucketItem() {
        return DTItems.CLEAR_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_CLEAR_WATER;
    }

    @Override
    public int getNextAirUnderwater(LivingEntity living, Random random, int air) {
        int respiration = EnchantmentHelper.getRespiration(living);

        if(respiration > 0 && random.nextInt(respiration + 1) > 0)
            return air;


        return random.nextInt(4) > 0 ? air : air - 1;
    }

    @Override
    protected ParticleEffect getParticle() {
        return DRIPPING_CLEAR_WATER;
    }

    @Override
    public Fluid getStill() {
        return CLEAR_WATER;
    }

    @Override
    @Nullable
    protected ParticleEffect getUnderwaterParticle(Random random) {
        return random.nextInt(3) == 0 ? BUBBLE : null;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return DTBlocks.CLEAR_WATER.getDefaultState().with(FluidBlock.LEVEL, FlowableFluid.getBlockStateLevel(state));
    }

    public static class Flowing extends ClearWaterFluid {

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

    public static class Still extends ClearWaterFluid {

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
