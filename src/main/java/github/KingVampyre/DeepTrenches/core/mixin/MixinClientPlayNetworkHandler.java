package github.KingVampyre.DeepTrenches.core.mixin;

import github.KingVampyre.DeepTrenches.client.event.client.callback.ColorCacheLoad;
import github.Louwind.Reload.core.mixin.AccessorClientWorld;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(ClientPlayNetworkHandler.class)
public class MixinClientPlayNetworkHandler {

    @Shadow
    private ClientWorld world;

    @Inject(method = "onGameJoin", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/MinecraftClient;joinWorld(Lnet/minecraft/client/world/ClientWorld;)V"))
    private void onGameJoin(GameJoinS2CPacket packet, CallbackInfo ci) {

        if (this.world != null)
            ColorCacheLoad.EVENT.invoker().onLoad(((AccessorClientWorld) this.world).getColorCache());

    }

    @Inject(method = "onPlayerRespawn", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/MinecraftClient;joinWorld(Lnet/minecraft/client/world/ClientWorld;)V"))
    private void onPlayerRespawn(PlayerRespawnS2CPacket packet, CallbackInfo ci) {

        if (this.world != null)
            ColorCacheLoad.EVENT.invoker().onLoad(((AccessorClientWorld) this.world).getColorCache());

    }

}