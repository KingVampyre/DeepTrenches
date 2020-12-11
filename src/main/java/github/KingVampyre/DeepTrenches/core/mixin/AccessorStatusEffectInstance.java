package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(StatusEffectInstance.class)
public interface AccessorStatusEffectInstance {

    @Accessor("amplifier")
    int getAmplifier();

    @Accessor("duration")
    int getDuration();

    @Accessor("type")
    StatusEffect getType();

}
