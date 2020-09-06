package github.KingVampyre.DeepTrenches.common.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.world.World;

public class CurativeStatusEffect extends StatusEffect {

	protected float healing;
	protected StatusEffect statusEffect;

	public CurativeStatusEffect(StatusEffectType statusEffectType, StatusEffect statusEffect, float healing, int i) {
		super(statusEffectType, i);

		this.statusEffect = statusEffect;
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		int ticks = 50 >> amplifier;

		if (ticks > 0)
			return duration % ticks == 0;
		else
			return true;

	}

	@Override
	public void applyUpdateEffect(LivingEntity entityLiving, int amplifier) {
		World world = entityLiving.getEntityWorld();

		if (!world.isClient) {
			entityLiving.removeStatusEffect(this.statusEffect);

			if (entityLiving.getHealth() < entityLiving.getMaxHealth())
				entityLiving.heal(this.healing);

		}
	}

}
