package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractOxygenatedWaterFluid;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import github.KingVampyre.DeepTrenches.core.init.DTItems;
import github.KingVampyre.DeepTrenches.core.util.particle.ParticleEffectHelper;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.state.StateManager;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTFluids.FLOWING_STORCEAN_GASOPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTFluids.STORCEAN_GASOPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.*;
import static net.minecraft.particle.ParticleTypes.BUBBLE;

public abstract class StorceanGasopelagicWaterFluid extends AbstractOxygenatedWaterFluid {

    @Override
    public int getNextAirUnderwater(LivingEntity living, Random random, int air) {
        return air;
    }

    @Override
    public Item getBucketItem() {
        return DTItems.STORCEAN_GASOPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_STORCEAN_GASOPELAGIC_WATER;
    }

    @Override
    protected ParticleEffect getParticle() {
        return ParticleEffectHelper.getDrippingEffect(this, 1F, 0.749F, 0.839F);
    }

    @Override
    @Nullable
    protected ParticleEffect getUnderwaterParticle(Random random) {

        if(random.nextInt(8) == 0)
            return BUBBLE;

        if(random.nextInt(5) == 0) {
            if(random.nextBoolean())
                return random.nextInt(3) == 0 ? STORCEAN_MARINE_SNOW_BIG : STORCEAN_MARINE_SNOW_CHUNK;

            return STORCEAN_MARINE_SNOW_SMALL;
        }

        return null;
    }

    @Override
    public Fluid getStill() {
        return STORCEAN_GASOPELAGIC_WATER;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return DTBlocks.STORCEAN_GASOPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, FlowableFluid.getBlockStateLevel(state));
    }

    public static class Flowing extends StorceanGasopelagicWaterFluid {

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

    public static class Still extends StorceanGasopelagicWaterFluid {

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
