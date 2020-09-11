package github.KingVampyre.DeepTrenches.client.mixin;

import static github.KingVampyre.DeepTrenches.core.init.EntityTypes.*;

import github.KingVampyre.DeepTrenches.common.entity.ModBoatEntity;
import github.KingVampyre.DeepTrenches.core.entity.*;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {

    @Shadow
    private ClientWorld world;

    @Inject(
            method = "onEntitySpawn(Lnet/minecraft/network/packet/s2c/play/EntitySpawnS2CPacket;)V",
            at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/network/packet/s2c/play/EntitySpawnS2CPacket;getEntityTypeId()Lnet/minecraft/entity/EntityType;"),
            cancellable = true,
            locals = LocalCapture.CAPTURE_FAILHARD
    )
    private void onEntitySpawn(EntitySpawnS2CPacket packet, CallbackInfo ci, double x, double y, double z, EntityType<?> type) {
        Entity entity = null;

        if (type == ADAIGGER)
            entity = new AdaiggerEntity(ADAIGGER, this.world);

        if (type == BETTA)
            entity = new BettaEntity(BETTA, this.world);

        if (type == BLACK_LOOSEJAW)
            entity = new BlackLoosejawEntity(BLACK_LOOSEJAW, this.world);

        if (type == BOAT)
            entity = new ModBoatEntity(this.world, x, y, z);

        if (type == DEEP_LAKE_BETTA)
            entity = new DeepLakeBettaEntity(DEEP_LAKE_BETTA, this.world);

        if (type == GIANT_HATCHETFISH)
            entity = new GiantHatchetfishEntity(GIANT_HATCHETFISH, this.world);

        if (type == LIGHT_LOOSEJAW)
            entity = new LightLoosejawEntity(LIGHT_LOOSEJAW, this.world);

        if (type == BARBELED_LOOSEJAW)
            entity = new BarbeledLoosejawEntity(BARBELED_LOOSEJAW, this.world);

        if (type == SMALLTOOTH_DRAGONFISH)
            entity = new SmalltoothDragonfishEntity(SMALLTOOTH_DRAGONFISH, this.world);

        if (type == STASP)
            entity = new StaspEntity(STASP, this.world);

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
