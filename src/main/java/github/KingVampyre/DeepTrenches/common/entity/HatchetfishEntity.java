package github.KingVampyre.DeepTrenches.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class HatchetfishEntity extends AnimatedFishEntity {

    public HatchetfishEntity(EntityType<? extends HatchetfishEntity> type, World world) {
        super(type, world);
    }
	
}
