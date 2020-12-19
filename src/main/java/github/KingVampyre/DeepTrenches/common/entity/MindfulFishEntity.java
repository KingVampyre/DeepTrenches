package github.KingVampyre.DeepTrenches.common.entity;

import github.KingVampyre.DeepTrenches.common.entity.ai.mob.Mindful;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class MindfulFishEntity extends AnimatedFishEntity implements Mindful {

    protected MindfulFishEntity(EntityType<? extends AnimatedFishEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void initGoals() {

    }

}
