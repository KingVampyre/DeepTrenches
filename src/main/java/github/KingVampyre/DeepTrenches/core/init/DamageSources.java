package github.KingVampyre.DeepTrenches.core.init;

import github.Louwind.entityutils.core.mixin.DamageSourceInvoker;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.EntityDamageSource;
import net.minecraft.entity.damage.ProjectileDamageSource;

public class DamageSources {

	public static final DamageSource ACID = DamageSourceInvoker.create("acid");
	public static final DamageSource GAS = DamageSourceInvoker.create("gas");
	public static final DamageSource PRESSURE = DamageSourceInvoker.create("pressure");
	public static final DamageSource SPROOM_SPIKE = DamageSourceInvoker.create("sproom_spike");
	public static final DamageSource STORCEAN_THORNS = DamageSourceInvoker.create("storcean_thorns");

	public static DamageSource adaigger(Entity adaigger, Entity attacker) {
		return (new ProjectileDamageSource("adaigger", adaigger, attacker)).setProjectile();
	}

	public static DamageSource soulDraining(Entity attacker) {
		return (new EntityDamageSource("soul_draining", attacker));
	}

}
