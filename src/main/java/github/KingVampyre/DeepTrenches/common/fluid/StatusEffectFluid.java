package github.KingVampyre.DeepTrenches.common.fluid;

import net.minecraft.entity.LivingEntity;

public interface StatusEffectFluid {

    void applyStatusEffects(LivingEntity living);

    boolean canApplyStatusEffects(LivingEntity living);

}
