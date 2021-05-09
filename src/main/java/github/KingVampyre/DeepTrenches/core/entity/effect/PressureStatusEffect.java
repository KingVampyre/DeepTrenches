package github.KingVampyre.DeepTrenches.core.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

import static github.KingVampyre.DeepTrenches.core.init.DamageSources.PRESSURE;

public class PressureStatusEffect extends StatusEffect {

    public PressureStatusEffect(StatusEffectType type, int color) {
        super(type, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        super.applyUpdateEffect(entity, amplifier);

        int armor = entity.getArmor();
        int factor = (amplifier + 1) / (armor + 1);
        float amount = factor * 5.5F;

        entity.damage(PRESSURE, amount);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int ticks = 10 * (amplifier + 1) + 20;

        return duration % ticks == 0;
    }

}
