package github.KingVampyre.DeepTrenches.common.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.world.World;

public class CurativeStatusEffect extends StatusEffect {

	protected StatusEffect effect;
	protected float healing;

	public CurativeStatusEffect(StatusEffectCategory category, StatusEffect effect, float healing, int i) {
		super(category, i);

		this.effect = effect;
		this.healing = healing;
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		int ticks = 50 >> amplifier;

		if (ticks > 0)
			return duration % ticks == 0;

		return true;
	}

	@Override
	public void applyUpdateEffect(LivingEntity entityLiving, int amplifier) {
		World world = entityLiving.getEntityWorld();

		if (!world.isClient) {
			entityLiving.removeStatusEffect(this.effect);

			if (entityLiving.getHealth() < entityLiving.getMaxHealth())
				entityLiving.heal(this.healing);

		}

	}

}
