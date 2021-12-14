package github.KingVampyre.DeepTrenches.core.fluid;

import github.KingVampyre.DeepTrenches.common.fluid.AbstractWaterFluid;
import github.KingVampyre.DeepTrenches.common.fluid.StatusEffectFluid;
import github.KingVampyre.DeepTrenches.core.init.block.DTBlocks;
import github.KingVampyre.DeepTrenches.core.init.item.DTItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.state.StateManager;

import static github.KingVampyre.DeepTrenches.core.init.DTFluids.BRINE;
import static github.KingVampyre.DeepTrenches.core.init.DTFluids.FLOWING_BRINE;
import static github.KingVampyre.DeepTrenches.core.init.DTParticleTypes.DRIPPING_BRINE;
import static github.KingVampyre.DeepTrenches.core.init.entity.DTStatusEffects.SINKING;
import static net.minecraft.entity.effect.StatusEffects.POISON;

public abstract class BrineFluid extends AbstractWaterFluid implements StatusEffectFluid {

    @Override
    public void applyStatusEffects(LivingEntity living) {
        living.addStatusEffect(new StatusEffectInstance(POISON, 100));
        living.addStatusEffect(new StatusEffectInstance(SINKING, 100, 1, false, false, true));
    }

    @Override
    public boolean canApplyStatusEffects(LivingEntity living) {
        return !living.isInvulnerableTo(DamageSource.MAGIC);
    }

    @Override
    public Item getBucketItem() {
        return DTItems.BRINE_BUCKET;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_BRINE;
    }

    @Override
    protected ParticleEffect getParticle() {
        return DRIPPING_BRINE;
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
        return DTBlocks.BRINE.getDefaultState().with(FluidBlock.LEVEL, FlowableFluid.getBlockStateLevel(state));
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
