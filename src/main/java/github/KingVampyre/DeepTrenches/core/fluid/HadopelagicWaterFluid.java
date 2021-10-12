package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractOxygenatedWaterFluid;
import github.KingVampyre.DeepTrenches.common.fluid.StatusEffectFluid;
import github.KingVampyre.DeepTrenches.core.init.DTDamageSources;
import github.KingVampyre.DeepTrenches.core.init.DTBlocks;
import github.KingVampyre.DeepTrenches.core.util.particle.ParticleEffectHelper;
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

import static github.KingVampyre.DeepTrenches.core.init.DTFluids.FLOWING_HADOPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTFluids.HADOPELAGIC_WATER;
import static github.KingVampyre.DeepTrenches.core.init.DTItems.HADOPELAGIC_WATER_BUCKET;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.DTStatusEffects.PRESSURE;

public abstract class HadopelagicWaterFluid extends AbstractOxygenatedWaterFluid implements StatusEffectFluid {

    @Override
    public void applyStatusEffects(LivingEntity living) {
        living.addStatusEffect(new StatusEffectInstance(PRESSURE, 250, 2, false, false, true));
    }

    @Override
    public boolean canApplyStatusEffects(LivingEntity living) {
        return !living.isInvulnerableTo(DTDamageSources.PRESSURE);
    }

    @Override
    public int getNextAirUnderwater(LivingEntity living, Random random, int air) {
        int respiration = EnchantmentHelper.getRespiration(living);

        return respiration > 0 && random.nextInt(respiration + 1) > 0 ? air : air - 4;
    }

    @Override
    public Item getBucketItem() {
        return HADOPELAGIC_WATER_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_HADOPELAGIC_WATER;
    }

    @Override
    protected ParticleEffect getParticle() {
        return ParticleEffectHelper.getDrippingEffect(this, 0.141F, 0.211F, 0.439F);
    }

    @Override
    public Fluid getStill() {
        return HADOPELAGIC_WATER;
    }

    @Override
    @Nullable
    protected ParticleEffect getUnderwaterParticle(Random random) {

        if(random.nextInt(7) == 0) {
            if(random.nextBoolean())
                return random.nextInt(3) == 0 ? MARINE_SNOW_BIG : MARINE_SNOW_CHUNK;

            return MARINE_SNOW_SMALL;
        }

        return null;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return DTBlocks.HADOPELAGIC_WATER.getDefaultState().with(FluidBlock.LEVEL, FlowableFluid.getBlockStateLevel(state));
    }

    public static class Flowing extends HadopelagicWaterFluid {

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

    public static class Still extends HadopelagicWaterFluid {

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
