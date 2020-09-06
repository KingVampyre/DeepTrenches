package github.KingVampyre.DeepTrenches.core.entity.effect;

import static github.KingVampyre.DeepTrenches.core.init.ModDamageSources.DRAINING;
import static net.minecraft.entity.effect.StatusEffectType.BENEFICIAL;
import static net.minecraft.entity.effect.StatusEffectType.HARMFUL;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class DrainingStatusEffect extends StatusEffect {

	public DrainingStatusEffect(StatusEffectType statusEffectType, int i) {
		super(statusEffectType, i);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		float hearts = 1 << amplifier;
		float amount = 2f + hearts;

		StatusEffectType statusEffectType = this.getType();

		if (statusEffectType == HARMFUL)
			entity.damage(DRAINING, amount);

		else if (statusEffectType == BENEFICIAL && entity.getHealth() < entity.getMaxHealth())
			entity.heal(amount);

	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		int period = 120 >> amplifier;

		if (period > 0)
			return duration % period == 0;

		return true;
	}

}
