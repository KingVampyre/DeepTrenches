package github.KingVampyre.DeepTrenches.core.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.mob.PhantomEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

public class SleepyStatusEffect extends StatusEffect {

	public SleepyStatusEffect(StatusEffectType statusEffectType, int i) {
		super(statusEffectType, i);
	}

	@Override
	public void applyUpdateEffect(LivingEntity entityLiving, int amplifier) {
		World world = entityLiving.getEntityWorld();

		if (entityLiving instanceof PlayerEntity) {
			PlayerEntity player = (PlayerEntity) entityLiving;
			Box aabb = player.getBoundingBox().expand(40);

			world.getEntitiesByClass(PhantomEntity.class, aabb, null)
				.stream()
				.filter(phantom -> phantom.getAttacking() == player)
				.forEach(phantom -> phantom.setOnFireFor(45));
		}
	}
	
}
