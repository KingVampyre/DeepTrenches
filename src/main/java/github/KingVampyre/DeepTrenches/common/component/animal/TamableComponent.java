package github.KingVampyre.DeepTrenches.common.component.animal;

import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.UUID;

public interface TamableComponent extends AutoSyncedComponent {

    PlayerEntity getOwner();

    UUID getOwnerId();

    int getTameChance();

    boolean isOwner(PlayerEntity entityIn);

    boolean getIsSitting();

    boolean getIsTamed();

    void setOwnerId(UUID ownerId);

    void setSitting(boolean isSitting);

    void setTamed(boolean isTamed);

    default void setTamedBy(PlayerEntity player) {
        this.setOwnerId(player.getUuid());
        this.setTamed(true);

        if (player instanceof ServerPlayerEntity) {
            // TODO CriteriaTriggers
        }

    }

    default void tamableToTag(CompoundTag tag) {
        tag.putBoolean("IsSitting", this.getIsSitting());
        tag.putBoolean("IsTamed", this.getIsTamed());
        tag.putUuid("OwnerId", this.getOwnerId());
    }

    default void tamableFromTag(CompoundTag tag) {
        this.setSitting(tag.getBoolean("IsSitting"));
        this.setTamed(tag.getBoolean("IsTamed"));
        this.setOwnerId(tag.getUuid("OwnerId"));
    }

}