package github.KingVampyre.DeepTrenches.core.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

import static net.minecraft.entity.effect.StatusEffectCategory.BENEFICIAL;

public class DrainingStatusEffect extends StatusEffect {

    public DrainingStatusEffect(StatusEffectCategory category, int i) {
        super(category, i);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        float hearts = 1 << amplifier;
        float amount = 2 + hearts;

        StatusEffectCategory statusEffectType = this.getCategory();

        if (statusEffectType == BENEFICIAL && entity.getHealth() < entity.getMaxHealth())
            entity.heal(amount);

    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 60 == 0;
    }

}