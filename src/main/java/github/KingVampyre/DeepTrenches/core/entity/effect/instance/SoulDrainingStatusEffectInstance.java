package github.KingVampyre.DeepTrenches.core.entity.effect.instance;

import github.KingVampyre.DeepTrenches.core.init.DTDamageSources;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

public class SoulDrainingStatusEffectInstance extends StatusEffectInstance {

    protected final LivingEntity attacker;
    protected final LivingEntity living;

    public SoulDrainingStatusEffectInstance(StatusEffect type, int duration, int amplifier, LivingEntity living, LivingEntity attacker) {
        super(type, duration, amplifier);

        this.attacker = attacker;
        this.living = living;
    }

    @Override
    public boolean update(LivingEntity entity, Runnable overwriteCallback) {
        var amplifier = this.getAmplifier();
        var duration = this.getDuration();

        if (duration > 0 && this.type.canApplyUpdateEffect(duration, amplifier)) {
            var source = DTDamageSources.soulDraining(this.attacker);

            var hearts = 1 << amplifier;
            var amount = 2 + hearts;

            this.living.damage(source, amount);
        }

        return super.update(entity, overwriteCallback);
    }

}
