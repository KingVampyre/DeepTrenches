package github.KingVampyre.DeepTrenches.core.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

import static net.minecraft.entity.effect.StatusEffectType.BENEFICIAL;

public class DrainingStatusEffect extends StatusEffect {

    public DrainingStatusEffect(StatusEffectType statusEffectType, int i) {
        super(statusEffectType, i);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        float hearts = 1 << amplifier;
        float amount = 2 + hearts;

        StatusEffectType statusEffectType = this.getType();

        if (statusEffectType == BENEFICIAL && entity.getHealth() < entity.getMaxHealth())
            entity.heal(amount);

    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 60 == 0;
    }

}
