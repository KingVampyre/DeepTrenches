package github.KingVampyre.DeepTrenches.core.util;

import github.KingVampyre.DeepTrenches.common.entity.effect.EntityStatusEffectInstance;
import github.KingVampyre.DeepTrenches.core.init.DTDamageSources;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

import java.util.UUID;

import static net.minecraft.entity.attribute.EntityAttributeModifier.Operation.ADDITION;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MAX_HEALTH;

public class StatusEffectHelper {

    public static void addCorrosionEffect(LivingEntity living, StatusEffect effect, int amplifier, int duration) {
        StatusEffectInstance effectInstance = StatusEffectHelper.getCorrosionEffect(living, effect, amplifier, duration);

        living.addStatusEffect(effectInstance);
    }

    public static void addSoulDrainingEffect(LivingEntity living, LivingEntity attacker, StatusEffect effect, int amplifier, int duration) {
        living.addStatusEffect(new EntityStatusEffectInstance(effect, duration, duration, instance -> {
            DamageSource source = DTDamageSources.soulDraining(attacker);

            float hearts = 1 << amplifier;
            float amount = 2 + hearts;

            living.damage(source, amount);
        }));
    }

    public static StatusEffectInstance getCorrosionEffect(LivingEntity living, StatusEffect effect, int amplifier, int duration) {
        return new EntityStatusEffectInstance(effect, duration, amplifier, instance -> {
            EntityAttributeInstance attributeInstance = living.getAttributeInstance(GENERIC_MAX_HEALTH);

            if(attributeInstance != null) {
                int currentDuration = instance.getDuration();

                double durationFactor = 100F / (currentDuration + 300F);
                double healthFactor = (amplifier + 1) * 10;
                double health = -Math.round(durationFactor * healthFactor);
                double baseHealth = attributeInstance.getBaseValue();
                double value = health >= baseHealth ? -baseHealth + 1 : health;

                EntityAttributeModifier modifier = new EntityAttributeModifier(UUID.fromString("d5fd30f3-3e18-4d37-8754-2ff20a71dec4"), "Corroded Hearts", value, ADDITION);

                if(attributeInstance.hasModifier(modifier))
                    attributeInstance.removeModifier(modifier);

                attributeInstance.addPersistentModifier(modifier);
            }
        });

    }

}
