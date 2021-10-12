package github.KingVampyre.DeepTrenches.core.util.entity.effect;

import github.KingVampyre.DeepTrenches.core.entity.effect.instance.CorrosionStatusEffectInstance;
import github.KingVampyre.DeepTrenches.core.entity.effect.instance.SoulDrainingStatusEffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;

public class StatusEffectHelper {

    public static void addCorrosionEffect(LivingEntity living, StatusEffect effect, int amplifier, int duration) {
        living.addStatusEffect(new CorrosionStatusEffectInstance(effect, duration, amplifier, living));
    }

    public static void addSoulDrainingEffect(LivingEntity living, LivingEntity attacker, StatusEffect effect, int amplifier, int duration) {
        living.addStatusEffect(new SoulDrainingStatusEffectInstance(effect, duration, amplifier, living, attacker));
    }

}
