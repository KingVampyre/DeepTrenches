package github.KingVampyre.DeepTrenches.common.component.animal;

import dev.onyxstudios.cca.api.v3.component.AutoSyncedComponent;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public interface AnimalComponent extends AutoSyncedComponent {

    boolean canBreed();

    boolean canBreed(MobEntity entity);

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

}
