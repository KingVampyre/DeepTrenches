package github.KingVampyre.DeepTrenches.common.component.animal;

import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import github.KingVampyre.DeepTrenches.core.init.Components;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.UUID;

public interface AnimalComponent extends AutoSyncedComponent {

    int getForcedAge();

    int getForcedAgeTimer();

    int getGrowingAge();

    int getHappyTicksRemaining();

    int getInLove();

    MobEntity getMob();

    UUID getPlayerInLove();

    void growUp(int age);

    void growUp(int age, boolean overGrow);

    boolean isBreedingItem(ItemStack stack);

    void setForcedAge(int forcedAge);

    void setForcedAgeTimer(int forcedAgeTimer);

    void setGrowingAge(int growingAge);

    void setHappyTicksRemaining(int happyTicksRemaining);

    void setInLove(int inLove);

    void setInLove(PlayerEntity player);

    void setPlayerInLove(UUID playerInLove);

    default boolean canBreed(MobEntity entity) {
        Optional<AnimalComponent> component = Components.ANIMAL.maybeGet(entity);

        if (component.isPresent()) {
            AnimalComponent animal = component.get();

            if (animal == this)
                return false;
            else if (entity.getClass() != this.getMob().getClass())
                return false;
            else
                return this.isInLove() && animal.isInLove();
        }

        return false;
    }

    default PlayerEntity getLovingPlayer() {
        UUID playerInLove = this.getPlayerInLove();
        World world = this.getMob().getEntityWorld();

        if (playerInLove == null)
            return null;

        return world.getPlayerByUuid(playerInLove);
    }

    default boolean isBaby() {
        return this.getGrowingAge() < 0;
    }

    default boolean isInLove() {
        return this.getInLove() > 0;
    }

    default void resetInLove() {
        this.setInLove(0);
    }

    default void animalToTag(CompoundTag tag) {
        tag.putInt("ForcedAge", this.getForcedAge());
        tag.putInt("ForcedAgeTimer", this.getForcedAgeTimer());
        tag.putInt("GrowingAge", this.getGrowingAge());
        tag.putInt("InLove", this.getInLove());

        UUID playerInLove = this.getPlayerInLove();

        if(playerInLove != null)
            tag.putUuid("PlayerInLove", playerInLove);
    }

    default void animalFromTag(CompoundTag tag) {
        this.setForcedAge(tag.getInt("ForcedAge"));
        this.setForcedAgeTimer(tag.getInt("ForcedAgeTimer"));
        this.setGrowingAge(tag.getInt("GrowingAge"));
        this.setInLove(tag.getInt("InLove"));

        if(tag.containsUuid("PlayerInLove"))
            this.setPlayerInLove(tag.getUuid("PlayerInLove"));
        else
            this.setPlayerInLove(null);

    }

}
