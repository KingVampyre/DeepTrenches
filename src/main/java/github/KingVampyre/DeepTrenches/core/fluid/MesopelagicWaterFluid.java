package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractOxygenatedWaterFluid;
import github.KingVampyre.DeepTrenches.core.init.block.DTBlocks;
import github.KingVampyre.DeepTrenches.core.init.item.DTItems;
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

import static github.KingVampyre.DeepTrenches.core.init.DTFluids.FLOWING_MESOPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTFluids.MESOPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.*;

public abstract class MesopelagicWaterFluid extends AbstractOxygenatedWaterFluid {

    @Override
    public int getNextAirUnderwater(LivingEntity living, Random random, int air) {
        int respiration = EnchantmentHelper.getRespiration(living);

        return respiration > 0 && random.nextInt(respiration + 1) > 0 ? air : air - 2;
    }

    @Override
    public Item getBucketItem() {
        return DTItems.MESOPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_MESOPELAGIC_WATER;
    }

    @Override
    protected ParticleEffect getParticle() {
        return DRIPPING_MESOPELAGIC_WATER;
    }

    @Override
    public Fluid getStill() {
        return MESOPELAGIC_WATER;
    }

    @Override
    @Nullable
    protected ParticleEffect getUnderwaterParticle(Random random) {

        if(random.nextInt(5) == 0) {
            if(random.nextBoolean())
                return random.nextInt(3) == 0 ? MARINE_SNOW_BIG : MARINE_SNOW_CHUNK;

            return MARINE_SNOW_SMALL;
        }

        return null;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return DTBlocks.MESOPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, FlowableFluid.getBlockStateLevel(state));
    }

    public static class Flowing extends MesopelagicWaterFluid {

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

    public static class Still extends MesopelagicWaterFluid {

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
