package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerDamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.EntityDamageSource;
import net.minecraft.entity.damage.ProjectileDamageSource;

public class DamageSources {

	public static final DamageSource ACID = InvokerDamageSource.create("acid");
	public static final DamageSource PRESSURE = InvokerDamageSource.create("pressure");
	public static final DamageSource SPROOM_SPIKE = InvokerDamageSource.create("sproom_spike");
	public static final DamageSource STORCEAN_THORNS = InvokerDamageSource.create("storcean_thorns");

	public static DamageSource adaigger(Entity adaigger, Entity attacker) {
		return (new ProjectileDamageSource("adaigger", adaigger, attacker)).setProjectile();
	}

	public static DamageSource soulDraining(Entity attacker) {
		return (new EntityDamageSource("soul_draining", attacker));
	}

}
