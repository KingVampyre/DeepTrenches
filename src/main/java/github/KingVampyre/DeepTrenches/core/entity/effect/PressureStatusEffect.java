package github.KingVampyre.DeepTrenches.core.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.MathHelper;

import static github.KingVampyre.DeepTrenches.core.init.DTDamageSources.PRESSURE;
import static github.KingVampyre.DeepTrenches.core.init.DTStatusEffects.SOFTBONES;
import static net.minecraft.tag.FluidTags.WATER;

public class PressureStatusEffect extends StatusEffect {

    public PressureStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
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
            float factor = (amplifier + 1) / (0.1F * armor + 2);
            float amount = MathHelper.ceil(factor * 3.5F);

            if(amount > 0)
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