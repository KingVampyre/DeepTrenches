package github.KingVampyre.DeepTrenches.common.entity.effect;

import github.KingVampyre.DeepTrenches.core.mixin.AccessorStatusEffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

import java.util.function.Consumer;

public class EntityStatusEffectInstance extends StatusEffectInstance {

    private Consumer<LivingEntity> consumer;

    public EntityStatusEffectInstance(StatusEffect type, int duration, int amplifier, Consumer<LivingEntity> consumer) {
        super(type, duration, amplifier);

        this.consumer = consumer;
    }

    @Override
    public boolean update(LivingEntity entity, Runnable overwriteCallback) {
        AccessorStatusEffectInstance accessor = (AccessorStatusEffectInstance) this;

        int amplifier = accessor.getAmplifier();
        int duration = accessor.getDuration();
        StatusEffect type = accessor.getType();

        if (duration > 0 && type.canApplyUpdateEffect(duration, amplifier))
            this.consumer.accept(entity);

        return super.update(entity, overwriteCallback);
    }
}
