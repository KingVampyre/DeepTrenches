package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;

import java.util.UUID;

public interface Lovable {

    boolean canBreedWith(LivingEntity living);

    ExperienceOrbEntity createExperienceOrb(ServerWorld server, double x, double y, double z);

    void breed(ServerWorld server, Lovable other);

    void eat(PlayerEntity player, ItemStack stack);

    int getLoveTicks();

    UUID getLovingPlayerUuid();

    ServerPlayerEntity getLovingPlayer();

    boolean isBreedingItem(ItemStack stack);

    boolean isInLove();

    void lovePlayer(PlayerEntity player);

    void resetLoveTicks();

    void setLoveTicks(int loveTicks);

    void setLovingPlayerUuid(UUID uuid);

}
