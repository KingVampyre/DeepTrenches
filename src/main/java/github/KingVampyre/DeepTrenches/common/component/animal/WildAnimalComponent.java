package github.KingVampyre.DeepTrenches.common.component.animal;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

import java.util.UUID;

import static github.KingVampyre.DeepTrenches.common.component.ComponentSyncOperations.*;

public class WildAnimalComponent implements AnimalComponent {

    protected final Ingredient breedItems;
    protected final MobEntity mob;

    protected int forcedAge;
    protected int forcedAgeTimer;
    protected int growingAge;
    protected int inLove;
    protected UUID playerInLove;

    public WildAnimalComponent(MobEntity mob, Ingredient breedItems) {
        this.breedItems = breedItems;
        this.mob = mob;
    }

    @Override
    public MobEntity getMob() {
        return this.mob;
    }

    @Override
    public int getInLove() {
        return this.inLove;
    }

    @Override
    public UUID getPlayerInLove() {
        return this.playerInLove;
    }

    @Override
    public void setPlayerInLove(UUID playerInLove) {
        this.playerInLove = playerInLove;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return this.breedItems.test(stack);
    }

    @Override
    public void setInLove(int inLove) {
        this.inLove = inLove;
    }

    @Override
    public void setInLove(PlayerEntity player) {
        World world = this.mob.getEntityWorld();

        this.setInLove(600);

        if (player != null)
            this.setPlayerInLove(player.getUuid());

        world.sendEntityStatus(this.mob, (byte) 18);
    }

    @Override
    public int getForcedAge() {
        return this.forcedAge;
    }

    @Override
    public void setForcedAge(int forcedAge) {
        this.forcedAge = forcedAge;
    }

    @Override
    public int getForcedAgeTimer() {
        return this.forcedAgeTimer;
    }

    @Override
    public void setForcedAgeTimer(int forcedAgeTimer) {
        this.forcedAgeTimer = forcedAgeTimer;
    }

    @Override
    public int getGrowingAge() {
        return this.growingAge;
    }

    @Override
    public void setGrowingAge(int growingAge) {
        this.growingAge = growingAge;
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        this.animalFromTag(tag);
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        this.animalToTag(tag);
    }

    @Override
    public void applySyncPacket(PacketByteBuf buf) {
        int syncOp = buf.readInt();

        this.applySyncPacket(buf, syncOp);
    }

    public void applySyncPacket(PacketByteBuf buf, int syncOp) {

        switch (syncOp) {
            case FULL_SYNC:
                CompoundTag tag = buf.readCompoundTag();

                this.readFromNbt(tag);
                break;
            case RESET_LOVE:
                this.inLove = 0;
                break;
            case SET_FORCED_AGE:
                this.forcedAge = buf.readInt();
                break;
            case SET_FORCED_AGE_TIMER:
                this.forcedAgeTimer = buf.readInt();
                break;
            case SET_GROWING_AGE:
                this.growingAge = buf.readInt();
                break;
            case SET_IN_LOVE:
                this.inLove = buf.readInt();
                break;
            case SET_PLAYER_IN_LOVE:
                this.playerInLove = buf.readUuid();
                break;
        }

    }

    @Override
    public void writeSyncPacket(PacketByteBuf buf, ServerPlayerEntity recipient) {
        CompoundTag tag = new CompoundTag();

        this.writeToNbt(tag);

        buf.writeInt(FULL_SYNC);
        buf.writeCompoundTag(tag);
    }

}
