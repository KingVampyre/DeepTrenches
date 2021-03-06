package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.POTION;

public class ModPotions {

	public static final Potion LONG_GAS_CORROSION;
	public static final Potion GAS_CORROSION;
	public static final Potion STRONG_GAS_CORROSION;

	public static final Potion LONG_SINKING;
	public static final Potion SINKING;
	public static final Potion STRONG_SINKING;

	public static final Potion LONG_SOFTBONES;
	public static final Potion LONG_STRONG_SOFTBONES;
	public static final Potion SOFTBONES;
	public static final Potion STRONG_SOFTBONES;

	private static Potion createPotion(String id, StatusEffectInstance effectInstance) {
		return Registry.register(POTION, id, new Potion(effectInstance));
	}

	private static Potion createPotion(String id, StatusEffect effect, int duration) {
		return createPotion(id, effect, duration, 0);
	}

	private static Potion createPotion(String id, StatusEffect effect, int duration, int amplifier) {
		return createPotion(id, new StatusEffectInstance(effect, duration, amplifier));
	}

	static {
		LONG_GAS_CORROSION = createPotion("deep_trenches:long_gas_corrosion", StatusEffects.GAS_CORROSION, 9600);
		GAS_CORROSION = createPotion("deep_trenches:gas_corrosion", StatusEffects.GAS_CORROSION, 3600);
		STRONG_GAS_CORROSION = createPotion("deep_trenches:strong_gas_corrosion", StatusEffects.GAS_CORROSION, 1200, 1);

		LONG_SINKING = createPotion("deep_trenches:long_sinking", new StatusEffectInstance(StatusEffects.SINKING, 9600));
		SINKING = createPotion("deep_trenches:sinking", new StatusEffectInstance(StatusEffects.SINKING, 4800));
		STRONG_SINKING = createPotion("deep_trenches:strong_sinking", new StatusEffectInstance(StatusEffects.SINKING, 2400, 1));

		LONG_SOFTBONES = createPotion("deep_trenches:long_softbones", StatusEffects.SOFTBONES, 14400);
		LONG_STRONG_SOFTBONES = createPotion("deep_trenches:long_strong_softbones", StatusEffects.SOFTBONES, 9600, 1);
		SOFTBONES = createPotion("deep_trenches:softbones", StatusEffects.SOFTBONES, 3600);
		STRONG_SOFTBONES = createPotion("deep_trenches:strong_softbones", StatusEffects.SOFTBONES, 2400, 1);
	}

}
