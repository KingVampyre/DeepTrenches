package github.KingVampyre.DeepTrenches.core.entity;

import github.KingVampyre.DeepTrenches.common.entity.AnimatedFishEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class HatchetfishEntity extends AnimatedFishEntity {

    public HatchetfishEntity(EntityType<? extends AnimatedFishEntity> type, World world) {
        super(type, world);
    }
	
}
