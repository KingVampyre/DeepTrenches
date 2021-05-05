package github.KingVampyre.DeepTrenches.common.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

import java.util.function.Consumer;

public class EntityStatusEffectInstance extends StatusEffectInstance {

    private final Consumer<StatusEffectInstance> consumer;

    public EntityStatusEffectInstance(StatusEffect type, int duration, int amplifier, Consumer<StatusEffectInstance> consumer) {
        super(type, duration, amplifier);

        this.consumer = consumer;
    }

    @Override
    public boolean update(LivingEntity entity, Runnable overwriteCallback) {
        int amplifier = this.getAmplifier();
        int duration = this.getDuration();

        if (duration > 0 && this.type.canApplyUpdateEffect(duration, amplifier))
            this.consumer.accept(this);

        return super.update(entity, overwriteCallback);
    }

}
