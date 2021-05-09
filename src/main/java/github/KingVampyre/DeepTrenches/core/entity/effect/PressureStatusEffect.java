package github.KingVampyre.DeepTrenches.core.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectType;

import static github.KingVampyre.DeepTrenches.core.init.DamageSources.PRESSURE;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.SOFTBONES;
import static net.minecraft.tag.FluidTags.WATER;

public class PressureStatusEffect extends StatusEffect {

    public PressureStatusEffect(StatusEffectType type, int color) {
        super(type, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

        if(entity.hasStatusEffect(SOFTBONES)) {
            StatusEffectInstance instance = entity.getStatusEffect(SOFTBONES);

            if(instance != null && instance.getAmplifier() >= amplifier)
                return;
        }

        if(entity.isSubmergedIn(WATER)) {
            int armor = entity.getArmor();
            float factor = (amplifier + 1) / (0.4F * armor + 2);
            float amount = Math.round(factor * 2.5F);

            entity.damage(PRESSURE, amount);
        }

    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int ticks = 80 - 10 * (amplifier + 1);

        if(ticks > 0)
            return duration % ticks == 0;
        else
            return duration % 20 == 0;
    }

}
