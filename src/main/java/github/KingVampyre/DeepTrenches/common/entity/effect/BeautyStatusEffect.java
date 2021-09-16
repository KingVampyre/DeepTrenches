package github.KingVampyre.DeepTrenches.common.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BeautyStatusEffect extends StatusEffect {

	protected final StatusEffect effect;
	protected final float healing;

	public BeautyStatusEffect(StatusEffectCategory category, StatusEffect effect, float healing, int i) {
		super(category, i);

		this.effect = effect;
		this.healing = healing;
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		var ticks = 50 >> amplifier;

		if (ticks > 0)
			return duration % ticks == 0;

		return true;
	}

	@Override
	public void applyUpdateEffect(LivingEntity entityLiving, int amplifier) {
		var world = entityLiving.getEntityWorld();

		if (!world.isClient) {
			entityLiving.removeStatusEffect(this.effect);

			if (entityLiving.getHealth() < entityLiving.getMaxHealth())
				entityLiving.heal(this.healing);

		}

	}

}
