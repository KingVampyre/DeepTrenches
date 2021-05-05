package github.KingVampyre.DeepTrenches.core.util;

import github.KingVampyre.DeepTrenches.common.entity.effect.EntityStatusEffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.math.MathHelper;

import java.util.UUID;

import static net.minecraft.entity.attribute.EntityAttributeModifier.Operation.ADDITION;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MAX_HEALTH;

public class StatusEffectHelper {

    public static void addCorrosionEffect(LivingEntity living, StatusEffect effect, int amplifier, int duration, int start, int ends) {
        living.addStatusEffect(new EntityStatusEffectInstance(effect, duration, amplifier, instance -> {
            EntityAttributeInstance attributeInstance = living.getAttributeInstance(GENERIC_MAX_HEALTH);

            if(attributeInstance != null) {
                int currentDuration = instance.getDuration();

                if(currentDuration >= ends && currentDuration < start) {
                    double multiplier = 1 / 6F * MathHelper.log2(currentDuration - ends - 1);
                    double maxHealth = 1.5 * amplifier + 4;
                    double health = -Math.ceil((1 - multiplier) * maxHealth);

                    EntityAttributeModifier modifier = new EntityAttributeModifier(UUID.fromString("d5fd30f3-3e18-4d37-8754-2ff20a71dec4"), "Corroded Hearts", health, ADDITION);

                    if(attributeInstance.hasModifier(modifier))
                        attributeInstance.removeModifier(modifier);

                    if(multiplier > 0)
                        attributeInstance.addPersistentModifier(modifier);
                }

            }
        }));

    }

}
