package github.KingVampyre.DeepTrenches.core.entity.effect.instance;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

import java.util.UUID;

import static net.minecraft.entity.attribute.EntityAttributeModifier.Operation.ADDITION;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_MAX_HEALTH;

public class CorrosionStatusEffectInstance extends StatusEffectInstance {

    protected final LivingEntity living;

    public CorrosionStatusEffectInstance(StatusEffect type, int duration, int amplifier, LivingEntity living) {
        super(type, duration, amplifier);

        this.living = living;
    }

    @Override
    public boolean update(LivingEntity entity, Runnable overwriteCallback) {
        var amplifier = this.getAmplifier();
        var duration = this.getDuration();

        if (duration > 0 && this.type.canApplyUpdateEffect(duration, amplifier)) {
            var attributeInstance = this.living.getAttributeInstance(GENERIC_MAX_HEALTH);

            if(attributeInstance != null) {
                var currentDuration = this.getDuration();

                var durationFactor = 100F / (currentDuration + 300F);
                var healthFactor = (amplifier + 1) * 10;
                var health = -Math.round(durationFactor * healthFactor);
                var baseHealth = attributeInstance.getBaseValue();
                var value = health >= baseHealth ? -baseHealth + 1 : health;

                var modifier = new EntityAttributeModifier(UUID.fromString("d5fd30f3-3e18-4d37-8754-2ff20a71dec4"), "Corroded Hearts", value, ADDITION);

                if(attributeInstance.hasModifier(modifier))
                    attributeInstance.removeModifier(modifier);

                attributeInstance.addPersistentModifier(modifier);
            }
        }

        return super.update(entity, overwriteCallback);
    }

}
