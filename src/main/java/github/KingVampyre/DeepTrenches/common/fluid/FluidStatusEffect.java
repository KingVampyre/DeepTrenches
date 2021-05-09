package github.KingVampyre.DeepTrenches.common.fluid;

import net.minecraft.entity.LivingEntity;

public interface FluidStatusEffect {

    void applyStatusEffects(LivingEntity living);

    boolean canApplyStatusEffects(LivingEntity living);

}
