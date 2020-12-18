package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;

public interface Nourishable {

    Entity createChild(ServerWorld world, Lovable lovable);

    int getBreedingAge();

    int getForcedAge();

    int getHappyTicksRemaining();

    void growUp(int age, boolean overGrow);

    void onGrowUp();

    void setForcedAge(int forcedAge);

    void setBreedingAge(int breedingAge);

    void setHappyTicksRemaining(int happyTicksRemaining);

}
