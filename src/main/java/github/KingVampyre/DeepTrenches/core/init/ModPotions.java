package github.KingVampyre.DeepTrenches.core.init;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;

public class ModPotions {

	public static final Potion LONG_SOFTBONES = new Potion(new StatusEffectInstance(StatusEffects.SOFTBONES, 14400));
	public static final Potion LONG_STRONG_SOFTBONES = new Potion(new StatusEffectInstance(StatusEffects.SOFTBONES, 9600, 1));
	public static final Potion SOFTBONES = new Potion(new StatusEffectInstance(StatusEffects.SOFTBONES, 3600));
	public static final Potion STRONG_OFTBONES = new Potion(new StatusEffectInstance(StatusEffects.SOFTBONES, 2400, 1));

}
