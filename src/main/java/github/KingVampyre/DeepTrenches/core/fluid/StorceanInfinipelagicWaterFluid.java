package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractOxygenatedWaterFluid;
import github.KingVampyre.DeepTrenches.common.fluid.StatusEffectFluid;
import github.KingVampyre.DeepTrenches.core.init.entity.DTDamageSources;
import github.KingVampyre.DeepTrenches.core.init.block.DTBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.state.StateManager;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static github.KingVampyre.DeepTrenches.core.init.DTFluids.FLOWING_STORCEAN_INFINIPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTFluids.STORCEAN_INFINIPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.item.DTItems.STORCEAN_INFINIPELAGIC_WATER_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.entity.DTStatusEffects.PRESSURE;
import static net.minecraft.particle.ParticleTypes.BUBBLE;

public abstract class StorceanInfinipelagicWaterFluid extends AbstractOxygenatedWaterFluid implements StatusEffectFluid {

    @Override
    public void applyStatusEffects(LivingEntity living) {
        living.addStatusEffect(new StatusEffectInstance(PRESSURE, 220, 5, false, false, true));
    }

    @Override
    public boolean canApplyStatusEffects(LivingEntity living) {
        return !living.isInvulnerableTo(DTDamageSources.PRESSURE);
    }

    @Override
    public int getNextAirUnderwater(LivingEntity living, Random random, int air) {
        int respiration = EnchantmentHelper.getRespiration(living);

        if(respiration > 0 && random.nextInt(respiration + 1) > 0)
            return air;

        return random.nextInt(3) > 0 ? air : air - 1;
    }

    @Override
    public Item getBucketItem() {
        return STORCEAN_INFINIPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_STORCEAN_INFINIPELAGIC_WATER;
    }

    @Override
    protected ParticleEffect getParticle() {
        return DRIPPING_STORCEAN_INFINIPELAGIC_WATER;
    }

    @Override
    public Fluid getStill() {
        return STORCEAN_INFINIPELAGIC_WATER;
    }

    @Override
    @Nullable
    protected ParticleEffect getUnderwaterParticle(Random random) {

        if(random.nextInt(25) == 0)
            return BUBBLE;

        if(random.nextInt(10) == 0) {
            if(random.nextBoolean())
                return random.nextInt(3) == 0 ? STORCEAN_MARINE_SNOW_BIG : STORCEAN_MARINE_SNOW_CHUNK;

            return STORCEAN_MARINE_SNOW_SMALL;
        }

        return null;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return DTBlocks.STORCEAN_INFINIPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, FlowableFluid.getBlockStateLevel(state));
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
