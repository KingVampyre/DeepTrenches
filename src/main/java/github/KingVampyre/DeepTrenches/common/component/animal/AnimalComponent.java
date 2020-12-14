package github.KingVampyre.DeepTrenches.common.component.animal;

import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;

import java.util.UUID;

public interface AnimalComponent extends AutoSyncedComponent {

    boolean canBreed();

    boolean canBreed(MobEntity entity);

    @Deprecated
    MobEntity getMob();

    int getInLove();

    PlayerEntity getLoveCause();

    UUID getPlayerInLove();

    boolean isBreedingItem(ItemStack stack);

    boolean isInLove();

    void resetInLove();

    void setInLove(int inLove);

    void setInLove(PlayerEntity player);

    void setPlayerInLove(UUID playerInLove);

    int getForcedAge();

    int getForcedAgeTimer();

    int getGrowingAge();

    void setForcedAge(int forcedAge);

    void setForcedAgeTimer(int forcedAgeTimer);

    void setGrowingAge(int growingAge);

    default void animalToTag(CompoundTag tag) {
        tag.putInt("ForcedAge", this.getForcedAge());
        tag.putInt("ForcedAgeTimer", this.getForcedAgeTimer());
        tag.putInt("GrowingAge", this.getGrowingAge());
        tag.putInt("InLove", this.getInLove());
        tag.putUuid("PlayerInLove", this.getPlayerInLove());
    }

    default void animalFromTag(CompoundTag tag) {
        this.setForcedAge(tag.getInt("ForcedAge"));
        this.setForcedAgeTimer(tag.getInt("ForcedAgeTimer"));
        this.setGrowingAge(tag.getInt("GrowingAge"));
        this.setInLove(tag.getInt("InLove"));
        this.setPlayerInLove(tag.getUuid("PlayerInLove"));
    }

}
