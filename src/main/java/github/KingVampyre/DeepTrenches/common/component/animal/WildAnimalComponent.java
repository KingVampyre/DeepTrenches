package github.KingVampyre.DeepTrenches.common.component.animal;

import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.UUID;

public class WildAnimalComponent implements AnimalComponent {

    public static final int RESET_LOVE = 1;
    public static final int SET_FORCED_AGE = 2;
    public static final int SET_FORCED_AGE_TIMER = 3;
    public static final int SET_GROWING_AGE = 4;
    public static final int SET_IN_LOVE = 5;
    public static final int SET_PLAYER_IN_LOVE = 6;

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
    public boolean canBreed() {
        return this.inLove > 0;
    }

    @Override
    public boolean canBreed(MobEntity entity) {
        Optional<AnimalComponent> animalComponent = Components.ANIMAL.maybeGet(entity);

        if (animalComponent.isPresent()) {
            AnimalComponent entityComponent = animalComponent.get();

            if (entityComponent == this)
                return false;
            else if (entity.getClass() != this.mob.getClass())
                return false;
            else
                return this.isInLove() && entityComponent.isInLove();
        }

        return false;
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
    public PlayerEntity getLoveCause() {
        World world = this.mob.getEntityWorld();

        if (this.playerInLove == null)
            return null;

        return world.getPlayerByUuid(this.playerInLove);
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
    public boolean isInLove() {
        return this.inLove > 0;
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

        // TODO play hearts
        world.sendEntityStatus(this.mob, (byte) 18);
    }

    @Override
    public void resetInLove() {
        this.inLove = 0;
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

    public void readFromPacket(PacketByteBuf buf, int syncOp) {

        switch (syncOp) {
            case FULL_SYNC:
                this.readFromNbt(buf.readCompoundTag());
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
    public void readFromPacket(PacketByteBuf buf) {
        int syncOp = buf.readInt();

        this.readFromPacket(buf, syncOp);
    }

    @Override
    public void readFromNbt(CompoundTag compoundTag) {
        this.forcedAge = compoundTag.getInt("ForcedAge");
        this.forcedAgeTimer = compoundTag.getInt("ForcedAgeTimer");
        this.growingAge = compoundTag.getInt("GrowingAge");
        this.inLove = compoundTag.getInt("InLove");
        this.playerInLove = compoundTag.getUuid("PlayerInLove");
    }

    @Override
    public void writeToPacket(PacketByteBuf buf, ServerPlayerEntity recipient, int syncOp) {
        buf.writeInt(syncOp);

        switch (syncOp) {
            case FULL_SYNC:
                CompoundTag tag = new CompoundTag();

                this.writeToNbt(tag);
                buf.writeCompoundTag(tag);
                break;
            case RESET_LOVE:
                break;
            case SET_FORCED_AGE:
                buf.writeInt(this.forcedAge);
                break;
            case SET_FORCED_AGE_TIMER:
                buf.writeInt(this.forcedAgeTimer);
                break;
            case SET_GROWING_AGE:
                buf.writeInt(this.growingAge);
                break;
            case SET_IN_LOVE:
                buf.writeInt(this.inLove);
                break;
            case SET_PLAYER_IN_LOVE:
                buf.writeUuid(this.playerInLove);
                break;
        }

    }

    @Override
    public void writeToNbt(CompoundTag compoundTag) {
        compoundTag.putInt("ForcedAge", this.forcedAge);
        compoundTag.putInt("ForcedAgeTimer", this.forcedAgeTimer);
        compoundTag.putInt("GrowingAge", this.growingAge);
        compoundTag.putInt("InLove", this.inLove);
        compoundTag.putUuid("PlayerInLove", this.playerInLove);
    }

}
