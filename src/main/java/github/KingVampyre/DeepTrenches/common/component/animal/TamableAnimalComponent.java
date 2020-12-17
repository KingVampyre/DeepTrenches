package github.KingVampyre.DeepTrenches.common.component.animal;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;

import java.util.UUID;

import static github.KingVampyre.DeepTrenches.common.component.ComponentSyncOperations.*;

@Deprecated
public class TamableAnimalComponent extends PassiveAnimalComponent implements TamableComponent {

    protected final Ingredient tameItems;

    protected boolean isSitting;
    protected boolean isTamed;
    protected UUID ownerId;

    public TamableAnimalComponent(MobEntity mob, Ingredient breedItems, Ingredient tameItems) {
        super(mob, breedItems);

        this.tameItems = tameItems;
    }

    @Override
    public LivingEntity getOwner() {
        World world = this.mob.getEntityWorld();

        if (this.ownerId == null)
            return null;

        return world.getPlayerByUuid(this.ownerId);
    }

    @Override
    public UUID getOwnerId() {
        return this.ownerId;
    }

    @Override
    public boolean isOwner(LivingEntity entityIn) {
        return entityIn == this.getOwner();
    }

    @Override
    public boolean getIsSitting() {
        return this.isSitting;
    }

    @Override
    public boolean getIsTamed() {
        return this.isTamed;
    }

    @Override
    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public void setSitting(boolean isSitting) {
        this.isSitting = isSitting;
    }

    @Override
    public void setTamed(boolean isTamed) {
        this.isTamed = isTamed;
    }

    @Override
    public boolean isTameItem(ItemStack stack) {
        return this.tameItems.test(stack);
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        super.readFromNbt(tag);

        this.tamableFromTag(tag);
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        super.writeToNbt(tag);

        this.tamableToTag(tag);
    }

    @Override
    public void applySyncPacket(PacketByteBuf buf, int syncOp) {

        switch (syncOp) {
            case SET_IS_SITTING:
                this.isSitting = buf.readBoolean();
                break;
            case SET_IS_TAMED:
                this.isTamed = buf.readBoolean();
                break;
            case SET_OWNER_ID:
                this.ownerId = buf.readUuid();
                break;
            default:
                super.applySyncPacket(buf, syncOp);
        }

    }

}
