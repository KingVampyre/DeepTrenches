package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.core.init.StatusEffects;
import github.KingVampyre.DeepTrenches.core.util.ModEnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.ProjectileDamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static github.KingVampyre.DeepTrenches.core.init.ParticleTypes.*;
import static github.KingVampyre.DeepTrenches.core.init.StatusEffects.*;
import static net.minecraft.entity.EquipmentSlot.MAINHAND;
import static net.minecraft.entity.damage.DamageSource.*;

@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity {

    @Shadow
    @Final
    private static TrackedData<Boolean> POTION_SWIRLS_AMBIENT;

    @Shadow
    public float knockbackVelocity;

    @Shadow
    protected boolean dead;

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

    @Inject(method = "damage", at = @At("RETURN"))
    private void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {

        if(source instanceof ProjectileDamageSource) {
            ProjectileDamageSource projectile = (ProjectileDamageSource) source;
            Entity sourceEntity = projectile.getSource();

            if(sourceEntity instanceof ArrowEntity || sourceEntity instanceof TridentEntity) {
                LivingEntity attacker = (LivingEntity) source.getAttacker();
                LivingEntity living = (LivingEntity) (Object) this;

                if(attacker != null && sourceEntity instanceof ArrowEntity) {
                    ItemStack stack = attacker.getEquippedStack(MAINHAND);

                    ModEnchantmentHelper.applySoulDraining(attacker, living, stack);
                }

                if(sourceEntity instanceof TridentEntity) {
                    TridentEntity trident = (TridentEntity) sourceEntity;
                    AccessorTridentEntity accessor = (AccessorTridentEntity) trident;
                    ItemStack stack = accessor.getTridentStack();

                    ModEnchantmentHelper.applySoulDraining(attacker, living, stack);
                }

            }

        }

    }

    @Inject(method = "onDeath", at = @At("HEAD"))
    private void onDeath(DamageSource source, CallbackInfo ci) {
        LivingEntity living = (LivingEntity) (Object) this;

        if(!living.removed && !this.dead) {

            if(source.getName().equals("soul_draining")) {
                LivingEntity attacker = (LivingEntity) source.getAttacker();

                if(attacker != null && attacker.hasStatusEffect(StatusEffects.SOUL_RAVENING)) {
                    StatusEffectInstance instance = attacker.getActiveStatusEffects().get(StatusEffects.SOUL_RAVENING);

                    instance.applyUpdateEffect(attacker);
                }

            }

        }

    }

    @Inject(method = "damage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;takeKnockback(FDD)V"), cancellable = true)
    private void takeKnockback(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {

        if(source.getName().equals("soul_draining")) {
            this.knockbackVelocity = (float)((int)(Math.random() * 2.0D) * 180);

            cir.cancel();
        }

    }

    @Inject(method = "tickStatusEffects", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;addParticle(Lnet/minecraft/particle/ParticleEffect;DDDDDD)V"), cancellable = true)
    protected void tickStatusEffects(CallbackInfo ci) {
        LivingEntity living = (LivingEntity) (Object) this;
        DataTracker dataTracker = living.getDataTracker();

        if(living.hasStatusEffect(ACID_CORROSION)) {
            living.world.addParticle(dataTracker.get(POTION_SWIRLS_AMBIENT) ? AMBIENT_NEAR_GASEOUS_ACID : ENTITY_NEAR_GASEOUS_ACID, living.getParticleX(0.5D), living.getRandomBodyY(), living.getParticleZ(0.5D), 0, 0, 0);
            ci.cancel();
        }

        if(living.hasStatusEffect(GAS_CORROSION)) {
            living.world.addParticle(dataTracker.get(POTION_SWIRLS_AMBIENT) ? AMBIENT_CORRODED_SKULL : ENTITY_CORRODED_SKULL, living.getParticleX(0.5D), living.getRandomBodyY(), living.getParticleZ(0.5D), 0, 0, 0);
            ci.cancel();
        }

    }

}
