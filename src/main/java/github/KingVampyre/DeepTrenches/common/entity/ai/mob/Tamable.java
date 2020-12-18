package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public interface Tamable {

    boolean canAttackWithOwner(LivingEntity target, LivingEntity owner);

    UUID getOwnerUuid();

    LivingEntity getOwner();

    boolean isOwner(LivingEntity entity);

    boolean isSitting();

    boolean isTameItem(ItemStack stack);

    boolean isTamed();

    void setOwnerUuid(UUID ownerUuid);

    void setSitting(boolean sitting);

    void setTamedBy(PlayerEntity player);

    void setTamed(boolean tamed);

}
