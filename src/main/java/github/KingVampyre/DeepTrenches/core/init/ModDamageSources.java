package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.common.entity.damage.ModDamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.EntityDamageSource;
import net.minecraft.entity.damage.ProjectileDamageSource;

public class ModDamageSources {

	public static final DamageSource SPROOM_SPIKE = new ModDamageSource("sproom_spike");

	public static DamageSource adaigger(Entity adaigger, Entity attacker) {
		return (new ProjectileDamageSource("adaigger", adaigger, attacker)).setProjectile();
	}

	public static DamageSource soulDraining(Entity attacker) {
		return (new EntityDamageSource("soul_draining", attacker));
	}

}
