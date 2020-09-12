package github.KingVampyre.DeepTrenches.core.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.CYCAWLER_BEAUTY;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.SOFTBONES;
import static net.minecraft.entity.damage.DamageSource.*;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    protected abstract void applyDamage(DamageSource source, float amount);

    @Shadow
    public abstract boolean damage(DamageSource source, float amount);

    @Inject(method = "damage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;applyDamage(Lnet/minecraft/entity/damage/DamageSource;F)V"), cancellable = true)
    private void applyDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity living = (LivingEntity) (Object) this;

        if (living.hasStatusEffect(SOFTBONES)) {
            StatusEffectInstance effectInstance = living.getActiveStatusEffects().get(SOFTBONES);
            int amplifier = effectInstance.getAmplifier();

            if (!living.isInvulnerableTo(source)) {
                if (source == ANVIL)
                    this.applyDamage(source, MathHelper.ceil(amplifier > 0 ? amount * 1.5F : amount * 1.35F));

                if (source == CRAMMING || source == IN_WALL)
                    this.applyDamage(source, MathHelper.ceil(amplifier > 0 ? amount * 1.75F : amount * 1.35F));

                if (source == FALL)
                    this.applyDamage(source, MathHelper.ceil(amplifier > 0 ? amount * 1.65F : amount * 1.4F));

                if (source == FLY_INTO_WALL)
                    this.applyDamage(source, amount = MathHelper.ceil(amplifier > 0 ? amount * 1.45F : amount * 1.35F));

                if (source == ANVIL || source == CRAMMING || source == IN_WALL || source == FALL || source == FLY_INTO_WALL)
                    cir.cancel();
            }
        }

        if(living.hasStatusEffect(CYCAWLER_BEAUTY)) {

            if (!living.isInvulnerableTo(source) && source == LIGHTNING_BOLT) {
                this.applyDamage(source, MathHelper.ceil(amount * 0.1F));

                cir.cancel();
            }

        }

    }

}
