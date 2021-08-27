package github.KingVampyre.DeepTrenches.core.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.mob.PhantomEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

public class SleepyStatusEffect extends StatusEffect {

	public SleepyStatusEffect(StatusEffectCategory category, int i) {
		super(category, i);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entityLiving, int amplifier) {
		World world = entityLiving.getEntityWorld();

		if (entityLiving instanceof PlayerEntity player) {
			Box aabb = player.getBoundingBox().expand(40);

			world.getEntitiesByClass(PhantomEntity.class, aabb, null)
				.stream()
				.filter(phantom -> phantom.getAttacking() == player)
				.forEach(phantom -> phantom.setOnFireFor(45));
		}
	}
	
}