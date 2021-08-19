package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.core.init.DTStatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ServerPlayerEntity.class)
public class MixinServerPlayerEntity {

    @Redirect(method = "trySleep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;isDay()Z"))
    private boolean trySleep(World world) {
        PlayerEntity player = (PlayerEntity) (Object) this;

        return !player.hasStatusEffect(DTStatusEffects.SLEEPY) && world.isDay();
    }

}
