package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.core.entity.AdaiggerEntity;
import github.KingVampyre.DeepTrenches.core.init.ModDamageSources;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.TridentEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(TridentEntity.class)
public class MixinTridentEntity {

    @Redirect(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/damage/DamageSource;trident(Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;)Lnet/minecraft/entity/damage/DamageSource;"))
    private DamageSource onEntityHit(Entity trident, Entity attacker) {

        if(trident instanceof AdaiggerEntity)
            return ModDamageSources.adaigger(trident, attacker);

        return DamageSource.trident(trident, attacker);
    }

}
