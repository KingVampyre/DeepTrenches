package github.KingVampyre.DeepTrenches.client.mixin;

import github.KingVampyre.DeepTrenches.common.entity.ModBoatEntity;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import static github.KingVampyre.DeepTrenches.core.init.EntityTypes.BOAT;

@Deprecated
@Mixin(ClientPlayNetworkHandler.class)
public class MixinClientPlayNetworkHandler {

    @Shadow
    private ClientWorld world;

    @Inject(
            method = "onEntitySpawn(Lnet/minecraft/network/packet/s2c/play/EntitySpawnS2CPacket;)V",
            at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/network/packet/s2c/play/EntitySpawnS2CPacket;getEntityTypeId()Lnet/minecraft/entity/EntityType;"),
            cancellable = true,
            locals = LocalCapture.CAPTURE_FAILHARD
    )
    private void onEntitySpawn(EntitySpawnS2CPacket packet, CallbackInfo ci, double x, double y, double z, EntityType<?> type) {
        Identifier id = Registry.ENTITY_TYPE.getId(type);

        if(id.getNamespace().equals("deep_trenches")) {
            Entity entity = type.create(this.world);

            if (type == BOAT)
                entity = new ModBoatEntity(this.world, x, y, z);

            if (entity != null) {
                int entityId = packet.getId();
                entity.setVelocity(Vec3d.ZERO);
                entity.updatePosition(x, y, z);
                entity.updateTrackedPosition(x, y, z);
                entity.pitch = (float) (packet.getPitch() * 360) / 256.0F;
                entity.yaw = (float) (packet.getYaw() * 360) / 256.0F;
                entity.setEntityId(entityId);
                entity.setUuid(packet.getUuid());
                this.world.addEntity(entityId, entity);
                ci.cancel();
            }

        }

    }

}
