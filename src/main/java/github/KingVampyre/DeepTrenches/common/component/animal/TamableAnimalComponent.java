package github.KingVampyre.DeepTrenches.common.component.animal;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

import java.util.UUID;

public class TamableAnimalComponent extends SchoolingAnimalComponent {

    public static final int SET_IS_SITTING = 9;
    public static final int SET_IS_TAMED = 10;
    public static final int SET_OWNER_ID = 11;

    protected final int tameChance;

    protected boolean isSitting;
    protected boolean isTamed;
    protected UUID ownerId;

    public TamableAnimalComponent(MobEntity mob, Ingredient breedItems, int maxSchoolSize, int tameChance) {
        super(mob, breedItems, maxSchoolSize);

        this.tameChance = tameChance;
    }

    public PlayerEntity getOwner() {
        World world = this.mob.getEntityWorld();

        if (this.ownerId == null)
            return null;

        return world.getPlayerByUuid(this.ownerId);
    }

    public UUID getOwnerId() {
        return this.ownerId;
    }

    public int getTameChance() {
        return this.tameChance;
    }

    public boolean isOwner(PlayerEntity entityIn) {
        return entityIn == this.getOwner();
    }

    public boolean getIsSitting() {
        return this.isSitting;
    }

    public boolean getIsTamed() {
        return this.isTamed;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    public void setSitting(boolean isSitting) {
        this.isSitting = isSitting;
    }

    public void setTamed(boolean isTamed) {
        this.isTamed = isTamed;
    }

    public void setTamedBy(PlayerEntity player) {
        this.setOwnerId(player.getUuid());
        this.setTamed(true);

        if (player instanceof ServerPlayerEntity) {
            // TODO CriteriaTriggers
        }

    }

    @Override
    public void readFromPacket(PacketByteBuf buf, int syncOp) {

        switch (syncOp) {
            case SET_IS_SITTING:
                this.isSitting = buf.readBoolean();
            case SET_IS_TAMED:
                this.isTamed = buf.readBoolean();
            case SET_OWNER_ID:
                this.ownerId = buf.readUuid();
            default:
                super.readFromPacket(buf, syncOp);
        }

    }

    @Override
    public void readFromNbt(CompoundTag compoundTag) {
        super.readFromNbt(compoundTag);

        this.isSitting = compoundTag.getBoolean("IsSitting");
        this.isTamed = compoundTag.getBoolean("IsTamed");
        this.ownerId = compoundTag.getUuid("OwnerId");
    }

    @Override
    public void writeToPacket(PacketByteBuf buf, ServerPlayerEntity recipient, int syncOp) {

        switch (syncOp) {
            case SET_IS_SITTING:
                buf.writeBoolean(this.isSitting);
            case SET_IS_TAMED:
                buf.writeBoolean(this.isTamed);
            case SET_OWNER_ID:
                buf.writeUuid(this.ownerId);
            default:
                super.writeToPacket(buf, recipient, syncOp);
        }

    }

    @Override
    public void writeToNbt(CompoundTag compoundTag) {
        super.writeToNbt(compoundTag);

        compoundTag.putBoolean("IsSitting", this.isSitting);
        compoundTag.putBoolean("IsTamed", this.isTamed);
        compoundTag.putUuid("OwnerId", this.ownerId);
    }

}
